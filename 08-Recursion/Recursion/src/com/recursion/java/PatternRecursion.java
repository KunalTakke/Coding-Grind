package com.recursion.java;

public class PatternRecursion {

	public static void main(String[] args) {
	
		pattern(5,1,1); // function call

	}	
	
	public static void pattern(int N, int row, int col) {
	
		// base case
		if(row > N) {
			return;
		}
		
		if(col > row) {
			System.out.println(); // next line
			pattern(N, row+1, 1); // w
			return;
		}
		

		System.out.print("*"); // print the pattern
		pattern(N,row,col+1); // increase col till col > row
		System.out.println();
	}
	
	
}
