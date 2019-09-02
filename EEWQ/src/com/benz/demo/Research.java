package com.benz.demo;

import java.util.Date;

public class Research {
	
   
    private String cName;
    private String mail;
    private String title;
    private Date date;
    
	private String univer;
    private String problem;
    public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public String getUniver() {
		return univer;
	}
	public void setUniver(String univer) {
		this.univer = univer;
	}
}
