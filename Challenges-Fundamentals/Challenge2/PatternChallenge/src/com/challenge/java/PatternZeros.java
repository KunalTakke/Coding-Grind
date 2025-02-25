package com.challenge.java;
import java.util.Scanner;

/*
  
 Take N (number of rows), print the following pattern (for N = 5)
1
2 2
3 0 3
4 0 0 4
5 0 0 0 5 
 
 */
public class PatternZeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		while(row<=n) {
			// work 
			int cst = 1;
			while(cst<=nst) {
				if(cst == 1 || cst == nst) {
					System.out.print(nst+" ");
				}else {
					System.out.print("0 ");
				}
				cst ++;
			}
			
			System.out.println();
			nst++;
			row ++;
		}

	}

}
