package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestB {
	public static void main(String[] args) {
		
		Comparator<Employee> comp = (e1,e2) ->{
			return e1.name.compareTo(e2.name);
		};
		
		
		TreeSet<Employee> ts = new TreeSet<Employee>(comp);
		Employee e1 = new Employee(4,"niki",5.6);
		Employee e2 = new Employee(5,"pavan",5.10);
		Employee e3 = new Employee(6,"reddy",5.9);
		Employee e4 = new Employee(7,"raju",5.6);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println("===============using iterator=============");
		
		Iterator<Employee> it =ts.iterator();
		while(it.hasNext()) {
			Employee e =it.next();
			System.out.println("name is "+e.name);
			System.out.println("id is "+e.id);
			System.out.println("height is "+e.height);
			System.out.println("==========================");
		}
		
	}

}
