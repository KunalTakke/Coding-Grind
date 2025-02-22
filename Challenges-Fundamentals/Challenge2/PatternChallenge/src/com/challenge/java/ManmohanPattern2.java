package com.challenge.java;

import java.util.Scanner;

public class ManmohanPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		while (row <= n) {
			// operation
			int cst = 1;
			while (cst <= nst) {
				if (cst == 1 || cst == nst) {
					if (nst == 1) {
						System.out.print("1");
					} else {
						System.out.print(nst - 1);
					}

				} else {
					System.out.print("0");
				}

				cst++;
			}
			System.out.println();
			nst++;
			row++;
		}
	}

}
