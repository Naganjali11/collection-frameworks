package com.codegnan.collections;

import java.util.Comparator;

public class Employee1Comparator implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		//return e1.getName().compareTo(e2.getName());
		//return Integer.compare(e1.getId(), e2.getId());
		//return Double.compare(e1.getSalary(),e2.getSalary());
		return e1.getAddr().compareTo(e2.getAddr());
	}
	

}
