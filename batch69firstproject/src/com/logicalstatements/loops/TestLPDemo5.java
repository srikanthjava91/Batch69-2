package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to find the given number is perfect number or not ..?
//A perfect number is a positive integer that is equal to the 
//sum of its proper divisors, excluding itself. 

//input 6 
//output : true --> the given number is perfect.

//input 28 
//output : true --> the given number is perfect.

//input 24: 
//ouput : false --> the given number is not perfect.
public class TestLPDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		int n = sc.nextInt();// 6

		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {

			if (n % i == 0) {
				sum = sum + i;// 1 2 3 = 6
			}

		}

		if (sum == n) {
			System.out.println("The Given number is perfect !!");
		} else {
			System.out.println("The Given number is not perfect !!");
		}

	}

}
