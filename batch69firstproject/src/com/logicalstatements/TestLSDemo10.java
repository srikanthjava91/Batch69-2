package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo10 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Category ");
		String catg = sc.next();

		switch (catg) {
		case "veg" -> {
			System.out.println("Enter Item : ");
			String item = sc.next();

			switch (item) {
			case "tmt" -> System.out.println("Tomoto and the price is 100rs Kg");
			case "ptt" -> System.out.println("Potato and the price is 60rs kp");
			case "drm" -> System.out.println("Drumstics and the rices is 150rs kg");
			case "brn" -> System.out.println("Brinjal and the price is 50rs kg");
			default -> System.out.println("Entered item is out of the stock ");
			}
		}

		case "fruits" -> {
			System.out.println("Enter item : ");
			String item = sc.next();

			switch (item) {
			case "bnn" -> System.out.println("Banana 12 p 100rs");
			case "app" -> System.out.println("Apple 12 p 500rs ");
			case "orn" -> System.out.println("Oranges 12 p 200rs ");
			default -> System.out.println("Entered item is out of the stock ");

			}
		}
		}
		System.out.println("main method ended ");
	}
}
