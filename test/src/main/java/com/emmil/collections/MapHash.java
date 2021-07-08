package com.emmil.collections;

import java.util.HashMap;
import java.util.Map;

public class MapHash {

	public static void main(String[] args) {
		Map<String, Integer> namesmap = new HashMap<String, Integer>();
		namesmap.put("Zarah", 8);
		namesmap.put("Emmil", 23);
		System.out.println(namesmap);

	}

}

/*

-A HashMap contains values based on the key.
Keys are unique.

-It may have one null key and multiple null values.

-HashMap doesn’t maintain any order.

*/