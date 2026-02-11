package com.arrays;

//WAP to combine two different arrays into one array..? 
public class TestArrDemo10 {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30 };// 0 1 2
		int[] b = { 40, 50, 60 };// 0 1 2

		int[] c = new int[a.length + b.length];// 0 1 2 3 4 5

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}

		for (int n : c) {
			System.out.print(n + " ");
		}

	}

}
