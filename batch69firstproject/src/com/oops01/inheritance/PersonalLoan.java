package com.oops01.inheritance;

//Child or Sub or Derived 
public class PersonalLoan extends Loan {

	void getPersonalLoanInfo() {
		System.out.println("Personal Loan is helpful for Your Personal needs !!");
	}

	void getPersonalLoanDocmentInfo() {
		System.out.println("Personal Loan documents submitted suceesfully !!");
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");
		System.out.println("VCUBE Personal Loan Banking !!");

//		By using Child Object, Child Reference, we can call both Parent and Child class functionalities.
		PersonalLoan p1 = new PersonalLoan();
		String customerName = p1.getCustomerName();
		System.out.println("Customer Name : " + customerName);

//		Can we store Child Object into Parent reference --> Yes --> this process is called Up-Casting
//		BY Using, Child Object, Child reference, what can we call..? 
//		Can we call only Parent class functionalities, but not child class functionalities.
//		
		Loan l1 = new PersonalLoan();
		l1.getAddressDetails();
//		l1.getPersonalLoanInfo();//The method getPersonalLoanInfo() is undefined for the type Loan
		

		double salary = p1.getCustomerSalary();
		int age = p1.getCustomerAge();
		int cibil = p1.getCibilSCore();

		if (salary > 600000.00 && cibil > 750 && age > 25 && p1.isValidMobile() && p1.isValidAadhar()
				&& p1.isValidPAN()) {
			System.out.println("Hearty Congrtulations Your Loan got approved !!");
			p1.getPersonalLoanInfo();

			System.out.println("Your Loan ROI is  " + p1.getRoi());

			System.out.println("Address Details: ");
			p1.getAddressDetails();

			p1.getPersonalLoanDocmentInfo();

		} else {
			System.out.println("Sorry !! Your Personal Loan got Rejected !!");
		}

		System.out.println("main method ended !!");
	}
}
