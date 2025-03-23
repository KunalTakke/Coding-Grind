package com.arrays.java;

public class SelectionSort {
	
	public static void swap(int[] arr, int ind1, int ind2) {
		
		int temp = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = temp;
		
	}

	public static void main(String[] args) {
		
		int[] arr = {88,11,44,99,55}; // unsorted 
		int fix = 0; // index for sorting current element
		int min = fix; // set the minimum index
		while(fix < arr.length -1 ) {
			
		
		for(int i = min+1;i<arr.length;i++) {
			if(arr[min]>arr[i]) { // finding minimum
				min = i;
			}
		}
		
		swap(arr,fix,min);
		
		fix++; // increment fix
		min = fix+1;
		}
		
		// print the array
		System.out.println("Sorted array is :");
		for(int x: arr) {
			System.out.print(x+" ");
		}
		 

	}

}
