package com.mycompany.myapp.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MnMainDAOImpl 
	implements MnMainDAO{
	
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "com.mycompany.myapp.mnScreeningMapper";

	@Override
	public int total(int cinema_num) throws Exception {
		return sqlSession.selectOne(namespace + ".totalsales", cinema_num);
	}//total

	@Override
	public int today(int cinema_num) throws Exception {
		return sqlSession.selectOne(namespace + ".todaysales", cinema_num);
	}//today

	@Override
	public int month(int cinema_num) throws Exception {
		return sqlSession.selectOne(namespace+".monthsales", cinema_num);
	}//month

}//MnMainDAOImpl
