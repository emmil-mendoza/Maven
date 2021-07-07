package com.emmil.collections;

import java.util.HashSet;
import java.util.Set;

public class setHash {

	public static void main(String[] args) {
		Set<String> animalsList = new HashSet<String>();
		animalsList.add("Hyena");
		animalsList.add("Whale");
		animalsList.add("Lion");
		animalsList.add("Tiger");
		animalsList.add(null);

		System.out.println(animalsList);
	}

}

/*
 * - Sets do not not allow duplicate elements - If you try to add a duplicate
 * element in HashSet, the old value would be overwritten. - HashSet doesn’t
 * maintain any order, the elements would be returned in any random order.
 */