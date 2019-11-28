package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {


		HashMap hm = new HashMap();
		hm.put("raju",321456);
		hm.put ("pavan",789456);
		hm.put("reddy",569878);
		hm.put("reddy12",569878);
		
		HashMap hm1 = new HashMap();
		hm1.put("divya",321456);
		hm1.put ("priya",789456);
		hm1.put("anuu",569878);
		
		
	boolean hashkey =	hm.containsKey("raju");
	System.out.println("hashkey "+hashkey);
	
	boolean hashValue = hm.containsValue("458679");
	System.out.println("hashvalue   "+hashValue);
	
	hm.putAll(hm1);
	System.out.println("after put all"+hm);
	
	System.out.println(hm.size());
	System.out.println(hm.isEmpty());
	hm.clear();
	}
}
