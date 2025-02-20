package com.challenge.java;

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// calculate no of digits
		int count = 0;
		int number = n;
		while (number != 0) {
			count++;
			number = number / 10;
		}
		// operation
		int result = 0;
		int dummy = n;
		while (dummy != 0) {
			int lastDigit = dummy % 10;
			result = (int) (result + Math.pow(lastDigit, count));
			dummy = dummy / 10;
		}

		// verdict
		if (result == n) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
