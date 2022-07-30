package com.mycompany.myapp.service;

import java.util.Map;

import com.mycompany.myapp.domain.MemberVo;
import com.mycompany.myapp.dto.LoginDTO;

public interface LoginService {

	Map<String, Object> loginCheck(String id, String password);
	
}
