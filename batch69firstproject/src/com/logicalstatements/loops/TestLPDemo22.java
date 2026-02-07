package com.logicalstatements.loops;

//Q) WAP to swap the variable using third variable.?
//Q) WAP to swap the variable without using third variable.?
public class TestLPDemo22 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		a = a + b;// 30
		b = a - b;// 10
		a = a - b;// 20

		System.out.println("********************");
		int i = 10;
		int j = 20;

		int temp = 0;

		temp = i;
		i = j;
		j = temp;

		System.out.println("i value : " + i);
		System.out.println("j value : " + j);

	}

}
