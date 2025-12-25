package com.javaintro;

public class Hello {
	
//	native void show();

	static void hello() {
		System.out.println("Hello Guys, Good evening !");
		System.out.println("Hello Guys, Good evening !");
		System.out.println("Hello Guys, Good evening !");
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		System.out.println("main method started !");
		System.out.println("main method started !");

		System.out.println("*********" + Thread.currentThread().getName());

		// Creating an Object for Hello
		Hello h = new Hello();

		// calling static hello method directly
		hello();

//		Calling instance welcome method by using object reference variable
//		Note : We cannot call instance methods in static area.
//		If we want call non-static methods in static area, we must need to create object.
		h.welcome();
		
//		h.show();

		System.out.println("main method ended !");
	}

	void welcome() {
		System.out.println("welcome to Java world !");
		System.out.println("welcome to Java world !");
	}

}
