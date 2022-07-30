package com.mycompany.myapp.dto;

public class BookingDTO {
	
	private String movie_num;
	private String local_info_city;
	private String local_info_dist;
	private String movie_start_time;
	public String getMovie_num() {
		return movie_num;
	}
	public void setMovie_num(String movie_num) {
		this.movie_num = movie_num;
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
	public BookingDTO(String movie_num, String local_info_city, String local_info_dist, String movie_start_time) {
		this.movie_num = movie_num;
		this.local_info_city = local_info_city;
		this.local_info_dist = local_info_dist;
		this.movie_start_time = movie_start_time;
	}
	public BookingDTO() {
	}
	@Override
	public String toString() {
		return "BookingDTO [movie_num=" + movie_num + ", local_info_city=" + local_info_city + ", local_info_dist="
				+ local_info_dist + ", movie_start_time=" + movie_start_time + "]";
	}
	
	
}