package com.recursion.java;

public class PowerRecursion {

	public static void main(String[] args) {
		
		System.out.println(PowerRecursion(2,5));

	}
	
	public static int PowerRecursion(int n, int pow) {
		
		// base case
		if(pow == 0) {
			return 1;
		}
		
		int functionCall = PowerRecursion(n,pow-1);
		int ans = functionCall*n;
		return ans;
		
	}
}
