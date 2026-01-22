package com.operators;

//instanceof will check the given reference is from the Specified Object or not ..? 
public class TestOpDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Integer a = 10;
		System.out.println(a instanceof Integer);// true
		System.out.println(a instanceof Number);// true
		System.out.println(a instanceof Object);// true

//		Incompatible conditional operand types Integer and String
//		System.out.println(a instanceof String);
		
		System.out.println(null instanceof Integer);//
		
		String s = "Srikanth";
		System.out.println(s instanceof String);
		System.out.println(s instanceof Object);

	}

}
