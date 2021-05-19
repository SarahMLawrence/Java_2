package com.qa.java.classes;

public class Pets {

	public String name;
	public String breed;
	public String color;
	public String age;
	public boolean isFixed;
	public boolean goodWithKids = true;

	public Pets(String name, String breed, String color, String age) {
		System.out.println("Pets class has been created!");

		this.name = name;
		this.breed = breed;
		this.color = color;
		this.age = age;
	}

	public boolean goodWithKids() {
		return goodWithKids;
	}

}
