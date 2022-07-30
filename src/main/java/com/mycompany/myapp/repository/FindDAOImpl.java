package com.mycompany.myapp.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.domain.MemberVo;
import com.mycompany.myapp.dto.FindDTO;

@Repository


public class FindDAOImpl implements FindDAO {

	@Autowired
	private SqlSession sqlSession;
	private static final String namespace = "com.mycompany.myapp.FindMapper";

	
	@Override
	public String findId(MemberVo vo) throws Exception {
		return sqlSession.selectOne(namespace+".findId", vo);
	} //findId

	
	@Override
	public String findPw(MemberVo vo) throws Exception {
		return sqlSession.selectOne(namespace+".findPw", vo);
	} //findPw
	
	
	@Override
	public void updatePw(MemberVo vo) throws Exception {
	   sqlSession.update(namespace+".updatePw", vo);
	} //updatePw

	
} //end class


