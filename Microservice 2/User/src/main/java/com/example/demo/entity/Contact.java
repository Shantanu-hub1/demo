package com.example.demo.entity;

public class Contact {
	
	private Long cid;
	private String email;
	private String contactname;
	
	
	private long userid;


	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Contact(Long cid, String email, String contactname, long userid) {
		super();
		this.cid = cid;
		this.email = email;
		this.contactname = contactname;
		this.userid = userid;
	}


	public Long getCid() {
		return cid;
	}


	public void setCid(Long cid) {
		this.cid = cid;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContactname() {
		return contactname;
	}


	public void setContactname(String contactname) {
		this.contactname = contactname;
	}


	public long getUserid() {
		return userid;
	}


	public void setUserid(long userid) {
		this.userid = userid;
	}
	
	

}
