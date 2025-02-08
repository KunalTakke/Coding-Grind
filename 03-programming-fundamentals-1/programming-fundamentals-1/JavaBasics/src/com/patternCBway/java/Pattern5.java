package com.patternCBway.java;

import java.util.Scanner;

/*
 n = 7
 *** ***
 **	  **
 *	   *
 
 *	   *
 **	  **
 *** ***
 */

public class Pattern5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nspace = 1;
		int nst = (n - nspace)/2;

		while (row <= n) {
			
			// work
			int cst1 =1;
			while(cst1<=nst) {
				System.out.print("*");
				cst1++;
			}

			// space
			int cspace = 1;
			while (cspace <= nspace) {
				System.out.print(" ");
				cspace++;
			}
			
			// work
			int cst2 =1;
			while(cst2<=nst) {
				System.out.print("*");
				cst2++;
			}
			

			if (row <= (n) / 2) {
				nspace += 2;
			} else {
				nspace -= 2;
			}

			System.out.println();
			nst = (n - nspace)/2;
			row++;
		}

	}

}
