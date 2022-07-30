package com.mycompany.myapp.domain;

import java.sql.Date;
import java.util.List;

public class MemberBoardVO {
	//아이디
	private String id;
	//이름
	private String name;
	//이메일
	private String email;
	//가입날짜
	private String regdate;
	//수정날짜 
	private String updatedate;
	//회원 connection 시간
	private String connection_time;
	//회원 disconnected 시간
	private String disconnected_time;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}
	public String getConnection_time() {
		return connection_time;
	}
	public void setConnection_time(String connection_time) {
		this.connection_time = connection_time;
	}
	public String getDisconnected_time() {
		return disconnected_time;
	}
	public void setDisconnected_time(String disconnected_time) {
		this.disconnected_time = disconnected_time;
	}
	public MemberBoardVO(String id, String name, String email, String regdate, String updatedate,
			String connection_time, String disconnected_time) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.regdate = regdate;
		this.updatedate = updatedate;
		this.connection_time = connection_time;
		this.disconnected_time = disconnected_time;
	}
	public MemberBoardVO() {
	}
	
	
}



