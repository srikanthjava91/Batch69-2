package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TestArrDemo18 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many time you want to Rotate :");
		int r = sc.nextInt();

		System.out.println("Before Rotation : ");
		System.out.println(Arrays.toString(arr));

		// Rotation
		arrayRotation(arr, r);

		System.out.println("After Rotation : ");
		System.out.println(Arrays.toString(arr));
	}

	private static void arrayRotation(int[] arr, int r) {

		int start = 0;
		int end = arr.length - 1;

		// Reverse an array

		arrayReverse(arr, start, end);
		arrayReverse(arr, start, r - 1);
		arrayReverse(arr, r, end);

	}

	private static void arrayReverse(int[] arr, int start, int end) {
		int temp = 0;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;

		}

	}

}
