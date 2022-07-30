package com.mycompany.myapp.domain;

import java.sql.Date;

public class ReplyVO {

	private String id;
	private String movie_num;
	private String comment;
	private int score;
	private double avgscore;
	
	private String regdate;
	private String updatedate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public ReplyVO(String id, String movie_num, String comment, int score, double avgscore, String regdate,
			String updatedate) {
		this.id = id;
		this.movie_num = movie_num;
		this.comment = comment;
		this.score = score;
		this.avgscore = avgscore;
		this.regdate = regdate;
		this.updatedate = updatedate;
	}
	public ReplyVO() {
	}
	@Override
	public String toString() {
		return "ReplyVO [id=" + id + ", movie_num=" + movie_num + ", comment=" + comment + ", score=" + score
				+ ", avgscore=" + avgscore + ", regdate=" + regdate + ", updatedate=" + updatedate + "]";
	}
	
	

}
