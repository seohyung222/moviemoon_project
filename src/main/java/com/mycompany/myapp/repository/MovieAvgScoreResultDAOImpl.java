package com.mycompany.myapp.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.domain.MovieAvgScoreResultVO;

@Repository
public class MovieAvgScoreResultDAOImpl implements MovieAvgScoreResultDAO {

	
	@Autowired
	private SqlSession sqlSession;
	private static final String namespace="com.mycompany.myapp.MovieAvgScoreResultMapper";
	
	@Override
	public void replyScoreUpdate(MovieAvgScoreResultVO vo) throws Exception {
		 sqlSession.update(namespace + ".scoreUpdate", vo);
	
	}  //replyScoreList

	@Override
	public MovieAvgScoreResultVO replyScoreSelect(String movie_num) throws Exception {
		return sqlSession.selectOne(namespace + ".scoreSelect", movie_num);
	}

}
