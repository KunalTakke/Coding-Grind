package com.basic.java;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n = sc.nextInt();
		
		
		int i= 2;
		while(i<=n-1) {
			if(n%i == 0) {
				System.out.println("Not Prime");
				break;
			}
			
			i++;
			
		}
		if(i==n) {
			System.out.println("Prime");
		}
		
	}

}
