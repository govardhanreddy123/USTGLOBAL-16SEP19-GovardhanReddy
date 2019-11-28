package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByMicr implements Comparator<Bank> {

	@Override
	public int compare(Bank x, Bank y) {
		// TODO Auto-generated method stub
		Long i = x.micr;
		Long j = y.micr;
		return i.compareTo(j);

	}

}
