package com.mycompany.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.repository.MnMainDAO;

@Service
public class MnServiceImpl implements MnService {
	
	@Autowired
	MnMainDAO dao;

	@Override
	public int total(int cinema_num) throws Exception {
		return dao.total(cinema_num);
	}

	@Override
	public int today(int cinema_num) throws Exception {
		return dao.today(cinema_num);
	}

	@Override
	public int month(int cinema_num) throws Exception {
		return dao.month(cinema_num);
	}
	

}//MnServiceImpl
