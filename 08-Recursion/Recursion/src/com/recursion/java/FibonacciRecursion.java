package com.recursion.java;

public class FibonacciRecursion {

	public static void main(String[] args) {
		
		int ans = Fibonacci(6);
		System.out.println(ans);
	}
	
	public static int Fibonacci(int n) { // n => fibonacci term
		
		//base case
		if(n == 0 || n == 1) {
			return n; 
		}
		
		int fCall1 = Fibonacci(n-1);
		int fCall2 = Fibonacci(n-2);
		int fans = fCall1+ fCall2;
		//0 1 1 2 3 5 8 
		return fans;
	}

}
