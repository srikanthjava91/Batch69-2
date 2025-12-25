package com.languagefundamentals;

public class TestLiteralsDemo3 {

	public static void main(String[] args) {

//		String Literals 
//		String is a collection of characters which we can store it into a ""(double quotes)
//		String is a class from java.lang 
		String str = "Srikanth";// String Literals --> SCP : String Constant Pool --> 1 object
		String str2 = "Srikanth";// 0 object

//		Dog d = "Puppy";

		String str1 = new String("Java");// String Object with new --> 2 object
		String str3 = "Java";// 0

//		null literals 
		String s1 = null;
		TestLiteralsDemo3 t1 = null;
//		int i = null;//Type mismatch: cannot convert from null to int

//		true false looks like a keywords but not the keywords, we can consider as
//		Boolean Literals 
		boolean b1 = true;
		if (b1) {
			System.out.println("Happy Christmas !!");
		} else {
			System.out.println("Merry Christmas  !!");
		}

		// char Literals
		char ch = 'A';
		char ch1 = 97;
		char ch2 = '\u0040';

		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(ch2);

	}

}
