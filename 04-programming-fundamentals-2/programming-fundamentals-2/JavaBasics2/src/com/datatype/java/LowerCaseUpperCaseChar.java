package com.datatype.java;

import java.util.Scanner;

public class LowerCaseUpperCaseChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char c = sc.next().charAt(0);
		
		if(c>=65 && c<=90) {
			System.out.println("UpperCase");
		}else if(c>=97 && c<=122) {
			System.out.println("LowerCase");
		}else {
			System.out.println("Invalid Character");
		}
		
	}

}
