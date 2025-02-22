package com.challenge.java;

import java.util.Scanner;

public class ManmohanPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		while (row <= n) {
			// work
			int cst = 1;
			while (cst <= nst) {
				if (row % 2 != 0) {
					System.out.print("1");
				} else {
					if (cst == 1 || cst == row) {
						System.out.print("1");
					} else {
						System.out.print("0");
					}
				}
				cst++;
			}
			System.out.println();
			nst++;
			row++;
		}
	}

}
