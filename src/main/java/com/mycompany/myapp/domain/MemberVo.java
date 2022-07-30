package com.mycompany.myapp.domain;

import java.sql.Date;
import java.util.List;

public class MemberVo {

	private String id;
	private String password;
	private String name;
	private String email;
	private Date regdate;
	private Date updatedate;
	private Date connection_time;
	private Date disconnected_time;
	
	

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
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



	public Date getRegdate() {
		return regdate;
	}



	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}



	public Date getUpdatedate() {
		return updatedate;
	}



	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}



	public Date getConnection_time() {
		return connection_time;
	}



	public void setConnection_time(Date connection_time) {
		this.connection_time = connection_time;
	}



	public Date getDisconnected_time() {
		return disconnected_time;
	}



	public void setDisconnected_time(Date disconnected_time) {
		this.disconnected_time = disconnected_time;
	}

	

	public MemberVo(String id, String password, String name, String email, Date regdate, Date updatedate,
			Date connection_time, Date disconnected_time, List<ReplyVO> replyvo) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.regdate = regdate;
		this.updatedate = updatedate;
		this.connection_time = connection_time;
		this.disconnected_time = disconnected_time;
		this.replyvo = replyvo;
	}
	


	public MemberVo() {
	}

	

	@Override
	public String toString() {
		return "MemberVo [id=" + id + ", password=" + password + ", name=" + name + ", email=" + email + ", regdate="
				+ regdate + ", updatedate=" + updatedate + ", connection_time=" + connection_time
				+ ", disconnected_time=" + disconnected_time + "]";
	}



	public List<ReplyVO> getReplyvo() {
		return replyvo;
	}



	public void setReplyvo(List<ReplyVO> replyvo) {
		this.replyvo = replyvo;
	}



	private List<ReplyVO> replyvo;
	
	public List<ReplyVO> setReplyList(List<ReplyVO> replyvo){ 
		return this.replyvo = replyvo; 
	}
	
	
	
	public void addReplyvo(ReplyVO vo) {
		replyvo.add(vo);
	}
	
	
}


