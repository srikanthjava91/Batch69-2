package com.logicalstatements.loops;

//WAP to print 0 to 10 prime numbers ..? 
public class TestLPDemo8 {

	static boolean isPrime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		for (int i = 0; i <= 10; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}

		}

	}
}
