package com.mycompany.myapp.dto;

import java.util.Date;

public class MovieScreeningDTO {

	private String movie_num;
	private String title;
	private Date opening_day;
	private String film_rate;
	private String running_time;
	private double avg_score;
	public String getMovie_num() {
		return movie_num;
	}
	public void setMovie_num(String movie_num) {
		this.movie_num = movie_num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getOpening_day() {
		return opening_day;
	}
	public void setOpening_day(Date opening_day) {
		this.opening_day = opening_day;
	}
	public String getFilm_rate() {
		return film_rate;
	}
	public void setFilm_rate(String film_rate) {
		this.film_rate = film_rate;
	}
	public String getRunning_time() {
		return running_time;
	}
	public void setRunning_time(String running_time) {
		this.running_time = running_time;
	}
	public double getAvg_score() {
		return avg_score;
	}
	public void setAvg_score(double avg_score) {
		this.avg_score = avg_score;
	}
	public MovieScreeningDTO(String movie_num, String title, Date opening_day, String film_rate, String running_time,
			double avg_score) {
		this.movie_num = movie_num;
		this.title = title;
		this.opening_day = opening_day;
		this.film_rate = film_rate;
		this.running_time = running_time;
		this.avg_score = avg_score;
	}
	public MovieScreeningDTO() {
	}
	@Override
	public String toString() {
		return "MovieScreeningDTO [movie_num=" + movie_num + ", title=" + title + ", opening_day=" + opening_day
				+ ", film_rate=" + film_rate + ", running_time=" + running_time + ", avg_score=" + avg_score + "]";
	}
	
	
	//현재 상영작 표시를 위한 DTO 작성
	
	
}
