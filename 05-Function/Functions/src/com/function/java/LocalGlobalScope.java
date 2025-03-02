package com.function.java;

public class LocalGlobalScope {
	
	public static int val = 20;
	
	
	public static void main(String[] args) {
		
		int one = 10;
		int two = 20;
		int val = 200;
		System.out.println("val :"+val);
		System.out.println("val :"+LocalGlobalScope.val);
		int res = demoScope(one);
		System.out.println(res);
	}
	
	public static int demoScope(int one) {
		
		int sum = one + val;
		
		return sum;
		
	}

}
