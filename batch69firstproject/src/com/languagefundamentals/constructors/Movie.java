package com.languagefundamentals.constructors;

public class Movie {

	String director;
	String hero;
	String name;
	String heroine;
	double budget;

	public Movie() {
		System.out.println("no arg constructor called !");
	}

	public Movie(String director, String hero) {
		this.director = director;
		this.hero = hero;
	}

	public Movie(Movie m, String name) {
		this.director = m.director;
		this.hero = m.hero;
		this.name = name;
	}

	public Movie(Movie m, String heroine, double budget) {
		this.director = m.director;
		this.hero = m.hero;
		this.name = m.name;
		this.heroine = heroine;
		this.budget = budget;
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		Movie m1 = new Movie();
		m1.show();

		Movie m2 = new Movie("S S rajmouli", "Mahesh Babu");
		m2.show();

		Movie m3 = new Movie(m2, "Varanasi");
		m3.show();

		Movie m4 = new Movie(m3, "Priyanka Chopra", 20000000000.00);
		m4.show();

	}

	void show() {
		System.out.println("*********************");
		System.out.println("Director Name: " + director);
		System.out.println("Hero Name : " + hero);
		System.out.println("Heroine Name: " + heroine);
		System.out.println("Budget Name: " + budget);
		System.out.println("Name of the Movie : " + name);
		System.out.println("*********************");
	}

}
