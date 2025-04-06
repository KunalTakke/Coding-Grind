package com.adv.arrays;

public class StringSubstringFunctions {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		System.out.println("########## Index of ##############");
		System.out.println(str.indexOf("llo"));
		System.out.println(str.indexOf("o"));
		
		System.out.println(str.indexOf(9));
		System.out.println("############# Starts With #############");
		
		System.out.println(str.startsWith("he"));
		System.out.println(str.startsWith("He"));
		
		
	}

}
