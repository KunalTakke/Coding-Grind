package com.challenge.java;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt(); // 10 => 2, 5 , 8, 11, 14, 17, 20, 23,
		int n2 = sc.nextInt(); // 4 => 8, 12 , 16 , 20 , 24

		int number = 0;
		int count = 0;
		while (count < n1) {

			int mul = 3 * number + 2;

			if (mul % n2 != 0 && mul >= n2) {
				System.out.println(mul);
				count++;
			}
			number++;
		}

	}

}
