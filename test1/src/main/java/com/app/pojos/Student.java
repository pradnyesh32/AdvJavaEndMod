package com.app.pojos;

import javax.persistence.Entity;

@Entity
public class Student extends BaseEntity {
	
	private String sname;
	private double average;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	
	
	
	public Student() {
		super();
	}
	public Student(String sname, double average) {
		super();
		this.sname = sname;
		this.average = average;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", average=" + average + "]";
	}
	
	
	

}
