package com.oops01.inheritance;

class Employee {
	String name;
	Address1 adress1;

	public Employee(String name, Address1 adress1) {
		this.name = name;
		this.adress1 = adress1;
	}

	public Employee(Employee emp1) {
		this.name = emp1.name;
		this.adress1 = new Address1();
	}

}

class Address1 {
	String city;

	public Address1(String city) {
		super();
		this.city = city;
	}

	public Address1() {

	}

}

public class TestEmployee {

	public static void main(String[] args) {

		Address1 addr = new Address1("Hyd");
		Employee emp1 = new Employee("Vamshi", addr);
		System.out.println(emp1.name);
		System.out.println(emp1.adress1.city);
		System.out.println("**************************");
		Employee emp2 = new Employee(emp1);
		System.out.println(emp2.name);
		System.out.println(emp2.adress1.city);

		emp2.name = "Vamshi Krishna";
		emp2.adress1.city = "Banglore";

		System.out.println("************After change ************");
		System.out.println(emp2.name);
		System.out.println(emp2.adress1.city);
		System.out.println(emp1.name);
		System.out.println(emp1.adress1.city);

	}

}
