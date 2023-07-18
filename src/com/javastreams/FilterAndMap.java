package com.javastreams;
import java.util.ArrayList;
import java.util.List;

class Employee {
    int empid;
    String empname;
    int salary;

    public Employee(int empid, String empname, int salary) {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }
}

public class FilterAndMap {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee(101, "monica", 16000));
        employee.add(new Employee(102, "rachel", 15000));
        employee.add(new Employee(103, "chandler", 20000));
        employee.add(new Employee(104, "phoebe", 16000));
        employee.add(new Employee(105, "joey", 19000));
        employee.add(new Employee(106, "ross", 15000));
        employee.stream().filter(n->n.salary>15000).map(n->n.salary).forEach(n-> System.out.println(n));
    }}