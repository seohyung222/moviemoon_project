package com.mycompany.myapp.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.mycompany.myapp.dto.MemberDTO;

@Repository
public class LoginDAOImpl 
        implements LoginDAO {
	
  @Autowired
  private SqlSession sqlSession;
  private static final String namespace="com.mycompany.myapp.MemberMapper";
    
    @Override
    public MemberDTO selectOne(String id) {
    	return sqlSession.selectOne(namespace+".selectOne", id);
    }

}
