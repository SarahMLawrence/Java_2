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

/*
 * NOTES:
 * 
 * ACCESS MODIFIERS - specifies which classes can access a give class and its
 * fields, constructors and methods
 * 
 * 1. PRIVATE - if method/class is set to private = only the code inside same
 * class can access the variable or method, nor can code from any external class
 * - cam be accessed with 'getter' and 'setter' methods. - this - refers to
 * current instance of the object being called
 * 
 * * PRIVATE CONSTRUCTOR - cannot be called from anywhere outside of class - can
 * still be called from out constructors, or from static methods in the same
 * class * the use of THIS calls a constructor with the provided input
 * parameters
 * 
 * 2. DEFAULT - is assigned if no other access modifiers is assigned - means the
 * code inside the class, as well as code inside classes in same package, can
 * access the resource which the default access modifier is assigned to
 * 
 * 3. Protected - provides same access as default - subclasses can access
 * protected methods and variables of superclass - even if subclass is not
 * located in same package as superclass
 * 
 * 4. Public - allows all code in the program to access the resource
 * 
 * 
 * * access modifiers that is assigned at class level takes precedence over any
 * access modifiers assigned to the variables - if class with default then no
 * other class outside the same Java package can acces that class, constructors,
 * fields, methods
 * 
 * 
 * 
 * // public String getPassword(String securityToken){ //
 * if(securityToken.equals("stated value"){ // return this.password; // } else {
 * // return "Error Wrong Password"; // }
 */
