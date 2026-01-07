package com.languagefundamentals.constructors;

class Animal {

	String name;
	int age;
	String breed;

	public Animal() {
		System.out.println("Animal Constructor called ");
	}
	

	public Animal(String name, int age, String breed) {
		this();
		System.out.println("Animal parameterized constructor called !!");
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	public static void main(String[] args) {
		System.out.println("main method started from Animal ");
	}
}

public class Dog extends Animal {

	Dog() {
		super("Puppy",3,"GS");
		System.out.println("Dog no arg constructor called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Dog class  !!");

		Dog d1 = new Dog();
		d1.show();
	}

	void show() {
		System.out.println("Name : " + name);
		System.out.println("Breed : " + breed);
		System.out.println("Age : " + age);
	}

}
