package com.arrays;

import java.util.Arrays;

public class TestArrDemo16 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int temp = 0;
		int count = 0;
		int count1 = 0;

		System.out.println("Before Sorting ");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		for (int i = 0; i < arr.length - 1; i++) {
			count++;
			boolean flag = false;

			for (int j = 0; j < arr.length - 1 - i; j++) {
				count1++;
				if (arr[j + 1] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}

			}

			if (!flag) {
				break;
			}
		}

		System.out.println("Count : " + count);
		System.out.println("Count1 : " + count1);

		System.out.println();
		System.out.println("After Sorting ");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
