package com.languagefundamentals.constructors;

class ReverseChain {

	ReverseChain(int a) {
		this(a, 10); // calls 2-arg
		System.out.println("1-arg constructor");
	}

	ReverseChain(int a, int b) {
		this(a, b, 20); // calls 3-arg
		System.out.println("2-arg constructor");
	}

	ReverseChain(int a, int b, int c) {
		this(a, b, c, 30); // calls 4-arg
		System.out.println("3-arg constructor");
	}

	ReverseChain(int a, int b, int c, int d) {
		System.out.println("4-arg constructor");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		new ReverseChain(5);
		System.out.println("main method ended !");
	}
}
