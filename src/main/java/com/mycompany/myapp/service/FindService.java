package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.MemberVo;

public interface FindService {
	
	public abstract String findId(MemberVo vo) throws Exception;
	
	public abstract String findPw(MemberVo vo) throws Exception;
	
	public abstract void updatePw(MemberVo vo) throws Exception;
}
