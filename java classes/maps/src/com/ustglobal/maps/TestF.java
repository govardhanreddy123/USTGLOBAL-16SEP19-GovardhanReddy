package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {
	public static void main(String[] args) {
		
		
		Student s1 = new Student(2,"divya",67.12);
		Student s2 = new Student(5,"kiran",56.19);
		Student s3 = new Student(3,"santhosh",77.81);
		Student s4 = new Student(4,"mainu",70.85);
		Student s5 = new Student(1,"dinesh",57.49);
		Student s6 = new Student(9,"sabir",60.32);
		Student s7 = new Student(8,"pavan",80.24);
		Student s8 = new Student(7,"raju",75.12);
		Student s9 = new Student(6,"guru",79.91);
		
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		
	
		
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<String, ArrayList<Student>>();
	
		hm.put("first",al);
		hm.put("second",al1);
		hm.put("third",al2);
		
		
		ArrayList<Student> first= hm.get("second");
		
		Iterator<Student> it = first.iterator();
		
		while(it.hasNext()){
			Student s = it.next();
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentage is "+s.percentage);
			System.out.println("================");
			
		}
		
		
		
		
		
		
	}

}
