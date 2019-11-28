package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestD {
	public static void main(String[] args) {

		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
		lh.put("bangalore",560068);
		lh.put("haryana",586004);
		lh.put("patna",621478);
		
		for(Map.Entry<String, Integer> m :lh.entrySet()) {
			
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("key is "+key+"====="+"value "+value);
			System.out.println("===========");
			
		}
	}

}
