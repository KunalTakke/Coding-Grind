package com.recursion.java;

public class TowerOfHanoi {

	public static void main(String[] args) {
		
		int n = 3;
		TowerOfHanoi(3, "src","dest","helper"); // function call from main function 

	}
	
	public static void TowerOfHanoi(int n, String src, String dest, String helper) {
		
		// base case
		if(n == 0) {
			return;
		}
		
		// functional case
		/*
		 
		 src - 3,
		 dest - 0, 1, 
		 helper - 0, 2, 
		 	 
		 */
		
		TowerOfHanoi(n-1, src,helper,dest);
		System.out.println("move "+n+"th disc from "+src+" to "+dest);
		TowerOfHanoi(n-1,helper,dest,src);
		
		// step 1: Move n-1 disks from src to helper using destination
		// step 2: 
		// step 3: 
		
	}

}
