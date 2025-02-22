package com.challenge.java;

import java.util.Scanner;
public class FibonacciPattern { // incomplete code

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		int val1 = 0;
		int val2 = 1;
		
		while(row<=n && n>=2) {
			int cst = 1;
			while(cst<=nst) {
				int fibbo = val1 + val2;
				System.out.print(fibbo+"\t");
				cst++;
				val1 = val2;
				val2 = fibbo;
			}
			System.out.println();
			
			nst++;
			row++;
		}
		
	}

}
