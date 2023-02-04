package module5;

import java.util.Arrays;
import java.util.Scanner;

public class lecture1 {
	
//	static void printName() {
//		String name ="John";
//		System.out.println(name);
//	}
	
//	static void printResult() {
//		int number1 = 30;
//		int result = number1*5;
//		System.out.println(result);
//		
//			}
	
//	static void running() {
//		System.out.println("I'm running");
//	}
//	
//	static void jogging() {
//		System.out.println("I'm jogging");
//		running();
//	}
//	
//	static void jumping() {
//		System.out.println("I'm jumping");
//	}

//	public static void main(String[] args) {
		
//		printResult();
		
//		printName();
//		
//		jogging();
//		jumping();
//		

/**Create a method "printResult()"That will multiply 5*40 and print the result
* Call this method from the main method - invoke
* In main method create a variable number1=30;
* Print it in the main method
* Try to print number1 inside the printResult() method
* Notice the effect of the scope*/
		
//		static void printResult() {
//			int a = 5;
//			int b = 40;
//			int result = a * b;
//			System.out.println(result);
//		}
//		
//		public static void main(String[] args) {
//		
//		printResult();
//		
//		int number1 = 30;
//		System.out.println(number1);
		
		
		
//		static void printResult(int a, int b) {
//			
//			int result = a * b;
//			System.out.println(result);
//		}
//		
//		
//		public static void main(String[] args) {
//		
//			printResult(10, 10);
			
//			******************************************
		
//		// Method header - it includes modifiers return_type method_name(parameters list)
//		// Method signature - it includes the method identifier(name) and the parameters list
//		
//			//Method header
////		|------------------------------------------------------|	
//		
//		
//							// Method signature	
////					|-----------------------------------------|
//			// Declare a method that will take a coffee type and print that the coffee is preparing
//			static void makeCoffee (String coffeeType, String temp) {
//				
//				
//				System.out.println("Your " + coffeeType + " is preparing...");
//				
//				if(temp.equalsIgnoreCase("Hot")) {
//					System.out.println("The coffee will be hot so be careful!");
//				}else {
//					System.out.println("We add caramel to cold drinks...");
//				}
//			}
//			
//			
//			public static void main(String[] args) {
//				
//			// The values that we pass in the method call(invocation) are called arguments
//				Scanner scan =new Scanner(System.in);
//			
//				System.out.println("What type of coffee you want? ");
//				String coffeeType = scan.nextLine();
//				
//				System.out.println("Hot or cold?");
//				String t = scan.next();
//				
//				makeCoffee(coffeeType, t);
//		// Pay attention that arguments are just variables or hard coded values 
//		// parameters have to be declared with data type in front of it		
		
		
//		***************************************

		
/**Create a method called customCounter that gets an array of ints (int[]), 
 * it outputs how many negative , positive and zero numbers are in the array.


customCounter (new int[]{6,3,-1,4,9,-4,0});		→ notice different way of passing array
will output:
positives:3, negatives:2, zeros:1*/		
		
//		static void customCounter(int [] arr) {
//			
//			int positive = 0, negative = 0, zero=0;
//			
//			int [] arr = {6,3,-1,4,9,-4,0};
//			
//			for(int i = 0; i<arr.length; i++) {
//				
//				if(arr[i]>0) {
//					positive++;
//				} else if (arr[i] < 0) {
//					negative++;
//				}else {
//					zero++;
//				}
//				
//			}
//			
//			System.out.println("positives: " + positive +  "negatives: " + negative + "zeros: " + zero);
//			
//			
//		}
//		
//			public static void main(String[] args) {
//				
//				customCounter(new int [] {6,3,3,3,-1,4,9,-4,0});
		
		
//		Create an array with cities:
//			"New York", "London", "Baku", "Istanbul", "Baku", "Los Angeles", "London", "Baku"
//			Create a method that gets an array of strings and a string
//			It counts how many times a string appears in the array and prints the count.
//			E.g: String [] cities;
//			cityFinder(cities, "Baku");
		
//	String[] cities = {"New York", "London", "London", "Baku", "Los Angeles", "London", "Baku"};
//	String cityName = "New York";
//	cityFounder(cities, cityName);
//}
//
//public static void cityFounder(String[] arrCity, String nameCity) {
//	int count= 0;
//	for (int i = 0; i < arrCity.length; i++) {
//		if (nameCity.equals(arrCity[i])) {
//			count++;
//		}
//	}
//	System.out.println(count);
//}
//}
				
	/*
	 * Create an array with cities: "New York", "London", "Baku", "Istanbul", "Baku","Los Angeles", "London", "Baku" 
	 * Create a method that gets an array of strings and a string 
	 * It counts how many times a string appears in the array
	 * and prints the count. E.g: String [] cities; cityFinder(cities, "Baku");
	 */


	public static void main(String[] args) {
			

		String [] arr = {"New York","Baku","Baku", "London", "Baku", "Istanbul", "Baku","Los Angeles", "London", "Baku"};
		
		String city = "Baku";
		
		cityFinder(arr, city);
		
	
		
	}
	
	
	public static void cityFinder(String [] arr, String city) {
        
		int countCities = 0;
		
		for(String cityName : arr) {
			
			if(cityName.equalsIgnoreCase(city)) {
				countCities++;
			}
			
		}
		
		System.out.println("The city " + city + " appers " +countCities +" times.");
	}
	

}