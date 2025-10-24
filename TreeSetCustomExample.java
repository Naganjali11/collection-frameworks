package com.codegnan.collections;

import java.util.TreeSet;

public class TreeSetCustomExample {

    public static void main(String[] args) {
        TreeSet<Employee1> employees = new TreeSet<Employee1>(new Employee1Comparator());
        employees.add(new Employee1(111, "malli", 60000, "hyderabad"));
        employees.add(new Employee1(1, "Arjun", 72000, "banglore"));
        employees.add(new Employee1(888, "Mahesh", 32000, "vjy"));
        employees.add(new Employee1(100, "anusha", 37000, "Hyderabad"));
        employees.add(new Employee1(20, "ravi", 23000, "pune"));
        System.out.println(employees);
        for(Employee1 e:employees) {
        	System.out.println(e);
        }
    }

}
