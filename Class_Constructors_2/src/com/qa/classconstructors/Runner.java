package com.qa.classconstructors;

import com.qa.classconstructors.classes.Book;
//-------------------//
//		IMPORTS		 //
//-------------------//
import com.qa.classconstructors.classes.Person;
import com.qa.classconstructors.classes.Pet;

public class Runner {

	// -----------------------//
	// MAIN METHOD - START //
	// ----------------------//
	public static void main(String[] args) {

		System.out.println("Main Class Start");

		Person a = new Person("Sarah", 30, "Female");
		Person b = new Person("Henry", 7, "Male");

		// Pet petExample = new Pet("Dog", 12);
		// Pet petExample2 = new Pet("Cat", 1, "Domestic Long Hair", "Male");

		Book newBook = new Book("LEGO: Star Wars", "DK", "Sci-fi", 150);

		a.read(newBook);

		// System.out.println(petExample2.gender);

		Pet example = new Pet();
		example.speak(false);
		example.speak(true);

		System.out.println(example.breed);
	}

	// -----------------//
	// END CLASS SCOPE //
	// -----------------//
}
