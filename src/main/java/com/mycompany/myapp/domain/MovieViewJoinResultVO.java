package com.mycompany.myapp.domain;

import java.util.Date;
import java.util.List;

public class MovieViewJoinResultVO {

	/* movie */
	private String movie_num;  //pk
	private String title; //영화 제목
	private String story;	//줄거리
	private String actor;	//출연진
	private String director;	//감독
	private String opening_day;	//영화 개봉일
	private String closing_day;   // 영화 종영일 
	private Date registration_time; //영화 등록 시간 
	private Date modification_time;
	private String film_rate;	//관람등급
	private String running_time;	//상영시간
	private double avg_score;	// 영화별 평점
	private String movie_genre;  //영화 장르
	
	/* view */
	private String view_path;  //파일 경로
	private String view_name_key;  // 파일 암호키
	private String view_name;   //실제 파일 명
	 
	private Date view_registration_time;
	private Date view_modification_time;
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
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getOpening_day() {
		return opening_day;
	}
	public void setOpening_day(String opening_day) {
		this.opening_day = opening_day;
	}
	public String getClosing_day() {
		return closing_day;
	}
	public void setClosing_day(String closing_day) {
		this.closing_day = closing_day;
	}
	public Date getRegistration_time() {
		return registration_time;
	}
	public void setRegistration_time(Date registration_time) {
		this.registration_time = registration_time;
	}
	public Date getModification_time() {
		return modification_time;
	}
	public void setModification_time(Date modification_time) {
		this.modification_time = modification_time;
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
	public String getMovie_genre() {
		return movie_genre;
	}
	public void setMovie_genre(String movie_genre) {
		this.movie_genre = movie_genre;
	}
	public String getView_path() {
		return view_path;
	}
	public void setView_path(String view_path) {
		this.view_path = view_path;
	}
	public String getView_name_key() {
		return view_name_key;
	}
	public void setView_name_key(String view_name_key) {
		this.view_name_key = view_name_key;
	}
	public String getView_name() {
		return view_name;
	}
	public void setView_name(String view_name) {
		this.view_name = view_name;
	}
	public Date getView_registration_time() {
		return view_registration_time;
	}
	public void setView_registration_time(Date view_registration_time) {
		this.view_registration_time = view_registration_time;
	}
	public Date getView_modification_time() {
		return view_modification_time;
	}
	public void setView_modification_time(Date view_modification_time) {
		this.view_modification_time = view_modification_time;
	}
	public MovieViewJoinResultVO(String movie_num, String title, String story, String actor, String director,
			String opening_day, String closing_day, Date registration_time, Date modification_time, String film_rate,
			String running_time, double avg_score, String movie_genre, String view_path, String view_name_key,
			String view_name, Date view_registration_time, Date view_modification_time) {
		this.movie_num = movie_num;
		this.title = title;
		this.story = story;
		this.actor = actor;
		this.director = director;
		this.opening_day = opening_day;
		this.closing_day = closing_day;
		this.registration_time = registration_time;
		this.modification_time = modification_time;
		this.film_rate = film_rate;
		this.running_time = running_time;
		this.avg_score = avg_score;
		this.movie_genre = movie_genre;
		this.view_path = view_path;
		this.view_name_key = view_name_key;
		this.view_name = view_name;
		this.view_registration_time = view_registration_time;
		this.view_modification_time = view_modification_time;
	}
	public MovieViewJoinResultVO() {
	}
	@Override
	public String toString() {
		return "MovieViewJoinResultVO [movie_num=" + movie_num + ", title=" + title + ", story=" + story + ", actor="
				+ actor + ", director=" + director + ", opening_day=" + opening_day + ", closing_day=" + closing_day
				+ ", registration_time=" + registration_time + ", modification_time=" + modification_time
				+ ", film_rate=" + film_rate + ", running_time=" + running_time + ", avg_score=" + avg_score
				+ ", movie_genre=" + movie_genre + ", view_path=" + view_path + ", view_name_key=" + view_name_key
				+ ", view_name=" + view_name + ", view_registration_time=" + view_registration_time
				+ ", view_modification_time=" + view_modification_time + "]";
	}
	
	

}
