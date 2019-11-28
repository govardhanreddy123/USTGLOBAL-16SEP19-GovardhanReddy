package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {
	public static void main(String[] args) {
		  
		SortByCustomerName sc = new SortByCustomerName();
		TreeSet<Customer> ts = new TreeSet<Customer>(sc);
		Customer c1 = new Customer("raju", 101, 20000);
		Customer c2 = new Customer("raju", 101, 20000);
		Customer c3 = new Customer("raju", 101, 20000);
		Customer c4 = new Customer("raju", 101, 20000);
		
		

		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		
System.out.println("============using iterator===========");
		
		Iterator<Customer> it = ts.iterator();
		while(it.hasNext()) {
			Customer c = it.next();
			System.out.println("name is "+c.name);
			System.out.println("id is "+c.id);
			System.out.println("salary is "+c.salary);
			System.out.println("================");
			
			
		}
		

}
}
