package com.oops01.inheritance;

class Student implements Cloneable {

	int sid;
	String sname;
	Address address;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Student(int sid, String sname, Address address) {
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}

}

class Address {
	String city;

	public Address(String city) {
		this.city = city;
	}

}

public class TestStudent {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address addr = new Address("Hyderabad");
		Student s1 = new Student(101, "Srikanth", addr);

		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("**************************");

		Student s2 = (Student) s1.clone();
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);

		System.out.println("----------------Modify the data for Object2---------------------------");
		s2.sid = 102;
		s2.sname = "Venkat";
		s2.address.city = "Banglore";
		System.out.println("---------------------------------");

		System.out.println(s1.sid);// 101
		System.out.println(s1.sname);// Srikanth
		System.out.println(s1.address.city);// Banglore 
		System.out.println("**************************");
		System.out.println(s2.sid);// 102
		System.out.println(s2.sname);// Venkat
		System.out.println(s2.address.city);// Banglore

	}

}
