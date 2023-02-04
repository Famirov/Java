package module7.encapsulation;

public class Cat {
	
	//Create private fields
	// Create private fields to restrict the rirect access to the state
	private String name;
	private int mood;
	private int hungry;
	private int energy;
	
	// Below is private method class
	private void meow() {
		System.out.println("Meowww...");
	} // we need to control it  and we will add it to void play
	
	
	//1. If we want to set it once we need to use Constructor
	// Constructor that sets the value for the name
	public Cat(String name) {
		this.name=name; 
	}
	//Getters will return the value of each field
	public String getName() {
		return name;
	}
	
	public int getMood() {
		return mood;
	}
	
	public int getHungry() {
		return hungry;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	// Create the method -- setter method concept
	// replace standart way of setters replace it with below methods
	public void sleep() {
		energy++;
		hungry++;
	}
	
	
	public void play() {
		energy--;
		mood++;
		meow();
	}	
	
	public void feed() {
		meow();
		hungry--;
		mood++;
		energy++;
	}

}
