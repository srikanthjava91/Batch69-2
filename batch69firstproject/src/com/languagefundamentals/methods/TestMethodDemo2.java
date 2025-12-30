package com.languagefundamentals.methods;

//no return + no arguments 
public class TestMethodDemo2 {

	void addition() {
		System.out.println("addition method called ");
		int a = 10;
		int b = 20;
		System.out.println(a + b);//Sum 
	}

	void subtraction() {
		System.out.println("subtraction method called ");
		int a = 10;
		int b = 20;
		System.out.println(a - b);//Difference 
	}

	void multiplication() {
		System.out.println("multiplication method called ");
		int a = 10;
		int b = 20;
		System.out.println(a * b);//product
	}

	void division() {
		System.out.println("divion method called ");
		int a = 100;
		int b = 20;
		System.out.println(a / b);//quotient --> 20)100(5 
	}

	void modulus() {
		System.out.println("modulus method called ");
		int a = 100;
		int b = 6;
		System.out.println(a % b);//reminder --> 0 --> 20)100(5
//														  100
//														  ----
//														  0
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		TestMethodDemo2 t1 = new TestMethodDemo2();
		t1.addition();
		t1.subtraction();
		t1.multiplication();
		t1.division();
		t1.modulus();

		System.out.println("main method ended ");

	}

}
