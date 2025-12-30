package com.languagefundamentals.methods;

import java.util.Scanner;

//WAP to print about you..? By using methods and scanner ..? 
public class TestMethodsDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		TestMethodsDemo4 t = new TestMethodsDemo4();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name : ");
		String fn = sc.next();

		System.out.println("Enter your last name : ");
		String ln = sc.next();

		// Calling method by passing the values : Call by value
		t.getName(fn, ln);

	}

	void getName(String fname, String lname) {
		String fullName = fname + " " + lname;
		System.out.println("My Full Name is : " + fullName);
	}

}
