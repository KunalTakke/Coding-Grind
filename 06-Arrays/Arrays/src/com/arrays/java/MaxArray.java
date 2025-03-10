package com.arrays.java;

import java.util.Scanner;
public class MaxArray {
	
	public static int[] takeInput(int size) {
		
		int[] arr = new int[size];
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<size;i++) {
			System.out.print("Enter value at index "+i+" :");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public static void findMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int x: arr) {
			if(x>max) {
				max = x;
			}
		}
		System.out.println("The max is :"+max);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of the array :");
		int size = sc.nextInt();
		
		int[] arr = takeInput(size);
		
		findMax(arr);

	}

}
