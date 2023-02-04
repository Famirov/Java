package personalmodules;

import java.util.Arrays;
import java.util.Scanner;

public class hometaskWeek5 {

	private static final char y = 0;
	private static final char n = 0;

	public static void main(String[] args) {
		
/**Instructions from your teacher:

Note: prerequisite - if-else statement

The video game machines at your local arcade output coupons according to how well you play the game. 
You can redeem 10 coupons for a candy bar or 3 coupons for a gumball. You prefer candy bars to gumballs. 
Write a program that defines a variable initially assigned to the number of coupons you win. 
Next, the program should output how many candy bars and gumballs you can get if you spend all of your coupons on candy bars first, 
and any remaining coupons on gumballs.

if you the coupons are not enough for any redeem, display message:

"Not enough coupons"

`Example1:`

`Display prompt: "Enter number of coupons:"`

`13`

`Display prompt: "Number of Candies: 1"`

`Display prompt: "Number of Gumballs: 1"`

`Example2:`

`Display prompt: "Enter number of coupons:"`

`23`

`Display prompt: "Number of Candies: 2"`

`Display prompt: "Number of Gumballs: 1"`

`Example3:`

`Display prompt: "Enter number of coupons:"`

`2`

`Display prompt: "Not enough coupons"`*/
		
		
		
//		Scanner scan = new Scanner (System.in);
//		System.out.println("Enter number of coupons:");
//		
//        int bar = 10;
//		int gumballs = 3;
//		int coupons = scan.nextInt();
//		
//		if (coupons >=10) {
//			System.out.println("Number of Candies: " + coupons/bar);
//			System.out.println("Number of Gumballs: " + (coupons%bar)/3);
//		}else {
//			System.out.println("Not enough coupons");
//			
//		}
	

/**Instructions from your teacher:

Note: prerequisite - if-else statement

In this assignment, you will write program for Leasing office.

numberOfBedrooms variable already declared and assigned value using Scanner:

startingPrice is set to 0.

Using Multi Way If statement create this program logic:

numberOfBedrooms is 1

	print "One Bedroom Selected"
	
	print "set startingPrice as $1100"
	
numberOfBedrooms is 2

	print "Two Bedroom Selected"
	
	print "set startingPrice as $1850"
	
numberOfBedrooms is 3

	print "Three Bedroom Selected"
	
	print "set startingPrice as $2550"
	
All other inputs:

	print "No such Bedrooms available"
	
Print "Starting Price: $value"*/
		

		
//		Scanner scan = new Scanner (System.in);
//		System.out.println("numberOfBedrooms is: ");
		
		
//		int numberOfBedrooms = scan.nextInt();
//		int startingPrice = 0;
//		
//		if(numberOfBedrooms == 1 ) {
//			startingPrice = 1100;
//			System.out.println("One Bedroom Selected");
//			
//			System.out.println("set startingPrice as $" + startingPrice);
//		}else if (numberOfBedrooms == 2) {
//			startingPrice = 1850;
//			System.out.println("Two Bedroom Selected");
//			
//			System.out.println("set startingPrice as $" + startingPrice);
//		}else if (numberOfBedrooms == 3) {
//			startingPrice = 2550;
//			System.out.println("Three Bedroom Selected");
//			
//			System.out.println("set startingPrice as $" + startingPrice);
//		}else {
//			System.out.println("No such Bedrooms available");
//			System.out.println("Starting Price: $value");
//		}
//		
		
		
/**Instructions from your teacher:

Note: prerequisite - if-else statement

U have 2 numbers already declared and assigned values.

Using Multi-Branch if statements, check if num1 and num2 are equal, or not. Please follow the below examples and print message accordingly:

Enter 2 numbers:

10

10

10 and 10 are equal

Enter 2 numbers:

100

55

100 is greater than 55

Enter 2 numbers:

33

333

333 is greater than 33*/
		
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter 2 numbers:");
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        
//        if(num1==num2) {
//        	System.out.println( num1 + " and " + num2 + " are equal");
//        } else if (num1 >num2) {
//        	System.out.println(num1 + " is greater than " + num2);
//        }else if (num1 <num2) {
//        	System.out.println(num2 + " is greater than " + num1);
//        }
		
		
		
/**Instructions from your teacher:

Note: prerequisite - if-else statement

Automated tests are the future.

in the given program you have a quiz question and a scanner to catch user input which will be stored on string a.

after the user inputs an answer (a, b or c) we need to check if its the correct, wrong, valid answer.

what is the farthest planet in the solar system:

a)venus

b)pluto

c)neptune

a

a is wrong

what is the farthest planet in the solar system:

a)venus

b)pluto

c)neptune

b

b is correct

what is the farthest planet in the solar system:

a)venus

b)pluto

c)neptune

c

c is wrong

what is the farthest planet in the solar system:

a)venus

b)pluto

c)neptune

z

z is not a valid answer*/
		
//		Scanner s = new Scanner(System.in);
//        System.out.println("what is the farthest planet in the solar system:");
//        System.out.println("a)venus");
//        System.out.println("b)pluto");
//        System.out.println("c)neptune");
//
//        String a = s.nextLine();
//		
//        if(a.equals("a")) {
//        	System.out.println(a + " is wrong");
//        }else if (a.equals("b")) {
//        	System.out.println(a + " is correct");
//        }else if (a.equals("c")) {
//        	System.out.println(a + " is wrong");
//        }else {
//        	System.out.println(a +" is not a valid answer");
//        }
    		
       
		
/**Instructions from your teacher:

Note: prerequisite - if-else statement

Honda Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017. 

In this assignment you will write a program that will find vehicle for recall. 

-Create a scanner object

-Create int variable named vehicleYear

-Display prompt: "Enter vehicle's year:"

input: 1996

if the value of modelYear does fall within the four recall ranges, display output:

"Your vehicle needs to be recalled!"

Otherwise, display message:

"Your vehicle is fine, enjoy!"*/
        
        
//        Scanner scan = new Scanner(System.in);
//        int vehicleYear;
//
//        System.out.println("Enter vehicle's year:");
//        vehicleYear = scan.nextInt();
//        
//        if (1995<=vehicleYear && vehicleYear <= 1998) {
//        	System.out.println("Your vehicle needs to be recalled!");
//        }else if (2001<=vehicleYear && vehicleYear <= 2002) {
//        	System.out.println("Your vehicle needs to be recalled!");
//        }else if (2004<=vehicleYear && vehicleYear <= 2006) {
//        	System.out.println("Your vehicle needs to be recalled!");
//        }else if(2015<=vehicleYear && vehicleYear <= 2017) {
//        	System.out.println("Your vehicle needs to be recalled!");
//        }else {
//        	System.out.println("Your vehicle is fine, enjoy!");
//        }
        
		
/**Instructions from your teacher:

a fast food company has two main order types, burger meal and chicken meal.

both have the same prices.

so if a cashier enters "burger" or "chicken" he will get the same price

a float : 10.0

this test can be done with one if.

check if in (string variable) equals "burger" or "chicken" and output the price 10.0

also if input is "soda" output 2.0 

for example:

in = "burger"

output: 10.0

in = "chicken"

output: 10.0

in = "soda"

output: 2.0

hint: OR operator in java is  || */		
		
//        Scanner s = new Scanner(System.in);
//        String in = s.next();
//        
//        String in1 = "burger";
//        String in2 = "chicken";
//        String in3 = "soda";
//        double output = 10.0;
//        double output2 = 2.0;
//        
//        
//        if(in.equals(in1)|| in.equals(in2)) {
//        	System.out.println(output);
//        }else if (in.equals(in3)) {
//        	System.out.println(output2);
//        }else {}
//		
//		
//		//2nd way
//		  double priceBurger = 10.0;
//		    double priceSoda = 2.0;
//		        
//	          if (in.equalsIgnoreCase("burger")|| in.equalsIgnoreCase("chicken")){
//	         
//		        	System.out.println(priceBurger);
//		        	
//		        } else if(in.equalsIgnoreCase("soda")) {
//		            
//		        	System.out.println(priceSoda);
//		        	
//		        }
		
/**Instructions from your teacher:

HTTP is the protocol that governs communications between web servers and web clients (i.e. browsers). 
Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request. 
Some of the codes and their meanings are listed below:

STATUS CODES

200, OK
201, Created
202, Accepted
301, Moved Permanently
303, See Other
304, Not Modified
307, Temporary Redirect
400, Bad Request
401, Unauthorized
403, Forbidden
404, Not Found
410, Gone
500, Internal Server Error
503, Service Unavailable

Given an int variable status, write a switch statement that prints out,
on a line by itself, the appropriate label from the above list based on status. 
Otherwise, print warning message: "Invalid status code!".

Example:

Display message: "Enter status code:"

input: 200

Display message: "OK"*/		
		
		
		
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter status code:");
//        int status = scan.nextInt();
//        //Write your Code Here
//        
//        switch(status) {
//        
//        case 200:
//        	System.out.println("OK");
//        	break;
//        case 202:
//        	System.out.println("Accepted");
//        	break;
//        case 201:
//        	System.out.println("Created");
//        	break;
//        case 301:
//        	System.out.println("Moved Permanently");
//        	break;
//        case 303:
//        	System.out.println("See Other");
//        	break;
//        case 304:
//        	System.out.println("Not Modified");
//        	break;
//        case 307:
//        	System.out.println("Temporary Redirect");
//        	break;
//        case 400:
//        	System.out.println("Bad Request");
//        	break;
//        case 401:
//        	System.out.println("Unauthorized");
//        	break;
//        case 403:
//        	System.out.println("Forbidden");
//        	break;
//        case 404:
//        	System.out.println("Not Found");
//        	break;
//        case 410:
//        	System.out.println("Gone");
//        	break;
//        case 500:
//        	System.out.println("Internal Server Error");
//        	break;
//        case 503:
//        	System.out.println("Service Unavailable");
//        	break;
//        	
//        	default:
//        		System.out.println("Invalid status code!");
//            
//        }
		
		
		
		
		
		
		
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

		
		
/**Instructions from your teacher:

Note: prerequisite - switch cases

Write a switch statement that tests the value of the char variable response and performs the following actions:

if response is y--> message "Your request is being processed" is printed

if response is n--> 'Thank you anyway for your consideration" is printed

if response is h --> "Sorry, no help is currently available" is printed

for any other value of response -->"Invalid entry, please try again!" is printed

Create Scanner object.

Use charAt() method, in order to get the char value at the specified index.

Example:

-Display prompt: "Enter command:"

input: y

-Display prompt: "Your request is being processed"*/
        
        
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter command:");
//        char response = scan.next().charAt(0);
//        
//        switch (response ) {
//        
//        case 'y':
//        	System.out.println("Your request is being processed");
//        	break;
//        
//        case 'n':
//        	System.out.println("Thank you anyway for your consideration");
//        	break;
//        
//		
//		case 'h':
//        	System.out.println("Sorry, no help is currently available");
//        	break;
//        
//        default: 
//        	System.out.println("Invalid entry, please try again!");
//        
//        }
        
        
/**Instructions from your teacher:

Write a program that will print out the longest word.

Example 1:

Enter first word:

Input :java

Enter second word:

Input : python

Output: "python is the largest word"*/        
        
//        Scanner scan = new Scanner(System.in);
//        String word1 = scan.next();
//        String word2 = scan.next();
//        
//        if(word1.length()>word2.length()) {
//        	System.out.println(word1 + " is the largest word");
//        	
//        } else {
//        	System.out.println(word2 + " is the largest word");
//        }
        
/** ## Change an Array Element

To change the value of a specific element, refer to the index number

Instructions:

- Create an array of string, cars, and assign 5 models: Volvo, BMW, Ford, Mazda, Toyota

- Using index number change the third car model to: Audi

- Print changed model using index number*/ 
		
		
//	String [] cars = {"Volvo", "BMW", "Ford", "Mazda", "Toyota"};
//	
//	cars [2]= "Audi";
//	
//	System.out.println(cars[2]);
	
//	System.out.println(Arrays.toString(cars));
	
 /** ## Array Length

To find out how many elements an array has, use the `length` property

Instructions:

- Create an array of string, cars, and assign 7 car models

- print out the count of assigned models*/       
		
		
		
//		String [] cars = {"Volvo", "BMW", "Ford", "Mazda", "Toyota", "Mercedes", "Honda"};
//        
//        System.out.println(cars.length);
		
		
/**## Multidimensional Arrays

A multidimensional array is an array containing one or more arrays.

To create a two-dimensional array, add each array within its own set of **curly braces.**

Instructions:

- Create multidimensional array of int, myNumbers, and assign two sets of numbers: (1,2,3,4) and (5,6,7)

- First set consisting of 4 numbers and second set consisting of 3 numbers 

**- myNumbers** is now an array with two arrays as its elements.

- Create another int variable to access the elements of the **myNumbers** array, specify two indexes: one for the array, and one for the element inside that array. 

- This variable should access the third element in the second array of myNumbers

- Print the result*/	
		
		
//		OPTION 1
		
//		int [][] myNumbers = {{1,2,3,4},
//							  {5,6,7}};
//		
//		int variable = myNumbers[1][2];
//		
//		System.out.println(variable);
		
		
////		OPTION 2
//		
//		int [][] myNumbers = {{1,2,3,4},
//				  {5,6,7}};
//		
//		for(int i = 0; i < myNumbers.length; i++) {
//			for (int j = 0; j<myNumbers[i].length; j++) {
//				System.out.println(myNumbers[1][2]);
//			}
//		}
//		
        
		
//		int [] values = {55, 443, 12, 5, 387};
//
//		System.out.println(values.length);//5
//		System.out.println(Arrays.toString(values)); //[55, 443, 12, 5, 387]
		
		
		

        
		// Arrays.toString()
		int[] nums = { 1, 3, 4, 5, 6 };
		
		double [] temps = {12.5, 66.8, 99.0};
		
		String [] arr = {"One", "Two", "Three"};
		
//		System.out.println(Arrays.toString(nums));
//		System.out.println(Arrays.toString(temps));
//		System.out.println(Arrays.toString(arr));
		
		
		
/**Each item in an array is called an _element_, 
 * and each element is accessed by its numerical _index_. Numbering begins with 0.
 *  The 9th element, for example, would therefore be accessed at index 8.

Instructions:

- Write a program that creates an array of integers

- Allocate memory for 10 integers

- Initialize first element and assign value to it: 100

- Initialize second element and assign value to it: 200

- and so forth

- Print each value on separate lines: 
  
   "Element at index 0: 100"
   "Element at index 1: 200"
    ... and so forth...
   "Element at index 9: 1000"
   */		
		
		
	int [] element = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		
		
//	System.out.println("Element at index 0: " + element[0]);
//	System.out.println("Element at index 1: " + element[1]);
//	System.out.println("Element at index 2: " + element[2]);
//	System.out.println("Element at index 3: " + element[3]);
//	System.out.println("Element at index 4: " + element[4]);
//	System.out.println("Element at index 5: " + element[5]);
//	System.out.println("Element at index 6: " + element[6]);
//	System.out.println("Element at index 7: " + element[7]);
//	System.out.println("Element at index 8: " + element[8]);
//	System.out.println("Element at index 9: " + element[9]);
	
//	for(int i=0; i<=element.length-1;i++) {
//		System.out.println("Element at index " + i + ": " + element[i]);
//	}
	
	
	
	
/**You can declare an array of arrays (also known as a _multidimensional_ array)
 * by using two or more sets of brackets, such as `String[][] names`.
 * Each element, therefore, must be accessed by a corresponding number of index values.

In the Java programming language, a multidimensional array is an array whose components are 
themselves arrays. 

Instructions:

- Create multidimensional String array and name it names

- First set: Mr. Mrs. Ms.

- Second set: Smith Jones

- Print first of first set and first of second set

- Print third of first set and second of second set*/	
		
		
		
	
	String [][] names = {{"Mr.", "Mrs.","Ms."},
			 {"Smith", "Jones"}};


System.out.println(names[0][0] +" " + names[1][0]);
System.out.println(names[0][2] +" " + names[1][1]);

	
	
	
	

	}

}
