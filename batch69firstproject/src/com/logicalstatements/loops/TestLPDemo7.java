package com.logicalstatements.loops;

import java.util.Scanner;

// WAP to print math table for given number ..?
//input 9
//output : 
// 9 X 1 = 9 
//9 X 2 = 18
//9 X 3 = 27
//---------
public class TestLPDemo7 {
	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which number you want for Math table : ");
		int n = sc.nextInt();

		System.out.println("Enter up to where you want to print ");
		int s = sc.nextInt();

		for (int i = 1; i <= s; i++) {
			System.out.println(n + " X " + i + " = " + n * i);
		}
	}
}
