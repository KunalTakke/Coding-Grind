package com.patternCBway.java;

import java.util.Scanner;

/*
5
*****
****
***
**
*
 
 
 Framework for problem solving:
 1. no of rows:
 2. work ?
 3. preparation

 */

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int nst = n; // no of stars
		int row = 1;
		
		while(row<=n) {
			int cst =1; // count of stars 
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			
			nst--;
			row++;
		}
		
		
	}

}
