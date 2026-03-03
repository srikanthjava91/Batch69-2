package com.arrays;

import java.util.Arrays;

public class TestArrDemo17 {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 3, 1, 2 };
		int temp = 0;

		System.out.println("Before Sorting ");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			int minIndex = i; // 0 1 2 4

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;

		}

		System.out.println("After Sorting ");
		System.out.println(Arrays.toString(arr));
	}

}
