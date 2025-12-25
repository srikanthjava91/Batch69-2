package com.javaintro;

public class Cricketer {

	// Step1 : Declaration
	// static
	static int countryId;
	static String countryName;

	// non-static or instance
	int jerseyNo;
	String cricketerName;

	public static void main(String[] args) {
		System.out.println("Welcome to Indian Cricket Team !!");

		// Creating Object of a class
		// LHS : Cricketer is a class name & virat is a Reference Variable for an
		// Object.
		// RHS : new is a keyword to create Objects with the help of COnstructor,
		// Cricketer() is a constructor.
		System.out.println("Object1 info ***********");
		Cricketer vk = new Cricketer();

		// Step 2: Initialization
		countryId = 91;
		countryName = "India";

		vk.jerseyNo = 18;
		vk.cricketerName = "Virat Kohli";

		// Step 3: Accessing static data directly
		System.out.println("County ID : " + countryId);// 0 91
		System.out.println("Country Name :" + countryName);// null India

		// Step 4: Accessing instance data directly
		System.out.println("Jersey number : " + vk.jerseyNo);// 0 18
		System.out.println("Cricketer Name : " + vk.cricketerName);// null Virat Kohli

		System.out.println("Object2 info ***********");
		Cricketer msd = new Cricketer();
		msd.jerseyNo = 7;
		msd.cricketerName = "M S Dhoni";
		System.out.println("County ID : " + countryId);// 91
		System.out.println("Country Name :" + countryName);// India
		System.out.println("Jersey number : " + msd.jerseyNo);// 0
		System.out.println("Cricketer Name : " + msd.cricketerName);// null

		System.out.println("Object3 info ***********");
		Cricketer rs = new Cricketer();
		rs.jerseyNo = 45;
		rs.cricketerName = "Rohit Sharma";
		System.out.println("County ID : " + countryId);// 91
		System.out.println("Country Name :" + countryName);// India
		System.out.println("Jersey number : " + rs.jerseyNo);// 0
		System.out.println("Cricketer Name : " + rs.cricketerName);// null

		System.out.println("Object4 info ***********");
		Cricketer kl = new Cricketer();
		countryId = 92;
		countryName = "Bharath";
		kl.jerseyNo = 1;
		kl.cricketerName = "Lokesh Rahul";
		System.out.println("County ID : " + countryId);// 91
		System.out.println("Country Name :" + countryName);// India
		System.out.println("Jersey number : " + kl.jerseyNo);// 0
		System.out.println("Cricketer Name : " + kl.cricketerName);// null

		System.out.println("Object5 info ***********");
		Cricketer jaddu = new Cricketer();
		System.out.println("County ID : " + countryId);//
		System.out.println("Country Name :" + countryName);//
		System.out.println("Jersey number : " + jaddu.jerseyNo);// 0
		System.out.println("Cricketer Name : " + jaddu.cricketerName);// null

	}
}
