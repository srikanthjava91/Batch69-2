package com.javaintro;

public class TestDemo2 {

	static TestDemo2 t2 = new TestDemo2();
	static int a;

	static {
		System.out.println("static starts");
		System.out.println(a);
	}

	{
		System.out.println("instance ");
	}

	public static void main(String[] args) {
		a = 10;
		System.out.println("main method strated !");
		System.out.println(a);
	}

}
