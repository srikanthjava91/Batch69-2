package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo2 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = s.nextInt();// 21

		System.out.println("Are you Indian ..?  ");
		boolean flag = s.nextBoolean();

		if (age > 18 && flag == true) {
			System.out.println("You are eligible for vote in India!!");
			System.out.println("You are eligible for Driving in India!!");
		} else {
			System.out.println("You are not eligible for vote !!");
		}
		System.out.println("main method ended ");

	}

}
