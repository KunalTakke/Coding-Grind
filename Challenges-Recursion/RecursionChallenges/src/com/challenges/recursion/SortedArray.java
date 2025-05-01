package com.challenges.recursion;
import java.util.Scanner;
public class SortedArray {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];
		
		for(int i = 0; i<size;i++) {
			arr[i] = scn.nextInt();
		}
		
		System.out.println(isSorted(arr, 0)); // returns with ans
		
	}
	
	public static boolean isSorted(int[] arr, int si) {
		
		// base case
		if(si == arr.length-1) {
			return true;
		}
		
		// functional case
		if(arr[si] > arr[si+1]) {
			return false;
		}
		boolean ans = isSorted(arr, si+1);
		return ans;
	}

}
