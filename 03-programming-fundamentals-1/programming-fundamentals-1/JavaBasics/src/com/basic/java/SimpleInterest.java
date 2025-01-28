package com.basic.java;

public class SimpleInterest {
	
	public static void main(String args[]) {
		
		int principle = 100;
		int rate = 10;
		int time = 5;
		
		double simpleInterest = (principle*rate*time)/100;
		
		System.out.println("Simple Interest is "+simpleInterest);
	}

}
