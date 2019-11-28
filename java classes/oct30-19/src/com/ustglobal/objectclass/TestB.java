package com.ustglobal.objectclass;

public class TestB {
	public static void main(String[] args) {
		pen p =new pen();
		int pHashCode =p.hashCode();
		System.out.println("hash code of p "+pHashCode);
		
		pen q =new pen();
		int qHashCode =q.hashCode();
		System.out.println("hash code of q "+qHashCode);
		
		
		
	}

}
