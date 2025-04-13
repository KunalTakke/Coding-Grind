package com.challenge.arrays;

import java.util.Scanner;
// O(n^2)
public class TargetSumPairs {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int arrSize = scn.nextInt();

		int[] arr = new int[arrSize];

		for (int i = 0; i < arrSize; i++) {
			arr[i] = scn.nextInt();
		}

		int querySum = scn.nextInt();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == querySum) {
					if (arr[i] <= arr[j]) {
						System.out.println(arr[i] + " and " + arr[j]);
					} else {
						System.out.println(arr[j] + " and " + arr[i]);
					}

				}
			}
		}

	}

}
