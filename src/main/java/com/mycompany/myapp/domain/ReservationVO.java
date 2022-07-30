package com.mycompany.myapp.domain;

public class ReservationVO {

   private String reservation_num;
   private String movie_num;
   private String id;
   private String screening_num;
   private String seat_location;
   
	public String getReservation_num() {
		return reservation_num;
	}
	public void setReservation_num(String reservation_num) {
		this.reservation_num = reservation_num;
	}
	public String getMovie_num() {
		return movie_num;
	}
	public void setMovie_num(String movie_num) {
		this.movie_num = movie_num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getScreening_num() {
		return screening_num;
	}
	public void setScreening_num(String screening_num) {
		this.screening_num = screening_num;
	}
	public String getSeat_location() {
		return seat_location;
	}
	public void setSeat_location(String seat_location) {
		this.seat_location = seat_location;
	}
	public ReservationVO(String reservation_num, String movie_num, String id, String screening_num,
			String seat_location) {
		this.reservation_num = reservation_num;
		this.movie_num = movie_num;
		this.id = id;
		this.screening_num = screening_num;
		this.seat_location = seat_location;
	}
	public ReservationVO() {
	}
	@Override
	public String toString() {
		return "ReservationVO [reservation_num=" + reservation_num + ", movie_num=" + movie_num + ", id=" + id
				+ ", screening_num=" + screening_num + ", seat_location=" + seat_location + "]";
	}
   
	
	
	
}// end class

