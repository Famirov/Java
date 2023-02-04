package module4Dima;

import java.util.Arrays;
import java.util.Scanner;

public class lecture2 {

	public static void main(String[] args) {

		/**TASK 10*/
	
// Write a program to print increments of 5 from 0 to 100
		
//		//Option 1
//		System.out.println("Update with 5");
//		for(int i=0; i <= 100; i +=5) {
//			System.out.print(i + " ");
//		}
//		
//		//Option 2
//		System.out.println("\nUse if statement");
//		for(int i=0; i <= 100; i++) {
//			
//			if(i%5 == 0) {
//				System.out.print(i + " ");
//			}
//		}
		
		
		/**Task*/
		
//  Write a program to ask user enter 5 numbers
//Print the total numers entered by user that are greater than 10
//Example: user enters: 3, 5, 15, 21, 6
//Your program should output: 36 (total of 15+21)
		
//		Scanner scan = new Scanner(System.in);
//		int sum =0;
//		
//		for (int i = 1; i<=5; i++) {
//			
//			System.out.println("Enter a number: ");
//			int num = scan.nextInt();
//			
//			if(num > 10) {
//				sum += num;
//			
//			}
//		}
//		 System.out.println("The sum is: " + sum);
		
		
		
		// Task
		
//		Given a String variable sentence, write code to print each word in separate lines in a reverse order. 
//		Example sentence -> "Ain't nobody got time for that"

//		String sentence = "Ain't nobody got time for that";
//		
//		String [] arr = sentence.split(" ");
//		System.out.println(Arrays.toString(arr));
//		
//		
//		for(int i = arr.length-1;  i >= 0 ; i--) {
//			System.out.println(arr[i]);
//		}
		
		
		// Taks
//		You have a string of email addresses
//		String emailAddresses = "omar@gmail.com, michelle@yahoo.com, ahmed@hotmail.com, stacy@gmail.com, carlos@gmail.com";
//		This list can be changed in future, new people might be added or removed
//		Find out how many people have gmail.com address

//		String emailAddresses = "email@gmail.com, omar@gmail.com, michelle@yahoo.com, ahmed@hotmail.com, stacy@gmail.com, carlos@gmail.com";
//        // array
//		String [] emails = emailAddresses.split(", "); //1
//		System.out.println(Arrays.toString(emails)); //2
//		
//		int countOfGmailAccounts = 0; //4
//		
//		for(int i = 0; i < emails.length; i++) { //3
//			
//			if(emails[i].contains("@gmail.com")) { // endsWith() //5
//				countOfGmailAccounts++;
//			}
//			
//			
//		}
//		
//		
//		System.out.println("The number of gmail.com accounts: " + countOfGmailAccounts); //6
		
		
		/**WHILE LOOP*/
		
		
		// Syntax
		
//		int count = 1; //#1- Initialization 
//		
//		while(count <= 3 ) { //#2-Condition
//			
//			System.out.println("Hello World!"); //#4
//			count++; // # 3- Update
//			//body
//		}
		
		
		/**TASK*
		 * Print numbers from 20 till 0
		 * USING WHILE LOOP
		 */
		
//		System.out.println("Use While Loop!");
//		int numbers = 20; //#1 Initialization 
//		
//		while (numbers >= 0) { //#2 Condition
//			
//			System.out.println(numbers); //#3 Print and Update
//			numbers--;
//		}
//		
//		//Using FOR LOOP
//		System.out.println("Use for loop!");
//		for (int i =20; i>=0; i--) {
//			System.out.println(i + " ");
//		}
		
		
	// Let's create a program that will login to Google account
	// Assume that you entered the username correctly 
	// the program has to validate the password if it is correct
	// if not ask again to enter the password
		
	// Precondition
//	String expectedPassword = "Desk45";
//	Scanner scan = new Scanner(System.in);
//	
	// Flow of the program
	// Say hello 
	// Ask for username
//	System.out.println("Hello! Enter your username:");
//	String username = scan.nextLine();
//	
//	//Ask for the password
//	System.out.println("Thank you, " + username);
//	
//	System.out.println("Enter your password: ");
//	String usersPassword = scan.nextLine();
//	
//	// Ask for attemps
//	
//	int attempts = 1;
//	
//	while(!usersPassword.equals(expectedPassword)&& attempts < 3) {
//		System.out.println("Incorrect password! Please try again: ");
//		usersPassword = scan.nextLine();
//		attempts++;
//	}
//	if (attempts < 3) {
//	
//		System.out.println("Welcome Back!");
//	} else {
//		System.out.println("Your account is locked! ");
//	}	
		
//		
//	int i = 20; 
//	
//	while (i >= 0) {
//		
//		System.out.print(i + " ");
//		i--;
//	}
//	System.out.println();
//	
//	
//	int j = 20;
//	while (--j >= 0) {
//		System.out.print(j + " ");
//		
//	}
	
	
//	Scanner scan = new Scanner(System.in);
//	System.out.println("Please enter the number of time you want to repeat the sign: ");
//	int count = scan.nextInt(); // #1
	
//	//For Loop
//	
//	for(int i = 1; i<=count; i++) { //#2
//		
//		System.out.print("@"); // #3
//	}
//	
//	int j = 1;
//	while (j <= count) {
//		System.out.println("@");
//		j++;
//	}
//		
		
//TASK
	
//	int sum = 0; 
//	int i = 0; 
//	
//	while (i <= 100) {
//		sum += i; 
//	    i++;
//	}
//	
//	System.out.println("The sum is " + sum);
//	
//	
//	
//	int sum1 = 0; 
//	
//	for(int j = 1; j <= 100; j++ ) {
//		sum1 += j; 
//	}
//	System.out.println("sum: " + sum1);
	
	
	
	//TASK

	/**
	 * Imagine you have to create a program for a store that will take the item
	 * prices and calculate the total that the customer has to pay.
	 * 
	 * The program will ask the user first if they want to enter an item price, then
	 * if the customer will answer yes we will add to the total.
	 * 
	 * Then the program should ask the user again if they want to enter the price
	 * for another item.
	 * 
	 * If the answer is yes then it will take the input again and add to the total
	 * amount.
	 * 
	 * The program will stop when the user will say "no".
	 * 
	 * After, the program should output the total to pay.
	 */
	
//	Scanner scan = new Scanner(System.in);
//	System.out.println("Would you like to enter an item price?: ");
//	String userAnswer = scan.next();
//	
//	double total = 0.0;
//	
//	while(userAnswer.equalsIgnoreCase("yes")) {
//		
//		System.out.println("Enter the item price: ");
//		double itemPrice = scan.nextDouble();
//		
//		total += itemPrice;
//		
//		System.out.println("Would you like to enter another item price?:");
//		userAnswer = scan.next();
//		
//	}
//	
//	System.out.println("Your total is: $" + (Math.round(total*100.0)/100.0));

	
		
		
/**DO WHILE LOOP*/		
		
// In Do will loop the body will be executed at least once and then check the condition 
//	but in while loop the condition will be checked and then will be executed		
	
	
	//Sytax
		
//	do {
//		// body
//		
//	}while (condition);
	
	
	// Let's write a loop that prints count = number till 5
	
	// While loop 
	
//	int counter = 1;
//	while (counter <= 5) {
//		System.out.println("Counter = " + counter);
//		counter++;
//	}
		
	
	// do while loop
	
//	int count = 1;
//	
//	do {
//		System.out.println("Count = " + count);
//		count++;
//		
//	}while (count <= 5);
	
	
		//TASK
		
		// Let's refactor check out program with do while loop
		
//				Scanner scan = new Scanner(System.in);
//				double total = 0.0;
//				String userAnswer;
//				
//
//				do{
//					
//					System.out.println("Enter a price:");
//					double itemPrice = scan.nextDouble();
//					
//					total += itemPrice;
//					
//					System.out.println("Would you like to enter a price for another item?");
//					userAnswer = scan.next();
//					
//					
//				}while(userAnswer.equalsIgnoreCase("yes"));
//				
//				System.out.println("Your total is: $" + (Math.round(total * 10.0) / 10.0));
	
		
		
		
		
		
		//TASK 13
		
		//Write a program that calculates the sum of numbers entered by the user until user enters 0.
		//After user enters 0, then print the total of numbers entered.
		
		
//		Scanner scan = new Scanner(System.in);
//		int userInput, total = 0;
//		
//		
//		do {
//			System.out.println("Please enter number");
//			userInput = scan.nextInt();
//			total += userInput;
//		}while (userInput !=0);
//		System.out.println("Sum is: " + total);
		
		//Lets write a loop that prints number from 1 till 10 except number 3 and 6
		
//		for (int i =1; i<=10; i++) {
//			if(i == 3 || i == 6) {
//				continue;
//			}
//			System.out.print(i + " ");
//		}
		
		// Difference between int 1 and 0
		 
		
//		char myChar = '1';
//		
//		System.out.println(Character.isDigit(myChar));
//		System.out.println(Character.isLetter(myChar));
//		System.out.println(Character.isUpperCase(myChar));
		
		
//		String sentence = "H2e3l4l4o2 W4o2r4l2d4";
//		
//		for(int i = 0; i < sentence.length(); i++) {
//			
//			if(Character.isDigit(sentence.charAt(i))) {
//				continue;
//			}
//			
//			System.out.print(sentence.charAt(i));
//			
//		}

		
		//Ex with Arrays
		
//		int [] array = {10, 59, -9, 88, -66, 84, 21};
//		
//		for(int i = 0; i < array.length; i++) {
//			if(array[i] < 0 ) {
//				continue;
//			}
//			System.out.print(array[i] + " " );
//		}
		
		
		//** TASK 14
		
		// Write a program that prints even numbers until 10
		// Utilize continue statement
		
		
		//1th option 
		
//		for (int i = 0; i <= 10; i++) {
//			if (i%2 !=0) {
//				continue;
//			}
//			System.out.print(i + " ");
//		}
					
//		//2nd option
//		
//		System.out.println();
//		
//		
//		// Without continue 
//		for(int i = 1; i <= 10; i++) {
//			
//			if(i%2 == 0) {
//				System.out.print(i+" ");
//			}
//			
//			
//		}
		

		
		// Write a loop that stops repeating the code if it finds number 7
		
//		for (int i =0; i<=10; i++) {
//			if (i == 7) {
//				break;
//			}
//			System.out.println(i+ " ");
//		}
		
		
		
		// if the array contains any negative value and stop the loop
		
		
//		int [] array = {10, 59, -9, 88, -66, 84, 21};
//		
//		boolean hasNegative = false;
//		
//		for (int i= 0;  i < array.length; i++ ) {
//			
//			System.out.println("The nuber of iteration: " + (i+1));
//			if(array[i] < 0) {
//				
//				hasNegative = true;
//				break;
//			}
//
//		}
//		System.out.println("The array has negative value: " + hasNegative);
		
		
		
		
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);

//		double total = 0.0;
//		String userAnswer;
//
//		do {
//			System.out.println("Enter the price");
//			double itemPrice = scan.nextDouble();
//
//			total = total + itemPrice;
//			System.out.println("Would you like to enter a price for another item? ");
//			userAnswer = scan.next();
//
//		} while (userAnswer.equalsIgnoreCase("yes"));
//		System.out.println("Your total is $" + Math.round(total * 100.0) / 100.0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
