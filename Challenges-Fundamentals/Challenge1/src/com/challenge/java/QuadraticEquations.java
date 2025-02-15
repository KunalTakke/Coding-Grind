package com.challenge.java;

import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquations {

	public static void main(String args[]) {
		Scanner  sc = new Scanner(System.in);
		int[] n = new int[3];
		for(int i =0;i<n.length;i++){
			n[i]=sc.nextInt();
		}
		int a = n[0];
		int b = n[1];
		int c = n[2];

		int disc = (b*b - (4*a*c));
		
		// Nature of roots
		if( disc > 0 ){
			System.out.println("Real and Distinct");
				int root1 = (int)(-b-Math.sqrt(disc))/(2*a);
				int root2 = (int)(-b+Math.sqrt(disc))/(2*a);
				System.out.print(root1);
				System.out.print(" ");
				System.out.print(root2);
		} 
		else if(disc < 0){
			System.out.println("Imaginary");
			
		}else{
			int root1 = (int)(-b-Math.sqrt(disc))/(2*a);
			int root2 = (int)(-b+Math.sqrt(disc))/(2*a);
			System.out.println("Real and Equal");
			System.out.print(root1);
			System.out.print(" ");
			System.out.print(root2);
		}


	}
}
