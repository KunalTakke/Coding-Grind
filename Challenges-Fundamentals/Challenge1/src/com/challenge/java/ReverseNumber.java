package com.challenge.java;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// maintain a variable to hold the reverse number
		int reverseNumber = 0;

		while (n != 0) {

			// use modulo to extract the last digits of the number
			int lastDigit = n % 10;
			reverseNumber = reverseNumber * 10 + lastDigit;

			n = n / 10;

		}

		System.out.println(reverseNumber);

	}

}
