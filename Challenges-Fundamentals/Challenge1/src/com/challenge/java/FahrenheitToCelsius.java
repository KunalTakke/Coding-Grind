package com.challenge.java;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int stop = sc.nextInt();
		int step = sc.nextInt();
		
		for(int i = start;i<=stop; i+=step) {
			
			int celcius = (int)((5.0/9)*(i-32));
			System.out.println(i+"\t"+celcius);
			
			
		}
	}

}
