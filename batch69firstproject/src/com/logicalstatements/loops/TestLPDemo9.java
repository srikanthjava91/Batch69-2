package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print factorial of number using for loop ..?
//input : 5 
//output : 5*4*3*2*1 = 120 
public class TestLPDemo9 {

	static int findFact(int n) {
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = fact * i;// 5 20 60 120 120
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = findFact(n);
		System.out.println("Factorial of a given number is : " + f);

	}

}
