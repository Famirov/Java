package Module6;

public class Hotelpractice {

	public static void main(String[] args) {

//	Hotel brand = new Hotel(); 	
		
		//Step_5---Create an object called Marriott - with default constructor
		Hotel marriott = new Hotel();
		//Create an object called Hyatt - with all the values as parameters
		Hotel hyatt = new Hotel(212, 5, "Hyatt", true);
		
		
		//Step_7
		marriott.printInfo(); //invoke
		hyatt.printInfo(); //invoke
		
		

	}

}
