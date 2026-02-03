package com.logicalstatements.loops;

//Q) WAP to print even numbers & odd numbers using if from 0 to 100.?
public class TestLPDemo2 {

	public static void main(String[] args) {
		System.out.println("main method staretd !");

		for (int i = 2; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		System.out.println("***************");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
	}
}
