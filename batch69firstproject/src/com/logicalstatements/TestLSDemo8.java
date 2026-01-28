package com.logicalstatements;

import java.util.Scanner;

//WAP to calculate the values based on the symbol 
public class TestLSDemo8 {

	public static void main(String[] args) {
		System.out.println("mian method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a = sc.nextInt();

		System.out.println("Enter b value : ");
		int b = sc.nextInt();

		System.out.println("Enter a symbol like + - * / % ");
		String symb = sc.next();

		switch (symb) {
		
		case "+" -> {
			System.out.println("In addition : ");
			System.out.println(a + b);
		}
		
		case "-" -> {
			System.out.println("In Subtraction : ");
			System.out.println(a - b);
		}

		case "*" -> {
			System.out.println("In Multiplication : ");
			System.out.println(a * b);
		}

		case "/" -> {
			System.out.println("In Division : ");
			System.out.println(a / b);
		}
		case "%" -> {
			System.out.println("In modulus : ");
			System.out.println(a % b);
		}

		default -> System.out.println("Invalid symbol to proceed ");

		}

	}

}
