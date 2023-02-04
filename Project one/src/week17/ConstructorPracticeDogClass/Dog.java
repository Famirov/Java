package week17.ConstructorPracticeDogClass;
/**
Complete the Dog.java class:

Include the following class variables:

name +

breed + 

weight +

All class variables should be declared lowercase

Write two constructors:

The main constructor (name defaults to "West", Breed defaults to "Mutt", weight defaults to 6.8)

A secondary constructor that takes in only Name and Weight 

Test your code with the Main.java class:

Create a Dog object using both Constructors and print their fields/states to make sure it's correct.
 
 */



public class Dog {
	
	String name;

	String breed;

	double weight;
	
	
	public Dog() {
		
		this.name = "West";
		this.breed = "Mutt";
		this.weight = 6.8;
		
		
	}
	
	
	public Dog (String name,double weight ) {
		
		this.name = name;
		this.weight = weight;
	}
	
	
	

}
