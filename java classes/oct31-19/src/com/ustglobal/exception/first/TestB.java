package com.ustglobal.exception.first;

public class TestB {
	
 public static void main(String[] args) {
	System.out.println("main strated");
	
	int a= 10;
	int b = 5;
	try {
		 b=10/5;
		 
		 System.out.println("hello");
		 System.out.println("happy deepvali");
		 
		
	}catch(ArithmeticException ae) {
		System.out.println("number is divided by zero");
	}
	
	System.out.println(b);

	
	
	
	System.out.println("main ended");
}

}
