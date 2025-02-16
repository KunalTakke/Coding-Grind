package com.patternCBway.java;

import java.util.Scanner;

/*
 5
*       *
**     **
***   ***
**** ****
*********
 
 */

public class Pattern7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int row = 1;
		int nst = row;
		int nspace = (n) * 2 - 3;

		while (row <= n) {

			// stars
			int cst1 = 1;
			while (cst1 <= nst) {
				System.out.print("*");
				cst1++;
			}

			// spaces
			int cspace = 1;
			while (cspace <= nspace) {
				System.out.print(" ");

				cspace++;
			}

			// stars
			int cst2 = 1;
			if(row == n) {
				cst2 = 2;
			}
			while (cst2 <= nst) {
				System.out.print("*");
				cst2++;
			}

			System.out.println();
			nspace -= 2;
			nst++;
			row++;
		}

	}

}
