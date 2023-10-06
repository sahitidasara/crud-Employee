package com.hiber;

import javax.persistence.Embeddable;

@Embeddable
public class Address123 {
private String country;
private String state;
public String getcountry() {
	return country;
}
public void setcountry(String country) {
	this.country = country;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public Address123(String country, String state) {
	super();
	this.country = country;
	this.state = state;
}
public Address123() {
	super();
	// TODO Auto-generated constructor stub
}


}
