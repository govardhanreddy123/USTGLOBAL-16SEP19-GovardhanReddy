package com.ustglobal.objectclass;

public class TestD {
	public static void main(String[] args) {
		
		Student s = new  Student(10, "raju", 80.0);
	    int s1 =s.hashCode();
	    System.out.println(s1);
	    String s2 = s.toString();
	    System.out.println(s2);
		
		
	}

}
