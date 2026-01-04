package com.languagefundamentals.constructors;

public class Student {

	int sid;
	String sname;
	int age;

	Student() {
		System.out.println("no arg constructor called ");
		sid = 101;
		sname = "unknown";
		age = 20;
	}

	Student(int sid, String sname, int age) {
		System.out.println("parameterized constructor called !");

		this.sid = sid;
		this.sname = sname;
		this.age = age;
	}

	public static void main(String[] args) {

		System.out.println("main method started !");
		// The below Object is created with the help of default constructor
		// The below Object is created with the help of no arg constructor
		Student s = new Student();
		s.show();

		Student s1 = new Student(102, "Sri", 22);
		s1.show();

		System.out.println("main method ended !");
	}

	void show() {
		System.out.println("********************");
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(age);
	}

}
