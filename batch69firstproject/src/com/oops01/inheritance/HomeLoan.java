package com.oops01.inheritance;

public class HomeLoan extends Loan {

	void getHomeLoanInfo() {
		System.out.println("Home Loan is helpful for Your House needs !!");
	}

	void getHomeLoanDocmentInfo() {
		System.out.println("Home Loan documents submitted suceesfully !!");
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");
		System.out.println("Welcome to Vcube Home Loan Banking !");
		HomeLoan hl = new HomeLoan();

		String customerName = hl.getCustomerName();
		System.out.println("Customer Name : " + customerName);

		double salary = hl.getCustomerSalary();
		int age = hl.getCustomerAge();
		int cibil = hl.getCibilSCore();

		if (salary > 800000.00 && cibil > 780 && age > 27 && hl.isValidMobile() && hl.isValidAadhar()
				&& hl.isValidPAN()) {
			System.out.println("Hearty Congrtulations Your Loan got approved !!");
			System.out.println("Your Loan ROI is  " + hl.getRoi());

		} else {
			System.out.println("Sorry !! Your Home Loan got Rejected !!");
		}

		System.out.println("main method ended !!");
	}

}
