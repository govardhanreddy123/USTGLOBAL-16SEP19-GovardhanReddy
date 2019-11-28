package com.ustglobal.beanobject.bean;

public class TestB {
	public static void main(String[] args) {
		employee e = new employee();
		e.setId(11);
		e.setSalary(30000);
		e.setName("raju");
		e.setDept("cse");
		e.setDesignation("first cls");
		
		DataBase1 db = new DataBase1() ;
		db.display(e);
		
	}
}
