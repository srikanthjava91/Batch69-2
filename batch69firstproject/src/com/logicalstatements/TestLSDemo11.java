package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo11 {

	public static void main(String[] args) {

		System.out.println("main method strated ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day of the week ");
		int day = sc.nextInt();

		switch (day) {
		case 1 -> System.out.println("Sundays are always Holidays ");
		case 2 -> System.out.println("Mondays are always lazy days");
		case 3, 4, 5 -> System.out.println("TUE, WED, & THUR are Routine days !!");
		case 6 -> System.out.println("Fridays are always funday");
		case 7 -> System.out.println("Saturdays are happy day and game changers day !!");
		default -> System.out.println("Invalid");
		}
		System.out.println("Hello");

	}

}
