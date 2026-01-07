package com.test;

import java.util.Scanner;

public class CarryTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		System.out.println("Enter a number: ");
		int b = sc.nextInt();

		int carry = 0;
		int count = 0;

		while (a > 0 || b > 0) {
			int r1 = a % 10;
			int r2 = b % 10;

			if ((r1 + r2) + carry >= 10) {
				count++;
				carry++;
			}

			a = a / 10;
			b = b / 10;
		}

		System.out.println("count : " + count);
		System.out.println("Carry : " + carry);
	}

}
