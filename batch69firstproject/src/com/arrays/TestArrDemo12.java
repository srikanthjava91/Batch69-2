package com.arrays;

public class TestArrDemo12 {

	public static void main(String[] args) {

		String[][] names = new String[2][3];

		names[0][0] = "Abhi";
		names[0][1] = "Tilak";
		names[0][2] = "Sky";

		names[1][0] = "Ishan";
		names[1][1] = "Varun";
		names[1][2] = "Hardik";

//		for (int i = 0; i < names.length; i++) {
//			for (int j = 0; j < names[i].length; j++) {
//				System.out.print(names[i][j] + " | ");
//			}
//			System.out.println();
//
//		

		for (String[] arr1 : names) {
			for (String arr : arr1) {
				System.out.print(arr + " | ");
			}
			System.out.println();

		}

	}

}
