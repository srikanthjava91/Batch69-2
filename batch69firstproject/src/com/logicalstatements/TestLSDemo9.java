package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a = sc.nextInt();

		System.out.println("Enter b value : ");
		int b = sc.nextInt();

		System.out.println("Enter a symbol like + - * / % ");
		String symb = sc.next();

		int result = 0;

		switch (symb) {
		case "+" -> result = a + b;
		case "-" -> result = a - b;
		case "*" -> result = a * b;
		case "/" -> result = a / b;
		case "%" -> result = a % b;
		default -> System.out.println("Invalid symbol : ");

		}

		System.out.println("The resulted value is : " + result);

	}

}
