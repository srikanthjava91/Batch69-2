package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print fibonacci series ..? 
//input : 10 
//ouput : 0 1 1 2 3 5 8 13 21 34 
public class TestLPDemo11 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a to represent series ");
		int n = sc.nextInt();

		int n1 = 0;
		int n2 = 1;
		int n3 = 0;

		System.out.print(n1 + " " + n2); // 0 1 1 2 3
		for (int i = 0; i < n-2; i++) {
			n3 = n1 + n2;// 2
			System.out.print(" " + n3);
			n1 = n2;// 1
			n2 = n3;// 2

		}

	}
}
