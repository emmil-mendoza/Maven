package com.emmil.collections;

import java.util.ArrayList;
//import java.util.Deque;
//import java.util.LinkedList;
import java.util.List;
//import java.util.String;

public class ListArray {

	public static void main(String[] args) {
		List<String> colors = new ArrayList<String>();

		colors.add("Yellow");
		colors.add("Blue");
		colors.add("Red");
		colors.add("Green");
		colors.add("Orange");
		// colors.remove("Blue");
		// colors.clear();
		System.out.println(colors.isEmpty());

		// System.out.println(colors);

		for (int i = 0; i < colors.size(); i++) {

			System.out.println(colors.get(i));

		}
		// System.out.println(colors.hashCode());
	}
}

//ArrayList is better for storing and accessing data 
//Allows random access 
