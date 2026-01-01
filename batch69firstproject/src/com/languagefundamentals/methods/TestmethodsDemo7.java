package com.languagefundamentals.methods;

//abstract methods 
interface In1 {
	// Abstract methods do not specify a body
	public abstract void method1();
}

class Person {

//	final void hello() {
//		System.out.println("Hello Person !!");
//	}

}

class Student extends Person {
	int sno;
	String sname;

	// Cannot override the final method from Person
//	@Override
//	void hello() {
//		System.out.println("Hello Student !!");
//	}
}

public class TestmethodsDemo7 {

	int getSalaryInfo() {
		double sal = 100000;
		return (int) sal;
	}

	// Factory method
	Student getStudent() {
		Student s = new Student();
		s.sno = 18;
		s.sname = "Virat";
		return s;
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		TestmethodsDemo7 t7 = new TestmethodsDemo7();
		Student s1 = t7.getStudent();
		System.out.println(s1.sno);
		System.out.println(s1.sname);

		System.out.println("mein mthod ended ");
	}
}
