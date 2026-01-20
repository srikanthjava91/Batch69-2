package com.operators;

//Assignment Operators : += -= %= /= *= 
public class TestOpDemo2 {

	public static void main(String[] args) {
		System.out.println("main method strated ");

		int a = 10;
		int result = 0;

		result = result + a;
		System.out.println(result);

//		Type mismatch: cannot convert from double to int
//		result = result + 5.5;
//		result = (int) (result + 5.5);
		result += 5.5;// Narrowing casting //result = result + 5.5;
		System.out.println(result);// 15

		// Type mismatch: cannot convert from double to int
//		result = result -4.5;
		result -= 4.5;// result = result -4.5
		System.out.println(result);

		// Type mismatch: cannot convert from double to int
//		result = result * 3.5;
		result *= 3.72;
		System.out.println(result);// 37

		// Type mismatch: cannot convert from double to int
//		result = result/2.5;
		result /= 2.5;
		System.out.println(result);// 14

		// Type mismatch: cannot convert from double to int
//		result = result%2.5;

		result %= 2.5;
		System.out.println(result);

	}
}
