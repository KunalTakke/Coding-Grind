package com.arrays.java;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {88,11,44,99,55}; // unsorted array
//		int[]arr = {88,11};
		
		int fix = 1; 
		
		while(fix < arr.length) { 
			int value = arr[fix]; // capture the value of fix
			
			int j = fix-1;
			
			while(j != -1 && arr[j]>value) {
				
				arr[j+1] = arr[j];
				System.out.println("j is :"+j);
				j--;
				
			}
			
			arr[j+1] = value;
			
			
			
			
			fix ++; // after sorting increment the counter
		}
		
		
		System.out.println("Printing sorted array :");
		// printing the array
		for(int x: arr) {
			System.out.print(x+ " ");
		}
		
		
		
	}
	

}
