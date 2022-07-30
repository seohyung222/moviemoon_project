package com.mycompany.myapp.repository;

import java.util.List;

import com.mycompany.myapp.domain.MemberBoardVO;
import com.mycompany.myapp.dto.PageDTO;

public interface MemberBoardDAO {
	 
	public List<MemberBoardVO> MemberBoardList(PageDTO pageDTO) throws Exception; //회원목록
                                      
	public int getMemberListCount(PageDTO pageDTO) throws Exception; //회원조회
	
	public MemberBoardVO selectMember(String id) throws Exception;
	
}
