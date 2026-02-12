package com.arrays;

public class TestArrDemo15 {

	public static void main(String[] args) {

		int[][][] n3 = { { { 10, 20, 30 }, { 0, 0, 0 }, { 0, 0, 0 } }, { { 0, 0, 0 }, { 70, 80, 90 }, { 0, 0, 0 } },
				{ { 40, 50, 60 }, { 0, 0, 0 }, { 0, 0, 0 } } };

//		int[][][] n3 = new int[3][3][3];// 27

		for (int i = 0; i < n3.length; i++) {
			for (int j = 0; j < n3[i].length; j++) {
				for (int k = 0; k < n3[i][j].length; k++) {
					System.out.print(n3[i][j][k] + " ");
				}
				System.out.println();
			}

			System.out.println();
		}

		System.out.println("****************************");

		for (int[][] n2 : n3) {
			for (int[] n1 : n2) {
				for (int n : n1) {
					System.out.print(n);
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
