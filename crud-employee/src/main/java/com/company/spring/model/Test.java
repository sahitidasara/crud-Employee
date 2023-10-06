package com.company.spring.model;

public class Test {

	private String scienceFiction;
	private String animation;
	public Test(String scienceFiction, String animation) {
		super();
		this.scienceFiction = scienceFiction;
		this.animation = animation;
	}
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getScienceFiction() {
		return scienceFiction;
	}
	public void setScienceFiction(String scienceFiction) {
		this.scienceFiction = scienceFiction;
	}
	public String getAnimation() {
		return animation;
	}
	public void setAnimation(String animation) {
		this.animation = animation;
	}
	@Override
	public String toString() {
		return "Test [scienceFiction=" + scienceFiction + ", animation=" + animation + "]";
	}
	
	
}
