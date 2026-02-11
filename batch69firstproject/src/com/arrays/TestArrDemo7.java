package com.arrays;

//WAP to print Array in reverse order..? 
public class TestArrDemo7 {

	public static void main(String[] args) {

		int[] arr = { 18, 4, 53, 1, 7, 9 };// 0 1 2 3 4 5
		// 5 4 3 2 1 0

//		for (int i = arr.length - 1; i >= 0; i--) {
//			System.out.print(arr[i] + " ");
//		}

		int start = 0;// 0
		int end = arr.length - 1;// 5
		int temp = 0;

		while (start < end) {
			temp = arr[start];// 18
			arr[start] = arr[end];// 9
			arr[end] = temp;// 18
			start++;
			end--;
		}
		
		for(int a:arr) {
			System.out.print(a + " ");
		}

	}
}
