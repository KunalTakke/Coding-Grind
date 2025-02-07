package com.pattern.java;

import java.util.Scanner;

/*
 // n = 5
  
 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *
 
  
 */

public class Pattern5 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total = n * 2 - 1;
		int rows = 1;

		// rows
		while (rows <= total) {

			// incr
			int star = 1;

			while (star <= rows) {
				System.out.print("*");
				star++;
			}
			System.out.println();

			if (rows <= (total / 2) + 1) {
				star++;
			} else {
				star--;
			}

			rows++;
		}

	}
}
