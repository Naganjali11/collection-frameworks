package com.codegnan.map;

import java.util.Comparator;

public class CustomComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		//return -Integer.compare(p1.getId(), p2.getId());
	    //return -p1.getName().compareTo(p2.getName());
		return -p1.getEmail().compareTo(p2.getEmail());
	}
	

}
