/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package csl.calcite.com.example.file;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import org.apache.calcite.linq4j.Enumerator;
import org.apache.calcite.linq4j.Linq4j;
import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.rel.type.RelDataTypeFactory;
import org.apache.calcite.util.Pair;
import org.apache.calcite.util.Source;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.*;

/**
 * Enumerator that reads from a Object List.
 */
public class JsonEnumerator implements Enumerator<@Nullable Object[]> {

  private final Enumerator<@Nullable Object[]> enumerator;

  public JsonEnumerator(List<? extends @Nullable Object> list) {
    List<@Nullable Object[]> objs = new ArrayList<>();
    for (Object obj : list) {
      if (obj instanceof Collection) {
        //noinspection unchecked
        List<Object> tmp = (List<Object>) obj;
        objs.add(tmp.toArray());
      } else if (obj instanceof Map) {
        objs.add(((LinkedHashMap) obj).values().toArray());
      } else {
        objs.add(new Object[]{obj});
      }
    }
    enumerator = Linq4j.enumerator(objs);
  }

  /** Deduces the names and types of a table's columns by reading the first line
   * of a JSON file. */
  static JsonDataConverter deduceRowType(RelDataTypeFactory typeFactory, Source source) {
    final ObjectMapper objectMapper = new ObjectMapper();
    List<Object> list;
    LinkedHashMap<String, Object> jsonFieldMap = new LinkedHashMap<>(1);
    Object jsonObj = null;
    try {
      objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true)
          .configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true)
          .configure(JsonParser.Feature.ALLOW_COMMENTS, true);

      if ("file".equals(source.protocol()) && source.file().exists()) {
        //noinspection unchecked
        jsonObj = objectMapper.readValue(source.file(), Object.class);
      } else if (Arrays.asList("http", "https", "ftp").contains(source.protocol())) {
        //noinspection unchecked
        jsonObj = objectMapper.readValue(source.url(), Object.class);
      } else {
        jsonObj = objectMapper.readValue(source.reader(), Object.class);
      }

    } catch (MismatchedInputException e) {
      if (!e.getMessage().contains("No content")) {
        throw new RuntimeException("Couldn't read " + source, e);
      }
    } catch (Exception e) {
      throw new RuntimeException("Couldn't read " + source, e);
    }

    if (jsonObj == null) {
      list = new ArrayList<>();
      jsonFieldMap.put("EmptyFileHasNoColumns", Boolean.TRUE);
    } else if (jsonObj instanceof Collection) {
      //noinspection unchecked
      list = (List<Object>) jsonObj;
      //noinspection unchecked
      jsonFieldMap = (LinkedHashMap) list.get(0);
    } else if (jsonObj instanceof Map) {
      //noinspection unchecked
      jsonFieldMap = (LinkedHashMap) jsonObj;
      //noinspection unchecked
      list = new ArrayList(((LinkedHashMap) jsonObj).values());
    } else {
      jsonFieldMap.put("line", jsonObj);
      list = new ArrayList<>();
      list.add(0, jsonObj);
    }

    final List<RelDataType> types = new ArrayList<RelDataType>(jsonFieldMap.size());
    final List<String> names = new ArrayList<String>(jsonFieldMap.size());

    for (Object key : jsonFieldMap.keySet()) {
      final RelDataType type = typeFactory.createJavaType(jsonFieldMap.get(key).getClass());
      names.add(key.toString());
      types.add(type);
    }

    RelDataType relDataType = typeFactory.createStructType(Pair.zip(names, types));
    return new JsonDataConverter(relDataType, list);
  }

  @Override public Object[] current() {
    return enumerator.current();
  }

  @Override public boolean moveNext() {
    return enumerator.moveNext();
  }

  @Override public void reset() {
    enumerator.reset();
  }

  @Override public void close() {
    enumerator.close();
  }

  /**
   * Json data and relDataType Converter.
   */
  static class JsonDataConverter {
    private final RelDataType relDataType;
    private final List<Object> dataList;

    private JsonDataConverter(RelDataType relDataType, List<Object> dataList) {
      this.relDataType = relDataType;
      this.dataList = dataList;
    }

    RelDataType getRelDataType() {
      return relDataType;
    }

    List<Object> getDataList() {
      return dataList;
    }
  }
}
