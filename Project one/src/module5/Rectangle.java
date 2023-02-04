package module5;

public class Rectangle {
	
	// Instance Variables
	double length;
	double width;
	
	//Methods
	double getArea() {
		return length * width;
	}
	
	void displayArea () { // call the getArea method ()
		System.out.println("The area of the rectangle is: " + getArea());
	}
	
	
	

}
