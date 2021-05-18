package com.qa.java.classes;

public class Person {

	public String name; //
	public float height;
	public int age; //
	public String eyecolor;
	public String ethnicity;
	public String gender; //
	public boolean isBreathing;
	public int walkSpeed = 30; // in feet
	Book newBook = new Book("Howdy Doody", "Scary", 100);

	// Constructor
	public Person(String name, int age, String gender) {
		System.out.println("Your person class has been created!");
		this.name = name;
		this.age = age;
		this.gender = gender;

	}

	public void read() {
		System.out.print(this.name + " is reading the book titled: " + this.newBook);
	}

	public boolean isStillBreathing() {
		return isBreathing;
	}

	public String speak(String msg) {
		return (this.name + " says " + msg);

	}

	public int walk() {
		return walkSpeed;

	}

}
