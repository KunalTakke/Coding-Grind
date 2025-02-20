package com.challenge.java;

import java.util.Scanner;
import java.lang.Math;

public class DecimalToOctal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int octalNumber = 0;
		int pow = 0;

		while (n != 0) {
			int lastDigit = n % 8;
			octalNumber = (int) (octalNumber + lastDigit * Math.pow(10, pow));
			pow++;
			n = n / 8;
		}
		System.out.println(octalNumber);
	}
}