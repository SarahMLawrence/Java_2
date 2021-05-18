package com.qa.java;

//---------//
// IMPORTS //
//---------//
import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		// int[] primArray = { 1, 2, 3, 4, 5 };
		int[] primArray = new int[6];

		ArrayList<Integer> array = new ArrayList<>();

		array.add(5);
		array.add(6);

		for (int x = 0; x < array.size(); x++) {
			System.out.println(array.get(x));
		}

		// array.clear();
		System.out.println("Size of the ArrayList: " + array.size());

	}
}