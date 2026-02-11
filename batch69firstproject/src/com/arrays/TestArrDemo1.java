package com.arrays;

public class TestArrDemo1 {

	public static void main(String[] args) {
		System.out.println("main method srated");

		// Declaration
		int[] num;

		// Creation
		num = new int[4];// 0 1 2 3

		// Initialization
		num[0] = 10;
		num[1] = 18;
		num[2] = 1;
		num[3] = 45;

		// Representation or Accessing
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}

		// Enhanced for loop or for each loop
		for (int n : num) {
			System.out.print(n + " ");
		}

//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		System.out.println(num[3]);

	}

}
