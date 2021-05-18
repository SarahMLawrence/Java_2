package com.qa.java;

//-----------//
//  IMPORTS  //
//-----------//
import java.util.ArrayList;
import java.util.Collections;

public class Runner {

	public static void main(String[] args) {
		// int[] myArray = new int [7];

		// create a new ArrayList
		ArrayList<Integer> myArray = new ArrayList<>();

		// add() several elements
		myArray.add(1);
		myArray.add(2);
		myArray.add(3);
		myArray.add(4);
		myArray.add(5);

		// print out the entire ArrayList
		System.out.println("Task 1: ");
		System.out.println("My Array contains the following: " + myArray);
		System.out.println("");

		// iterate through the ArrayList and print out each element
		// (with both normal and enhanced for-loops)
		System.out.println("Task 2: ");
		for (int x = 0; x < myArray.size(); x++) {
			System.out.print(" " + myArray.get(x));
		}

		System.out.println("");
		System.out.println("");

		for (int handle : myArray) {
			System.out.println(" " + handle);
		}

		// get()
		System.out.println("\nTask 3: ");
		System.out.println(myArray.get(0));

		// set() - modify ArrayList by passing index of element
		// to the set() method
		System.out.println("\nTask 4: ");
		myArray.set(0, 2);
		myArray.set(1, 8);
		System.out.println(myArray);

		// remove() - remove one element from ArrayList - passing in the index of the
		// element
		// or all of them with the clear() method.
		System.out.println("\nTask 5: ");
		myArray.remove(0);
		myArray.remove(2);
		System.out.println(myArray);

		// sort()
		Collections.sort(myArray);
		for (int i : myArray) {
			System.out.println(i);
		}

	}
}