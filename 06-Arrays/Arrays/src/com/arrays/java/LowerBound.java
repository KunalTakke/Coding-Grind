package com.arrays.java;

public class LowerBound {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 2, 2, 3, 3, 3, 9, 11 };
		int data = 2;
		int ans = -1;

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == data) {
				ans = mid;
				high = mid-1;
			} else if (arr[mid] > data) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}
		System.out.println(ans);

	}

}
