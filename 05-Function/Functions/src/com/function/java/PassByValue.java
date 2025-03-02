package com.function.java;

public class PassByValue {

	public static void main(String[] args) {
	
		int a = 10;
		int b = 20;
		
		System.out.println("value of a is :"+a+" Value of b is :"+b);
		Swap(a,b);
		System.out.println("value of a is :"+a+" Value of b is :"+b); // The value is not reflected hence Java is pass by value
		

	}
	
	public static void Swap(int a , int b) {
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("value of a is :"+a+" Value of b is :"+b);
		
	}

}
