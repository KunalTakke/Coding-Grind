package com.challenge.arrays;

/*

Sample Input
4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44

Sample Output
11, 21, 31, 41, 42, 32, 22, 12, 13, 23, 33, 43, 44, 34, 24, 14, END

 */

import java.util.Scanner;

public class ArrayWavePrintColumnWise {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int m = scn.nextInt();
		int n = scn.nextInt();

		// take input for 2d array
		int[][] arr = new int[m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}

		// print 2d array as column wise wave
		int dir = 0; // 1 or 0
		int count = m * n; // total values in the matrix
		int top = 0;
		int bottom = arr.length - 1;
		while (count > 0 && top != arr[0].length) {

			// up-down
			if (count > 0 && dir == 0) {
				for (int i = 0; i <= arr.length - 1; i++) {
					System.out.print(arr[i][top] + ", ");
					count--;
				}
				dir = 1;
				top++;
			}

			// down-up
			if (count > 0 && dir == 1) {

				for (int i = arr.length - 1; i >= 0; i--) {
					System.out.print(arr[i][top] + ", ");
					count--;
				}
				dir = 0;
				top++;
			}

		} // while end

		System.out.print("END"); // end print

	}

}
