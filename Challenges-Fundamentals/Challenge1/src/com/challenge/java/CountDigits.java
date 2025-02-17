package com.challenge.java;

import java.util.Scanner;
public class CountDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int digit = sc.nextInt();
		int count = 0;
		while(n!=0) {
			
			long lastDigit = n % 10;
			if(lastDigit == digit) {
				count++;
			}
			
			n=n/10;
		}
		
		System.out.println(count);
	}

}
