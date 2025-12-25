package com.javaintro;

public class Student {

	final static int a = 10;

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method started  ");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("main method ended  ");
	}
}
