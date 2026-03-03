package com.accessmodifiers02;

import com.accessmodifiers01.TestAccessDemo1;

public class TestAccessDemo3 extends TestAccessDemo1 {

	public static void main(String[] args) {

		TestAccessDemo1 t1 = new TestAccessDemo1();

		// Accessing default data members outside of the packages are not possible.
//		System.out.println(t1.a2);
//		System.out.println(t1.name2);
//		t1.method2();

		// Accessing public data members within the package also
		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();

		// Accessing protected data members outside of the packages are not possible
		// even though it's a sub class of your class with super reference.
//		System.out.println(t1.a4);
//		System.out.println(t1.name4);
//		t1.method4();

//		But we can access protected data members outside of the packages of sub classes
//		with sub class object reference only.
		
		TestAccessDemo3 t3 = new TestAccessDemo3();
		System.out.println(t3.a4);
		System.out.println(t3.name4);
		t3.method4();
		
		
	}

}
