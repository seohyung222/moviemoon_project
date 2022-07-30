package com.mycompany.myapp.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.domain.MemberReplyJoinResultVO;
import com.mycompany.myapp.repository.MovieAvgScoreResultDAO;
import com.mycompany.myapp.repository.ReplyDAO;

@Service
public class ReplyServiceImpl implements ReplyService {

	
	@Autowired
	ReplyDAO dao;
	
	@Autowired
	MovieAvgScoreResultDAO avgscoredao;
	
	@Autowired
	SqlSession sqlSession;
	
	//댓글정보 서비스
	
	@Override
	public List<MemberReplyJoinResultVO> replyList(String movie_num) throws Exception {
		
	
//		avgscoredao.replyScoreList(movie_num);
		
	      
		return dao.replyList(movie_num);
	}  //replyList

	@Override
	public void replyCreate(MemberReplyJoinResultVO vo) throws Exception {

		 dao.replyCreate(vo);

	}  //replyCreate

	@Override
	public void replyUpdate(MemberReplyJoinResultVO vo) throws Exception {
		
		dao.replyUpdate(vo);

	}  //replyUpdate

	@Override
	public int replyDelete(String id) throws Exception {
		 return dao.replyDelete(id);
	}  //replyDelete

}
