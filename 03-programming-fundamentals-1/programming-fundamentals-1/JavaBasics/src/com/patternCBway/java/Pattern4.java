package com.patternCBway.java;

import java.util.Scanner;

/*
 
 6
*
**
***
****
*****
******
*****
****
***
**
*
 
 
 */

public class Pattern4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int total = n * 2 - 1; // total row
		int nst = 1;

		while (row <= total) {

			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			if (row <= (total) / 2) { // increment
				nst++;
			} else { // decrement
				nst--;
			}

			row++;
		}

	}

}
