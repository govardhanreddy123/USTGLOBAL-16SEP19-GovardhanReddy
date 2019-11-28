package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
	public static void main(String[] args) {

		TreeMap<String, Integer> lh = new TreeMap<String, Integer>();
		lh.put("bangalore",560068);
		lh.put("haryana",586004);
		lh.put("patna",621478);
//		lh.put(null,621478); null pointer exception
		
		
		
		for(Map.Entry<String, Integer> m :lh.entrySet()) {
			 String key = m.getKey();
			 Integer value = m.getValue();
			 System.out.println("key is "+key);
			 System.out.println("value is"+value);
			 System.out.println("=====================");
		}
	}

}
