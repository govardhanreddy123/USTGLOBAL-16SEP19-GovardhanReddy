package com.ustglobal.exception.customizeduncheckedexception;

public class InvalidAgeException extends RuntimeException {
	String message = "Invalid age below 18 years are not allowed";
	
     public InvalidAgeException() {
		// TODO Auto-generated constructor stub
	}
     public InvalidAgeException( String message) {
    	 this.message=message;
     }
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

}
