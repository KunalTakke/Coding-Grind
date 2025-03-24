package com.challenge.java;

import java.util.Scanner;
/*
 
             5                   5   
             5 4               4 5 
             5 4 3           3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2 1 0 1 2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3           3 4 5 
             5 4               4 5 
             5                   5 
  
 */

public class PatternInvertedHourGlass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int total = n*2+1;
		int row = 1;
		int nst = 1;
		int mid = (total/2)+1;
		int nsp = n*2-1;
		while(row<=total) {
			
			// work
			int cst = 1;
			int val = n;
	
			while(cst<=nst) {
				
				if(val!=0) {
					System.out.print(val+" ");
				}
				val--;
				cst++;
			}
			
			// space 
			int csp = 1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			
			// work
			int cst1 = 1;
			int val2 = n-nst+1;
			while(cst1<=nst) {
				System.out.print(val2);
				val2++;
				cst1++;
			}
			
			
			System.out.println();
			if(row<mid) { 
				nsp=nsp-2;
				nst++;
				
				
			}else {
				nst--;
				nsp = nsp+2;
			}
			row ++;
		
			
			
			
		}

	}

}
