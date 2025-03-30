package com.adv.arrays;

import java.util.Scanner;

public class InputOutput2DArray {

	public static int[][] takeInput() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int rows = sc.nextInt();

		int[][] arr = new int[rows][];

		for (int i = 0; i < rows; i++) {
			System.out.println("Enter the number of columns for row " + i + " :");
			int col = sc.nextInt();
			arr[i] = new int[col];
			for (int j = 0; j < col; j++) {
				System.out.print("Enter element at " + i + " and " + j+" :");
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;

	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		int[][] arr = takeInput();
		display(arr);

	}

}
