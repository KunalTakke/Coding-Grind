package com.recursion.java;

public class BubbleSortUsingRecursion {

	public static void main(String[] args) {

		int[] arr = { 50, 40, 30, 20, 10 };
		BubbleSort(arr, 0, arr.length - 1);

		// display the array
		for (int x : arr) {
			System.out.println(x);
		}

	}

	public static void BubbleSort(int[] arr, int si, int li) {

		// base case
		if (li == 0) {
			return;
		}

		// functional case
		if (si ==  li) {
			BubbleSort(arr, 0, li - 1);
			return;
		}

		if (arr[si] > arr[si + 1]) { // if previous is more than next
			int temp = arr[si + 1];
			arr[si + 1] = arr[si];
			arr[si] = temp;
		} // swap complete
		BubbleSort(arr, si + 1, li);

	}

}
