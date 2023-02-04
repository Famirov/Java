package module3Dima;

//import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

	public static void main(String[] args) {
		/**  SWITCH CASE STATEMENT */
		
		
		/**syntax of switch case statement-----DAVAMINI YAZ PDFDEN
		 * 
		 * 1.switch(value){
		 * case value1 //some code
		 * case value2*/
			
		
//		int myNumber = 1;			//Daha basic varianti
//		
//		if (myNumber == 1) {
//			System.out.println("Value was 1");
//			
//		}else if (myNumber == 2) {
//			System.out.println("Value was 2");
//			
//		
//		}else if (myNumber == 3) {
//			System.out.println("Value was 3");
//		}
			
		
		
		//break statement => after each case we need to have break to stop running it.
		//default statement => if the condition has not been satisfied
		
//		int mySwitchValue = 5;
//		
//		switch (mySwitchValue) {
//		
//		case 1:
//			System.out.println("Value was 1");
//		break;
//		
//		
//		case 2:
//			System.out.println("Value was 2");
//		break;
//		
//		
//		case 3:
//			System.out.println("Value was 3");
//		break;
//		
//		default:
//			System.out.println("Default statement got executed because none of the cases matched: ");
//		}
		
		/*NOTES SWITCH CASE STATEMENTS*/
		// You can have multiple cases in one switch block
		// You cannot have duplicated values for the case
		// The values in cases have to match the data type of the expression
		// The values of cases have to be constants, you cannot use variables
		// Each case block has to contain break statement in order to avoid executing multiple statements
		// The default statement if optional, it will be executed if none of the cases didn't match the expression
		// In Java for switch statement we can use these data types: byte, short, int, char, Strings - Enums
		
		/**EXAMPLE */
		
//		Scanner sc = new Scanner(System.in);
//		
//		//Welcome message
//		
//		System.out.println("Welcome to the Best Coffee Shop");
//		System.out.println("Here is our menu: ");
//		System.out.println("----------------------");
//		System.out.println("1. Americano");
//		System.out.println("2. Espresso");
//		System.out.println("3. Cappuccino");
//		System.out.println("4. Latte");
//		System.out.println("5. Tea");		
//		System.out.println("----------------------");
//		
//		System.out.println("Please enter the number of the item you want to get: ");
//		int userOrder = sc.nextInt();
//		
//		switch(userOrder) {
//		
//		case 1:
//		System.out.println("Your Americano will be ready soon...");
//		break;
//
//		
//		case 2:
//		System.out.println("Your Espresso will be ready soon...");
//		break;
//		
//		
//		case 3: // Option with nested if statement
//		
//		System.out.println("What type of milk would you like? ");
//		String typeOfMilkString = sc.next();
//		
//		if(typeOfMilkString.equals("whole")) {
//		System.out.println("Your Cappuccino will be ready soon...");
//		}else {
//			System.out.println("Sorry, we do not have that type of milk currently...");
//		}
//		break;
//		
//		
//		case 4:
//		System.out.println("Your Late will be ready soon...");
//		break;
//		
//		
//		case 5:
//		System.out.println("Your Tea will be ready soon...");
//		break;
//		
//		default:
//			System.out.println("Sorry we do not have such number in our menu!");
//
//
//		}
		
		
//	/*TASK 8*/
//		
		System.out.println("Please enter a number for the corresponding month");
		int monthName = 5;
		
		switch (monthName) {
		
		case 1:
			System.out.println("January");
		break;
		
		case 2:
			System.out.println("February");
		break;
		
		case 3:
			System.out.println("March");
		break;
		
		case 4:
			System.out.println("April");
		break;
		
		case 5:
			System.out.println("May");
		break;
		
		case 6:
			System.out.println("June");
		break;
		
		case 7:
			System.out.println("July");
		break;
		
		case 8:
			System.out.println("August");
		break;
		
		case 9:
			System.out.println("September");
		break;
		
		case 10:
			System.out.println("October");
		break;
		
		case 11:
			System.out.println("November");
		break;
		
		case 12:
			System.out.println("December");
		break;
		
		default:
			System.out.println("Invalid Month ");
			
		}
		System.out.println("Thank you for using month converter!");
		
		
		//If vs Switch
		//- 95% of the time you will use if statements
		//- we us switch when we have to compare a value against a list of the values
	
		
		/**SCOPES*/
		
//		int methodLevelVariable = 700; //bu method variabledir > inside (lower level scopes) of scope-dan boyukdur.
//		
//		if( 10 > 5) {
//			System.out.println(methodLevelVariable); // inside of the scope {}
//		}
//		
		
	/**	Write a program with two int variables, int x and int y, and give each one a value.
		Depending on their values, print "x is bigger than y", "x is smaller than y", or "x and y are the same". 
		Change the values and run the program a few times to check it works.*/
		
//		Scanner sc = new Scanner (System.in);
//		
//		
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		
//		if (x > y) {
//			System.out.println("x is bigger than y " + (x-y));
//			
//		}else if(x < y) {
//			System.out.println("x is smaller than y " + (y-x));
//			
//		}else {
//			System.out.println("x and y are the same ");
//			
//		}
		
		
		/*Exercise*/
		
// Create a game where the program picks a random number from 1 to 5 and you, the player, has to guess it. If the player guesses right, print "Correct! Aren't you lucky.". 
// If the player guesses wrong, print "Hard luck! Maybe next time."
// You can use the line of code below which produces a random number from 1 to 5 and stores it in a variable called randomNumber. */

		
//		// Get input user
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter a number in the range of 1 till 5");
//		int usersAnswer = sc.nextInt();
//		
//		// Random class gives us ability to generate different random numbers
//		Random random = new Random();
//		
//		//Use the object from random class to access methods from it
//		int randomNumber = random.nextInt(1,6);
//		
//		if(usersAnswer == randomNumber) {
//			System.out.println("Correct! Aren't you lucky.");
//			
//		}else {
//			System.out.println("Hard Luck! Maybe next time.");
//			System.out.println("The winning number was: " + randomNumber);
//			System.out.println("Your number was: " + usersAnswer);
//			
//		}
		
		
		// Creating strings using literals
//		String str = "book";
//		String str2 = "book";
		
//		String str3 = "Book";
		
		// Creating strings using new keyword
//		String str4 = new String("book");
//		String str5 = new String("book");
//		
//		System.out.println(str == str2); // true  - point to the same object
//		System.out.println(str.equals(str2));// true - the values are the same
//		System.out.println(str.equals(str3));// false - equals() is case sensitive
//		System.out.println(str4 == str5);// false - they are two different objects since we used new keyword
//		System.out.println(str4.equals(str5)); // true - they have same value
		
		
		/*str.length()*/
		//Will return the count of characters in given string
		//returns an integer
		
//		String name = "Omar";
//		System.out.println(name.length());
//		
//		String fullName = "Omar Ramo";
//		int length0fStr =fullName.length();
//		System.out.println(length0fStr);
		
		// Practice // 1. Define two strings and assign some value to it 
		// 2. Identify the length of both strings 
		// 3. Print in the console the total length of those characters
		
//		
//		String str = "Hello dude!";
//		String str2 = "I love JAVA!";
		
//		System.out.println(str.length());  //--1ci yolu
//		System.out.println(str2.length());
////		
//		System.out.println(str.length()+str2.length());
		
//		String str = "Hello dude!";
//		String str2 = "I love JAVA!";
		
			
//		int length1 = str.length();  //--- 2ci yolu
//		int length2 = str2.length();
//		System.out.println(length1 +length2);
		
		
		
		// str.charAt(int index);
		// will return back the character at the specified index
		
//		String myString = "Some Value";
//				//index	=  0123456789	
//		
//		
//		System.out.println("Character at index 0 is: " + myString.charAt(0));
//		System.out.println("Character at index 5 is: " + myString.charAt(5));
//
//		int len = myString.length();
//		System.out.println("The last character in given string is: " + myString.charAt(len-1));// axrinci charcter-i gosterir
//		
		// If we provide an index to charAt which is out of bounds
		//
		
		
		// str.equals(String str2)
		// Will check if both strings are equal based on value
		// Will return true or false
		
//		String name1 = "Jackie";
//		String name2 = "Jackie";
//		
//		System.out.println(name1.equals(name2));
//		
//		boolean result = name1.equals(name2);
//		System.out.println(result);
//		
//		// str.equalsIgnoreCase(String str)
//		
//		String newName = "Omar";
//		String newName2 = "OmaR";
//		
//		System.out.println(newName.equalsIgnoreCase(newName2));
//		
//		
//		// Yes yes YES
//		
//		String userAnswer = "YEs";
//		
//		System.out.println(userAnswer.equalsIgnoreCase("yes"));
		
		
		/*Exercises*///BUNA TEZDEN BAX
		
		//Write a program that will print out the longer word.
		//Declare 2 variables
		//Get input from user for those variables
		//Compare and print the one that is longer
		//If Equal Print "These words are equal"
		
//		String var1;
//		String var2;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter 1st word you prefer");
//		var1=scan.next();
//		System.out.println("enter 2nd word you prefer");
//		var2=scan.next();
//		
//		if (var1.length()>var2.length()) {
//			System.out.println(var1);
//		}else if(var1.length()<var2.length()) {
//			System.out.println(var1);
//		}else {
//			System.out.println("These words are equal");
//		}

		// str.stratsWith(String prefix) 
				// This method will tell us if the string has specified prefix
				// Returns true or false
				
//				String fruit = "banana";
//				System.out.println(fruit.startsWith("banb"));
//				
//				String str = "iPhone";
//				
//				System.out.println(str.startsWith("Pho", 1));
//				
//				String myPhone = "iPhone";
//				
//				if(myPhone.startsWith("Pho") || myPhone.startsWith("Pho",1)) {
//					System.out.println("The string contains Pho in the beginning.");
//				}
		
		// endsWith(String suffix) 
		// If the string ends with specified string will return true or false
		
//		String newString = "working";	
//		System.out.println("The word ends with ed: " + newString.endsWith("ed"));
		
		
		
		// .substring(int startIndex)
		// Will return a substring of a given string starting from specified index till the end
//		        String str = "Women";
//		        String strSubstring = str.substring(2);
//		        System.out.println(strSubstring); // men
//
//		        // Use literals directly
//		        System.out.println("unhappy".substring(2)); // "unhappy".substring(2) -> happy
//		        System.out.println("Smiles".substring(1)); // "Smiles".substring(1) -> miles
		
		
		
		
//		 String sentence = "I will be a SDET in 5 months";
//
//	       // First index is included and last index is excluded
//	       String mySubstring = sentence.substring(12,16);
//	       System.out.println(mySubstring);
		
		
//		 String email = "email@gmail.com";
//
//	        // In this case we hardcode the indexes - there is a better way to do with combining other methods
//	        String newStr = email.substring(0,5);
//	        System.out.println(newStr);

		
//		Scanner in = new Scanner(System.in);
//		System.out.println("Please enter a word");
//		
//		String savedWord = in.next();
//		
//		if(savedWord.endsWith("ing")) {
//			
//			System.out.println("Tense: Present Part...");
//			
//		}else if(savedWord.endsWith("ed")) {
//			
//			System.out.println("Tense: Past");
//			
//		}else {
//			
//			System.out.println("The word has a different tense.");
//			
//		}
		
		
		
		
		
		
		
		
	}

}
