package com.accessmodifiers01;

//private is : Illegal modifier for the class TestAccessDemo1; 
//only public,<default>, strictfp abstract & final are permitted
public class TestAccessDemo1 {

//	private TestAccessDemo1(){
//		
//	}

	// Syntax error, insert "Identifier" to complete CompactConstructorHeader
//	private static {
//		
//	}

//	protected data members

	protected int a4 = 33;
	protected String name4 = "Hardhik";

	protected void method4() {
		System.out.println("methdo4 called !!");
	}

	// public data members
	public int a3 = 77;
	public String name3 = "Gill";

	public void method3() {
		System.out.println("method3 called ");
	}

	// default data members
	int a2 = 63;
	String name2 = "SKY";

	void method2() {
		System.out.println("method2 called !!");
	}

	// private Data members
	private int a1 = 4;
	private String name1 = "Abhishek";

	private void method1() {
		System.out.println("Method1 called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		TestAccessDemo1 t1 = new TestAccessDemo1();

		// Accessing private data members within the class
		System.out.println(t1.a1);
		System.out.println(t1.name1);
		t1.method1();

		// Accessing default data members within the class
		System.out.println(t1.a2);
		System.out.println(t1.name2);
		t1.method2();

		// Accessing public data members within the class
		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();

		// Accessing protected data members within the class
		System.out.println(t1.a4);
		System.out.println(t1.name4);
		t1.method4();
	}
}
