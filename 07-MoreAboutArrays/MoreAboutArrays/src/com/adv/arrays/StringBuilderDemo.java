package com.adv.arrays;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		
		StringBuilder str = new StringBuilder("Hello");
		
		System.out.println(str.length());
		System.out.println(str);
		// Using CharAt in StringBuilder
		System.out.println(str.charAt(1));
		
		// Using Insert in StringBuilder
		str.insert(2, "abc");
		System.out.println(str);
		
		// Using Append in StringBuilder
		str.append("xyz");
		System.out.println(str);
		
		// Using Remove in StringBuilder
		str.deleteCharAt(0);
		System.out.println(str);
		
		// Using setCharAt() in StringBuilder
		str.setCharAt(0,'h');
		System.out.println(str);
		
		
		// Conversion from StringBuilder to String
		String s = str.toString();
		System.out.println(s);
	}

}
