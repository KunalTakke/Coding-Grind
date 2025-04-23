package com.recursion.java;

public class PrintIncreasingDecreasing {

	public static void main(String[] args) {
		
		PrintIncreasingDecreasing(5);

	}
	
	public static void PrintIncreasingDecreasing(int n) {
		
		if(n == 0) {
			return;
		}
		System.out.println(n);
		PrintIncreasingDecreasing(n-1);
		System.out.println(n);
	}

}
