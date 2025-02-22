package com.challenge.java;

import java.util.Scanner;

/*
4

1						1
1	2				2	1
1	2	3		3	2	1
1	2	3	4	3	2	1
 
 */
public class PatternMountain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int maxValue = row;
		int nst = 1;
		int nsp = n*2-3;
		while (row <= n) {

			// work
			int cst = 1;
			while (cst <= nst) {
				System.out.print(cst + "\t");
				cst++;
			}

			// spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}

			// work
			int cst1 = 1;
			int val = maxValue;

			if (row == n) { // for last row
				cst1 = 2;
				val = maxValue - 1;
			}
			while (cst1 <= nst) {

				System.out.print(val + "\t");
				val--;
				cst1++;
			}

			System.out.println();

			nsp -= 2;
			nst++;
			row++;
			maxValue = row;
		}

	}

}
