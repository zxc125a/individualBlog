package cn.edu.scau.pl.java.test.domain;

import java.util.List;
import java.util.Map;

public class Student {

	private String name;
	private int age;
	private List<String> scoreList;
	private Map<String, Integer> scores;
	private Teacher teacher;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Student() {
		super();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public List<String> getScoreList() {
		return scoreList;
	}

	public void setScoreList(List<String> scoreList) {
		this.scoreList = scoreList;
	}

	public Map<String, Integer> getScores() {
		return scores;
	}

	public void setScores(Map<String, Integer> scores) {
		this.scores = scores;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", scoreList=" + scoreList + ", scores=" + scores
				+ ", teacher=" + teacher + "]";
	}
	
}
