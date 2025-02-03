package com.basic.java;

import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of fibbonacci series you want :");
		int n = sc.nextInt();
		
		// initializing variables
		int a = 0; 
		int b = 1;
		
		int counter = 1; // record number of times to run 
		
		while(counter<=n) {
			
			int sum  = a+b;
			System.out.println(sum);
			a = b;
			b = sum;
			counter ++;
		}
		
	}

}
