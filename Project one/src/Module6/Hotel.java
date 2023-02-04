package Module6;


/**	Create a class called: Hotel
Create instance variables: numberOfApartments, numberOfStars, name, hasPool;
Create an object called Marriott - with default constructor
Create an object called Hyatt - with all the values as paramaters
Means you have to create parameterized constructor */



//Step_1 ---Create a class called: Hotel
public class Hotel {

	


	//Step_2 ---Create instance variables: numberOfApartments, numberOfStars, name, hasPool;
	
		
		public int numberOfApartments;
		public int numberOfStars;
		public String name;
		public boolean hasPool;
		
		//Step_4
		//Create defult constructor
		public Hotel() {}
		
		// Step -3
		// We can use different parameters names so we avoid naming confusion
		// Better approach will be to use same var names and this keyword
		public Hotel(int iNumberOfAppartments, int iNumberOfStars, String iName, boolean iHasPool) {
			numberOfApartments = iNumberOfAppartments;
			numberOfStars = iNumberOfStars;
			name = iName;
			hasPool = iHasPool;
		
	}
		//Step_6
		public void printInfo() { //This is a method to help us print
			
			System.out.println(name + " "+ numberOfStars +" "+numberOfApartments + " " +hasPool);
		}


/**Create a method with same name as class
It should accept numberOfApartments as parameter
Compare to the constructors*/
		
		
//If we include the retur type, even we use class name it will be treated as method
		public int Hotel(int numberOfApartments) {
			return this.numberOfApartments--;
		}
}