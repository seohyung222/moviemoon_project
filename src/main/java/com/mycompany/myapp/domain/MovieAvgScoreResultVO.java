package com.mycompany.myapp.domain;

import java.util.Date;

public class MovieAvgScoreResultVO {

	
	private String movie_num;  //pk
	private double avg_score;	// 영화별 평점
	
	private String id;
	private int score;
	public String getMovie_num() {
		return movie_num;
	}
	public void setMovie_num(String movie_num) {
		this.movie_num = movie_num;
	}
	public double getAvg_score() {
		return avg_score;
	}
	public void setAvg_score(double avg_score) {
		this.avg_score = avg_score;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public MovieAvgScoreResultVO(String movie_num, double avg_score, String id, int score) {
		this.movie_num = movie_num;
		this.avg_score = avg_score;
		this.id = id;
		this.score = score;
	}
	public MovieAvgScoreResultVO() {
	}
	@Override
	public String toString() {
		return "MovieAvgScoreResultVO [movie_num=" + movie_num + ", avg_score=" + avg_score + ", id=" + id + ", score="
				+ score + "]";
	}
	
	

}
