package com.recursion.java;

public class PrintDecreasing {

	public static void main(String[] args) {
		
		PrintDecreasing(5);
	}
	
	public static void PrintDecreasing(int n) {

		if(n == 0) {
			return;
		}
		System.out.println(n);
		PrintDecreasing(n-1);
	}
}
