package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Testk {
 public static void main(String[] args) {
	 PriorityQueue pq = new PriorityQueue();
	 pq.add(12);
	 pq.add(24);
	 pq.add(34);
	 pq.add(15);
	 pq.add(24);
	 pq.offer(1);
	 System.out.println(pq);
	 
	 System.out.println("=========== using iterator==========");
	 
	 Iterator<Integer> it = pq.iterator();
	 
	 while(it.hasNext()) {
		 System.out.println(pq.poll());
		 
	 }
	 
	 System.out.println("after poll"+pq);
	 
	 
	
	 
	 
	 
	 
}
}
