package com.mycompany.myapp.dto;

import java.sql.Date;

public class MemberReplyJoinResultDTO {

	private String id;  //작성자 id pk
	private String password;  //회원 비밀번호
	private String name;  //이름 
	private String email;  //이메일
	

	private String movie_num;  //영화 번호 pk
	private String comment;  //한줄평
	
	private int score;  //별점 
	private double avgscore;  //별점평균 
	
	private String regdate;  //등록 날짜
	private String updatedate;  //수정 날짜
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
	public String getMovie_num() {
		return movie_num;
	}
	public void setMovie_num(String movie_num) {
		this.movie_num = movie_num;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public double getAvgscore() {
		return avgscore;
	}
	public void setAvgscore(double avgscore) {
		this.avgscore = avgscore;
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
	public MemberReplyJoinResultDTO(String id, String password, String name, String email, String movie_num,
			String comment, int score, double avgscore, String regdate, String updatedate) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.movie_num = movie_num;
		this.comment = comment;
		this.score = score;
		this.avgscore = avgscore;
		this.regdate = regdate;
		this.updatedate = updatedate;
	}
	public MemberReplyJoinResultDTO() {
	}
	
	

}
