package com.mycompany.myapp.repository;

import com.mycompany.myapp.dto.MemberDTO;

public interface LoginDAO {

	MemberDTO selectOne(String id);
	
}
