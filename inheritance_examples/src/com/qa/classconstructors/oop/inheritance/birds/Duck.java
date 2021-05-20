package com.qa.classconstructors.oop.inheritance.birds;

import com.qa.classconstructors.oop.inheritanceclass.Bird;

//extends - performing a type of inheritance
public class Duck extends Bird {

	// alt + shift + s

	// is-a relathionship // Duck is a bird (inheritance)
	// has-a relationship // (compositional)

	// Attributes
	protected boolean isSwimming;
	protected boolean canSwim;
	// protected Wing duckwings;

	// Constructors
	public Duck() {
		// super() - the Bird constructor without any parameters
		super();
		this.isSwimming = false;
		this.canSwim = true;

	}

	public Duck(String species, boolean canfly, boolean isflying, int age, String featherColor, int numbEyes) {
		// super() - the Bird constructor without any parameters
		super(species, canfly, isflying, age, featherColor, numbEyes);
		this.isSwimming = false;
		this.canSwim = true;

	}

	public Duck(String species, boolean canfly) {
		// super() - the Bird constructor without any parameters
		super(species, canfly);
		this.isSwimming = false;
		this.canSwim = true;

	}

	// Methods

	// quack, swim

	public void speak() {
		System.out.println("quack");
	}

	// Get / Set

}
