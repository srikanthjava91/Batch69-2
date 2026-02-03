package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to find the given number is perfect number or not ..?
//input 6 
//output : true --> the given number is perfect.

//input 28 
//output : true --> the given number is perfect.

//input 24: 
//ouput : false --> the given number is not perfect.
public class TestLPDemo6 {

	static boolean isPerfect(int n) {
		boolean status = false;
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;// 1 2 3 = 6
			}
		}

		if (sum == n) {
			status = true;
		}

		return status;

	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		int n = sc.nextInt();// 6

		boolean status = isPerfect(n);

		if (status) {
			System.out.println("The given number is Perfect : :");
		} else {
			System.out.println("The given number is not a Perfect : :");
		}

	}

}
