package com.patternCBway.java;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int row = 1;
		int nst = row;
		int nspace =(n-nst)*2-1;
		
		// space = 7 , row = 1 , stars = 2
		// space = 5 , row = 2 , stars = 4 
		// space = 3 , row = 3 , stars = 6
		// space = 1 , row = 4 , stars = 8
		// space = 0 , row = 5 , stars = 9
		while(row<=n) {
			
			// stars
			int cst1 = 1;
			while(cst1<=nst) {
				System.out.print("*");
				cst1++;
			}
			
			//spaces
			int cspace =1;
			while(cspace<=nspace) {
				System.out.print(" ");
				
				cspace ++;
			}
			
			// stars
			int cst2 =1;
			while(cst2<=nst) {
				System.out.print("*");
				cst2++;
			}
			
			System.out.println();
			nspace=(n-nst)*2-1;
			nst ++;
			row ++;
		}
		
		

	}

}
