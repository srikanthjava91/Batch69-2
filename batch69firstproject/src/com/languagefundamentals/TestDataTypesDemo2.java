package com.languagefundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;

class Dog {

}

public class TestDataTypesDemo2 {

	String name = "SrikanthJava";// String Literals --> SCP
	String name1 = new String("Vcube");// String Object with new --> Heap

//	Note : Converting primitive data types to Wrapper object data types : Auto-Boxing 
	Integer i1 = 100;// int to Integer
//	Integer i1 = Integer.valueOf(100);

//	Note : Converting Wrapper Object data types  to primitive data types : Auto-Unboxing 
	int i2 = i1;//
//	int i2 = i1.intValue();

	Character c1 = 'C';
	Long l = 9972677655L;

	// Type mismatch: cannot convert from int to BigInteger
	// Type mismatch: cannot convert from String to BigInteger
	BigInteger bi1 = new BigInteger("1000000098877766555444433222222233444");
	BigInteger bi2 = new BigInteger("1000000098877766555444433222222233444");
//	BigDecimal bd = 67.5;

//	Dog d = "puppy";

	public static void main(String[] args) {
		System.out.println("main method started !!");
		TestDataTypesDemo2 t2 = new TestDataTypesDemo2();

		System.out.println(t2.name);
		System.out.println(t2.name1);

		System.out.println(t2.i1);

		System.out.println(t2.c1);
		System.out.println(t2.l);

		System.out.println(t2.bi1);
		System.out.println(t2.bi2);

		// The operator + is undefined for the argument type(s) java.math.BigInteger,
		// java.math.BigInteger
//		System.out.println(t2.bi1 + t2.bi2);

		System.out.println("**************Addition ");
		System.out.println(t2.bi1.add(t2.bi2));
		System.out.println(t2.bi1.multiply(t2.bi2));

//		System.out.println(t2.bd);
//		System.out.println(t2.d);

	}

}
