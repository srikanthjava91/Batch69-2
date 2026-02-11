package com.arrays;

import java.util.Scanner;

//WAP to read the elements from a SCanner and store it into an array ..?
public class TestArrDemo8 {

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
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size for an array ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter elements based on size  : " + size);
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		// For even numbers
//		System.out.println("Even numbers :");
//		for (int a : arr) {
//			if (a % 2 == 0) {
//				System.out.print(a + " ");
//			}
//		}

		// For prime number
		for (int a : arr) {
			if (isPrime(a)) {
				System.out.print(a + " ");
			}
		}

	}
}
