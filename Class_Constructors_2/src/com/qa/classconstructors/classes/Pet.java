package com.qa.classconstructors.classes;

public class Pet {

	// ***********//
	// ATTRIBUTES //
	// ***********//
	public String petType;
	public String breed;
	public String gender;
	public int age;
	public boolean isFixed;

	// ************//
	// CONSTRUCTOR //
	// ************//

	// Default Constructor
	public Pet() {
		// default = takes in 0 parameters
		this.petType = "???";
		this.age = 1;
		this.gender = "Female";
	}

	public Pet(String petType, int age) {
		this.petType = petType;
		this.age = age;
	}

	// Method overloading - constructor overloading
	public Pet(String petType, int age, String breed, String gender) {
		this.petType = petType;
		this.age = age;
		this.breed = breed;
		this.gender = gender;
	}

	// ********//
	// METHODS //
	// ********//

	// public String getPassword(String securityToken){
	// if(securityToken.equals("stated value"){
	// return this.password;
	// } else {
	// return "Error Wrong Password";
	// }

	public void speak() {
		System.out.println("Meow");
	}

	// method overloading
	public void speak(boolean isAngry) {
		if (isAngry) {
			System.out.println("Hiss");

		} else {
			System.out.println("Meow");
		}
	}
}
