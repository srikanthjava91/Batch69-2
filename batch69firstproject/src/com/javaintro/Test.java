package com.javaintro;

class Student1 {
	Student1 s;
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called !!");
	}
}



public class Test {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();

		s1.s = s2;
		s2.s = s1;

		s1 = null;
		s2 = null;
		// Both objects form an "island of isolation" → eligible for GC
		
		System.gc();
	}
}
