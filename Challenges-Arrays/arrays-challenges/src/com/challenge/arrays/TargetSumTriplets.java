package com.challenge.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class TargetSumTriplets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arrSize = sc.nextInt();

		int[] arr = new int[arrSize];

		for (int i = 0; i < arrSize; i++) {
			arr[i] = sc.nextInt();
		}

		int targetSum = sc.nextInt();

		Arrays.sort(arr); // sorting the array

		int left = 0;
		int mid = 1;
		int right = arrSize - 1;

		while (left < right) {

			while (mid < right) {
				if (arr[left] + arr[mid] + arr[right] == targetSum) {
					System.out.println(arr[left] + ", " + arr[mid] + " and " + arr[right]);
					mid++;
					right--;
				} else if (arr[left] + arr[mid] + arr[right] > targetSum) {
					right--;
				} else {
					mid++;
				}
			}
			left++;
			mid = left + 1;
			right = arrSize - 1;
		}

	}

}
