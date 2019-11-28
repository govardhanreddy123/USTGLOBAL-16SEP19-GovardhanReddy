package com.ustglobal.beanobject.bean;

import java.util.Scanner;

public class TestC {
	public static void main(String[] args) {
		System.out.println("scanner class");
		Scanner scn = new Scanner(System.in);
		System.out.println("enter age");
		int age = scn.nextInt();
		System.out.println("age is "+age);
		System.out.println("enter name");
		String name = scn.next();
		System.out.println("name is "+name);
		System.out.println("enter clg name");
		String clg = scn.nextLine();
		System.out.println("clg name is "+clg);
		
	}

}
