package Module6;

import module5.Car;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new -instantiation
		// Car()- constructor-initialization of the object
		
		Car myCar = new Car();
		myCar.printInfo();
		
		Car myCar2 = new Car ();
		Car myCar3 = new Car ();
		Car myCar4 = new Car ();
		Car myCar5 = new Car ();
		
		
		System.out.println("Count of Car objects: " + myCar.countCars);

	}

}
