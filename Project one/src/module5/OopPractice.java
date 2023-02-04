package module5;

public class OopPractice {

	public static void main(String[] args) {

		// Create an objects
		// We already created many objects of Scanner class, String etc..
		// Scanner scan = new Scanner(System.in);
		// String name = new String("Omar");
		
		//Create a Car object
		//The process of crating and object is called- Instantioantion 
		
		//1. Declare the type-data, class 
		//2. Name the object 
		//3. Use new keyword to instantiate the object in the heap memory 
		//4. Use the constructor to initialize the fields
		
		
		Car myCar = new Car();// an object of my Car-- Car is a data type
	
		// Now let's access the behavior of car object
		// To access any method we need to use object name then "." and method name
		    
		myCar.startEngine();
		
		// Call another method 
		
		myCar.stopEngine();
		
		// Access the fields of the objects
		System.out.println("Make: " + myCar.make);
		System.out.println("Model: " + myCar.model);
		System.out.println("Year: " + myCar.year);
		System.out.println("VIN: " + myCar.VIN);
		
		
		System.out.println("----------------------");
		// Initialize the instant variables/fields 
		myCar.make = "BMW";
		myCar.model = "X5";
		myCar.year = 2022;
		myCar.VIN = "VP12543673217";
		myCar.doors = 4;
		myCar.color = "Red";
		myCar.tankCapacity =15;
		myCar.minNumOfSeat = 5;
		
//		System.out.println("Make: " + myCar.make);
//		System.out.println("Model: " + myCar.model);
//		System.out.println("Year: " + myCar.year);
//		System.out.println("VIN: " + myCar.VIN);
		
		// CREATE A METHOD THAT WILL PRINT THE INFO
		
		myCar.printInfo();
		double finalPrice =myCar.fullTankCost(5.5);// benzinin qiymetin -5.5 ozumuz yaziriq
				
		System.out.println("Fill out the tank price $" + finalPrice );
		
		// We can reate from a class as many objects as we need
		Car omarsCar = new Car();
		
		omarsCar.make = "Lexus";
		omarsCar.model ="RX300";
		omarsCar.year = 2022;
		omarsCar.VIN = "IHK1234567899";
		omarsCar.doors = 5;
		omarsCar.color = "Blue";
		
		// Set the tank capacity
		omarsCar.tankCapacity = 40;
		
		
		omarsCar.printInfo();
		
		 // calculate the price and print
			System.out.println("Fill out the tank price $" + omarsCar.fullTankCost(4.5));
		
		
	
		
		
		
		
		// You can reassign the values for the fields at any time
		omarsCar.color= "Dark Blue";
		System.out.println("-------------------");		
		System.out.println("After color change");
		omarsCar.printInfo();
		
		
		
		// Create a rectangle class
		
		Rectangle rec1 = new Rectangle();
		
		rec1.length = 12;
		rec1.width = 2.5;
		
		rec1.displayArea();
		
		
        
		
	

		
		
		
	}

}
