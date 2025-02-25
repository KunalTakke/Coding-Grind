package com.challenge.java;

import java.util.Scanner;

/*
 Take N (number of rows), print the following pattern (for N = 4).

                       1 
                     2 3 2
                   3 4 5 4 3
                 4 5 6 7 6 5 4 
  
 */

public class PatternTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nspace = n - 1;
		int nwork = 1;
		
		while(row<=n) {
			
			// space
			int cspace = 1;
			while(cspace <= nspace) {
				System.out.print("\t");
				cspace ++;
			}
			
			// work
			int cwork = 1;
			int val = row;
			int mid = (nwork/2)+1;
			while(cwork <= nwork) {
				//logic
				if(cwork < mid) {
					System.out.print(val+"\t");
					val++;
				}else {
					System.out.print(val+"\t");
					val--;
				}
				
				cwork++;
			}
			System.out.println();
			
			nspace --;
			nwork+=2;
			row ++ ;
		}
			
	}

}
