package com.mycompany.myapp.dto;

import java.util.Date;

public class ReplyDTO {
	
	private String id;
	private String comment;
	private double score;
	private Date updatedate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	public ReplyDTO(String id, String comment, double score, Date updatedate) {
		this.id = id;
		this.comment = comment;
		this.score = score;
		this.updatedate = updatedate;
	}
	public ReplyDTO() {
	}
	@Override
	public String toString() {
		return "ReplyDTO [id=" + id + ", comment=" + comment + ", score=" + score + ", updatedate=" + updatedate + "]";
	}
	
	
}
