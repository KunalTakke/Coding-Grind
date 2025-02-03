package com.basic.java;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n1: ");
		int n1 = sc.nextInt();
		System.out.print("Enter n2: ");
		int n2 = sc.nextInt();
		
		// finding common divisors
		int divisor = 0;
		int divident = 0;
		
		// find the smallest among n1 and n2 
		if(n1<n2) {
			divisor = n1;
			divident = n2;
		}
		else {
			divisor = n2;
			divident = n1;
		}
		int remainder = divident % divisor;
		while(remainder != 0) {
			divident = divisor;
			divisor = remainder;
			remainder = divident % divisor;
		}
		System.out.println(divisor);
		
		
		
	}

}
