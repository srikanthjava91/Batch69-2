package com.languagefundamentals;


//Integral Literals 
public class TestLiteralsDemo1 {
	// instance
	// static

	public static void main(String[] args) {

		// com.languagefundamentals.TestLiteralsDemo1@1dbd16a6
		TestLiteralsDemo1 t1 = new TestLiteralsDemo1();
		System.out.println(t1);// Address of the Object

		int x = 0x1dbd16a6;
		System.out.println(x);
		System.out.println(t1.hashCode());// 498931366

		// local
		System.out.println("*******Decimal Literals ****************");
		// integral Literals
		// Decimal Literals : Base 10 --> 0 to 9
		int a = 10;
		int a1 = 123;
		int a2 = 1230;
		int a3 = 78965;
		System.out.println(a);// 10
		System.out.println(a1);// 123
		System.out.println(a2);// 1230
		System.out.println(a3);// 78965

		System.out.println("**********Octal Literlas*************");
		// Octal Literals : Base 8 --> 0 to 7
		// ANy number starts with 0 is called Octal
		int a4 = 0123;
		// 0+ 1*8^2 +2*8^1 +3*8^0
		// 64 + 16 + 3 = 83
		System.out.println(a4);// 83

		int a5 = 0456;// 302
		int a6 = 0567;// 375
//		int a7 = 0685;//453//The literal 0685 of type int is out of range 

		System.out.println(a5);
		System.out.println(a6);
//		System.out.println(a7);

		// HexaDecimal : Base 16 --> 0 to 9 & a-f --> a=10 b =11 c=12 d=13 e=14 f=15
		// any number starts with 0x or 0X

		System.out.println("********Hex Decimal***************");
		int a7 = 0x123;
//		1*16^2 +2*16^1 +3*16^0 = 256 + 32 + 3 = 291 
		System.out.println(a7);

		int a8 = 0xbee;
//		b e e -->  11*16^2 +14*16^1 +14*16^0= 3054
		System.out.println(a8);

		int a9 = 0xA1B2;
		int a10 = 0XDAD;
//		int a11 = 0XXAb;//Invalid hex literal number
		int a12 = 0X123a;

		System.out.println(a9);// 41394
		System.out.println(a10);// 3501
		System.out.println(a12);// 4666

		System.out.println("**********Binary literals *************");
//		Binary Literals : Base 2 --> 0 1 
		int a13 = 0b1010;
		int a14 = 0B10110;

		System.out.println(a13);
		System.out.println(a14);

	}

}
