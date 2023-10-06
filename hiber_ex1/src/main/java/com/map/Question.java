package com.map;

import java.util.List;

import javax.persistence.*;
import javax.persistence.Id;

@Entity 
public class Question {
@Id	
@Column(name="questionId")
private int quesId;

private String ques;

/*
 * @OneToOne
 * 
 * @JoinColumn(name="answer_id") private Answer ans;
 */
@OneToMany
private List<Answer> answers;

public int getQuesId() {
	return quesId;
}
public void setQuesId(int quesId) {
	this.quesId = quesId;
}
public String getQues() {
	return ques;
}
public void setQues(String ques) {
	this.ques = ques;
}

public List<Answer> getAnswers() {
	return answers;
}
public void setAnswers(List<Answer> answers) {
	this.answers = answers;
}

public Question(int quesId, String ques, List<Answer> answers) {
	super();
	this.quesId = quesId;
	this.ques = ques;
	this.answers = answers;
}
public Question() {
	super();
	// TODO Auto-generated constructor stub
}


}
