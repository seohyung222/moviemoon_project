package com.mycompany.myapp.domain;

import java.util.Objects;

public class MypageVO {


   private String reservation_num; 
   private String movie_start_time;
   private String title;
   private String local_info_dist;
   private String reservation_date;
   private String seat_location;
	public String getReservation_num() {
		return reservation_num;
	}
	public void setReservation_num(String reservation_num) {
		this.reservation_num = reservation_num;
	}
	public String getMovie_start_time() {
		return movie_start_time;
	}
	public void setMovie_start_time(String movie_start_time) {
		this.movie_start_time = movie_start_time;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocal_info_dist() {
		return local_info_dist;
	}
	public void setLocal_info_dist(String local_info_dist) {
		this.local_info_dist = local_info_dist;
	}
	public String getReservation_date() {
		return reservation_date;
	}
	public void setReservation_date(String reservation_date) {
		this.reservation_date = reservation_date;
	}
	public String getSeat_location() {
		return seat_location;
	}
	public void setSeat_location(String seat_location) {
		this.seat_location = seat_location;
	}
	public MypageVO(String reservation_num, String movie_start_time, String title, String local_info_dist,
			String reservation_date, String seat_location) {
		this.reservation_num = reservation_num;
		this.movie_start_time = movie_start_time;
		this.title = title;
		this.local_info_dist = local_info_dist;
		this.reservation_date = reservation_date;
		this.seat_location = seat_location;
	}
	public MypageVO() {
	}
	@Override
	public int hashCode() {
		return Objects.hash(local_info_dist, movie_start_time, reservation_date, reservation_num, seat_location, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MypageVO other = (MypageVO) obj;
		return Objects.equals(local_info_dist, other.local_info_dist)
				&& Objects.equals(movie_start_time, other.movie_start_time)
				&& Objects.equals(reservation_date, other.reservation_date)
				&& Objects.equals(reservation_num, other.reservation_num)
				&& Objects.equals(seat_location, other.seat_location) && Objects.equals(title, other.title);
	}
   
   
}// end class
