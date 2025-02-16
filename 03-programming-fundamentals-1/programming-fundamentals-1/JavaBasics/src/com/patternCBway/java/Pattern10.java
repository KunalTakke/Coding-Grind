package com.patternCBway.java;

import java.util.Scanner;

/*
 
  5
				1	
			2	3	4	
		5	6	7	8	9	
	10	11	12	13	14	15	16	
17	18	19	20	21	22	23	24	25	
  
  
 
 */

public class Pattern10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int row =1;
		int nspace = n-1;
		int nnum =1;
		int val=1;
		while(row<=n) {
			
			// space
			for(int cspace=1;cspace<=nspace;cspace++) {
				System.out.print("\t");
			}
			
			// stars
			for(int cnum=1;cnum<=nnum;cnum++) {
				System.out.print(val+"\t");
				val++;
			}
			System.out.println();
			nnum+=2;
			nspace--;
			row++;
		}

	}

}
