package com.codegnan.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		@SuppressWarnings("unchecked")
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new PriorityComparator());
		pq.add(5);
		pq.add(3);
		pq.add(1);
		pq.add(4);
		pq.add(2);
		pq.add(6);
		pq.add(5);
		System.out.println(pq);
		
		}

}
/*PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
pq.add(5);
pq.add(3);
pq.add(1);
pq.add(4);
pq.add(2);
pq.add(6);
pq.add(5);
System.out.println(pq);*/
/*pq.add(null);
System.out.println(pq);*/
