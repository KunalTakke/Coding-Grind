package com.function.java;

import java.util.Scanner;

public class DecimalToAnyBase {
	
	public static int decimalToAnyBase(int number, int destBase) {
		
		int multiplier = 1;
		int result = 0;
		int sbase = 10;
		while(number!=0) {
			
			int lastDigit = number % destBase;
			result = result + lastDigit * multiplier;
			multiplier = multiplier * sbase ; 
			
			
			number = number/destBase;
		}
		
		
		
		return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dbase = sc.nextInt();
		
		
		int res = decimalToAnyBase(n, dbase);
		System.out.println("The result in base "+dbase+" is :"+res);

	}

}
