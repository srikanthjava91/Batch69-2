package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print divisors or factors of a given number.?
public class TestLPDemo4 {

	static void findFactors(int n) {
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		int n = sc.nextInt();// 6

		findFactors(n);

		System.out.println("main method ended !");
	}

}
