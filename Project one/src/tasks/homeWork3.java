package tasks;

import java.util.Scanner;

public class homeWork3 {

	public static void main(String[] args) {
	
		
/**Instructions from your teacher:

Five friends are going to the theater.
They have purchased a row of five seats with an aisle on either end.5 String variables are already declared to stored their names.

James doesn't want to sit next to Jill
Betty and Herb are dating and want to sit next to each other
Bob wants to sit on an left side aisle
James wants to sit on the aisle
Provide a seating order that conforms to the above rules. An example of an invalid seating order is:

James, Betty, Herb, Bob, Jill
The above arrangement is invalid because: Bob is not sitting on left aisle.

Specify the seating order as the names separated by commas and a space (as in the above example).
Use variables and print names in the right order.

Order: James, Betty, Herb, Jill, Bob
*/
		
//		String p1 = "James";
//		String p2 = "Jill,";
//		String p3 = "Bob,";
//		String p4 = "Betty,";
//		String p5 = "Herb,";
//		
//		
//	 System.out.println(p3 + p2 + p4 + p5 + p1);
//		


/**Declare an byte variable named steps and assign 100

Declare an short variable named miles and assign 5000

Declare an int variable named count and assign 1000000

Declare an long variable named population and assign 3434455667L
*/		
		
		
//		byte steps = 100;
//		
//		short miles = 5000;
//		
//		int count = 1000000;
//		
//		long population = 3434455667L;
//				
//		System.out.println(steps);
//	    System.out.println(miles);
//	    System.out.println(count);
//	    System.out.println(population);		
		
		
/**Instructions from your teacher:

In this assignment, you will write code to put together time of day.

Like this: 12:24:33 PM

Declare variables: hour, minute, second that can hold int values.

Declare amOrPm variable that can hold a String ("AM" or "PM")

Instructor will set different values to your variables

Using the variables and concatenation, print values in the format mentioned above.*/
		
//	    Scanner sc = new Scanner(System.in);
//	    
//	    int hour, minute, second;
//	    String amOrPm;
//	    
//	    
//	    hour   = sc.nextInt();
//	    minute = sc.nextInt();
//	    second = sc.nextInt();
//	    amOrPm = sc.next();
//	
//		
//	    System.out.println(hour + ":"+ minute + ":"+ second + " " + amOrPm);
		
		
/**Instructions from your teacher:

In this assignment you will create a Scanner object and ask user to enter 3 number inputs.

-Declare integer variables num1, num2, num3, sum.

-Create a Scanner object named scan.

-Display prompt "Enter 3 numbers:"

-Using scanner object let user input 3 numbers

-Add 3 numbers and assign to sum variable

-Print "Sum of numbers: ValueOfSum"*/
		
//	    //WRITE YOUR CODE HERE:
//		Scanner sc= new Scanner(System.in);
//		
//		int num1, num2, num3, sum;
//		    
//	    System.out.println("Enter 3 numbers:");
//	    
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		num3 = sc.nextInt();
//		
//		sum =num1+num2+num3;
//		
//	    
//	    //WRITE YOUR CODE HERE:
//	    
//	    System.out.println("Sum of numbers: "+sum);
		
		
/**Instructions from your teacher:

Write a program that accepts user input int values: areaCode and localNumber.

-Using concatenation put together in this format and assign to String phoneNumber variable:

-(222)-3334444

-Write a print statement that displays (use phoneNumber variable ):

Calling number (222)-3334444*/	//	------BU SEHVDIR
		
//	    int areaCode, localNumber;
//	    
//	    areaCode = 222;
//	    
//	    localNumber = 3334444;
//	    
//	    
//	    
//	      
//	    String phoneNumber  = "("+areaCode+")-"+localNumber;
//	    
// 	    	    	
//		System.out.println("Calling number "+phoneNumber);
		
		
		


//The variable "name" holds a String user input
//
//Write a conditional statement starting on line 11 that does the following:
//
//- If name is equal to "Chen", print "teacher"
//- For any other input, print "student"
//
//Examples:
//
//In: Chen
//teacher
//
//In: Faa
//student

//	Scanner inp = new Scanner(System.in);
//	System.out.print("In:");
//	String name = inp.nextLine();
//	
//	if (name.equals("Chen")) {
// 	   
//	   	   System.out.println("teacher");
//	    	   
//	     } else {
//	    	   
//	   	   System.out.println("student");
//	    	   
//	    }

		
/**Instructions from your teacher:

Given an integer variable i and a floating-point variable f,
that have already been given values, 
write a statement that writes both of their values to console in the following format:

i=value-of-i f=value-of-f

Ex:

Assume i = 9 and f = 33.4

Output should be:

i=9 f=33.4*/
		
//	 Scanner sc = new Scanner (System.in);
//	 
//	 int i = sc.nextInt();
//	 
//	 float f = sc.nextFloat();
//	 
//	 System.out.println("i = " + i + " f = " + f);
		
/**Instructions from your teacher:

Write a program that determines the change to be dispensed from a vending machine.
An item in the machine can cost between 25 cents and 1 dollar, in 5-cent increments 
(25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
dollar bill to pay for the item.

- int variable itemPrice

- int variables quarters, dimes, nickels

- Scanner object

Program accepts itemPrice, which is a price for the item you would like to purchase.

Positive behaviour:

Please follow the example: 

-If the Item price was entered 95: need to display message: Your change is 0 quarters, 0 dimes, and 1 nickels. 
-If the Item price was entered 60: need to display message: Your change is 1 quarters, 1 dimes, and 1 nickels. 

Note: Implement a program that calculates the minimum number of coins required to give a user change.

Negative behaviour:

If itemPrice is less than 25 or more than 100 cents, then display error message:

Invalid price!

If itemPrice is not divisible by 5, then also display error message:

Invalid price!

use (itemPrice % 5 == 0) expression to find it is divisible by 5.

Do not display anything else.*/		
		
		
		
//	Scanner sc = new Scanner(System.in);
//	
//	int itemPrice = sc.nextInt();
//	
//	int quarters = 25;  
//	int dimes  	= 10; 
//	int nickels	=  5;
//	
//	if (100 > itemPrice && itemPrice > 25 ) {
//		
//		if (itemPrice % 5 == 0) {
//			
//			int moneyback = (100-itemPrice);
//			int num1 = moneyback/quarters;
//			int num2 = (moneyback-num1*quarters)/dimes;
//			int num3 = (moneyback-(num1*quarters + num2*dimes))/nickels;
//			
//				
//			System.out.println("Your change is " + num1 + " quarters, " + num2 + " dimes, and " + num3 + " nickels." );
//			
//		}else {
//			System.out.println("Invalid price! ");
//		}
//			
//			
//		
//	}else {
//		System.out.println("Invalid price!");
//	}
//		
		
 
	
	 
		
		
	


		
		
		
		

		
		

	}

}
