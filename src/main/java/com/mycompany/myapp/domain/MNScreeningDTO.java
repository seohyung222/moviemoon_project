package com.mycompany.myapp.domain;

import com.mycompany.myapp.dto.LoginDTO;

public class MNScreeningDTO {
   
   private String title;
   private String local_info_city;
   private String local_info_dist;
   private String movie_start_time;
   
   private int screening_num;

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getLocal_info_city() {
		return local_info_city;
	}
	
	public void setLocal_info_city(String local_info_city) {
		this.local_info_city = local_info_city;
	}
	
	public String getLocal_info_dist() {
		return local_info_dist;
	}
	
	public void setLocal_info_dist(String local_info_dist) {
		this.local_info_dist = local_info_dist;
	}
	
	public String getMovie_start_time() {
		return movie_start_time;
	}
	
	public void setMovie_start_time(String movie_start_time) {
		this.movie_start_time = movie_start_time;
	}
	
	public int getScreening_num() {
		return screening_num;
	}
	
	public void setScreening_num(int screening_num) {
		this.screening_num = screening_num;
	}

	public MNScreeningDTO(String title, String local_info_city, String local_info_dist, String movie_start_time,
			int screening_num) {
		this.title = title;
		this.local_info_city = local_info_city;
		this.local_info_dist = local_info_dist;
		this.movie_start_time = movie_start_time;
		this.screening_num = screening_num;
	}

	public MNScreeningDTO() {
	}

	@Override
	public String toString() {
		return "MNScreeningDTO [title=" + title + ", local_info_city=" + local_info_city + ", local_info_dist="
				+ local_info_dist + ", movie_start_time=" + movie_start_time + ", screening_num=" + screening_num + "]";
	}
   
	
   
}
