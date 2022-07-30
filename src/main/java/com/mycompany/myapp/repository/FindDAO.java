package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.MemberVo;
import com.mycompany.myapp.dto.FindDTO;

public interface FindDAO {

	public abstract String findId(MemberVo vo) throws Exception;
	
	public abstract String findPw(MemberVo vo) throws Exception;
	
	public abstract void updatePw(MemberVo vo) throws Exception;
	
}


