package module4Dima;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class lecture3 {

	public static void main(String[] args) {


//		Practice
//		Write password program
//		Set correct password as: "Desk45"
//		User has 3 chances to enter correct password
//		If user enters incorrect password: "Incorrect password. Please, try again. You have 2 chances left"
//		If user doesn't enter in 3 tries, then print: "Sorry. Your account is locked "
//		If user enters correct password, print: "Welcome";
		
		// Prerequisite
		
//		String expectedPassword = "Desk45";
//		//Scan to take the input
//		Scanner scan = new Scanner(System.in);
//		
//		// we know how many time we need to iterate - 3 attempts
//		
//		for(int attempts=3; attempts>=1; attempts--) {
//			
//			
//			// Ask for password
//			System.out.println("Enter the password:");
//			String pass = scan.nextLine();
//			
//			// If the password is correct say Welcome and stop the program
//			// Do not ask again for the password
//			
//			if(pass.equals(expectedPassword)) {
//				
//				System.out.println("Welcome!");
//				break;
//			} else { // In case the password is not correct we need to keep asking for password or lock the account
//				
//				if(attempts > 1 ) { // first we check if there are more than 1 attempts
//					System.out.println("The password you have entered is incorrect!");
//					System.out.println("Attempts Left: " + (attempts-1));
//					
//				}else { // if it is 1 means the account 
//					System.out.println("Your account is locked!");
//					System.out.println("Try again in 15 minutes...");
//				}
//			}
//						
//		}
		
		
		
//		Declare two strings - word and separator 
//		Declare int  count
//		Ask user to enter word, separator and count values
//		Assign entered values to variables and print a big string 
//		That is made of count occurrences of the word, separated by the separator string.
	
		
// Option 1
//				Scanner scan = new Scanner(System.in);
//				
//				String word;
//				String separator;
//				String result = "";
//				int count;
//				
//				System.out.println("Enter the word:");
//				word = scan.next();
//				
//				System.out.println("Enter the separetor:");
//				separator = scan.next();
//				
//				System.out.println("Enter the count: ");
//				count = scan.nextInt();
//				
//				for(int i = 1; i <= count; i++) {
//					
//					result += word + separator;
//					
//				}
//				System.out.println(result);
//				//AppleWWWAppleWWWAppleWWW
//				System.out.println(result.substring(0, result.lastIndexOf(separator)));
				
		
//		// Option 2
//				Scanner scan = new Scanner(System.in);
//				
//				String word;
//				String separator;
//				String result = "";
//				int count;
//				
//				System.out.println("Enter the word:");
//				word = scan.next();
//				
//				System.out.println("Enter the separetor:");
//				separator = scan.next();
//				
//				System.out.println("Enter the count: ");
//				count = scan.nextInt();
//				
//				for(int i = 1; i <= count; i++) {
//					
//					result += word;
//					
//					if(i == count) {
//						break;
//					}
//					
//					result += separator;
//					
//				}
//				
//
//				System.out.println(result);
//				
				
				
/***NESTED LOOPS**/		
				
// Assemble the table
	
		
//		for (int leg = 1; leg <= 4; leg++) {
//			
//			System.out.println("I am assembling leg number: " + leg);
//			
//			for (int screw =1; screw <=4; screw++) {
//				
//				System.out.println(" * I'm tightening the screw number: " + screw);
//			}
//		}
//		
		
		
		// Print the week count and days count
//		for (int week = 1; week <= 4; week++) {
//			System.out.println("Week: " + week);
//			
//			for(int day =1; day <= 7; day++ ) {
//				System.out.println(" -Day:" + day);
//			}
//		}
		
		
		
		// Print Following shape in console using nested loop
		//*****
		//*****
		//*****
		
//		for(int i = 1; i <= 3; i++) { // The loop that is outside- outer loop
//			
//			for(int j =1; j <= 5; j++) { // the loop that is nested - inner loop
//				
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	
		

		
		
//				for (int i=0;i<=3;i++) {
//					System.out.println("outter loopun iterationi "+i);
//					for (int j=0;j<10;j++) {
//						System.out.println(i+j);
//					}
//				}
		
		
		
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5 

		

			
//	for(int i = 1; i <= 5; i++) { // The loop that is outside- outer loop //12345
//		
//		for(int j = 1; j <= i; j++) { // the loop that is nested - inner loop 1 
////			1 2 
////			1 2 3 
////			1 2 3 4 
//			System.out.print(j + " ");
//		}
//		
//		System.out.println();
//				
//	}
		//column    j=  0, 1, 2, 3, 4, 5
//	int [][] matrix = {{1, 2, 3, 4, 5}, 		// i = 0
//					   {6, 7, 8}, 			// i = 1
//					   {9, 10, 11, 12, 13}};// i = 2
//	
//	
//	//outer loop is responsible for rows
//	// we can get the length of how many rows we have by array.length
//							//rows
//	for (int i = 0; i< matrix.length; i++) {
//		
//		
//		// inner loop is responsible for columns
//		// We can identify each row's length by providing the index of the row - array[i].length
//		for(int j = 0; j < matrix[i].length; j++) {
//			
//			System.out.println(matrix[i][j]);
//		}
//		
//	}
//		
		
		
//		String [][] states = {{"CA","OR","WA","ON","NY","SC"},
//							  {"IL","FL","NJ","VA","TX"}, 
//							  {"RI","PA","MA","NC","BC","AZ"}};
//		
//		for (int i = 0; i < states.length; i++) { // how many element do we have in each columns
//			
//			for (int j=0; j < states[i].length; j++) { // how many element do we have in each row
//				
//				System.out.print(states[i][j] + " ");
//			}
//			    System.out.println();
//		}
		
		
		/**Populate a 2D array*/
		
//		// Populate a 2D array
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("How many rows we need?");
//		int rows = scan.nextInt();
//		
//		System.out.println("How many columns we need?");
//		int column = scan.nextInt();
//		
//		int [][] arr = new int[rows][column];
//		
//		System.out.println(Arrays.deepToString(arr));
//		
//		
//		for(int i = 0; i < arr.length; i++) {
//			
//			for (int j = 0; j < arr[i].length; j++) {
//				
//				System.out.println("Enter the value for: row ["+ i +"] column ["+ j +"]:");
//				arr[i][j] = scan.nextInt();
//				
//			}
//			
//			
//		}
//		
//		System.out.println(Arrays.deepToString(arr));
		
		
		
		/**FOR EACH LOOP**/
		
		
		// Syntax of For-Each Loop 
		
//		for(data_type variableName: arrayName){
//			// body
//			
//		}
				
		
//		String[] shoppingCart = {"Milk","Eggs","Apples","Cereal", "Bread"};
		
//		//basic for loop 
//		for(int i = 0; i < shoppingCart.length; i++ ) {
//			System.out.println(shoppingCart[i]);
//		}
		
		
		// for-each/ enhanced loop
//		for(String item : shoppingCart) {
//			System.out.println(item);
//			
//		}
	
	
// Example
		
//		//basic for loop 
//		for(int i = 0; i < shoppingCart.length; i++ ) {
//			System.out.println(shoppingCart[i]);
//		}
	
	
	
		

//		int[] numbers = {10, 34, -22, 891, 1334, 4}; 
//		
//		// use a variable to store the addition
//		int sum = 0;
//		
//		// data type for each element will be int 
//		for(int num : numbers) {
//			sum += num; // every-time get the value that num holds and add on top of sum 
//		}
//		
//		System.out.println("Sum: " + sum);
		
		
		 
		 
		
		// Change the value of Apples to Pears in the array
		
//		String [] shoppingCart = {"Milk", "Eggs", "Apples", "Cereal", "Bread"};
//		
//		// we can do it with for loop since we have direct access to index
//		for(int i = 0; i < shoppingCart.length; i++) {
//			
//			// check if current element equals to Apples and is so reassign it to Pears
//			if(shoppingCart[i].equals("Apples")) {
//				shoppingCart[i] = "Pears";
//			}
//			
//		}
//		System.out.println(Arrays.toString(shoppingCart));
		
		
		
		
		
//		String [] shoppingCart2 = {"Milk", "Eggs", "Apples", "Cereal", "Bread"};
//		
//		// for-each / enhanced loop
//		
//		for(String item : shoppingCart2) {
//			
//			if(item.equals("Apples")) { 
//				// We cannot modify the array's elements since the values of each element is copied in the temporary variable
//				item = "Pear"; // Here we change the value for item and it doesn't really affect the array itself
//			}
//		}
//		System.out.println(Arrays.toString(shoppingCart));
		
		
		
		
		// Print all the car makes in separate row
//		String [] germanMake = {"BMW", "Benz", "Audi"};
//		String [] italianMake = {"Fiat", "Lambo", "Ferrari"};
//		String [] frenchMake = {"Renault", "Citroen", "Peugeot"};
//		String [] japanMake = {"Mazda", "Toyota", "Honda"};
//		
//		String [][] cars = {germanMake,
//				            italianMake,
//				            frenchMake, 
//				            japanMake};
		
		
		// Outer for each loop will be responsible for each row which is also an array
		// The type of each element of 2D array is an array so it will be String []
		// The carMake here will hold the copy of the each array from 2D array
//		for(String[] carMake : cars) {
			// Now since we have each array(row) stored in the carMake we can iterate through it as well
			// Each element will be a string here and we create a temporary variable to store a copy of it
//			for(String car : carMake) {
//				
//				System.out.println(car); // print the value of car which holds each element's value
//				
//			}
//			
//		}
		
		
//		Write password program
//		Set correct password as: "Desk45"
//		User has 3 chances to enter correct password
//		If user enters incorrect password: "Incorrect password. Please, try again. You have 2 chances left"
//		If user doesn't enter in 3 tries, then print: "Sorry. Your account is locked "
//		If user enters correct password, print: "Welcome";
//		
//		
//		Here is the password task logic breakdown:
//			You can use it as a template to write the solution.
//			        1. Declare a variable to store expected password
//					2. Create a Scanner object to be able to take the input later in the code
//					3. Create a loop that will iterate 3 times as we have 3 attempts only
//					4. Inside the loop prompt for the user's password
//					5. Take the input as a string and store it into a variable
//					6. Check if the password entered by user matches the expected one
//					7. If it matches print "Welcome" and exit the loop - if statement
//					8. If it doesn't match: - else statement
//					9. Check if the user has available attempts:  - nested if
//						- If there are more attempts available print:
//							The password you have entered is incorrect!
//							Attempts left: <2> where 2 can change based on how many attempts we have(use for loop counter)
//						- If the user had only one attempt and it's wrong print:
//						    Your account is locked!
		
		
		// 04-09-2022
		
//		// Practice
//		Print all the values of below array in using 
//		nested for loops
//		nested for each loop
//		String apps[][] = { 
//		                        { "Facebook", "Instagram", "Twitter", "Youtube" }, 
//		                        { "Bank of America", "TD Bank", "Chase", "Wells Fargo" }, 
//		                        { "Hotels", "AirBnb", "Expedia" }
//		 }; 

//		String apps[][] = { { "Facebook", "Instagram", "Twitter", "Youtube" }, // i = 0
//				            { "Bank of America", "TD Bank", "Chase", "Wells Fargo" }, // i = 1
//				            { "Hotels", "AirBnb", "Expedia" } }; // i = 2
//
//		// basic for loop 
//		for (int i = 0; i < apps.length; i++) {
//
//			for (int j = 0; j < apps[i].length; j++) {
//				System.out.println(apps[i][j]);
//			}
//
//		}
//		
//		System.out.println("**********************");
//		
//		// enhanced for loop
//		// If you have a 2D array we can use a nested for each loop
//		// Here we need to provide what will be the data type for each element
//		// Since each element in 2D array is a one dimensional array we will provide as a data type
//		// String [] - will be the data type for our outer for loop
//		
//		// Then you just give a temporary name for each of the array
//		
//		// Then you provide the 2D array identifier
//		
//		for(String [] eachAppArr: apps) {
//			
//			// Now, once we have defined what will be each of the rows we can go into each row and iterate through elements
//			// Here now each element will be just a String
//			// Then provide a temp variable that will hold each element
//			
//			// As for array we will use the already defined array in our outer loop
//			
//			for(String eachApp : eachAppArr) {
//				
//				// Now each we have access to each element in the 2D array
//				System.out.println(eachApp);
//				
//			}
//			
//		}
		
		
		
		
		
		// Practice
		
//		Write a program that takes arrays of integers and compares them
//		int[]tempArray= {23, 44, 12, 99, 4};
//		Then prints the smallest one out of them.

//		int[]tempArray= {-23, 44, 12, 99, 4444};
		
		

/**For loop version*/		
		

//		int[]tempArray= {-23, -44, 12, 99, 4444};
//		
//		//The variable that will hold the smallest value
//		int min = tempArray[0];
//		
//		//We need a loop to iterate through array so we can check each value
//		for(int i =0; i<tempArray.length; i++) {
//		
//			// We need to compare the value the we already have in min value with current element's value
//			if(tempArray[i]<min) {
//				min = tempArray[i];
//				
//				
//			}
//			
//		}
//		System.out.println(min);
		
		
		
/** For Each version*/
		
//		int min = tempArray[1];
//		
//		
//		for(int num : tempArray) {
//			
//			if(num < min) {
//				min = num;
//			}
//			
//		}
//
//        // int - each element's data type
//		// num - temporary placeholder for each elemt's value
//		// : - is a syntax rule which will separate the element from the array 
//		// tempArray - the data structure we need to iterate through
//		
//		System.out.println("The minimum number in the array is: " + min);
//		
//		
//		// The variable that will hold the smallest value
////		int minValue = tempArray[0];
////		
////		// We need a loop to iterate through array so we can check each value 
////		for(int i = 0; i < tempArray.length; i++) {
////			
////			// we need to compare the value the we already have in minValue with current elemt's value
////			if(tempArray[i] < minValue) {
////				minValue = tempArray[i]; // reassign the value if the cond becomes true
////			}
////			
////		}
////		
////		System.out.println(minValue);
		
		
		
		
		
		
		
	
		
	}

}
