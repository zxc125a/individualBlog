package cn.edu.scau.pl.java.test.domain;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

public class Teacher {

	private String name;
	private int age;
	private Student student;
	
	public String getName() {
		return name;
	}
	
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	public Teacher() {
		super();
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + "]";
	}
	
}
