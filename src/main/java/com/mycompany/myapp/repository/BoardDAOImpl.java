package com.mycompany.myapp.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mycompany.myapp.domain.BoardVO;
import com.mycompany.myapp.domain.Criteria;

@Controller
public class BoardDAOImpl 
	implements BoardDAO {
	
	@Autowired 
	private SqlSession sqlSession;
	private final String namespace = "com.mycompany.myapp.BoardMapper";
	
	
	@Override
	public void create(BoardVO vo) throws Exception {
		sqlSession.insert(namespace + ".create", vo);
	}//create
	

	@Override
	public BoardVO read(int bno) throws Exception {	
		return sqlSession.selectOne(namespace + ".read", bno);
	}//read

	@Override
	public void update(BoardVO vo) throws Exception {
		sqlSession.update(namespace + ".update", vo);		
	}//update

	@Override
	public void delete(Integer bno) throws Exception {
		sqlSession.delete(namespace+".delete", bno);		
	}//delete

	@Override
	public List<BoardVO> listAll() throws Exception {	
		return sqlSession.selectList(namespace+".listAll");
	}//listAll

	@Override
	public List<BoardVO> listPage(int page) throws Exception {
		if(page <= 0) {
			page = 1;
		}
		page = (page-1)*10;
		
		return sqlSession.selectList(namespace + "listPage", page);
	}//listPage


	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {		
		return sqlSession.selectList(namespace + ".listCriteria", cri);
	}//listCriteria


	@Override
	public int countPaging(Criteria cri) throws Exception {		
		return sqlSession.selectOne(namespace + ".countPaging", cri);
	}//countPaging

}//endclass
