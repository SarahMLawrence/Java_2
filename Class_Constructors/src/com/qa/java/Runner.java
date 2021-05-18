package com.qa.java;

import com.qa.java.classes.Book;
import com.qa.java.classes.Person;

public class Runner {
	public static void main(String[] args) {

		// START
		System.out.println("APP START ");

		Person Bob = new Person("Bob", 32, "male");
		Person personVar = new Person("Charlotte", 28, "Female");
		Person trainer = new Person("Alan", 37, "Male");

		Book newBook = new Book("Howdy Doody", "Scary", 100);

		System.out.println(Bob.age);
		System.out.println(personVar.gender);
		System.out.println(newBook.title);
		// System.out.println(Bob.speak("Hello!"));

		System.out.println("APP END");
	}

}
