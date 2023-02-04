package module3Dima;

import java.util.Scanner;

public class Lesson2 {

	private static Object string;

	public static void main(String[] args) {
		
		// Create a program that will tell if a number is even or odd
		// The number is even or the number is add
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter a number: ");
//		int number = sc.nextInt();
//		
//		if (number%2 ==0) {
//			System.out.println(number + " is even!");
//		}else {
//			System.out.println(number +"is odd!");
//		}
//			
//		System.out.println("Thanks! ");

		/**ELSE IF CONDITION*/
		
		// We will convert grades from higher to lower and give them marks.
		
		//Grade Converter
		
//		Scanner sc = new Scanner (System.in); 				// Step 1.
//		System.out.println("Enter your grade: ");
//		int score = sc.nextInt();
//		
//		if (score <= 100 && score >= 90) {					// Step 2.
//			System.out.println("Your grade is: A");
//			
//		} else if(score < 90 && score >= 80 ) {
//			System.out.println("Your grade is: B");
//			
//		} else if(score <80 && score>=70) {
//			System.out.println("Your grade is: C");
//			
//		}else if (score < 70 && score >=60) {
//			System.out.println("Your grade is: D");
//			
//		}else if(score < 60 && score>=0) {
//			System.out.println("Your grade is: F");
//		
//		} else {											// Step 3.
//			
//			System.out.println("Invalid Score");
//			
//		}
		
		/**TASK 4*/
		
		/**Previous Example*/
		
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
		
		/**New example that looks same as previous example*/
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter the password: ");
//		int actualPassword = sc.nextInt();
//		
//		int expectedPassword1 = 123456;
//		int expectedPassword2 = 333;
//		int expectedPassword3 = 444;
		
//		if(actualPassword == expectedPassword1) {
//			System.out.println("Welcome back!");
//			System.out.println("Your password is correct: " + actualPassword);
//			
//		}else if (actualPassword == expectedPassword2){
//			System.out.println("Welcome back!");
//			System.out.println("Your password is correct:" + actualPassword);
//			
//		}else if (actualPassword == expectedPassword3){
//			System.out.println("Welcome back!");
//			System.out.println("Your password is correct:" + actualPassword);
//			
//		}else {
//			
//			System.out.println("Sorry, you cannot log in!");
//			
//		}
//		
		// we can't have operands as a numbers
		//actualPassword == expectedPassword1 || expectedPassword2 || expectedPassword3 -if uncomment will not work
		
		
		// OPTION 2 for previous example -- we can't use it if want to do it with grades example because it was very specific.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter the password: ");
//		int actualPassword = sc.nextInt();
//		
//		int expectedPassword1 = 123456;
//		int expectedPassword2 = 333;
//		int expectedPassword3 = 444;
//		if(actualPassword  == expectedPassword1 
//				|| actualPassword == expectedPassword2 
//				||actualPassword == expectedPassword3) {
//			
//			System.out.println("Welcome Back! ");
//			
//		} else {
//			System.out.println("Invalid password! ");
//			
//		}
			
			
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("How many masks do you want to purchase? : ");
//		int masks = sc.nextInt();
//		
//	
//	if (masks <100 && masks >= 0) {						// Step 2.
//		System.out.println("Your total is: $" + masks*2.50);
//		
//	}else if (masks <= 500 && masks >= 100) {					
//		System.out.println("Your total is: $" + masks*2.25);
//		
//	} else if(masks <= 1000 && masks > 500 ) {
//		System.out.println("Your total is: $" + masks*2.00);
//		
//	} else {											// Step 3.
//		
//		System.out.println("Sorry, we don't have that many in stock");
//		
//	}		
//		

		// == -compares the values of two operands as primitive data types
		
		//There are two ways of creating a String
		
		//Using literals
	//	String str = "book";
		
		// Using new keyword
	//	String str2 =new String ("book");
		
	//	System.out.println(str == str2);// false, because they are in different places that's why
		
	//	System.out.println("The address is same: " + (str == str2));
		// for strings to compare two values we use str.equals (anotherString)
		
	//	System.out.println("The values are the same: " + str.equals(str2));//true-- the values are the same
		
		
		/**Task 6*/
		
		/* Concert task */
		
//		Scanner sc = new Scanner(System.in);							//Step.1
//		System.out.println("What is your age? ");
//		int age = sc.nextInt();
//		
//		System.out.println("Do you have a ticket? Answer yes or no "); // Step.2
//		String answer = sc.next();
//		
						
//		if ((age >= 18 && answer.equals("yes")) || age>=60) {						// Step.3 additional condition 60age
//			System.out.println("Come on in!");
//			
//		}else {
//			System.out.println("Sorry, you cannot enter!");
//		}
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("What is your age? ");
//		
//		int age = 20;
//		
//		if (age >= 16) {
//			System.out.println("You can drive");
//		}else {
//			System.out.println("You are not allowed to drive");
//		}
//		
//		boolean mood = false
//				System.out.println(mood); *********DAVAMINI YAZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ
		
		
		/**NESTED IF STATEMENTS*/
		
		/*Google log in*/
//		
//		String expectedUsername = "omarRamo";    			//Requirements
//		int expectedPassword = 123456;
//		int expectedSecretCode = 777;
//		
//		Scanner sc = new Scanner(System.in);				//STEP 1.a
//		System.out.println("Enter your username: ");
//		String username = sc.next();
//		
//		
//		System.out.println("Enter your password: ");		//STEP 1.b
//		int password =sc.nextInt();
//		
//		if(username.equals(expectedUsername) && password == expectedPassword) { //STEP 2.
//			
//			
//			// Ask user to enter secret code only when they enter valid credentials
//			System.out.println("We sent you a secret code, please enter it: ");
//			int secretCode = sc.nextInt();
//			
//			if (secretCode == expectedSecretCode) {
//				System.out.println("You have successfully logged in");
//			}else {
//				System.out.println("Invalid secret code! ");
//			}
//			
//		}else {
//			System.out.println("Invalid credentials");
//		}
		
		
		
		

		//Answer 1:  		
			
//		String goldMember = "gold";
//		String silverMember ="silver";
//
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter total price? : ");											//Step1.
//		double price = sc.nextDouble();
//		
//		double goldDiscount = price - (price*10/100);
//		double silverDiscount = price - (price*5/100);
//		
//		System.out.println("Do you have a Membership? Answer yes or no "); 							// Step2.
//		String answer = sc.next();
//		
//		if (answer.equals("yes")) {
//			System.out.println("What kind of membership do you have ? Gold or Silver ?");			// Step3.
//			
//			String membership = sc.next();
//			
//			if (membership.equals(goldMember)) 
//			System.out.println("You will get 10% discount. " + "Your total will be: $"+ goldDiscount);
//			
//			if (membership.equals (silverMember)) 
//			System.out.println("You will get 5% discount. " + "Your total will be: $" + silverDiscount);
//			
//		} else if (answer.equals("no")) {
//				System.out.println("Sorry, you are not member and your total price will be: $" + price);
//			
//		
		
//		}
//	

		//Answer 2: 
		
//		Scanner sc = new Scanner (System.in);					//STEP 1.
//		System.out.println("Please enter your total price? ");
//		double usersTotal = sc.nextDouble();
//		
//		System.out.println("Do you have a membership? "); 		//STEP 2.
//		String userAnswer = sc.next();
//		
//		int goldDiscount = 10;									//STEP 3.
//		int silverDiscount = 5;
//		
//		
//		
//		if(userAnswer.equals("yes")) {							//STEP 4.
//			
//			System.out.println("What type of membership you have?");
//			System.out.println("Enter Gold or Silver: ");
//			String typeOfMembership = sc.next();
//			
//			if (typeOfMembership.equals("Gold")) {					//STEP 5.
//				
//			usersTotal = usersTotal -(usersTotal*goldDiscount)/100;
//			System.out.println("Your total is $ " + usersTotal);
//				
//			
//			} else if (typeOfMembership.equals("Silver")) {				//STEP 6.
//				
//			usersTotal = usersTotal -(usersTotal*silverDiscount)/100;
//			System.out.println("Your total is $ " + usersTotal);
//			
//			} 
//			
//		}else {																// STEP 7.
//				
//				System.out.println("Sorry, we do not have this type of membership.");
//				System.out.println("Your total is $" + usersTotal);
		
		
		/**  SWITCH CASE STATEMENT */
		
		
		/**syntax of switch case statement-----DAVAMINI YAZ PDFDEN
		 * 
		 * 1.switch(value){
		 * case value1 //some code
		 * case value2*/
			
		
				
			
			
		}
		
		
		
		
		

	}

}
