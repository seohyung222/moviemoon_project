package com.mycompany.myapp.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.domain.MemberVo;

import com.mycompany.myapp.repository.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {

@Autowired
private MemberDAO dao ;	
	
	@Override
	public void regist(MemberVo vo) throws Exception {
	       dao.insertMember(vo);
		
	} //regist
	
	
	@Override
	public void modify(MemberVo vo) throws Exception {
		dao.updateProfile(vo);
		
	} //modify


	@Override
	public int remove(MemberVo vo) throws Exception {
        
		 int userRemoveCount = dao.deleteProfile(vo);
         return userRemoveCount;
    	
	} //remove


	@Override
	public int DuplicateId(String user_id) throws Exception {
		return dao.idCheck(user_id);
		
	} //DuplicateId


	@Override
	public int DuplicateEmail(String user_email) throws Exception {
		return dao.emailCheck(user_email);
		
	} //DuplicateEmail


	@Override
	public int getNewPw(MemberVo vo) throws Exception {
        return  dao.reset_Password(vo);

	} //getNewPw


	@Override
	public void connection_time(MemberVo vo) throws Exception {
	    dao.connection_time(vo);
		
	} //connection_time


	@Override
	public void disconnected_time(MemberVo vo) throws Exception {
		dao.disconnected_time(vo);
		
	}
	
	


} //end interface
