package com.qa.classconstructors.classes;

public class Person {

	// ***********//
	// ATTRIBUTES //
	// ***********//
	private String name = "Sarah";
	public int age;
	public String gender;
	public boolean isBreathing;
	public int walkSpeed = 30;

	// ************//
	// CONSTRUCTOR //
	// ************//
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	// ********//
	// METHODS //
	// ********//

	// GET NAME
	public String getName() {
		return name;
	}

	public void read(Book item) {
		item.read();
		System.out.println(this.name + " is reading the book titled: " + item.title);
	}

	public boolean isStillBreathing() {
		return isBreathing;
	}

	public String speak(String msg) {
		return this.name + " says: " + msg;
	}

	public int walk() {
		return walkSpeed;
	}
}