package com.operators;

//Logical Operators  && || !
public class TestOPDemo5 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;

		System.out.println(true && true);// true
		System.out.println(true && false);// false
		System.out.println(false && true);// false
		System.out.println(false && false);// false

		System.out.println(a < b && a < c && 10 < 20); // true
		System.out.println(a < b && a > c);// false
		System.out.println(a > b && a < c);// false
		System.out.println(a > b && a > c);// false

		System.out.println("*********************");
		System.out.println(true || true);// true
		System.out.println(false || true);// true
		System.out.println(true || false);// true
		System.out.println(false || false);// false
		System.out.println("******************");

		System.out.println(!true);
		System.out.println(!false);

	}

}
