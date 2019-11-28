package com.ustglobal.java8.Predicates;

import java.util.function.Predicate;

public class TestA {
	
	public static void main(String[] args) {
		
		Predicate<Employee> p = e ->{
			 if(e.salary > 20000) {
				 return true;
			 }else {
				 return false;
			 }
		};
		
		
		
		
		
		
		Employee e = new Employee("raju", 101, 20000);
		boolean res = p.test(e);
		System.out.println(res);
		
	}

}
