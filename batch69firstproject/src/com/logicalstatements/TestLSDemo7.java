package com.logicalstatements;

import java.util.Scanner;

//WAP to find the Description  of the T shirt.
public class TestLSDemo7 {

	public static void main(String[] args) {

		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter T-shirt size : ");
		int ts = sc.nextInt();
		
//		Cannot switch on a value of type double. 
//		Only convertible int values, strings or enum variables are permitted

		switch (ts) {
		case 36 -> System.out.println("T-shirt size is small");
		case 38 -> System.out.println("T-shirt size is Medium");
		case 40 -> System.out.println("T-shirt size is Large");
		case 42 -> System.out.println("T-shirt size is X-Large");
		case 44 -> System.out.println("T-shirt size is XX-Large");
		default -> System.out.println("Entered size is not availble : ");

		}

	}

}
