package com.languagefundamentals.methods;

import java.util.Scanner;

//3) with return type + no arguments 
public class TestMethodsDemo5 {

	static Scanner sc = new Scanner(System.in);

	void main() {
		System.out.println("main method started !!");
//		System.out.println("Total Salary : " + (getEmployeeSalary() + getEmployeeBonus()));
		double sal = getEmployeeSalary();
		double bon = getEmployeeBonus();
		System.out.println("Total Salary : " + (sal + bon));
	}

	double getEmployeeSalary() {
		System.out.println("Enter salary : ");
		double salary = sc.nextDouble();
		return salary;
	}

	double getEmployeeBonus() {
		System.out.println("Enter Bonus : ");
		double bonus = sc.nextDouble();
		return bonus;

	}

}
