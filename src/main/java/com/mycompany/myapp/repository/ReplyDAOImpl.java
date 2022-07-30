package com.mycompany.myapp.repository;
 
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.domain.MemberReplyJoinResultVO;
import com.mycompany.myapp.domain.MemberVo;
import com.mycompany.myapp.domain.ReplyVO;

 @Repository 
 public class ReplyDAOImpl implements ReplyDAO{
 
 @Autowired
 private SqlSession sqlSession;
 private static final String namespace="com.mycompany.myapp.ReplyMapper";
 
 
//댓글 목록 
	@Override
	public List<MemberReplyJoinResultVO> replyList(String movie_num)
			throws Exception {
		
	List<MemberReplyJoinResultVO> list1 = sqlSession.selectList(namespace + ".replyList", movie_num);
		
		MemberVo memberVO = new MemberVo();
		List<ReplyVO> memberReplyList = new ArrayList<>();
		
	
		 String id = null;
		 String password= null;
		 String name= null;
		 String email= null;
		 int score = 0;
		 double avgscore = 0.0;
		 String regdate= null;
		 String updatedate= null;

		
		int recordNum = 0;
		
		for(MemberReplyJoinResultVO vo : list1) {
			++recordNum;
			
			if(recordNum == 1) {
				memberVO.setId(id);
				memberVO.setPassword(password);
				memberVO.setName(name);
				memberVO.setEmail(email);
			}
			
			ReplyVO replyVO = new ReplyVO();
			
			replyVO.setId(id);
			replyVO.setMovie_num(movie_num);
			replyVO.setScore(score);
			replyVO.setAvgscore(avgscore);
			replyVO.setRegdate(regdate);
			replyVO.setUpdatedate(updatedate);
			
			memberReplyList.add(replyVO);
		}
		
		memberVO.setReplyList(memberReplyList);
		
		return list1;
	}  //replyList

	
	//댓글 삽입
	@Override
	public void replyCreate(MemberReplyJoinResultVO vo)
			throws Exception {
		sqlSession.insert(namespace + ".replyCreate", vo);
	}  //replyInsert
	
	@Override
	public void replyUpdate(MemberReplyJoinResultVO vo) 
			throws Exception {
		sqlSession.update(namespace + ".replyUpdate", vo); 
	}  //replyUpdate

	
	@Override
	public int replyDelete(String id) 
			throws Exception {
		  return sqlSession.delete(namespace + ".replyDelete", id);
	}  //replyDelete	

 }  //end class

