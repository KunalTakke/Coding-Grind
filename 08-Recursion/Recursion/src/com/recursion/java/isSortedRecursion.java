package com.recursion.java;

public class isSortedRecursion {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(isSorted(arr, 0));

	}

	public static boolean isSorted(int[] arr, int size) {

		// base case
		if (size + 1 > arr.length - 1) { 
			return true;
		}

		// functional cases
		if (arr[size] > arr[size + 1]) {
			return false;
		} 
		boolean ans = isSorted(arr,size+1);
		return ans;

	}
}
