package com.emmil.exercises.misc;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		int sum = 0;
		int average;
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int[] intArray = new int[arraySize];

		if (arraySize <= 99) {
			for (int i = 0; i < arraySize; i++) {

				intArray[i] = sc.nextInt();

			}

			for (int num : intArray) {
				sum = sum + num;

			}
			average = sum / arraySize;
			System.out.println("Average is: " + average);
		}

	}

}
