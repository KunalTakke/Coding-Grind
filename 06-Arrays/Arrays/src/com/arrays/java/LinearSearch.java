package com.arrays.java;
import java.util.Scanner;
public class LinearSearch {
	
	public static int searchArray(int[] arr,int item) {
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == item) {
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,70,90};
		
		System.out.println(searchArray(arr, 20));

	}

}
