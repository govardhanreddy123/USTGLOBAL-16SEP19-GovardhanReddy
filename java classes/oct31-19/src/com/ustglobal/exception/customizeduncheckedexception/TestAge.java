package com.ustglobal.exception.customizeduncheckedexception;

public class TestAge {
 public static void main(String[] args) {
	System.out.println("main started");
	
	Validator v = new Validator();
	try {
	v.verify(12);
	}catch(InvalidAgeException e){
		System.out.println("exeception occured");
		
	}
	
	
	
	System.out.println("main ended");
}
}
