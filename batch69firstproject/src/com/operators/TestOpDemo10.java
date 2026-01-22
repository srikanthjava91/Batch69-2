package com.operators;

class A {

}

class B extends A {

}

public class TestOpDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		B b = new B();
		A a = new A();
		System.out.println(b instanceof A);
		System.out.println(b instanceof B);

		System.out.println(a instanceof A);
		System.out.println(a instanceof B );
	}
}
