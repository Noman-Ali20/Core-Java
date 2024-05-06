package demo;

import java.io.Serializable;

public class Student implements Serializable{
	private String name;
	private double marks;
	private int rollNum ;
	
	Student(String name, double marks, int rollNum){
		this.name = name;
		this.marks = marks;
		this.rollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	
}
