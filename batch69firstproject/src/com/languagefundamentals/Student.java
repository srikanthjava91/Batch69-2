package com.languagefundamentals;

//Type of variables 
public class Student {
// instance variables + primitive
	private int id;
//	instance variables + Object
	String name;
// static variables + primitive 
	public static int orgId = 555;

//	static variables + Object 
	protected static String orgName = "Vcube";

	public static void main(String[] args) {
		System.out.println("main method started !");
		Student s1 = new Student();
		s1.id = 18;
		s1.name = "Kohli";
// local variables are temporary variables,
//		where we cannot use any access modifiers or  modifiers except final
		int i = 10;
		String n = "Srikanth";
		i = 100;

		var id = 45;
		var name = "Rohit";

		int orgId = 666;
		String orgName = "VSS";

		System.out.println("*********instance access***********");
// Accessing the instance data by using Object reference variables
		System.out.println(s1.id);
		System.out.println(s1.name);

		System.out.println("*********static access***********");
// Accessing the static data directly or 
//		we can also access by using class name 
//		we can also access by using Object reference variable
//		Note : Which one is Recommended approach for accessing static data..? 
//		The answer is : By using only class name.
		System.out.println(orgId);// 666
		System.out.println(orgName);// VSS

		System.out.println(Student.orgId);// 555
		System.out.println(Student.orgName);// Vcube

		// The static field Student.orgId should be accessed in a static way
		System.out.println(s1.orgId);// 555
		// The static field Student.orgName should be accessed in a static way
		System.out.println(s1.orgName);// Vcube

		System.out.println("*********local access***********");
//	Accessing the local variables 
//		Note : JVM will not provide any default values for local variables, 
//		we must need to initialize while declaring variables or 
//		assign before accessing.
		System.out.println(i);
		System.out.println(n);

		System.out.println(id);
		System.out.println(name);

	}
}
