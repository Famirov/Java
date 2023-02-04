package module5;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson2 {

//	public static void main(String[] args) {
		
		// String myString = sayHi(); // if uncomment then we will get a compilation error since the method doesn't return string
	
		
//		int sum = addNums(100,33); // 133
//		
//		System.out.println(sum + 100);
//
//	}
	
	/*
	 * So far we have used methods with void return type
	 * However, in many cases we need to return back some value once the method is executed
	 * In this case we can use a return type as int, long, double etc...
	 * Each method that has a return type should have return statement!
	 * In void methods we cannot have return statement with value however it is possible to use just return
	 * */
	
	
//	public static int addNums(int a, int b) {
//		// every method that has a return type should have a return statement
//		// return expression; expression has to evaluate to the same data type as return
//		// int variableCanBeAnyName = a + b;
//		return a+b; 
//	}
	
	
	// This method doesn't really provide value 
	// We cannot reuse the output of the addition
//	public static void addNums(int a, int b) {
//		System.out.println(a + b);
//	}
	
	
	/* Method that prints Hi! */
	// This method is void and it doesn't return anything
//	public static void sayHi() {
//		System.out.println("Hi!");
//	}
//	
	/*
	 * Method should take two inputs:
	 * price and rate
	 * it should return the price with tax calculated
	 * */
	
	/*
	 * If you have a return type as a lager data type
	 * You can return smaller data types
	 * However, you cannot do the oppsite 
	 * */
	
//	public static double calculateTax(double price, double rate) {
//		// double total = price + (price * rate/100.0);
//	
//		
//		return total;
	
//	double result = calculateTax(267.97, 14.8);
//	System.out.println(result);
	
	
	
	

//}




/*
 * Method should take two inputs:
 * price and rate
 * it should return the price with tax calculated
 * */

/*
 * If you have a return type as a lager data type
 * You can return smaller data types
 * However, you cannot do the oppsite 
 * */

//public static double calculateTax(double price, double rate) {
//	double total = price + (price * rate/100.0);
//	total = Math.round(total * 100.0) / 100.0;
//	return total;


		/* 
		 * The return type can be:
		 * - all primitive data types
		 * - non primitive data types(reference types) - String 
		 * - data structures - arrays, 2D arrays etc..
		 * */ 
		
		
		/*
		 * This method should take two strings first name and last name
		 * Then return a generated yoll email
		 * firstName = Omar
		 * lastName = Ramo
		 * return = omar_ramo@yoll.io
		 * */
//		public static String generateEmail(String firstName, String lastName) {
//			String result = firstName + "_" +lastName +"@yoll.io";
//			return result.toLowerCase();
//		}
		
		
		
		/*
		 * Create a method that will take two strings
		 * A text and a word
		 * The method should check if the word appears in the text without considering case sensitivity
		 * return true or false 
		 * 
		 * 
		 * Remember* - The variables that are parameters don't have to be the same as arguments
		 * */
		
		
//		String text= "This is my text!";
//		
//		String word ="Text";
//		
//		System.out.println("The text contains the word: " +containsIgnoreCase(text,word)); // true
//	}
//		
//		
//		public static boolean containsIgnoreCase(String text, String word) {
//			String textModified = text.toLowerCase();// This is my text! -> this is my text!
//			String wordModified = word.toLowerCase(); // Text -> text
//			boolean result = textModified.contains(wordModified);
//			return result;
//		
	
//public static void main(String[] args) {
//			
//			int [] newArray = createArray(11,99,-9);
//			System.out.println(Arrays.toString(newArray));
//			
//		
//		}
//		
//		/*
//		 * Create a method that will take three integers
//		 * And return them as an array
//		 * */
//		public static int[] createArray(int a, int b, int c) {
//			int [] arr = {a,b,c};
//			return arr;
//			
//		}
		
		

//		public static void main(String[] args) {
//			
//			int[] newArray = createArray(11, 99, -9);
//					System.out.println(Arrays.toString(newArray));
//
//					Scanner sc = new Scanner(System.in);
//					System.out.println("Enter first number: ");
//					int a = sc.nextInt();
//					System.out.println("Enter second number: ");
//					int b = sc.nextInt();
//					System.out.println(subtract(a, b));
//
//				}
//
//			//// Option 1 - using one return statement
//				public static int subtract(int num1, int num2) {
//
//					// declare a variable that will hold the result
//					int result;
//
//					if (num1 > num2) { // if num1 if larger assign the subtraction to result
//						result = num1 - num2;
//					} else {
//						result = num2 - num1;
//					}
//					return result; // we return whatever the value was assigne in if statement
//
//				}
//
//				// Option 2 - using multiple return statements
//				public static int subtract(int num1, int num2) {
//
//					// declare a variable that will hold the result
//					// int result;
//
//					if (num1 > num2) { // if num1 if larger assign the subtraction to result
//						return num1 - num2;
//					} else {
//						return num2 - num1;
//					}
//					// return result; // we return whatever the value was assigne in if statement

		
		
/**See previous example
Call method twice with different numbers and then multiply their results.

Call method twice with different numbers
and use the results as arguments to call the method again.*/
		

public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number: ");
	int a = sc.nextInt();
	System.out.println("Enter second number: ");
	int b = sc.nextInt();
	System.out.println(subtract(a, b));
	
}
	
	public static int subtract(int num1, int num2) {
		
		int result1;
		int result2;
	
		// Option 1 - using variables
		int result3 = result1 * result2;
		// Option 2 - using just the method call
		int result4 = subtract(115, 25) * subtract(15, 225);
		
//		Call method twice with different numbers
//		and use the results as arguments to call the method again.
		// Option 1
		System.out.println(subtract(result1, result2));
		// Option 2
		System.out.println(subtract(subtract(100, 10),subtract(10, 100)));
				}
	


}
	
	

