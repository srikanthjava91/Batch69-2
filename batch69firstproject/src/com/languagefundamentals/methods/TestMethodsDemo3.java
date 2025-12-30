package com.languagefundamentals.methods;

import java.util.Scanner;

// no return type + with arguments
public class TestMethodsDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		TestMethodsDemo3 t = new TestMethodsDemo3();

		// For reading the elements from console, we must need to create object like
		// below.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter i value : ");
		int i = sc.nextInt();

		System.out.println("Enter J vlaue : ");
		int j = sc.nextInt();
		t.addition(i, j);
		
		
//		t.subtraction(10, 20L);// int can convert long --> Implicit type casting
//		t.multiplication(5.5F, 7.9F);// float can convert to double
//		t.division(10, 2);
//		t.modulus(98, 5.0);

	}

	void addition(int a, int b) {

		System.out.println("IN addition");
		System.out.println(a + b);
	}

	void subtraction(long a, long b) {
		System.out.println("IN subtraction");
		System.out.println(a - b);
	}

	void multiplication(float a, double b) {
		System.out.println("IN multiplication");
		System.out.println(a * b);
	}

	void division(double a, double b) {
		System.out.println("IN division");
		System.out.println(a / b);
	}

	void modulus(int a, double b) {
		System.out.println("IN modulus");
		System.out.println(a % b);
	}

}
