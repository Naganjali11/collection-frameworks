package com.codegnan.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
//import java.util.List;
import java.util.Vector;

public class ListExamples {

	public static void main(String[] args) {
				
		Vector<Student> studentList=new Vector<Student>();
		studentList.add(new Student(1,"arjun",20));
		studentList.add(new Student(2,"malli",25));
		studentList.add(new Student(3,"priya",32));
		studentList.add(new Student(4,"rohan",28));
		//studentList.addLast(new Student(7,"riya",35));
		System.out.println(studentList);
		System.out.println("Using Enumeration");
		Enumeration<Student>e=studentList.elements();
		while(e.hasMoreElements()) {
			Student s=e.nextElement();
			System.out.println(s);
		}
		
		ArrayList<Student> studentList2=new ArrayList<Student>();
		studentList2.add(new Student(1,"arjun",20));
		studentList2.add(new Student(2,"malli",25));
		studentList2.add(new Student(3,"priya",32));
		studentList2.add(new Student(4,"rohan",28));
		//studentList.addLast(new Student(7,"riya",35));
		System.out.println(studentList2);
		System.out.println("Using Enumeration");
		Vector<Student>studentVector=new Vector<>(studentList2);
		Enumeration<Student>e1=studentVector.elements();
		while(e1.hasMoreElements()) {
			Student s=e1.nextElement();
			System.out.println(s);
		}
		System.out.println("Using Iterator");
		@SuppressWarnings("unused")
		Iterator<Student>itr=studentList.iterator();
		while(e1.hasMoreElements()) {
			Student s=e1.nextElement();
			System.out.println(s);
		}
		
		LinkedList<Student> studentList1=new LinkedList<Student>();
		studentList1.add(new Student(1,"arjun",20));
		studentList1.add(new Student(2,"malli",25));
		studentList1.add(new Student(3,"priya",32));
		studentList1.add(new Student(4,"rohan",28));
		studentList1.addLast(new Student(7,"riya",35));
		System.out.println(studentList1);
	}

}
