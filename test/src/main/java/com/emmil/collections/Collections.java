package com.emmil.collections;

import java.util.ArrayList;
//import java.util.Deque;
//import java.util.LinkedList;
import java.util.List;
//import java.util.String;

public class Collections {

	public static void main(String[] args) {
		List<String> colors = new ArrayList<String>();

		colors.add("Yellow");
		colors.add("Blue");
		colors.add("Red");
		colors.add("Green");
		// colors.remove("Blue");
		// colors.clear();
		// System.out.println(colors.isEmpty());

		// System.out.println(colors);

		for (int i = 0; i < colors.size(); i++)

			System.out.println(colors.get(i));
		//System.out.println(colors.hashCode());
	}

}
