package com.ustglobal.springmvcassessment.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.springmvcassessment.beans.Retailer;
import com.ustglobal.springmvcassessment.dao.ProductDAO;

@Service
public class RetailerServiceImpl implements RetailerService {
	 
	@Autowired
	private ProductDAO dao;
	@Override
	public int createProfile(Retailer bean) {
		// TODO Auto-generated method stub
		return  dao.createProfile(bean);
	}

	@Override
	public Retailer login(int id, String password) {
		// TODO Auto-generated method stub
		return dao.login(id, password);
	}

	@Override
	public Retailer search(int id) {
		// TODO Auto-generated method stub
		return dao.search(id);
	}

	@Override
	public boolean updatePassword(int id, String password) {
		// TODO Auto-generated method stub
		return dao.updatePassword(id, password);
	}

}
