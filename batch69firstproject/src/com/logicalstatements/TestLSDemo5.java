package com.logicalstatements;

import java.util.Scanner;

//8 + 8 + 8 
//WAP to check Eligibility for Marriage in a matrimony communication.
public class TestLSDemo5 {

	public static void main(String[] args) {

		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name : ");
		String name = sc.next();// Pavan

		System.out.println("Hello Mr." + name);
		System.out.println("Enter your Salary :  ");
		double salary = sc.nextDouble();

		System.out.println("Enter your assets : ");
		double assets = sc.nextDouble();

		System.out.println("Enter your cibili score : ");
		int cibil = sc.nextInt();

		if ((salary >= 2000000.00 || assets >= 50000000.00) && cibil >= 750) {
			System.out.println("Oh Ok !! We will proceed furthur..");

			System.out.println("Enter your age !!");
			int age = sc.nextInt();
			if (age >= 27 && age <= 29) {
				System.out.println("Okay to continue !!");

				System.out.println("Enter your weight :");
				double weight = sc.nextDouble();

				if (weight >= 60 && weight <= 70) {
					System.out.println("OKay !! Enter your Height ");

					double height = sc.nextDouble();
					if (height >= 5.5 && height <= 6.2) {
						System.out.println("Okay to proceed furthur !!");

						System.out.println("DO you have Sibling ..?");
						boolean status = sc.nextBoolean();

						if (!status) {
							System.out.println("Yes !! We will get back to you !!");
						} else {
							System.out.println("OMG sorry !!");
						}

					} else {
						System.out.println("You are too short or long !! Sorry ");
					}

				} else {
					System.out.println("Sorry !! You must need to join ");
				}

			} else {
				System.out.println("Sorry your profile is not matching");
			}

		} else {
			System.out.println("Sorry !! You can Leave for the day !!");
		}

	}

}
