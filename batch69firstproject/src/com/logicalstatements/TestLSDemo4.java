package com.logicalstatements;

import java.util.Scanner;

//WAP to print Grade based on marks percentage ..? 
public class TestLSDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter mark percentage : ");
		double marksP = sc.nextDouble();

		if (marksP >= 100 || marksP < 0) {
			System.out.println("Invalid marks Percentage : ");
		} else if (marksP >= 90) {
			System.out.println("Grade A !!");
		} else if (marksP >= 80) {
			System.out.println("Grade B !!");
		} else if (marksP >= 70) {
			System.out.println("Grade C !!");
		} else if (marksP >= 60) {
			System.out.println("Grade D ");
		} else if (marksP >= 35) {
			System.out.println("Just Passed !!");
		} else {
			System.out.println("Failed !!");
		}

		System.out.println("main method ended !!");
	}

}
