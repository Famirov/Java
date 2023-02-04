package module7.inheritance;


	/* 
	 *  The class that stores common logic/features is called superclass(parent class)
	 *  
	 *  */ 
	public class Animal {
		
		/*
		 * From a subclass we can directly access public, protected, default fields
		 * Private field is not visible and we need an accessor to access it
		 * For private filed the memory is allocated anyways
		 * Static fields can be accessed by Superclass or Subclass directly
		 * Static fields are not inherited but they point to that shared variable
		 * */
		
		
		/*
		 * We cannot inherit constructors
		 * However, each subclass will call the super constructor
		 * To call super constructor we use super()
		 * By default each child class from default constructor calls the super default constructor 
		 * 
		 * */
		
		public Animal() {
		  System.out.println("New animal got created!");	
		}
		
		public Animal(String name) {
			  this.name = name;
			  System.out.println("New animal got created!");	
		}
		
		

		// State
		// Common to all of the animals
		public String name;
		protected String color; // protected field will be accessible outside of the package for child classes
		String gender;
		private int age;
		
		// static modifier
		public static int countAnimals;
		
		
		// Common functions for all the animals
		public void breathe() {
			System.out.println("Animal is breathing...");
		}
		
		public void eat() {
			System.out.println("Animal is eating...");
		}
		
		public void sleep() {
			System.out.println("Animal is sleeping...");
		}

		// Create getters and setters for the private fields - (encapsulation)
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
	
	

}
