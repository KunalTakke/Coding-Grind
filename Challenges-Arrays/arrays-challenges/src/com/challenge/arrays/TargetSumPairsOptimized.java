package com.challenge.arrays;

import java.util.Arrays;
import java.util.Scanner;
// O(n)
public class TargetSumPairsOptimized {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int arrSize = scn.nextInt();
		
		int[] arr = new int[arrSize];
		
		for(int i =0;i<arrSize;i++) {
			arr[i] = scn.nextInt();
		}
		
		int query = scn.nextInt(); // target sum
		
		// optimized approach
		int left = 0;
		int right = arrSize -1;
		
		// sorting the array
		Arrays.sort(arr);
		
		while(left<right) { // limiting condition
			if(arr[left]+arr[right] == query) {
				System.out.println(arr[left]+" and "+arr[right]);
				left++;
				right -- ;
			}else if(arr[left]+arr[right]>query) {
				right--;
			}else {
				left++;
			}
			
		}

	}

}
