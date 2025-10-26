package com.codegnan.map;

import java.util.TreeMap;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		TreeMap t=new TreeMap();
		t.put("sunny", null);
		t.put("vinny", "chinny");
		t.put("jenny", null);
		System.out.println(t);
		t.put("aaa", 10);
		System.out.println(t);
		//t.put(99, "bbb");
		//System.out.println(t);
		
		}

}
