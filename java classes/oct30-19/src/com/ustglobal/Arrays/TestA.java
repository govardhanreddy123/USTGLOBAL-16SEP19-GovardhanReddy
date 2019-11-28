package com.ustglobal.Arrays;

public class TestA {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		
		for(int i = 0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("==========================");
		
		for(int j :numbers) {
			System.out.println(j);
		}
		
		char ch[] = {'a','b','c'};
		for(int i = 0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		System.out.println("==========================");
		for (int c : ch) {
			System.out.println(c);
		}
		
		
		double[] d ={2.2,2.3,2.4,2.5};
		
			for(int i =0;i<d.length;i++) {
				System.out.println(d[i]);
			}
			
			System.out.println("======================");
			
			for(double d1:d) {
				System.out.println(d1);
			}
			byte[] b = {1,2,3,4};
			
			for(int i =0;i<b.length;i++) {
				System.out.println(b[i]);
			}
			
			System.out.println("======================");
			
			for(byte b1:b) {
				System.out.println(b1);
			}
			
			String[] s = {"raju","pavan","reddy"};
			for(int i =0;i<s.length;i++) {
				System.out.println(s[i]);
			}
			
			System.out.println("======================");
			
			for(String s1:s) {
				System.out.println(s1);
			}
			

		
		
		
		
	}

}
