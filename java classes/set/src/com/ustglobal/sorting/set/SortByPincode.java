package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByPincode implements Comparator<Bank> {

	@Override
	public int compare(Bank x, Bank y) {
		// TODO Auto-generated method stub
		Integer i = x.pincode;
		Integer j = y.pincode;
		return i.compareTo(j);
	}


}
