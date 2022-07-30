package com.mycompany.myapp.dto;

import java.sql.Date;

public class MovieCommentsDTO {
	
	private String id;
	private String movie_num;
	private String name;
	private String comment;
	private double score;
	private Date updatedate;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public MovieCommentsDTO(String id, String movie_num, String name, String comment, double score, Date updatedate) {
		this.id = id;
		this.movie_num = movie_num;
		this.name = name;
		this.comment = comment;
		this.score = score;
		this.updatedate = updatedate;
	}
	public MovieCommentsDTO() {
	}
	
	
}  //MovieCommentsDTO
