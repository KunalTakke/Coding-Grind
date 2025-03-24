package com.challenge.java;
import java.util.Scanner;

/*
 
 Take N as input. For a value of N=7, we wish to draw the following pattern :

                            1 
                        2 1   1 2 
                    3 2 1       1 2 3 
                4 3 2 1           1 2 3 4 
                    3 2 1       1 2 3 
                        2 1   1 2 
                            1 
  
 */

public class DoubleSidedArrow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		
		int nwork = 1;
		int nspace = n-1;
		int ispace = -1;
		int mid = (n/2)+1; 
		int i = 2;
		
		while(row<=n) {
			
			//space
			int cspace = 1;
			while(cspace<=nspace) {
				System.out.print(" ");
				cspace ++;
			}
			
			// work
			int cwork = 1;
//			int val = row - i; //r5 v3 ,r6 v2 ,r7 v1 
			int val=row;
			if(row<mid) {
				val = row;
			}
			
			while(cwork<=nwork) {
				System.out.print(val);
				val--;
				cwork++;
			}
			

			int cntspace = 1;
			while(cntspace<=ispace) { // 0 , 1, 3, 5, 3, 1, 0 
				System.out.print("*");
				cntspace++;
			}

			// work
			int c2work = 1;
			int val2 = 1;
			while(c2work<=nwork) {
				System.out.print(val2);
				val2++;
				c2work++;
			}
			
			
			System.out.println();
			
			if(row<mid) {
				nwork++;
				nspace=nspace-2;
				ispace=ispace +2;
			}
			else {
				nwork--;
				nspace=nspace+2;
				ispace=ispace -2;
			}

			row ++;
		}
		
		
	}

}
