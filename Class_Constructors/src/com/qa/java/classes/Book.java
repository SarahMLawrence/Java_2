package com.qa.java.classes;

public class Book {

	public String title;
	public String genre;
	public int numPages;

	// Constructor
	public Book(String title, String genre, int numPages) {
		System.out.println("Your Book class has been created");
		this.title = title;
		this.genre = genre;
		this.numPages = numPages;
	}

	public void hardbackBook() {
		System.out.print(this.title);
	}
}
