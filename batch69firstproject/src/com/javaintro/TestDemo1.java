package com.javaintro;

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		TestDemo1 t1 = new TestDemo1();

		TestDemo1 t2 = new TestDemo1();

		System.out.println("main method ended ");
	}

	// static block
	static {
		System.out.println("static block1 ");
		System.out.println("static block1 ");
		System.out.println("static block1 ");
	}

	// instance block
	{
		System.out.println("instance block ");
	}

}
