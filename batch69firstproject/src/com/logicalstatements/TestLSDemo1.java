package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo1 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a value : ");
		int a = s.nextInt();

		System.out.println("Enter b value : ");
		int b = s.nextInt();

		if (a < b) {
			System.out.println("a value is smaller than b");
		} else {
			System.out.println("a value greater than b or equal");
		}
			

		System.out.println("main method ended ");
	}
}
