package com.javaintro;

public class TestDemo4 {

	static {
		System.out.println("Hello static ");
	}

	void main() {
		System.out.println("Hello main ");
	}

	{
		System.out.println("Hello instance1 ");
	}

	{
		System.out.println("Hello instance2 ");
	}

	{
		System.out.println("Hello instance3 ");
	}

}
