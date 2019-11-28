package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	
	public static void main(String[] args) {
		
		
		HashMap hm = new HashMap();
		 hm.put("raju",321456);
		 hm.put ("pavan",789456);
		 hm.put("reddy",569878);
		 hm.put("reddy12",569878);
		 hm.put(null,569878);
		 hm.put(null,258741);
		 
		 
		 System.out.println("data "+hm);
		 
		 hm.put("pavan",568471);
		 System.out.println("after modify"+hm);
		 
		 hm.put("dimple",985231);
		 System.out.println("after dimple"+hm);
		 
		 System.out.println("after null"+hm);
		 
		 System.out.println("after duplicate null"+hm);
		 System.out.println("=======================");
		 
		 Object phoneno = hm.get("shella");
		 System.out.println("value "+phoneno);
		 
		 System.out.println("======================");
		 
		 Object phoneno1 = hm.get("pavan");
		 System.out.println("value "+phoneno1);
		 
		 System.out.println("======================");
		 
		 Object value = hm.remove("reddy12");
		 System.out.println("value "+value);
		 
		 System.out.println("after removing ======>"+hm);
		 
		 
	}

}
