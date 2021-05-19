package com.qa.classconstructors.classes;

public class Book {

	// *************//
	// ATTRIBUTES //
	// *************//
	public String title;
	public String author;
	public String genre;
	public int numPage;
	public boolean isRead;

	// **************//
	// CONSTRUCTOR //
	// **************//
	public Book(String title, String author, String genre, int numPage) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.numPage = numPage;

	}

	// ***********//
	// METHODS //
	// ***********//
	public void read() {
		this.isRead = true;
	}

	public void notRead() {
		this.isRead = false;
	}

}
