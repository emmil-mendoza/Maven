package com.emmil.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

		for (int i = 0; i < colors.size(); i++) {  //Iterate Method 1 

			System.out.println(colors.get(i));

		}
		
		Iterator<String> namesitr = colors.iterator(); //Iterate Method 2 
		
		while(namesitr.hasNext()) {
			String name = namesitr.next();
			System.out.println(name);
		}
	}
}

/*
 
 -ArrayList is better for storing and accessing data
 -Allows random access 
 -Nonsynchronized
 
 */
