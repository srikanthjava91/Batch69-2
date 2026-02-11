package com.arrays;

import java.util.Scanner;

public class TestArrDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size for an array ");
		int size = sc.nextInt();
		String[] names = new String[size];

		System.out.println("Enter names : ");
		for (int i = 0; i < size; i++) {
			names[i] = sc.next();
		}

		for (String name : names) {
			if (name.toLowerCase().contains("h")) {
				System.out.println(name);
			}
		}

	}

}
