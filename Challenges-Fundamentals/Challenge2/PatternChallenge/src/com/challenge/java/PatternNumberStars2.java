package com.challenge.java;

import java.util.Scanner;
/*
 n = 7
 
 1******
 12*****
 123****
 1234***
 12345**
 123456*
 1234567
  
 */

public class PatternNumberStars2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int nwork = row;
		int snwork = n - nwork; 
		while(row<=n) {
			
			// number work
			int cwork = 1;
			while(cwork<=nwork) {
				System.out.print(cwork);
				cwork++;
			}
			
			// star work
			int scwork = 1;
			while(scwork<=snwork) {
				System.out.print("*");
				scwork++;
			}
			
			
			System.out.println();
			
			
			nwork++;
			snwork = n - nwork;
			row ++;
		}
		
		

	}

}
