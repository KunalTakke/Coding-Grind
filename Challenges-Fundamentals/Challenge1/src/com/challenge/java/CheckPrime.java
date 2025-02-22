package com.challenge.java;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums = 2;
		boolean isPrime = true;
		while (nums < n) {

			if (n % nums == 0 && n != 2) {
				isPrime = false;
			}

			nums++;

		}
		if (isPrime) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}

	}

}
