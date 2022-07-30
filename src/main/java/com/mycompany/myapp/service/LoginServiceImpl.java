package com.mycompany.myapp.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.domain.MemberVo;
import com.mycompany.myapp.dto.LoginDTO;
import com.mycompany.myapp.dto.MemberDTO;
import com.mycompany.myapp.repository.LoginDAO;

@Service


public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDAO dao;
	
	// 암호화
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public Map<String, Object> loginCheck(String id, String password) {
		Map<String, Object> rmap = new HashMap<>();
		
		MemberDTO member = dao.selectOne(id);
		if(member==null) {
			rmap.put("code", 1);
			rmap.put("msg", "등록된 아이디가 없습니다.");
			return rmap;
		}
		
		boolean match = bCryptPasswordEncoder.matches(password, member.getPassword());
		if(!match) {
			rmap.put("code",2);
			rmap.put("msg", "비밀번호 불일치");
			return rmap;
		}
		rmap.put("code", 0);
		rmap.put("msg","로그인완료");
		return rmap;
	}

} // class
