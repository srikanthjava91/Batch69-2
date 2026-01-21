package com.operators;

//Ternary Operators  -> ? :
//syntax : (condition)?st1:st2
public class TestOpDemo8 {

	public static void main(String[] args) {

		int a1 = 10;
		int b1 = 20;
		int c1 = 30;
		int max2 = 0;

		max2 = (a1 > b1) ? (a1 > c1 ? a1 : c1) : (b1 > c1 ? b1 : c1);

		System.out.println("Max value : : " + max2);

		System.out.println("**************************");
		int a = 10;
		int b = 20;
		int max = 0;

		max = (a > b) ? a : b;
		System.out.println("max value is : " + max);

		System.out.println("**************************");

		String s1 = "Srikanth";
		String s2 = "Java";
		String max1 = "";

		max1 = (s1.length() > s2.length()) ? s1 : s2;
		max = (s1.length() > s2.length()) ? s1.length() : s2.length();

		System.out.println("Max String is : " + max1 + " And the length is : " + max);

	}

}
