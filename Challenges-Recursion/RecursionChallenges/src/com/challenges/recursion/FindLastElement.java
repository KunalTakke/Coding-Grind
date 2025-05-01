package com.challenges.recursion;
import java.util.Scanner;

public class FindLastElement {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i< size; i++) {
			arr[i] = scn.nextInt();
		}
		
		int query = scn.nextInt();
		System.out.println(FindLastIndex(arr, 0, query));
	}
	
	public static int FindLastIndex(int[] arr, int si, int query) {
		
		// base case
		if(si == arr.length) {
			return -1; // asuming occurance not found
		}
		
		// functional case
		
		int ans = FindLastIndex(arr, si+1, query);
		if(arr[si] == query && ans == -1) {
			ans = si;
		}
		return ans;
		
	}

}
