package com.pattern.java;

import java.util.Scanner;
/*
 Following is the pattern
 *****
  ****
   ***
    **
     *

 */

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int row =1;
		while(row<=n) {
			// spaces 
			int spaces = 1;
			while(spaces<=row-1) {
				System.out.print(" ");
				spaces++;
			}
			
			//stars
			int col = 1;
			while(col<=n-row+1) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}

	}

}
