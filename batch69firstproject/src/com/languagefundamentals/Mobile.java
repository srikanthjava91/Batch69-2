package com.languagefundamentals;

// 4 6 8 9 22 5 7 
public class Mobile {

	long mobile_no = 9972677655L;
	String network = "Airtel";

	public static void main(String[] args) {
		System.out.println("main method strated !!");

		Mobile m = new Mobile();
		System.out.println(m.mobile_no);
		System.out.println(m.network);
		System.out.println("main method ended !!");
	}
}
