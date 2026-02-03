package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print divisors or factors of a given number.?
//input  : 10 
//output : 1 2 5 10 

//input : 28 
//output : 1 2 4 7 14 28 

//input : 16 
//output : 1 2 4 8 16 

//input : 24 
//output : 1 2 3 4 6 8 12 24 

//input : 6 
//ouput : 1 2 3 6 
public class TestLPDemo3 {

	public static void main(String[] args) {

		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		int n = sc.nextInt();// 6

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(n);
	}
}
