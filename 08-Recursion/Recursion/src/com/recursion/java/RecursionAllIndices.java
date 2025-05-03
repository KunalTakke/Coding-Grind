package com.recursion.java;


import java.util.ArrayList;

public class RecursionAllIndices {

	public static void main(String[] args) {
		int[] arr = {3,8,1,8,8,4};
		int[] res = allIndices(arr, 0, 8, 0); // initial values
		
		for(int x: res) {
			System.out.println(x);
		}
	}
	
	public static int[] allIndices(int[] arr, int si, int data, int count) {
		
		/*
		 My approach is that while building the stack I will count the occurance,
		 and while the stack is falling I will insert into the arr with the index 
		 */
		
		//base case
		if(si == arr.length) {
			int[] ans = new int[count];
			return ans;
		} 
		
		
		// functional case
		if(arr[si] == data) { // if element equals the data
			 int[] ans = allIndices(arr, si+1, data, count+1);
			 ans[count] = si;
			 return ans;
			 
		}
		int[] ans = allIndices(arr, si+1, data, count); // if element not equal to data	
		return ans;
		
	} 
	

}
