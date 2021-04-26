package csl.calcite.com.chapter1;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.calcite.adapter.java.ReflectiveSchema;
import org.apache.calcite.jdbc.CalciteConnection;
import org.apache.calcite.schema.Schema;
import org.apache.calcite.schema.SchemaPlus;

import java.sql.*;
import java.util.*;

public class Test2ClassName {

    public static void main(String[] args) throws Exception {
        Class.forName("org.apache.calcite.jdbc.Driver");
        Properties info = new Properties();
        info.setProperty("lex", "JAVA");
        Connection connection = DriverManager.getConnection("jdbc:calcite:", info);
        CalciteConnection calciteConnection = connection.unwrap(CalciteConnection.class);
        SchemaPlus rootSchema = calciteConnection.getRootSchema();
        Map<String, Object> operand = new HashMap<>();
        String className = new HrSchema().getClass().getName();
        System.out.println(className);
        operand.put("class", className);
        Schema schema = new ReflectiveSchema.Factory().create(rootSchema, "hr", operand);
        rootSchema.add("hr", schema);
        Statement statement = calciteConnection.createStatement();
        test1(statement);
        statement.close();
        connection.close();
    }


    public static void test1(Statement statement) throws Exception {
        ResultSet resultSet = statement.executeQuery("select d.deptno, min(e.empid) as a_min\n"
                + "from hr.emps as e\n"
                + "join hr.depts as d\n"
                + "  on e.deptno = d.deptno\n"
                + "group by d.deptno\n"
                + "having count(*) > 0");
        System.out.println(JSON.toJSONString(getData(resultSet)));
    }


    public static List<Map<String, Object>> getData(ResultSet resultSet) throws Exception {
        List<Map<String, Object>> list = Lists.newArrayList();
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnSize = metaData.getColumnCount();

        while (resultSet.next()) {
            Map<String, Object> map = Maps.newLinkedHashMap();
            for (int i = 1; i < columnSize + 1; i++) {
                map.put(metaData.getColumnLabel(i), resultSet.getObject(i));
            }
            list.add(map);
        }
        return list;
    }

    public static class HrSchema {
        public static Employee[] emps = {new Employee(1, 1, "a", 2.0f,
                120)};
        public static Department[] depts = {new Department(1, "q", Arrays.asList(emps),
                null)};

    }

    public static class Employee {
        public final int empid;
        public final int deptno;
        public final String name;
        public final float salary;
        public final Integer commission;

        public Employee(int empid, int deptno, String name, float salary,
                        Integer commission) {
            this.empid = empid;
            this.deptno = deptno;
            this.name = name;
            this.salary = salary;
            this.commission = commission;
        }

        @Override
        public String toString() {
            return "Employee [empid: " + empid + ", deptno: " + deptno
                    + ", name: " + name + "]";
        }

        @Override
        public boolean equals(Object obj) {
            return obj == this
                    || obj instanceof Employee
                    && empid == ((Employee) obj).empid;
        }
    }


    public static class Department {
        public final int deptno;
        public final String name;

        @org.apache.calcite.adapter.java.Array(component = Employee.class)
        public final List<Employee> employees;
        public final Location location;

        public Department(int deptno, String name, List<Employee> employees,
                          Location location) {
            this.deptno = deptno;
            this.name = name;
            this.employees = employees;
            this.location = location;
        }

        @Override
        public String toString() {
            return "Department [deptno: " + deptno + ", name: " + name
                    + ", employees: " + employees + ", location: " + location + "]";
        }

        @Override
        public boolean equals(Object obj) {
            return obj == this
                    || obj instanceof Department
                    && deptno == ((Department) obj).deptno;
        }
    }

    public static class DepartmentPlus extends Department {
        public final Timestamp inceptionDate;

        public DepartmentPlus(int deptno, String name, List<Employee> employees,
                              Location location, Timestamp inceptionDate) {
            super(deptno, name, employees, location);
            this.inceptionDate = inceptionDate;
        }
    }

    public static class Location {
        public final int x;
        public final int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Location [x: " + x + ", y: " + y + "]";
        }

        @Override
        public boolean equals(Object obj) {
            return obj == this
                    || obj instanceof Location
                    && x == ((Location) obj).x
                    && y == ((Location) obj).y;
        }
    }

    public static class Dependent {
        public final int empid;
        public final String name;

        public Dependent(int empid, String name) {
            this.empid = empid;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Dependent [empid: " + empid + ", name: " + name + "]";
        }

        @Override
        public boolean equals(Object obj) {
            return obj == this
                    || obj instanceof Dependent
                    && empid == ((Dependent) obj).empid
                    && Objects.equals(name, ((Dependent) obj).name);
        }
    }
}
