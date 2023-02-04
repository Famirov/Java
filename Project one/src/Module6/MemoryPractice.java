package Module6;

import java.util.ArrayList;

import module5.Car; //Attention to this

public class MemoryPractice {

	public static void main(String[] args) {
		
//		/* Stack Memory
//		 * Java stores - method calls, local variables, references
//		 *  */
//		
//		// Local variables
//		int x = 10;
//		int y = 20;
//		
//		// Methods call
//		// Stack memory get dealocated automatically once the method is executed
//		printAddition(x, y);
//		
//		// reference type variables are stored in stack as well
//		int [] arr = {1,2,3};
//		
//		
//		
//		// Heap memory stores the objects itself
//		Car myCar = new Car();
//		
//		Car wifesCar = new Car();
//		
//		// Destroy an object by reassigning to another reference type
//		// At this point we lose the connection to myCar object and we chain the myCar ref to fifesCar
//		// Here now both references will use the same object from heap memory
//		myCar = wifesCar;
//		
//		// Destroy by assigning a reference type to null;
//		// Once we assign our references to null, the object unchaines from references and will be destroyed 
//		wifesCar = null;
//		myCar = null;
//		
//		// This method may or may not call GC at this point
//		// Remember we cannot force GC to perform at a specific time
//		System.gc();
		
		
//		Integer.parseInt()
//		Double.parseDouble(null)
		
		
		//Primitive date types
	    /* Each primitive data type has it's alternative as non-primitive data type */ 
		/* These classes are called Wrapper class */
//		int      -> Integer
//		long     -> Long
//		float    -> Float
//		double   -> Double
//		boolean  -> Boolean
//		char     -> Character
		
//		int [] arr;
//		ArrayList<Integer> myList;
		
		/* Boxing - aka AutoBoxing */ 
		
		// Option 1 when we assign a primitive variable
//		int x = 10;
//		
//		/* When we assign a primitive variable or value to a Wrapper class it is called Boxing */
//		Integer intObj = x; // Integer.valueOf(x);
//		
//		System.out.println(intObj); // 10
//		
//		// Option 2 when we assign a primitive value
//		
//		Integer xObj = 100; // Integer.valueOf(100);
//		
//		
//		/* Unboxing is the opposite to boxing */ 
//		
//		// we can create an Wrapper class object with classic way with new keyword
//		// However, this way is deprecated
//		Integer myObj = new Integer(900);
//		
//		// we can also, create an object of wrapper class by using valueOf() method
//		Integer myObj2 = Integer.valueOf(800);
//		
//		// The process of assigning a reference type to a primitive variable is called Unboxing
//		int num = myObj;
//		
//		System.out.println(num); // 900
		
		
		//Practice Task
		
//		Create following Wrapper class objects Integer, Double, Character, Boolean.
//		Assign to them primitive literal values.
//		Create primitive data types variables and assign the Wrapper objects to it.
//		Print all the values.
		
		// Practice---Answer
		/*
		 * Create following Wrapper class objects Integer, Double, Character, Boolean.
		 * Assign to them primitive literal values. 
		 * Create primitive data types variables and assign the Wrapper objects to it. Print all the values.
		 */

		   //  * Create following Wrapper class objects Integer, Double, Character, Boolean.
		   // * Assign to them primitive literal values. 
		   // Boxing -> prim -> non-prim
//		   Integer myInt = 10;
//	       Double myDouble = 20.00;
//	       Character myChar = 'D';
//	       Boolean myBoo = false;
//	      
//	       
//	       // * Create primitive data types variables and assign the Wrapper objects to it.
//	       // unboxing -> no-prim -> prim
//	       boolean myBoo2 = myBoo;
//	       char myChar2 = myChar;
//	       double myDouble2 = myDouble;
//	       int myInt2 = myInt;
//	      
//	       
//	       // Print all the values.
//	       System.out.println(myBoo + " " + myChar + " " + myDouble + " " + myInt);

		
		
		int a =10;
		int b = 15;
		
		System.out.println(a==b);
		
		String str1 ="Hi";
		String str2 = new String("Hi");
		
		

	}
	
	
	
	
	
	
	//created a method
	public static void printAddition(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
		
	}
	

}
