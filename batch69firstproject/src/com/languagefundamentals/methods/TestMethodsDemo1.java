package com.languagefundamentals.methods;

// no return + no arguments 
public class TestMethodsDemo1 {

	void show() {
		System.out.println("Show your ID card !");
	}

	public static void main(String[] args) {
		System.out.println("main method started !");

		// calling the static method
		// static methods we can call directly & also can call uing class name
		welcome();
		TestMethodsDemo1.welcome();

		// If we want to call instance or non-static methods,
//		we must need to create an object to load instance methods

		// Creating an object
		TestMethodsDemo1 t1 = new TestMethodsDemo1();
		t1.show();

		TestMethodsDemo1 t2 = new TestMethodsDemo1();
		t2.show();
		
		TestMethodsDemo1 t3 = new TestMethodsDemo1();
		t3.show();

		System.out.println("main method ended !");
	}

	public static void welcome() {
		System.out.println("Welcome to Vcube Java !!");
	}

}
