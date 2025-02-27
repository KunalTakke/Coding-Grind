package com.function.java;
import java.util.Scanner;


public class FunctionParams {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		addition(a,b);
		int res = additionReturn(a,b);
		System.out.println(res);

	}
	
	public static void addition(int a, int b) {
		System.out.println("Addition is "+(a+b));
	}
	
	public static int additionReturn(int a, int b) {
		return (a+b);
	}
}
