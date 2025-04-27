package com.recursion.java;

public class FirstIndexUsingRecursion {

	public static void main(String[] args) {
		int[] arr = {6,8,1,1,8,4};
		System.out.println(FirstIndex(arr, 0, 4));

	}
	
	public static int FirstIndex(int[] arr, int si, int data) {
		
		//base case
		if((si+1 > arr.length-1) && arr[si]!=data) {
			return -1;
		}
		
		// functional case
		if(arr[si] == data) {
			return si;
		}
		int ans = FirstIndex(arr,si+1,data);
		return ans;
		
		
	}

}
