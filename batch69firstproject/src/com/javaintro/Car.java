package com.javaintro;

public class Car {
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called !");
	}

	void hello() {
		Car c4 = new Car();
		System.out.println("**************" + c4);
	}

	public static void main(String[] args) {

		Car c = new Car();
		Car c1 = new Car();
		Car c2 = new Car();

//		1) Nullifying the Reference
		c = null;
//		c1 = null;
		c2 = null;
//		2) Re-assigning Reference Variable
		Car c3 = new Car();
		c3 = c1;

		c3.hello();
		System.gc();
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}
}
