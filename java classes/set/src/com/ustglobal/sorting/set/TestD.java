package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
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
