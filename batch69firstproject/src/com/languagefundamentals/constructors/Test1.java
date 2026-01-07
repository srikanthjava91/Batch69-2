package com.languagefundamentals.constructors;

class TestA {
	int a;

	TestA() {
		System.out.println("Hell Test A");
	}

	TestA(int a) {

	}
}

class TestB extends TestA {

	TestB() {
		System.out.println("Hello Test B ");
		super();
	}

}

public class Test1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		TestB t = new TestB();
		
		

	}

}
