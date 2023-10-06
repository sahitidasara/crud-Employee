package com.hiber;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
//@Table(name="empdetails2")
public class Employee {

	@Id  
	private int id;
	private String name;
	private String city;
	private Address123 ad;
	public Employee(int id, String name, String city,Address123 ad) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.ad =ad;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address123 getAd() {
		return ad;
	}
	public void setAd(Address123 ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", ad=" + ad + "]";
	}
	
}
