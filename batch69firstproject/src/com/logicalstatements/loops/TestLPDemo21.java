package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo21 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		String yn = "";

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number : ");
			int a = sc.nextInt();

			System.out.println("Enter b number : ");
			int b = sc.nextInt();

			System.out.println("Enter a symbol to proceed like + - * % /");
			String symb = sc.next();

			switch (symb) {

			case "+" -> System.out.println(a + b);
			case "-" -> System.out.println(a - b);
			case "*" -> System.out.println(a * b);
			case "%" -> System.out.println(a % b);
			case "/" -> System.out.println(a / b);
			default -> System.out.println("Invalid symbol ");

			}

			System.out.println("Do you want to Continue ? Click y for yes, n for No ");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));

	}

}
