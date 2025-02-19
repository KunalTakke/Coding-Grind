package com.patternCBway.java;

import java.util.Scanner;

/*
 
  n = 4
   1
  121
 12321
1234321
 
 */
public class Pattern11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nsp = n - 1;
		int nst = 1;
		while (row <= n) {

			// spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			// values
			int maxValue = row;
			int cst = 1;
			int val = 1;

			while (cst <= nst) {
				System.out.print(val);
				if (cst < maxValue) {
					val++;
				} else {
					val--;
				}
				cst++;
			}
			System.out.println();

			nst += 2; // incrementing nst by 2
			nsp--;
			row++;

		}

	}

}
