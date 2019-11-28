package com.ustglobal.beanobject.bean;

public class DataBase1 {
	
	void display( employee e ) {
		System.out.println("id is "+e.getId());
		System.out.println("salary is "+e.getSalary());
		System.out.println("name is "+e.getName());
		System.out.println("dept is "+e.getDept());
		System.out.println("designation is "+e.getDesignation());
	}

}
