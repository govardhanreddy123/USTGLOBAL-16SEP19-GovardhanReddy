package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("deepa");
		hs.add("samantha");
		hs.add("divya");
		hs.add("anu");
		hs.add("kajool");
		hs.add("deepa");
		
		System.out.println("================ Using for each =================");
		for(String s:hs) {
			System.out.println(s);
		}
		System.out.println("============== USING iTERATOR====================");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			String p= it.next();
			System.out.println(p);
		}
		
	}

}
