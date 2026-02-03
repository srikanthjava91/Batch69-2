package com.javaintro;

public class Test1 {

	public static void main(String[] args) throws ClassNotFoundException {

		System.out.println("main method started ");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Successfully loaded !");
	}

}
