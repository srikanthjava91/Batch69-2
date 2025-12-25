package com.javaintro;

public class Employee {

	int eid;
	String ename;

	public static void main(String[] args) {
		System.out.println("main method started");

		Employee e1 = new Employee();
//		com.javaintro.Employee@1dbd16a6
		System.out.println(e1);// Address of the Object
		e1.eid = 18;
		e1.ename = "Virat";
		System.out.println(e1.eid);
		System.out.println(e1.ename);

		e1 = null;
		System.out.println(e1);
		
		Employee e2 = new Employee();
		System.out.println(e2);
		System.out.println("main method ended !");
	}
}
