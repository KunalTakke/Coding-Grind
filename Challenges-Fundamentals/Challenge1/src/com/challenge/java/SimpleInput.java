package com.challenge.java;

import java.util.Scanner;

public class SimpleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		while(sum>=0){
			int n = sc.nextInt();
			sum+=n;
			if(sum>=0){
				System.out.println(n);
			}
	}

}
}
