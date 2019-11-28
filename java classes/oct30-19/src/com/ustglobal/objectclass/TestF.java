package com.ustglobal.objectclass;

public class TestF {
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"raju", 20000);
		Employee e2 = new Employee(2,"pawan", 30000);
		Employee e3 = new Employee(1,"raju", 20000);
		Employee e4 = e3;
		System.out.println(e4.equals(e3));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e2));
	}
}
