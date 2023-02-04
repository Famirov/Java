package module5;

public class House {
	
/**Create House Class
Create variables of the class: numberOfWindows, numberOfRooms, numberOfStories, address, yearBuilt, hasPool, hasPatio, etc
Create an method that prints all the house object properties.


Create an object of the house class
Assign values to the properties of the object
Call the object method to print the house info.*/	
	
	//State-Fields/Insatance Variables Step 1
	//Create variables of the class: numberOfWindows, numberOfRooms, 
	//numberOfStories, address, yearBuilt, hasPool, hasPatio, etc
	int numberOfWindows;
	int numberOfRooms;
	int numberOfStories;
	String address;
	int yearBuilt;
	boolean hasPool;
	boolean hasPatio;
	
	//Beahvior-Step 2
	void printHouseInfo() { // Create a method that print all the house object properties
		System.out.println("Windows: " + numberOfWindows);
		System.out.println("Rooms: " + numberOfRooms);
		System.out.println("Stories: " + numberOfStories);
		System.out.println("Address: " + address);
		System.out.println("Year Built: " + yearBuilt);
		System.out.println("Pool: " + hasPool);
		System.out.println("Patio: "+ hasPatio);
				
	}

	

}
