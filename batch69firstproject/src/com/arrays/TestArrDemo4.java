package com.arrays;

public class TestArrDemo4 {

	public static void main(String[] args) {

//		Variable must provide either dimension expressions or 
//		an array initializer
//		int[] numbers = new int[];

		// The literal 2147483648 of type int is out of range
		// the maximum int range is 2147483647
		// Java.lang.OutOfMemoryError: Requested array size exceeds VM limit
//		int[] numbers = new int[2147483647];
//		long[] numbers1 = new long[2147483647];

//		Exception in thread "main" java.lang.NegativeArraySizeException: -5
//		int[] numbers2 = new int[-5];// -4 -3 -2 -1 0

	}

}
