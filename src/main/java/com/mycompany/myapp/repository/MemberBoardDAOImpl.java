package com.mycompany.myapp.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.domain.MemberBoardVO;
import com.mycompany.myapp.dto.PageDTO;

@Repository
public class MemberBoardDAOImpl implements MemberBoardDAO{

	@Autowired
	private SqlSession sqlSession;
	
    private static final String namespace="com.mycompany.myapp.MemberMapper";
	
	public List<MemberBoardVO> MemberBoardList(PageDTO pageDTO){
		return sqlSession.selectList(namespace+".MemberBoardList",pageDTO);			
	}   
	
	@Override
	public int getMemberListCount(PageDTO pageDTO) {
		System.out.println("pageDTO:" + pageDTO);
		return sqlSession.selectOne(namespace+".getMemberListCount",pageDTO);
	}

	@Override
	public MemberBoardVO selectMember(String id) throws Exception {
		 System.out.println("selectMember invoked");
		 System.out.println("id::123" + id);
		 return sqlSession.selectOne(namespace+".MemberBoardOne" ,id);
	}
}
