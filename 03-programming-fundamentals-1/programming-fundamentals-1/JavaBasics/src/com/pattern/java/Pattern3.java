package com.pattern.java;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String args[]) {
		
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		
		while(row<=n) {
			// for printing space
			int space = 1;
			while(space<=n-row) {
				System.out.print(" ");
				space++;
			}
			// for printing *
			int col =1; 
			while(col<=row) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
			
			
		}
		
	}
	
}
