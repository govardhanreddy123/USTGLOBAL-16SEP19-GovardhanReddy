package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestH {
	public static void main(String[] args) {
		 TreeSet<Employee> hs = new TreeSet<Employee>();
		 
		 Employee e1 =  new Employee(12,"sweety",45000);
		 Employee e2 =  new Employee(13,"samantha",25000);
		 Employee e3 =  new Employee(14,"anuu",35000);
		 Employee e4 =  new Employee(15,"divya",40000);
		 Employee e5 =  new Employee(12,"sweety",45000);
		 
		 hs.add(e1);
		 hs.add(e2);
		 hs.add(e3);
		 hs.add(e4);
		 hs.add(e5);
		 
		 System.out.println("=======using iterator===========");
		 Iterator<Employee> it = hs.iterator();
		 while(it.hasNext()) {
				Employee e = it.next();
				System.out.println(e.id);
				System.out.println(e.name);
				System.out.println(e.salary);
				System.out.println("============");
				
				
			}
	}


}
