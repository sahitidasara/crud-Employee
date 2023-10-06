package com.map;

import javax.persistence.*;

@Entity
public class Answer {
@Id
@Column(name="answer_Id")
	private int ansId;
	private String answer;
	//ans is Answer's object in Question cls
	/*
	 * @OneToOne(mappedBy="ans") private Question question;
	 */
	
	@ManyToOne
	private Question question;
	public int getAnsId() {
		return ansId;
	}
	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Answer(int ansId, String answer) {
		super();
		this.ansId = ansId;
		this.answer = answer;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
