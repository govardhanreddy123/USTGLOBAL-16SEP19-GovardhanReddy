package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {


		TreeSet hs = new TreeSet();

		hs.add(12);
		hs.add(45);
		hs.add(57);
		hs.add(55);
//		hs.add(null);  null pointer exception
//		hs.add("deepika"); classcast exception
		

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


