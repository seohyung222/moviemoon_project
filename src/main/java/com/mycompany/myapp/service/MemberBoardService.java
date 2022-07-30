package com.mycompany.myapp.service;

import java.util.List;

import com.mycompany.myapp.domain.MemberBoardVO;
import com.mycompany.myapp.dto.PageDTO;

public interface MemberBoardService {
	
	public List<MemberBoardVO> MemberBoardList(PageDTO pageDTO) throws Exception;
	
	public int getMemberListCount(PageDTO pageDTO) throws Exception;
	
	public MemberBoardVO selectMember(String id) throws Exception;
}
