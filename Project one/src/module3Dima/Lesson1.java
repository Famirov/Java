package module3Dima;

import java.util.Scanner;

public class Lesson1 {

	public static void main(String[] args) {
	
		
//		boolean isFridegeEmpty = false;
//		/* If Statements*/
//
//		System.out.println("Wake up!");
//		System.out.println("Exercise");
//		System.out.println("Take a shower");
//		
//		System.out.println("Check the fridge");// Decision point
		
		//if you have only one statement that has to controlled by if
		// The {} - scope is optional to include
		
		//if you have multiple statements to control we will need {}
		// if we do not include only the first line of code will be treated as the scope
//		
//		if(isFridegeEmpty) {
//		System.out.println("Go to grocery store");
//		System.out.println("Get some eggs");
//		System.out.println("Get milk");
//		System.out.println("Get some veggies");
//		System.out.println("Drive home");
//		}
//		
//		
//		System.out.println("Make a breakfast");
//		System.out.println("Make a coffee");
//		System.out.println("Enjoy it");
//		System.out.println("Go to work...");
		
		
		/*Base syntax for if statements*/
//		if(condition ) {
//			//body that include one or more lines of code that will be controlled by condition
//		}
		//if - keywords that let's java know there will be a condition and a block of code that has to be ..
		//() - in parentheses we will include out comparison-condition that is a boolean value
		//{} - curly brackets forms the scope of the if body, this body will be executed only the codition becomes
		// Make sure you do not include a semicolon after the scope
		
		/*EXample*/
//		boolean condition = false;
//		if (condition) {
//			System.out.println("The is body hot executed since the cond is true");
//		}
//			System.out.println("We are outside of if statement");
	
		
		/*Example2*/
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your age:");
//		
//		int age = sc.nextInt();
//				
//		if (age >=16) {
//			System.out.println("You can take the driving test");
//		}
//			System.out.println("Thank you for visiting out DMW");
		
		/*Practice*/
		
//		Scanner sc1 = new Scanner(System.in);
//		System.out.println("Please Enter The Number:");
//		
//		int number = sc1.nextInt();
//		
//		if (number >=0) {
//			
//			System.out.println("Congrats: " + number);
//			
//		}
//			System.out.println("Regardsless" + number);
//			
		
		/*Practice 2*/
		
//		Write a program that prompts user to enter their password.
//		If their password is equal to 12345, print "Welcome back"
//		If their password is different then don't print welcome message.
//		At the end, Regardless of the password entered, print out Thank you for visiting our web page.

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please eneter the password: ");
//		
//		int expectedPassword = 12345;
//		int actualPassword = scan.nextInt();
//		
//		// check if the password is correct
//        // print "Welcome back"
//		
//		if(actualPassword == expectedPassword) {
//			System.out.println("Welcome back");
//		}
//		
//		System.out.println("Thank you for visiting our web page");
		
		/**ELSE*---TOPIC*/
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please eneter the password: ");
//		
//		int expectedPassword = 12345;
//		int actualPassword = scan.nextInt();
//		
//		// check if the password is correct
//        // print "Welcome back"
//		
//		if(actualPassword == expectedPassword) {
//			System.out.println("Welcome back");
//		} else {
//			
//			System.out.println("Your password is incorrect, please try again in 15 minutes!");
//			
//		}
//		
//		System.out.println("Thank you for visiting our web page");
			
		
		//Starbuks coffee
		
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Is outside cold? Anwer true or false");
//		boolean isCold = sc.nextBoolean();
//		
//		if (isCold) {
//			System.out.println("Buy a hot coffee");
//		}else {
//			System.out.println("Buy a capuccino");
//		}
//			System.out.println("Thank you!");
			
			
	}

}
