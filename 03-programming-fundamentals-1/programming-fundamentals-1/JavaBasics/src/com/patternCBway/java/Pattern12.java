package com.patternCBway.java;

import java.util.Scanner;
/*
5
1	
2	*	2	
3	*	3	*	3	
4	*	4	*	4	*	4	
5	*	5	*	5	*	5	*	5	
4	*	4	*	4	*	4	
3	*	3	*	3	
2	*	2	
1	

 
 
 */

public class Pattern12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = 1;
		
		
		int row =1 ;
		int val =1;
		while(row<=(n*2-1)) {
			
			
			// value
			int cst = 1;
			while(cst<=nst) {
				if(cst%2!=0) {
					System.out.print(val);
					System.out.print("\t");
				}else {
					System.out.print("*");
					System.out.print("\t");
				}
				cst++;
			}
			
			System.out.println();
			if(row<n) {
				nst+=2;
				val++;
			}else {
				nst-=2;
				val--;
			}
			
			row++;
		}
		
	}

}
