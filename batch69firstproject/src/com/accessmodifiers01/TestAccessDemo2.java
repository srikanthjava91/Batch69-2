package com.accessmodifiers01;

public class TestAccessDemo2 {

	public static void main(String[] args) {

//		The constructor TestAccessDemo1() is not visible
		TestAccessDemo1 t1 = new TestAccessDemo1();

		// Note : If the data members are private, we cannot access outside of the
		// classes even though the classes are in Same package.
//		private data members we can access only inside the class.
//		System.out.println(t1.a1);//The field TestAccessDemo1.a1 is not visible
//		System.out.println(t1.name1);//The field TestAccessDemo1.name1 is not visible
//		t1.method1();/The method method1() from the type TestAccessDemo1 is not visible

		// Accessing default data members outside of the classes within the same
		// package.
		System.out.println(t1.a2);
		System.out.println(t1.name2);
		t1.method2();

		// Accessing public data members within the package also
		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();

		// Accessing protected data members within the package also
		System.out.println(t1.a4);
		System.out.println(t1.name4);
		t1.method4();
	}

}
