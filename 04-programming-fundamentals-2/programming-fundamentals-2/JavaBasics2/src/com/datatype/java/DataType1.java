package com.datatype.java;

public class DataType1 {

	public static void main(String[] args) {

		byte b = 10;
		short sh = 20;
		int in = 30;
		long ln = 40;

//		b = sh; byte->1byte; short->2byte
//		b = in;
//		b = ln;

		sh = b; // short-> 2byte ; byte -> 1byte
		System.out.println(sh);

		in = b;
		in = sh;
//		in=ln;
		ln = in;

		// Part 2
		b = 10; // 10 is in the byte range (internally interger is converted to byte)
//		b = (byte)10; => implicit conversion
		b = 127;
		b = (byte) 128; // explicit conversion
		System.out.println(b); // -128

		// Part 3
		in = 1000000000;
		System.out.println(in);
//		in = 10000000000; 
		ln = 10000000000L; // if number gets out of the range of integers, then we convert the number into
							// long literal explicitly
		System.out.println(ln);

		/*
		 * Implicit conversion work by default for byte and short data type
		 */

		// Part 4
		sh = 3200; // implicit conversion by default
		System.out.println(sh);

		// Part 5
//		float f = 5.5; // by default the decimal numbers are of type double
		float f = 5.5f;
		System.out.println(f);

		double d = 6.5;

		// Part 6
		in = (int) f; // compiler will remove the decimal part
		System.out.println(in);

		f = in;
		System.out.println(f);

		// Part 7
		boolean bit = true;
		boolean bit2 = false; // 0 or 1 as values are not allowed

		// Part 8
//		65 to 90 => 'A' to 'Z'
//		97 to 122 -> 'a' to 'z'

		char ch = 'a';
		ch = 99;
		System.out.println(ch);

//		ch = 6400;
//		System.out.println(ch); // Java support UNICODE 

		ch = (char) (ch + 2);
		System.out.println(ch);
		
		ch = (char)6800;
		System.out.println(ch);
		
		// Part 9
		System.out.println(10+20+"Hello"+10+20); //30Hello1020
		System.out.println(2+' '+5); //39
		System.out.println(2+" "+5); //2 5
		System.out.println("Hello"+"\t"+"World!");
		System.out.println("Hello"+'\t'+"World!");		
		
	}

}
