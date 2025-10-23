package com.codegnan.collections;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Vector;
import java.util.Enumeration;
public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<Employee> empList = new LinkedList<Employee>();
        empList.add(new Employee(101, "Arjun", 30000));
        empList.add(new Employee(102, "Malli", 40000));
        empList.add(new Employee(103, "Priya", 50000));
        empList.add(new Employee(104, "Rohan", 35000));
        empList.addLast(new Employee(105, "Riya", 45000));

        System.out.println("Using Enumeration:");
        Vector<Employee> vectorList = new Vector<>(empList);
        Enumeration<Employee> e = vectorList.elements();
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

