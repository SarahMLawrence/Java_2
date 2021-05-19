package com.qa.java;

//import com.qa.java.classes.Book;
//import com.qa.java.classes.Person;
import com.qa.java.classes.Pets;
import com.qa.java.classes.PetsNeeds;

public class Runner {
	public static void main(String[] args) {

		// START
		System.out.println("APP START ");

		// Pets class
		Pets pet = new Pets("Ralphy", "Domestic Long Hair", "Tuxedo", "kitten");

		System.out.println("My pets name is: " + pet.name + ". He is a " + pet.breed + "\n" + pet.age);
		System.out.println(pet.name + " is good with Kids? " + pet.goodWithKids());

		// PetsNeeds class
		PetsNeeds groceryList = new PetsNeeds("Clumping Litter", "Meow Mix", "Scratch pads");

		System.out.println(groceryList.catlitter);

		System.out.println(pet.name + " needs more " + groceryList.food);

		System.out.println(pet.name + " is out of food? " + groceryList.outOfFood());
		System.out.println("APP END");
	}

}
