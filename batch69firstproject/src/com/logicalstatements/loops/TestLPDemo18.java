package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to convert Decimal to Binary 
public class TestLPDemo18 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numnber : ");
		int n = sc.nextInt();// 18
		int r = 0;
		String bv = "";

		while (n != 0) {
			r = n % 2;// 18%2 = 0, 9%2 = 1,4%2=0,2%2=0,1%2=1
			n = n / 2;// 18/2 = 9,9/2= 4,4/2 =2,2/2=1,1/2=0
			bv = r + bv;// 10010
		}

		System.out.println("The Binary value is : " + bv);

	}
}
