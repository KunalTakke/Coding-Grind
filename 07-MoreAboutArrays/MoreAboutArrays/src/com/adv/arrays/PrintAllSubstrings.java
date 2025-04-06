package com.adv.arrays;

import java.util.Scanner;

public class PrintAllSubstrings {

	public static void printSubStrings(String query) {
		
		for(int i =0;i<query.length();i++) {
			
			for(int j=i+1;j<=query.length();j++) {
				System.out.println(query.substring(i,j));
			}
			System.out.println();
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		// function call
		printSubStrings(str);

	}

}
