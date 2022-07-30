package com.mycompany.myapp.dto;

public class MnMovieFileDTO {
	
	private int view_id;
	private String movie_num;
	private String view_path;  //파일 경로
	private String view_name_key;  // 파일 암호키
	private String view_name;   //실제 파일 명
	 
	private String view_registration_time;
	private String view_modification_time;
	public int getView_id() {
		return view_id;
	}
	public void setView_id(int view_id) {
		this.view_id = view_id;
	}
	public String getMovie_num() {
		return movie_num;
	}
	public void setMovie_num(String movie_num) {
		this.movie_num = movie_num;
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
	public String getView_registration_time() {
		return view_registration_time;
	}
	public void setView_registration_time(String view_registration_time) {
		this.view_registration_time = view_registration_time;
	}
	public String getView_modification_time() {
		return view_modification_time;
	}
	public void setView_modification_time(String view_modification_time) {
		this.view_modification_time = view_modification_time;
	}
	public MnMovieFileDTO(int view_id, String movie_num, String view_path, String view_name_key, String view_name,
			String view_registration_time, String view_modification_time) {
		this.view_id = view_id;
		this.movie_num = movie_num;
		this.view_path = view_path;
		this.view_name_key = view_name_key;
		this.view_name = view_name;
		this.view_registration_time = view_registration_time;
		this.view_modification_time = view_modification_time;
	}
	public MnMovieFileDTO() {
	}
	@Override
	public String toString() {
		return "MnMovieFileDTO [view_id=" + view_id + ", movie_num=" + movie_num + ", view_path=" + view_path
				+ ", view_name_key=" + view_name_key + ", view_name=" + view_name + ", view_registration_time="
				+ view_registration_time + ", view_modification_time=" + view_modification_time + "]";
	}
	
	
	
	
}
