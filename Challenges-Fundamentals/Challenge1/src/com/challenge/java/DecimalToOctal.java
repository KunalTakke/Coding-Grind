package com.challenge.java;

import java.util.Scanner;
import java.lang.Math;

public class DecimalToOctal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int octalNumber = 0;
		while(n!=0) {
			
			int lastDigit = n % 10; // 63 => 77 => 
			
			
			
			n = n / 10;
		}
		System.out.println(octalNumber);

	}

}
