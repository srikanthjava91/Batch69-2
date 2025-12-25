package com.javaintro;

public class TestDemo3 {

	// in static we can call static methods directly.
	void main() {
		System.out.println("main method started !!");
		method1();
	}

	// In static, if we want to call instance methods, we must need to create
	// objects.
	// By using object reference variable we an call instance methods.
	static void method1() {
		System.out.println("method1 called ");
		TestDemo3 t = new TestDemo3();
		t.method2();
	}

	// in instance, we can call instance directly.
	void method2() {
		System.out.println("method2 called ");
		method4();
	}

	static void method3() {
		System.out.println("method3 called ");
	}

	// In instance, can we call static directly or not ..?
	void method4() {
		System.out.println("method4 called ");
		method3();
	}

}
