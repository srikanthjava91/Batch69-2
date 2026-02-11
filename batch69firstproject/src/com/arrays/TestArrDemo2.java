package com.arrays;

public class TestArrDemo2 {

	public static void main(String[] args) {

		String[] names;
		names = new String[5];// 0 1 2 3 4

		names[0] = "Sky";
		names[1] = "Tilak";
		names[2] = "Ishan";
		names[3] = "Abhishek";
		names[4] = "Arshadeep";

//		for (int i = 0; i < names.length; i++) {
//			System.out.print(names[i] + " ");
//		}

		for (String name : names) {
			System.out.println(name);
		}

	}

}
