package com.patternCBway.java;

import java.util.Scanner;

/*
 5
    *
   **
  ***
 ****
*****
  
 */

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int nst =1;
		int row =1;
		int nspaces=n-1;
		while(row<=n) {
			
			//Spaces
			int cspaces=1;
			while(cspaces<=nspaces) {
				System.out.print(" ");
				cspaces++;
			}
			
			// Stars
			int cst =1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			nspaces--;				
			nst++;
			row++;
		}
		
		
		
	}

}
