package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to find count of the digits from given number.

//input : 567
//output : 3 

//input : 12345677
//output : 8
public class TestLPDemo14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();//123
		int count = 0;

		while (n != 0) {
			n = n/10;//123/10=12,12/10=1,1/10=0
			count++;
		}
		
		System.out.println("Count : " + count);

	}

}
