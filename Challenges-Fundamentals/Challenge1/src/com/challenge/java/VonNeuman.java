package com.challenge.java;

import java.lang.Math;
import java.util.Scanner;

public class VonNeuman {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			long number = sc.nextLong();
			int decimalNumber = 0;
			int power = 0;
			while (number != 0) {

				long digits = number % 10;
				decimalNumber = (int) (decimalNumber + digits * Math.pow(2, power));

				power++;
				number = number / 10;

			}
			System.out.println(decimalNumber);

		}

	}

}
