package com.adv.arrays;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		System.out.println(list.size());
		System.out.println(list);
		
		list.add(20);
		System.out.println(list.size());
		System.out.println(list);
		
		list.add(30);
		System.out.println(list.size());
		System.out.println(list);
		
		list.add(40);
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("######################");
		
		// getting list values through the index
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		
		System.out.println("#######################");
		System.out.println("Removing elements from the list");
		System.out.println(list.remove(1));
		System.out.println(list);
		System.out.println(list.size());

	}

}
