package com.codinghub;

public class Student11 {
	
	String name;
	String section;
	int marks;
	String college;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student11 [name=" + name + ", section=" + section + ", marks=" + marks + ", college=" + college + "]";
	}
	
}
