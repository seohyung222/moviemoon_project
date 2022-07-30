package com.mycompany.myapp.domain;

public class MypageDTO {
	
	  private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public MypageDTO(String id) {
		this.id = id;
	}

	public MypageDTO() {
	}

	@Override
	public String toString() {
		return "MypageDTO [id=" + id + "]";
	}
	  

}
