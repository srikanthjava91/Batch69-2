package com.languagefundamentals.constructors;

//Super or Base or Parent 
class Vehicle {

	String name = "Tata";
	String model;
	String brand;
	double price;
	
	static {
		System.out.println("Hello static from Vehicle !");
	}

	public static void main(String[] args) {
		System.out.println("main method strated from Vehicle !!");
	}

	void hi() {
		System.out.println("Hi Mr: vamshi !!");
	}
}

//Sub or Derived or Child 
public class Bike extends Vehicle {
	String name = "Vcube-Tata";

	public static void main(String[] args) {
		System.out.println("main method strated from Bike !!");
		Bike b1 = new Bike();
		b1.show();
	}

	void show() {
		System.out.println(model);
		System.out.println(brand);
		System.out.println(price);
		System.out.print(super.name);
		System.out.println(this.name);
		super.hi();
	}
}
