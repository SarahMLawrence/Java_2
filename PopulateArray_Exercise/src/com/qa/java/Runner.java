
package com.qa.java;

public class Runner {

	public static void main(String[] args) {
		populateArray();
	}

	public static void populateArray() {
		System.out.println("Starting task");

		// empty array of 10 spaces
		// {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
		int[] array = new int[10];

		// for (int handle : array) {
		// System.out.println(handle + "\s");
		// }

		// 1st for loop
		for (int x = 0; x < array.length; x++) {
			array[x] = x + 1;
			System.out.println(array[x] + "\s");
		}

		// new line
		System.out.println(" ");

		// 2nd for loop
		for (int x = 0; x < array.length; x++) {
			array[x] *= 10;
			System.out.println(array[x] + " ");

		}
	}
}
