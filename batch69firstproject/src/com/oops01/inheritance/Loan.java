package com.oops01.inheritance;

import java.util.Scanner;


//Parent or Super or Base
public class Loan {
	
	static Scanner s = new Scanner(System.in);

	String getCustomerName() {
		System.out.println("Enter your Full Name : ");
		String name = s.nextLine();
		return name;
	}

	double getCustomerSalary() {

		System.out.println("Enter your salary ");
		double salary = s.nextDouble();
		return salary;
	}

	int getCustomerAge() {
		System.out.println("Enter your age : ");
		return s.nextInt();
	}

	int getCibilSCore() {
		System.out.println("Enter your Cibil score ! ");
		int cibil = s.nextInt();
		return cibil;
	}

	double getRoi() {
		return 9.5;
	}

	boolean isValidMobile() {
		System.out.println("Enter your Mobile Number ! ");
		String mobile = s.next();

		boolean isValidMobile = mobile.matches("[6-9][0-9]{9}");

		if (isValidMobile) {
			System.out.println("Valid Mobile Number ✅");
			return true;
		} else {
			System.out.println("Invalid Mobile Number ❌");
			return false;
		}
	}

	boolean isValidAadhar() {

		System.out.println("Enter your Aadhar Number ! ");
		String aadhar = s.next();

		boolean isValidAadhar = aadhar.matches("[2-9][0-9]{11}");

		if (isValidAadhar) {
			System.out.println("Valid Aadhar Number ✅");
			return true;
		} else {
			System.out.println("Invalid Aadhar Number ❌");
			return false;
		}
	}

	boolean isValidPAN() {

		System.out.println("Enter your PAN Number ! ");
		String pan = s.next();

		boolean isValidPan = pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");

		if (isValidPan) {
			System.out.println("Valid PAN Number ✅");
			return true;
		} else {
			System.out.println("Invalid PAN Number ❌");
			return false;
		}

	}

	String getAddressDetails() {
		System.out.println("Enter your flat number : ");
		String flat = s.next();

		System.out.println("Enter your plot details : ");
		String plot = s.next();

		System.out.println("Enter your Street name: ");
		String street = s.next();

		System.out.println("Enter your city name: ");
		String city = s.next();

		System.out.println("Enter your PIN Code: ");
		long pincode = s.nextLong();

		String address = "Flat : " + flat + ", Plot name: " + plot + ", STreet Name : " + street + ", City : " + city
				+ ",Pincode :" + pincode;

		return address;

	}

}
