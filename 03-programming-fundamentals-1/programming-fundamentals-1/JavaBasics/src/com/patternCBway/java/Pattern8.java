package com.patternCBway.java;
import java.util.Scanner;


/*
 
 5
    1
   111
  11111
 1111111
111111111
   
 */
public class Pattern8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int nnum=1; // no of num
		int row =1;
		int nspace =n-1;
		while(row<=n) {
			
			//spaces
			int cspace =1;
			while(cspace<=nspace) {
				System.out.print(" ");
				cspace++;
			}
						
			// number
			int cnum =1;
			while(cnum<=nnum) {
				System.out.print("1");
				cnum++;
			}
			System.out.println();
			nspace--;
			nnum+=2;
			row++;
			
		}
	}

}
