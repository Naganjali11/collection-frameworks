package com.codegnan.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CustomMapExample {

	public static void main(String[] args) {
		HashMap<Person,Integer>h=new HashMap<>();
		h.put(new Person(1,"Malli","arjun@gmail.com"), 666);
		h.put(new Person(7,"Arjun","malli@gmail.com"), 111);
		h.put(new Person(5,"Neha","shena@gmail.com"), 000);
		h.put(new Person(3,"Monika","shaa@gmail.com"), 999);
		h.put(new Person(8,"Anusha","anu@gmail.com"), 777);
		h.put(new Person(6,"Ravi","ravi@gmail.com"), 222);
		h.put(new Person(9,"Divya","divya007@gmail.com"), 333);
		h.put(new Person(2,"Vikram","vikram@gmail.com"), 555);
		h.put(new Person(10,"Rajesh","raju321@gmail.com"), 444);
		h.put(new Person(4,"Priya","priya555@gmail.com"), 888);
		System.out.println(h);
		System.out.println("Printing entries one by one");
		for(Map.Entry<Person,Integer>entry:h.entrySet()) {
			System.out.println(entry.getKey()+"---->"+entry.getValue());
		}
		LinkedHashMap<Person,Integer>h1=new LinkedHashMap<>();
		h1.put(new Person(1,"Malli","arjun@gmail.com"), 666);
		h1.put(new Person(7,"Arjun","malli@gmail.com"), 111);
		h1.put(new Person(5,"Neha","shena@gmail.com"), 000);
		h1.put(new Person(3,"Monika","shaa@gmail.com"), 999);
		h1.put(new Person(8,"Anusha","anu@gmail.com"), 777);
		h1.put(new Person(6,"Ravi","ravi@gmail.com"), 222);
		h1.put(new Person(9,"Divya","divya007@gmail.com"), 333);
		h1.put(new Person(2,"Vikram","vikram@gmail.com"), 555);
		h1.put(new Person(10,"Rajesh","raju321@gmail.com"), 444);
		h1.put(new Person(4,"Priya","priya555@gmail.com"), 888);
		System.out.println(h1);
		System.out.println("Printing entries one by one");
		for(Map.Entry<Person,Integer>entry:h1.entrySet()) {
			System.out.println(entry.getKey()+"---->"+entry.getValue());
		}
		System.out.println("Tree Map Example");
		TreeMap<Person,Integer>h2=new TreeMap<>(new CustomComparator());
		h2.put(new Person(1,"Malli","arjun@gmail.com"), 666);
		h2.put(new Person(7,"Arjun","malli@gmail.com"), 111);
		h2.put(new Person(5,"Neha","shena@gmail.com"), 000);
		h2.put(new Person(3,"Monika","shaa@gmail.com"), 999);
		h2.put(new Person(8,"Anusha","anu@gmail.com"), 777);
		h2.put(new Person(6,"Ravi","ravi@gmail.com"), 222);
		h2.put(new Person(9,"Divya","divya007@gmail.com"), 333);
		h2.put(new Person(2,"Vikram","vikram@gmail.com"), 555);
		h2.put(new Person(10,"Rajesh","raju321@gmail.com"), 444);
		h2.put(new Person(4,"Priya","priya555@gmail.com"), 888);
		System.out.println(h2);
		System.out.println("Printing entries one by one");
		for(Map.Entry<Person,Integer>entry:h2.entrySet()) {
			System.out.println(entry.getKey()+"---->"+entry.getValue());
		}
	}

}
