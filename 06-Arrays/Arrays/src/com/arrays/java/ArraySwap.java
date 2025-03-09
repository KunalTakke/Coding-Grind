package com.arrays.java;

import java.util.Scanner;

public class ArraySwap {

	public static void Swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void PrintArray(int[] arr) {
		// print array
		System.out.println("Printing array :");
		for (int x : arr) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {

		int[] arr = new int[5];

		Scanner sc = new Scanner(System.in);

		// give inputs
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		PrintArray(arr);

		System.out.println("Swap index for i: ");
		int i = sc.nextInt();
		System.out.println("Swap index for j: ");
		int j = sc.nextInt();

		Swap(arr, i, j);
		PrintArray(arr);

	}

}
