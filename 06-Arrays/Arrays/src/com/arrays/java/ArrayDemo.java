package com.arrays.java;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] arr = null;
		
		System.out.println(arr);
		
		arr = new int[5];
		
		System.out.println("Memory address of arr is :"+arr);
		
		// un-initialized array
		System.out.println("Uninitialized values are :");
		for(int i = 0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		
		// initializing values in an array
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		// printing initialized values 
		System.out.println("Initialized Values are :");
		for(int i = 0; i< arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		// using for each loop
		System.out.println("Using for each loop :");
		for(int x: arr) {
			System.out.println(x);
		}
	}

}
