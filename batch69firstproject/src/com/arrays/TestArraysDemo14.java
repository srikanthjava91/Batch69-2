package com.arrays;

public class TestArraysDemo14 {

	public static void main(String[] args) {

		int[][] n = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90, 100, 110 } };
		System.out.println(n);

		for (int i = 0; i <= n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
	}
}
