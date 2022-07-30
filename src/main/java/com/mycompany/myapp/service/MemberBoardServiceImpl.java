package com.mycompany.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.domain.MemberBoardVO;
import com.mycompany.myapp.dto.PageDTO;
import com.mycompany.myapp.repository.MemberBoardDAO;

@Service
public class MemberBoardServiceImpl implements MemberBoardService{
	
	@Autowired
	private MemberBoardDAO dao;
	
	@Override
	public List<MemberBoardVO> MemberBoardList(PageDTO pageDTO) throws Exception{
		return dao.MemberBoardList(pageDTO);
	}
	
	@Override
	public int getMemberListCount(PageDTO pageDTO) throws Exception {
		return dao.getMemberListCount(pageDTO);
	}

	@Override
	public MemberBoardVO selectMember(String id) throws Exception {
		return dao.selectMember(id);
	}
}
