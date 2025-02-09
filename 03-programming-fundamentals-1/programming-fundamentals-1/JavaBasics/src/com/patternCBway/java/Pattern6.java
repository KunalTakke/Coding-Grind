package com.patternCBway.java;
import java.util.Scanner;

/*
 
  n = 7
   *
  ***
 *****
*******
 *****
  ***
   *
  
 */

public class Pattern6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int nsp =n-4; // 
		int nst = 1;
		while(row<=n) {
			
			// work 
			
			// 1.spaces
			int csp = 1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			
			// 2.stars
			int cst =1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			
			System.out.println();
			
			
			if(row<=(n)/2) {
				nst+=2;
				nsp--;
			}else {
				nst-=2;
				nsp++;
			}
			
			row++;
		}
		
		

	}

}
