package com.packageModels;

public class dog extends animal implements pet{
	
	public dog(String name, String breed, int weight) {	
		super(name, breed, weight);
	}
	

	public String aDog() {
		
		if(getWeight()<30) {
			return "You created a " + getBreed() + ", " + getName() + ", Have them hop into your lap! " + getWeight();
		}else if(getWeight()>=30) {
			return "You created a " + getBreed() + ", " + getName() + ", Have them curl up next to you! " + getWeight();
		}
		return null;	
    }
}
