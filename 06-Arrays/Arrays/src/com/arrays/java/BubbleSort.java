package com.arrays.java;

public class BubbleSort {

	public static void swap(int[] arr, int ind1, int ind2) {
		System.out.println("In swap !");
		int temp = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = temp;

	}

	public static void main(String[] args) {

		int[] arr = { 88, 66, 55, 44, 22 };

		int parseCounter = 1;
		// 0 1 2 3 4
		while (parseCounter < arr.length) { // 66 55 88 44 22 c1
			// pointer to values
			for (int i = 0; i < arr.length - parseCounter; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}

			}

			parseCounter++;
		}

		// printing the array
		for (int x : arr) {
			System.out.print(x + " ");
		}

	}

}
