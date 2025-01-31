package com.basic.java;

import java.util.Scanner;

public class SumN {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N :");
		
		int number = sc.nextInt();
		int sum = 0;
		int i=1;
		while(i<=number) {
			sum+=i;
			i++;
		}
		System.out.println("The total is :"+sum);
		
	}

}
