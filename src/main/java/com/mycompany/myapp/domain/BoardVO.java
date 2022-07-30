package com.mycompany.myapp.domain;

import java.util.Date;

public class BoardVO {
	private Integer bno;
	private String title;
	private String content;	
	private Date regdate;
	public Integer getBno() {
		return bno;
	}
	public void setBno(Integer bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public BoardVO(Integer bno, String title, String content, Date regdate) {
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
	}
	public BoardVO() {
	}
	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", regdate=" + regdate + "]";
	}	
	
}
