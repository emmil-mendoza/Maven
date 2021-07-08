package com.emmil.binarytree;

import java.util.TreeMap;

public class MapTree {

	public static void main(String[] args) {
		TreeMap<String, Integer> subjectMarks = new TreeMap<String, Integer>();
        subjectMarks.put("Math", 90);
        subjectMarks.put("Science", 80);
        subjectMarks.put("History", 70);
        subjectMarks.put("Art", 100);
        System.out.println(subjectMarks);
	}

}

/*
 
-It creates Map, stored in a tree structure.

-A TreeMap provides an efficient means of storing key/value pair in efficient order.

-It provides key/value pairs in sorted order and allows rapid retrieval

*/
