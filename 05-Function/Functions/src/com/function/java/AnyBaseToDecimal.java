package com.function.java;

import java.util.Scanner;
import java.lang.Math;

public class AnyBaseToDecimal {

	public static int ToDecimal(int number, int base) {

		int count = 0;
		int result = 0;
		while (number != 0) {
			// operations

			int lastDigit = number % 10;
			result = (int) (result + lastDigit * Math.pow(base, count));

			count++;
			number = number / 10;
		}

		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number :");
		int n = sc.nextInt();

		System.out.print("Enter it's base :");
		int base = sc.nextInt();

		int res = ToDecimal(n, base); // call the function
		System.out.println("The number in decimal is :" + res);
	}

}
