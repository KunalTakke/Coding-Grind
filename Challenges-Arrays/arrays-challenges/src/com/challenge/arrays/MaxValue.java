package com.challenge.arrays;

import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int i = 0;
		int[] arr= new int[size];
		while(i!=size) {
			arr[i] = sc.nextInt();
			i++;
		}
		
		
		// finding max value
		int max = Integer.MIN_VALUE;
		for(int x: arr) {
			if(max<x) {
				max = x;
			}
		}
		
		System.out.println(max);
		
		
	}

}
