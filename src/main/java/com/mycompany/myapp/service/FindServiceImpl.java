package com.mycompany.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.domain.MemberVo;
import com.mycompany.myapp.repository.FindDAO;

@Service


public class FindServiceImpl implements FindService {

	@Autowired
	private FindDAO dao;
	
	@Override
	public String findId(MemberVo vo) throws Exception {
		 return dao.findId(vo);
	} //findId

	@Override
	public String findPw(MemberVo vo) throws Exception {
		return dao.findPw(vo);
	} //findPw
	
	
	@Override
	public void updatePw(MemberVo vo) throws Exception {
		dao.updatePw(vo);
	} //updatePw

	
	
}
