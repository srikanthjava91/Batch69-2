package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo17 {

	// 371
	static boolean isArmstrong(int n) {
		boolean status = false;

		String s = Integer.toString(n);// 371
		int digitCount = s.length();// 3
		int temp = n;
		int r = 0;
		int sumP = 0;

		while (n != 0) {
			r = n % 10;// 371%10=1, 37%10=7,3%10=3
			n = n / 10;// 371/10 =37,37/10=3,3/10=0
			sumP = (int) (sumP + Math.pow(r, digitCount));
		}

		if (temp == sumP) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();

		boolean status = isArmstrong(n);

		if (status) {
			System.out.println("The Given number is Armstrong ");
		} else {
			System.out.println("Th Given  number is not armstrong ");
		}
	}
}
