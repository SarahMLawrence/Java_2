package com.qa.java.classes;

public class PetsNeeds {

	public String catlitter;
	public String food;
	public String toys;
	public boolean outOfFood = true;

	public PetsNeeds(String catlitter, String food, String toys) {
		System.out.println("PetsNeeds class has been created");

		this.catlitter = catlitter;
		this.food = food;
		this.toys = toys;

	}

	public boolean outOfFood() {
		return outOfFood;
	}

}
