package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print sum of it's digits.?
//input : 123 
//output : 6 

//input : 456
//output : 15

public class TestLPDemo13 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter s number: ");
		int n = sc.nextInt();// 234
		int r = 0;
		int sum =0;

		while (n != 0) {
			r = n%10; //234%10=4, 23%10=3,2%10=2
			n = n/10;//234/10= 23,23/10=2,2/10=0
			sum = sum + r;
		}
		
		System.out.println("sum of all numbers : " + sum);

	}
}
