package com.ustglobal.Arrays;

public class TestB {
	public static void main(String[] args) {
		int[] i = {10,20,30,40};
//		System.out.println(i[5]); ArrayIndexOutOfBoundsException
		receive(i);
	}
	
	static void receive( int[] numbers) {
		
		for(int a :numbers) {
			System.out.println(a);
			
		}
		
	}
	
	static int[] getArray() {
		int[] values = {20,21,22,23};
		return values;
		}
	static String[] getstring() {
		String[] values = {"abc","dce","fgh","ijk"};
		return values;
		}
	


}

