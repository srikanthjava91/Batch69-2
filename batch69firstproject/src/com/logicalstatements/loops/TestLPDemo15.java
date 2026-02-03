package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print reverse of a Given number ..? 
//WAP to check the given number is palindrome or not ..?

public class TestLPDemo15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter s number: ");
		int n = sc.nextInt();// 456 --> 654
		int r = 0;
		int rev = 0;
		int temp = n;

		while (n != 0) {
			r = n % 10;// 456%10=6, 45%10=5,4%10=4
			n = n / 10;// 456/10=45,45/10= 4, 4/10=0
			rev = rev * 10 + r;// 654
		}

		System.out.println("Reverse of a given number  : " + rev);

		if (rev == temp) {
			System.out.println("The Given number is Palindrome !");
		}else {
			System.out.println("The Given number is not Palindrome !");
		}

	}

}
