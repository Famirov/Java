package module5;

public class OopHousePractice {

	public static void main(String[] args) {
		
	House myHouse = new House();
	

		
		
	
	// Initialize the instant variables/fields 
	myHouse.numberOfWindows = 15;
	myHouse.numberOfRooms = 7;
	myHouse.numberOfStories = 3;
	myHouse.address = "Baku city, Nasimi Dc";
	myHouse.yearBuilt = 2022;
	myHouse.hasPool = true;
	myHouse.hasPatio = true;
	
	myHouse.printHouseInfo();// Create an object of the house class
	  
	System.out.println(myHouse.address.toUpperCase());
	
	if(myHouse.hasPatio) {
		System.out.println("Keep it!");
	}else {
		System.out.println("Sell it!");
	}
	
	}

}
