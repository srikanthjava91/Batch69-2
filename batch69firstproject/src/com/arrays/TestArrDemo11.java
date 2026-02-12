package com.arrays;

public class TestArrDemo11 {

	public static void main(String[] args) {

		int[][] numbers = new int[3][3];

		System.out.println("length : " + numbers.length);// 3

		System.out.println(numbers[0].length);
		System.out.println(numbers[1].length);
		System.out.println(numbers[2].length);

//		0 1 2   0 1 2 
//		00 01 02
//		10 11 12 
//		20 21 22 

		numbers[0][0] = 101;
		numbers[0][1] = 102;
		numbers[0][2] = 103;

		numbers[1][0] = 104;
		numbers[1][1] = 105;
		numbers[1][2] = 106;

		numbers[2][0] = 107;
		numbers[2][1] = 108;
		numbers[2][2] = 109;

//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = 0; j < numbers[i].length; j++) {
//				System.out.print(numbers[i][j] +" | ");//101 102 103
//			}
//			System.out.println();
//		}

		//Enhanced for loop 
		for (int[] n1 : numbers) {
			for (int n : n1) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

	}

}
