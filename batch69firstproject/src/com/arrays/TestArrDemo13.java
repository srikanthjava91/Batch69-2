package com.arrays;

public class TestArrDemo13 {

	public static void main(String[] args) {

		int[][] arr = new int[2][];// 0 1

		arr[0] = new int[3];// 0 1 2
		arr[1] = new int[3];// 0 1 2

		arr[0][0] = 100;
		arr[1][1] = 200;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
