package com.Ulearn.PackageService.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Address {
	
	@Id
	private String city;
	private String pin;
	private String ph;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String pin, String ph) {
		super();
		this.city = city;
		this.pin = pin;
		this.ph = ph;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pin=" + pin + ", ph=" + ph + "]";
	}
	
	

}
