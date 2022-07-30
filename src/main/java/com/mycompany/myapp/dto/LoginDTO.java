package com.mycompany.myapp.dto;

public class LoginDTO {

	private String id;
	private String password;
	private String reservation_num;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getReservation_num() {
		return reservation_num;
	}
	public void setReservation_num(String reservation_num) {
		this.reservation_num = reservation_num;
	}
	public LoginDTO(String id, String password, String reservation_num) {
		this.id = id;
		this.password = password;
		this.reservation_num = reservation_num;
	}
	public LoginDTO() {
	}
	@Override
	public String toString() {
		return "LoginDTO [id=" + id + ", password=" + password + ", reservation_num=" + reservation_num + "]";
	}
	
	
}
