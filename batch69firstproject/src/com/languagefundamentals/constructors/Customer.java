package com.languagefundamentals.constructors;

class Person {

	String name;

	public Person() {
		
	}

	public Person(String name) {
		super();
		this.name = name;
	}

}

public class Customer extends Person {

	int cid;
	String cCity;

	Customer() {

		System.out.println("no arg constructor called from Customer !!");
	}

	public Customer(int cid, String cCity) {
		System.out.println("Parameterized constructor called !");
		super();
		this.cid = cid;
		this.cCity = cCity;
	}

	public static void main(String[] args) {
		System.out.println("main method strated !!");
//		Customer c1 = new Customer(1, "Hyderabad");
//		c1.show();

		Customer c2 = new Customer();
		c2.show();

	}

	void show() {
		System.out.println(cid);
		System.out.println(cCity);
	}

}
