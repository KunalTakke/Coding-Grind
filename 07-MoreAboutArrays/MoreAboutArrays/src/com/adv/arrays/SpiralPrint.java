package com.adv.arrays;

public class SpiralPrint {

	public static void spiralPrint(int[][] arr) {
		int left = 0;
		int right = arr[0].length - 1;
		int top = 0;
		int bottom = arr.length - 1;
		int direction = 1;
		int count = (right + 1) * (bottom + 1);

		while (top <= bottom && left <= right) {
			if (count > 0) {
				if (direction == 1) {
					for (int i = left; i <= right; i++) {
						System.out.print(arr[left][i] + " ");
						count--;
					}
					direction = 2;
					top++;
				}
			}
			if (count > 0) {
				if (direction == 2) {
					for (int i = top; i <= bottom; i++) {
						System.out.print(arr[i][right] + " ");
						count--;
					}
					direction = 3;
					right--;

				}
			}

			if (count > 0) {
				if (direction == 3) {
					for (int i = right; i >= left; i--) {
						System.out.print(arr[bottom][i] + " ");
						count--;
					}
					direction = 4;
					bottom--;
				}
			}

			if (count > 0) {
				if (direction == 4) {
					for (int i = bottom; i >= top; i--) {
						System.out.print(arr[i][left] + " ");
						count--;
					}
					direction = 1;
					left++;
				}
			}

		}

	}

	public static void main(String[] args) {

		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };

		spiralPrint(arr);

	}

}
