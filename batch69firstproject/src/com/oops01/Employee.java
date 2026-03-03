package com.oops01;

//DTO 	: Data Transfer Object  
//POJO 	: Plain Old Java Object 
//Model : Data Model to connect DB entities.
public class Employee {

	private int eid;
	private String ename;
	private long mobile;
	private double salary;
	private int age;

	Employee() {

	}

	public Employee(int eid, String ename, long mobile, double salary, int age) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.mobile = mobile;
		this.salary = salary;
		this.age = age;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		if (age >= 18) {
			this.age = age;
		} else {
			System.out.println("IN valid age, age must be greater than 18");
		}

	}

}
