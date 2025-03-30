package com.adv.arrays;

public class Arrays2D {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][4];
		arr[0][2] = 12;
		arr[2][3] = 10;
		for(int i=0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();

		}
		
	}

}
