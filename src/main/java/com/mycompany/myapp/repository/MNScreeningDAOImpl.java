package com.mycompany.myapp.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.domain.Criteria;
import com.mycompany.myapp.domain.MNScreeningDTO;
import com.mycompany.myapp.domain.MovieAvgScoreResultVO;
import com.mycompany.myapp.domain.MovieViewJoinResultVO;


@Repository
public class MNScreeningDAOImpl implements MNScreeningDAO {

	
	@Autowired
	private SqlSession sqlSession;
	private static final String namespace="com.mycompany.myapp.mnScreeningMapper";
	
	
	@Override
	public List<MNScreeningDTO> selectTitle() throws Exception {
		return sqlSession.selectList(namespace+".mnScreeningTitle");
	}


	@Override
	public List<MNScreeningDTO> selectCinema() throws Exception {
		return sqlSession.selectList(namespace+".mnScreeningCinema");
	}


	@Override
	public List<MNScreeningDTO> selectMovieTime() throws Exception {
		return sqlSession.selectList(namespace+".mnScreeningStartTime");
	}
	
	@Override
	public List<MNScreeningDTO> selectScreeningList() throws Exception {
		
		return sqlSession.selectList(namespace+".showScreeningList");
	}
	
	@Override
	public List<MNScreeningDTO> mnScreeningListPage(int page) throws Exception {
		if(page <= 0 ) {
			page = 1;
		} 
		page = (page -1) * 10;
		return sqlSession.selectList(namespace + ".mnScreeningListPage", page);
	
	}
	@Override
	public List<MNScreeningDTO> mnScreeningListCriteria(Criteria cri) throws Exception {
		//상영으로 바꾸기
		return sqlSession.selectList(namespace + ".mnScreeningListCriteria",  cri);
	}
	@Override
	public int countPaging(Criteria cri) throws Exception {
		//상영으로 바꾸기
		return sqlSession.selectOne(namespace + ".mnScreeningListCountPaging",cri);
	}


	@Override
	public void mnScreeningRegist(MNScreeningDTO dto) throws Exception {
	     sqlSession.insert(namespace + ".InsertmnScreening" , dto); 
	}


	@Override
	public List<MNScreeningDTO> selectDist() throws Exception {
		return sqlSession.selectList(namespace + ".mnScreeningDist");
	}


	@Override
	public void delete(MNScreeningDTO dto) throws Exception {
		sqlSession.delete(namespace+".mnScreeningDelete", dto);
	}



}
