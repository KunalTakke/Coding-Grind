package com.recursion.java;

public class LastIndexRecursion {

	public static void main(String[] args) {
		int[] arr =  {3,8,1,8,8,3,4};
		System.out.println("Last index is "+lastIndex(arr, 0, 8));

	}
	
	public static int lastIndex(int[] arr, int si, int data) {
		
		// base case
		if(si == arr.length) {
			return -1;
		}
		
		// functional case
		int ans = lastIndex(arr,si+1,data);
		if(arr[si] == data && ans == -1) {
			return si;
		}
		return ans;
	}

}
