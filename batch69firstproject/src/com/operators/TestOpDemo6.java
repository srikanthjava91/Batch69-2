package com.operators;

//Bitwise Operators & | ^ ~
public class TestOpDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		System.out.println(true & true);// true
		System.out.println(true & false);// false
		System.out.println(false & true);// false
		System.out.println(false & false);// false

		System.out.println(45 & 30);// 12
		System.out.println(65 & 36);// 0
		System.out.println(87 & 23);// 23
		System.out.println(98 & 12);// 0

		System.out.println(true | true);// true
		System.out.println(false | true);// true
		System.out.println(true | false);// true
		System.out.println(false | false);// false

		System.out.println(45 | 30);// 63
		System.out.println(65 | 36);// 101
		System.out.println(87 | 23);// 87
		System.out.println(98 | 12);// 110

		System.out.println(true ^ true);// false
		System.out.println(false ^ true);// true
		System.out.println(true ^ false);// true
		System.out.println(false ^ false);// false

		System.out.println(45 ^ 30);// 63
		System.out.println(65 ^ 36);// 101
		System.out.println(87 ^ 23);// 87
		System.out.println(98 ^ 12);// 110

		System.out.println(~100);// -(n+1)

	}

}
