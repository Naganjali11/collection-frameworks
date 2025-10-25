package com.codegnan.collections;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class PriorityComparator implements Comparator {
public int compare(Object obj1,Object obj2) {
	Integer i1=(Integer)obj1;
	Integer i2=(Integer)obj2;
	return -i1.compareTo(i2);//+i1
	
}
}