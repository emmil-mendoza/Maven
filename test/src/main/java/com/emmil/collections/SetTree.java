package com.emmil.collections;

import java.util.TreeSet;

//The objects of TreeSet class are stored in ascending order.

public class SetTree {

	public static void main(String[] args) {
		
		TreeSet<String> birdsSet = new TreeSet<String>();
		birdsSet.add("Parrot");
		birdsSet.add("Ostrich");
		birdsSet.add("Penguin");
		birdsSet.add("Chicken");
		System.out.println(birdsSet);
		System.out.println(birdsSet.contains("Parrot"));
		

	}

}
