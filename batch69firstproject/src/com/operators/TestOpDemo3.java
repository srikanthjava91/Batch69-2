package com.operators;

//Relational or Comparison Operators : == < <= > >= != 
//--> Will give the boolean expression 
//== operators checks the content if the data is primitive.
//== operator checks the addresses of the object type data.
public class TestOpDemo3 {

	public static void main(String[] args) {
		System.out.println("main method strated ");

		int a = 10;
		int b = 15;
		int c = 20;
		int d = 10;
		boolean status = false;
		boolean flag = true;

		String s1 = new String("Srikanth");// Heap
		String s2 = new String("Srikanth");// Heap a
		System.out.println(s1 == s2);// false

		//String Literals 
		String s3 = "Java";
		String s4 = "Java";

		System.out.println(s3 == s4);//true
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equalsIgnoreCase(s4));

		System.out.println("****************");
		System.out.println(!status);// true
		System.out.println(status == flag);

		System.out.println("**************");
		System.out.println(a == d);// true
		System.out.println(a == b);// false

		System.out.println(a < b);// true
		System.out.println(a > c);// false

		System.out.println("**********************");
		System.out.println(a <= d);// true
		System.out.println(a >= d);// true

		System.out.println(d >= b);// false
		System.out.println(a != d);// false
		System.out.println(b != c);// true

	}

}
