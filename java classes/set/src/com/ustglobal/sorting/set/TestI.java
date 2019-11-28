package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
	public static void main(String[] args) {
		
		
		SortByName sb = new  SortByName();
		SortByPincode sb1 = new SortByPincode();
		SortByMicr sb2 = new SortByMicr();
		TreeSet<Bank> ts = new TreeSet<Bank>(sb1);
//		TreeSet<Bank> ts = new TreeSet<Bank>(sb2);
//		TreeSet<Bank> ts = new TreeSet<Bank>(sb);
		Bank b1 = new  Bank("sbi", 516269, 6789541);
		Bank b2 = new  Bank("hdfc", 560017, 7895416);
		Bank b3 = new  Bank("icici", 518529, 8954175);
		Bank b4 = new  Bank("axis", 548526, 9541234);
		
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		
		System.out.println("============using iterator===========");
		
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank b = it.next();
			System.out.println("name is "+b.name);
			System.out.println("pincode is "+b.pincode);
			System.out.println("Micr is "+b.micr);
			System.out.println("================");
			
			
		}
	}

}
