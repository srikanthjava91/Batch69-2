package com.languagefundamentals.methods;

import java.util.Scanner;

//WAP to print about you..? By using methods and scanner ..? 
public class TestMethodsDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		TestMethodsDemo4 t = new TestMethodsDemo4();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		System.out.println("Enter your gender : ");
		char gender = sc.next().charAt(0); // Method chaining

		System.out.println("Enter your first name : ");
		sc.nextLine();
		String fn = sc.nextLine();

		System.out.println("Enter your last name : ");
		String ln = sc.nextLine();

		System.out.println("******************************");
		// Calling method by passing the values : Call by value
		t.getName(fn, ln);
		t.getAge(age);
		t.getGender(gender);

		sc.close();

	}

	void getGender(char gen) {
		System.out.println("User'd Gender is  : " + gen);

	}

	void getAge(int age) {
		System.out.println("User age is : " + age);
	}

	void getName(String fname, String lname) {
		String fullName = fname + " " + lname;
		System.out.println("My Full Name is : " + fullName);
	}

}
