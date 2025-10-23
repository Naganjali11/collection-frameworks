package com.codegnan.collections;
import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
public class VectorExample {
    public static void main(String[] args) {

        Vector<Employee> empList = new Vector<Employee>();
        empList.add(new Employee(101, "Arjun", 30000));
        empList.add(new Employee(102, "Malli", 40000));
        empList.add(new Employee(103, "Priya", 50000));
        empList.add(new Employee(104, "Rohan", 35000));
        empList.add(new Employee(105, "Riya", 45000));

        System.out.println("Using Enumeration:");
        Enumeration<Employee> e = empList.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        System.out.println("Using Iterator:");
        Iterator<Employee> itr = empList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
