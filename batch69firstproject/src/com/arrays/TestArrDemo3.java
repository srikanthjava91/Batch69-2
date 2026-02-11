package com.arrays;

public class TestArrDemo3 {

	public static void main(String[] args) {
		int[] arr = new int[5];// 0 1 2 3 4
		System.out.println(arr);// [I@2b2fa4f7
//		System.out.println(arr[2]);

//		for (int a : arr) {
//			System.out.println(a);
//		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
