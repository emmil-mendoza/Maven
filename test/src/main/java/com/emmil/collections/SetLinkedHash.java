package com.emmil.collections;

import java.util.LinkedHashSet;
import java.util.Set;

/*LinkedHashSet maintains the insertion order. Elements gets sorted in the same sequence in which 
they have been added to the Set.*/


public class SetLinkedHash {

	public static void main(String[] args) {

		Set<String> countrySet = new LinkedHashSet<String>();
		countrySet.add("Canada");
		countrySet.add("Japan");
		System.out.println(countrySet);

		Set<Integer> numbers = new LinkedHashSet<Integer>();
		numbers.add(101);
		numbers.add(150);
		System.out.println(numbers);

	}

}
