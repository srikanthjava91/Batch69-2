package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to find even numbers sum and odd numbers sum and 
//find the evensum -oddsum value from a given number..?

//input : 1234 --> 2+ 4= 6, 1+ 3 = 4 --> 6-4 = 2  
//output : 2 

//input : 345 : --> 4 , 3+5=8, 4-8 = -4 
//output : -4 
public class TestLpDemo23 {

	// 1234
	static int solution(int n) {
		int evenSum = 0;
		int oddSum = 0;
		int r = 0;

		while (n > 0) {
			r = n % 10;

			if (r % 2 == 0) {
				evenSum = evenSum + r;// 4+2=6
			} else {
				oddSum = oddSum + r;// 3+1 = 4
			}

			n = n / 10;
		}

		return evenSum - oddSum;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		System.out.println("result : " + solution(n));

	}
}
