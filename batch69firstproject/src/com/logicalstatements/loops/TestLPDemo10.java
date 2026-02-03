package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print factorial of number using recursion ..?
public class TestLPDemo10 {

	static long findFact(long n) {

		if (n == 0 || n == 1) {
			return 1;
		}
		return n * findFact(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a numbe r: ");
		long n = sc.nextInt();
		long f = findFact(n);
		System.out.println("Factorial of a given number is : " + f);
	}
}
