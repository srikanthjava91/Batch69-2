package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo3 {

	public static void main(String[] args) {

		System.out.println("main method strated ");
		Scanner s = new Scanner(System.in);

		System.out.println("Are you coming classes regularly ..? ");
		boolean areYouAttendingClasses = s.nextBoolean();

		System.out.println("Are you attending Labs regularly ..? ");
		boolean areYouAttendingLabs = s.nextBoolean();

		System.out.println("Are you attending Weekly Exams ..? ");
		boolean areYouAttendingExams = s.nextBoolean();

		System.out.println("Are you attending Every week Mocks ..? ");
		boolean areYouAttendingMocks = s.nextBoolean();

		System.out.println("Are you serious about your job ");
		boolean areYouSerious = s.nextBoolean();

		if (areYouAttendingClasses && areYouAttendingLabs && areYouAttendingExams && areYouAttendingMocks
				&& areYouSerious) {
			System.out.println("You will get a job in 6 months pakka Gaurenty !!");
		} else {
			System.out.println("God will save you !!");
		}

	}

}
