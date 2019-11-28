package com.ustglobal.java8.Predicates;

import java.util.function.Function;

public class TestB {
	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i ->i*i;
			
		
		System.out.println(f.apply(2));
		
		System.out.println(f.apply(12));
	}

}
