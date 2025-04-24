package com.recursion.java;

public class FactorialRecursion {

	public static void main(String[] args) {
		
		System.out.println(Factorial(4));
	}
	
	public static int Factorial(int n) {
		
		// base case 
		if(n == 1 || n == 0) {
			return 1;
		}
		
		int factorialCall = Factorial(n-1);
		int factorial = n * factorialCall;
		return factorial;
		
		
	}

}
