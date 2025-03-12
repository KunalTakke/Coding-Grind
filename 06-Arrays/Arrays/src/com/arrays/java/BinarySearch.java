package com.arrays.java;

import java.util.Scanner;

public class BinarySearch { // array must be sorted

	public static int binarySearch(int[] arr, int item) {
		int low = 0;
		int high = arr.length - 1;

		// [1,2,3,4]
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] < item) {
				low = mid + 1;

			} else if (arr[mid] > item) {
				high = mid - 1;

			} else {
				return mid;
			}

		}

		return -1;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array :");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the value at index " + i+" :");
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the item to find in arr: ");
		int item = sc.nextInt();
		int ans = binarySearch(arr, item);
		System.out.print(ans);
	}

}
