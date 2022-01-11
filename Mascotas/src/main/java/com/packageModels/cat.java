package com.packageModels;

public class cat extends animal{
	
	public cat(String name, String breed, int weight) {
		super(name, breed, weight);
	}
	
	public String aCat() {
		return "You created a " + getBreed() + ", " + getName() + " looked at you with some affection. You think" + getWeight();
    }

}
