package com.arrays;

//WAP to find minimum and maximum from Given array.
public class TestArrDemo6 {

	public static void main(String[] args) {

		int[] arr = { 5, 6, 1, 2, -3, 9 };// 0 1 2 3 4 5

		int min = arr[0];// 5 1 -3
		int max = arr[0];// 5

//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] < min) {
//				min = arr[i];
//			} else if (arr[i] > max) {
//				max = arr[i];
//			}
//		}

		for (int a : arr) {
			if (a < min) {
				min = a;
			} else if (a > max) {
				max = a;
			}
		}

		System.out.println("minimum number from a given array is : " + min);
		System.out.println("maximum number from a given array is : " + max);
	}
}
