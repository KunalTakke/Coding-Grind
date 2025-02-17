package com.challenge.java;

import java.util.Scanner;

public class DelhiOddEven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			Long number = sc.nextLong();
			int evenSum = 0;
			int oddSum = 0;
			// take sum of even digits and odd digits
			while(number!=0) {
				Long lastDigit = number % 10 ;
				if (lastDigit%2 == 0) {
					evenSum+=lastDigit;
				}else {
					oddSum+=lastDigit;
				}
				
				number = number / 10;
			}
			// verdict
			if(evenSum%4 == 0 || oddSum % 3 == 0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
		}

	}

}
