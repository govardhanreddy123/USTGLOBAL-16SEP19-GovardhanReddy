package com.ustglobal.springmvcassessment.dao;

import com.ustglobal.springmvcassessment.beans.Retailer;

public interface ProductDAO {
	
	public int createProfile(Retailer bean);
	public Retailer login(int id,String password);
	public  Retailer search(int id);
	public boolean updatePassword(int id,String password);
	
	
	
	
	
	

}
