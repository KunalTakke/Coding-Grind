package com.patternCBway.java;

import java.util.Scanner;

/*
 5
    1
   222
  33333
 4444444
555555555
 
 */

public class Pattern9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nspace =n-1;
		int nnum =1;
		int val=1;
		while(row<=n) {
			//space
			for(int cspace=1;cspace<=nspace;cspace++) {
				System.out.print(" ");
			}
			
			//numbers
			for(int cnum=1;cnum<=nnum;cnum++) {
				System.out.print(val);
				
			}
			
			System.out.println();
			val++;
			
			nnum+=2;
			nspace--;
			row++;
		}
		
	}

}
