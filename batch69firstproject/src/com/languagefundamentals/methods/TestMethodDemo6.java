package com.languagefundamentals.methods;

//4) with return type + with arguments 
import java.util.Scanner;

//WAP to get Areas of Circle, Triangle, Square & Rectangle.
//Area of circle is 		: PI * r* r 
//Area of Triangle is 	: 0.5 * base * height
//Area of Square 		: side * side 
//Area of Rectangle 		: Length * Breadth 
public class TestMethodDemo6 {

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("main method started !");

		// Area of circle ************************
		System.out.println("Enter Radius : ");
		double radius = sc.nextDouble();
		System.out.println("Area of circle : " + getAreaOfCircle(radius));

		// Area of Triangle *********************
		System.out.println("Enter base ");
		double base = sc.nextDouble();
		System.out.println("Enter Height ");
		double height = sc.nextDouble();

		System.out.println("Area of Traiangle : " + getAreaOfTriangle(base, height));

		sc.close();
	}

	double getAreaOfCircle(double r) {
		double arcir = Math.PI * r * r;
		return arcir;
	}

	double getAreaOfTriangle(double b, double h) {
		double arTri = 0.5 * b * h;
		return arTri;
	}

	double getAreaOfSquare(float side) {
		double arSq = side * side;
		return arSq;
	}

	double getAreaOfRectangle(double l, double b) {
		double arRec = l * b;
		return arRec;
	}

}
