package com.emmil.collections;

//import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
//import java.util.List;

public class ListLink {

	public static void main(String[] args) {
		
		Deque<String> colors = new LinkedList<String>();

		colors.add("Yellow");
		colors.addFirst("Blue");
		colors.add("Red");
		colors.add("Green");
		colors.addLast("Purple");
		
		System.out.println(colors);
		System.out.println(colors.size());
	}

}

//LinkedList is better for manipulating data 
//Can be used as list, stack or queue.
