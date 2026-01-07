package com.languagefundamentals.constructors;

public class Employee {

	int eid;
	String ename;
	double salary;
	int age;

	Employee() {
		System.out.println("No arg constructor !");
		eid = 100;
		ename = "unknown";
		salary = 100000.00;
		age = 18;
	}

	Employee(int eid) {
		this();//calling the no arg constructor 
		System.out.println("one arg constructor called ");
		this.eid = eid;
	}

	Employee(int eid, String ename) {
		this(eid);
		System.out.println("Two arg constructor called !");
		this.ename = ename;
	}

	Employee(int eid, String ename, double salary) {
		this(eid, ename);
		System.out.println("Three arg constructor called ");
		this.salary = salary;

	}

	Employee(int eid, String ename, double salary, int age) {
		this(eid, ename, salary);
		System.out.println("Four arg constructor called ");
		this.age = age;

	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Employee e1 = new Employee();
		e1.display();

		Employee e2 = new Employee(101);
		e2.display();
//
		Employee e3 = new Employee(102, "Srikanth");
		e3.display();

		Employee e4 = new Employee(103, "Vamshi", 600000.00);
		e4.display();
//
		Employee e5 = new Employee(104, "Bharath", 800000.00, 22);
		e5.display();

	}

	void display() {
		System.out.println("********************");
		System.out.println("Employee ID : " + eid);
		System.out.println("Employee Name :" + ename);
		System.out.println("Employee Salary : " + salary);
		System.out.println("Employee Age : " + age);
	}

}
