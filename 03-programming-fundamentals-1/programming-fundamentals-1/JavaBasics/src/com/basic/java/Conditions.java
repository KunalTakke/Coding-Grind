package com.basic.java;

import java.util.*;
public class Conditions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age :");
		int number = sc.nextInt();
		
		if(number<=11) {
			System.out.println("Child");
		}else if(number>=12 && number <18){
			System.out.println("Teenager");
		}else if(number>=18 && number<=60) {
			System.out.println("Adult");
		}else {
			System.out.println("Old");
		}
		
		
	}

}
