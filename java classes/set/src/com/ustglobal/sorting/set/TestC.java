package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
	public static void main(String[] args) {

		LinkedHashSet hs = new LinkedHashSet();
		hs.add(12);
		hs.add(45);
		hs.add("deepa");
		hs.add(57.7);
		hs.add("deepa");
		hs.add(57.7);
		hs.add(null);
		hs.add(null);
		
		System.out.println("================ Using for each =================");
		for(Object o:hs) {
			System.out.println(o);
		}
		System.out.println("============== USING iTERATOR====================");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object s=it.next();
			System.out.println(s);
			
			
		}
		
			
			
		}

}
