package com.languagefundamentals;


//byte short int long float double 
public class TestDataTypesDemo1 {

	// Declaration
	// 1 byte = 8 bits, the range we can store is -128 to 127
	// Note : All number values from RHS is by default int
	// Type mismatch: cannot convert from int to byte

	// -128 -127 -126 .......0 .. 1 2 3 4 ...... 127
	byte b = (byte) 257;// Explicit Type casting -> Big Data Type values to Low data types.

	// 2 bytes = 16 bits, the range we can store is -32768 to 32767
	// Type mismatch: cannot convert from int to short
	short s = (short) 32768;

	// 4 bytes = 32 bits, the range we can store is -2147483648 to 2147483647
	// The literal 2147483648 of type int is out of range
	int i = (int) 2147483648L;

	// 8 byte = 64 bits, the range we can store
//	is 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//	The literal 9223372036854775808L of type long is out of range 
	long l = 9223372036854775807L;

	// 4 bytes = 32 bits, the range we can store after decimal 5-6 decimal points.
	// By default all decimal numbers from RHS is double
	// Type mismatch: cannot convert from double to float
	float f = 5.95674547657856543765576454F;
	float f1 = 785764658767564545675465454656475F;
	float f2 = 100;//Implicit Type casting : Converting small data types to Big data types 
	//ex: int to float 
	
	
	// 8 byte = 64 bits
	double d = 5.95674547657856543765576454;

	// 2 bytes : -32768 to 32767 = 65535
	char c = 'A';
	char c1 = 85;//ASCII --> A //int can convert to char
	char c2 = '6';// 6 
//	char c3 = "A";//Type mismatch: cannot convert from String to char
	char c4 = '\u0040';//unicode characters --> @ 
	
	char c5 = 678;


	int i1 = 'A'; //can we convert to char to int ..? Yes // Imlicit Type casting 
	

	// 1 bit
	boolean boo = false;

//	boolean boo1 = 0;
//	boolean boo2 = 1;
//	boolean boo2 = TRUE;
//	boolean boo2 = TRUE;
//	boolean boo2 = True;
//	boolean boo2 = False;
//	boolean boo2 = "true";
//	boolean boo2 = "flase";
	
	public static void main(String[] args) {
		System.out.println("main method started !!");

		TestDataTypesDemo1 t1 = new TestDataTypesDemo1();

		System.out.println("byte value : " + t1.b);// 0// -126
		System.out.println("short value : " + t1.s);// 0

		System.out.println("int value : " + t1.i);// 0
		System.out.println("long value : " + t1.l);// 0

		System.out.println("float value : " + t1.f);// 0.0
		System.out.println("float value : " + t1.f1);// 0.0
		System.out.println("float value : " + t1.f2);// 0.0
		
		System.out.println("double value : " + t1.d);// 0.0
		
		System.out.println("char value : " + t1.c);//
		System.out.println("char value : " + t1.c1);//
		System.out.println("char value : " + t1.c2);//
//		System.out.println("char value : " + t1.c3);//
		System.out.println("char value : " + t1.c4);//
		
		System.out.println("char5 value : " + t1.c5);//
		
		
		if(t1.boo) {
			System.out.println("Java is simple ");
		}
		
		
		
		
		System.out.println("boolean value : " + t1.boo);// false
		
		System.out.println("main method edned !");

	}

}
