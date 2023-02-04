package module5;

public class Student {
	
	// State - Fields 
	// Instance variables
	// All the instance variables will be accessible to other instance methods
	// We can say it is global to this class
	String firstName;
	String lastName;
	String email;
	double gpa;
	// schoolName
	final static String SCHOOL = "Yoll Academy"; //Static Variable
	
	
	String getFullName() {
		// full is a local variable that can be used only in  the scope of this method
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	void increaseGpa() {
		double increase = 0.1;
		gpa += increase;
		
		// System.out.println(fullName); - if uncomment will not work, since it is local to the getFullName()
	}
	
	//	From instance method we can access instance variables, static variables, instance method
	void instanceMethod() {
		System.out.println(firstName); //instance varaiable inside pharanthesis
		System.out.println(SCHOOL); // Static variable
		getFullName(); // instance method
		staticMethod();
	}
	 
	static void staticMethod() { // static method can only call static members
		System.out.println("This is static method");
		
		System.out.println(SCHOOL);
		//System.out.println(gpa); -will not call this method because it's nor static
	}

}
