package com.languagefundamentals;

//Floating Literals 
//byte short int long float double 
//char boolean 
public class TestLiteralsDemo2 {

	public static void main(String[] args) {

		float f1 = 100;// Implicit Type casting
		float f2 = 0123;
//		float f3 = 0123.5;//Type mismatch: cannot convert from double to float
		float f4 = 0123.5F;//
		float f5 = 0123F;
		float f6 = 1230F;
		float f7 = 0345.5F;
		float f8 = 0x123;
//		float f9 = 0x123.5F;//Invalid hex literal number
		float f10 = 0x456D;
		float f11 = 0x12F;

		System.out.println(f1);// 100.0
		System.out.println(f2);// 83.0
		System.out.println(f4);//123.5
		System.out.println(f5);//123.0
		System.out.println(f6);//
		System.out.println(f7);//345.5
		System.out.println(f8);
		
		double d1 = 12D;
		System.out.println(d1);//12.0
		

	}

}
