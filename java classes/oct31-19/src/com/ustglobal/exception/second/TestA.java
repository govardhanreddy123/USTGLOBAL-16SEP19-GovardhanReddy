package com.ustglobal.exception.second;

public class TestA {
	public static void main(String[] args) {
		System.out.println("main method");
		try {
		Thread.sleep(3000);
		System.out.println("inside try");
		}catch(InterruptedException ae) {
			System.out.println("exception caugth");
			ae.printStackTrace();
			
		}
		System.out.println("main ended");
		
	}

}
