package com.operators;

import java.util.Scanner;

//Arithmetic Operators : + - * % /  
public class TestOpDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int a = sc.nextInt();

		System.out.println("Enter b number : ");
		int b = sc.nextInt();

		System.out.println("Sum  : " + a + b);
		System.out.println("Sum with BODMAS : " + (a + b));

//		The operator - is undefined for the argument type(s) String, int
//		System.out.println("Difference : " + b-a); CE 
		System.out.println("Difference : " + (a - b));

		System.out.println("Product of two numbers :" + a * b);
		System.out.println("Quotient of two numbers: " + a / b);
		System.out.println("Reminder of two numbers: " + a % b);

	}

}
