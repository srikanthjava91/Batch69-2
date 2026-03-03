package com.oops01.inheritance;

public class Product {

	int pid;
	String pname;

	@Override
	public String toString() {

		return "Product Details : PID  : " + pid + " PNAME : " + pname;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called !!");
	}

	public static void main(String[] args) {

		Product p1 = new Product();
		System.out.println(p1);// @2b2fa4f7

		Product p2 = new Product();
		System.out.println(p2);// @1dbd16a6
		p2 = p1;// Re-assigning

		System.gc();
		System.out.println(p1.equals(p2));// false

		// class com.oops01.inheritance.Product
		System.out.println(p1.getClass());// Full Qualified Name of the class with class

		System.out.println(p1.hashCode());// 724542711
		int i = 0x2b2fa4f7;
		System.out.println(i);

		Product p3 = new Product();
		System.out.println(p3);
		System.out.println(p3.toString());

	}

}
