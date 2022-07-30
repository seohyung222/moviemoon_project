package com.mycompany.myapp.dto;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.type.Alias;

public class ViewDTO {

	private String movie_num;
	private String view_path;  //파일 경로
	private String view_name_key;  // 파일 암호키
	private String view_name;   //실제 파일 명 
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
	public ViewDTO(String movie_num, String view_path, String view_name_key, String view_name) {
		this.movie_num = movie_num;
		this.view_path = view_path;
		this.view_name_key = view_name_key;
		this.view_name = view_name;
	}
	public ViewDTO() {
	}
	@Override
	public String toString() {
		return "ViewDTO [movie_num=" + movie_num + ", view_path=" + view_path + ", view_name_key=" + view_name_key
				+ ", view_name=" + view_name + "]";
	}
	
	
}
