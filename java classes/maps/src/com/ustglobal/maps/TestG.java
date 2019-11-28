package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(2,"divya",67000);
		Employee e2 = new Employee(5,"kiran",56000);
		Employee e3 = new Employee(3,"santhosh",77081);
		Employee e4 = new Employee(4,"mainu",70085);
		Employee e5 = new Employee(1,"dinesh",57049);
		Employee e6 = new Employee(9,"sabir",60032);
		Employee e7 = new Employee(8,"pavan",80024);
		Employee e8 = new Employee(7,"raju",75012);
		Employee e9 = new Employee(6,"guru",79091);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		ArrayList<Employee> al1 = new ArrayList<Employee>();
		al1.add(e4);
		al1.add(e5);
		al1.add(e6);
		
		ArrayList<Employee> al2 = new ArrayList<Employee>();
		al2.add(e7);
		al2.add(e8);
		al2.add(e9);
		

		HashMap<String, ArrayList<Employee>> hm = new HashMap<String, ArrayList<Employee>>();
	
		hm.put("first",al);
		hm.put("second",al1);
		hm.put("third",al2);
		
		
		ArrayList<Employee> first= hm.get("second");
		
		Iterator<Employee> it = first.iterator();
		
		while(it.hasNext()){
			Employee s = it.next();
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentage is "+s.salary);
			System.out.println("================");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
