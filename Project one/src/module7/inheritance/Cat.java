package module7.inheritance;
//to achieve inheritance we use extends keyword then the class we want to extend from

//The class that extends is called subclass(child class)
public class Cat extends Animal{
	
	// When we extend the Animal class we get access to all the fields and method
	// In addition we can define specific features to each child class
	public String catBreed;
	
	public void meow() {
		System.out.println("Meoww...");
	}
	
	
	// Each child class will implicitly call the superclass default constructor from its default constructor
public Cat() {
	   
}

	public Cat(String name) {
 	super(name);
 }
	

}
