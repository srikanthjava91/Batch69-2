package com.languagefundamentals.constructors;

public class Car {

	String model;
	String brand;
	double price;

	Car() {
		System.out.println("no arg constructor called ");
		model = "unknown";
		brand = "unknown";
		price = 100000.00;
	}

	Car(String model, String brand, double price) {
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	public static void main(String[] args) {
		System.out.println("main method started !");

		Car c1 = new Car();
		c1.show();

		Car c2 = new Car();
		c2.model = "Sonet";
		c2.brand = "KIA";
		c2.price = 1500000.00;
		c2.show();

		Car c3 = new Car("Seltos", "KIA", 2000000.00);
		c3.show();

		System.out.println("main method ended");
	}

	void show() {
		System.out.println("************");
		System.out.println("Model of the car : " + model);
		System.out.println("Brand of the Car : " + brand);
		System.out.println("Price of the car : " + price);
	}
}
