package personalmodules;

import java.util.Arrays;
import java.util.Scanner;

public class CheatSheet {

	public static void main(String[] args) {
		
		String text = "Farhad";

//	    // Reverse a string
//		// Use as last index text.length() -1 since length() returns the natural number
//		
//		for(int i = text.length()-1; i >= 0; i--) {
//			System.out.print(text.charAt(i));
//		}

		
		// Loops with arrays
		
//		int [] nums = {10,20,30,40,50,60,70,80};
//		
//		for (int i = 0; i<nums.length; i++) {
//			System.out.print(nums[i] + " ");
//		}
//		
//		
//		// Reverse arrays
//		
//		int [] nums1 = {10,20,30,40,50,60,70,80};
//		
//		for (int i= nums1.length-1; i>=0; i--) {
//			System.out.print(nums1[i] + " ");
//		}
//		
//		
//		// Reverse a String
//		// Use as last index text.length() -1 since length() returns the natural number
//		
//		String txt = "Hello Mate";
//		
//		for (int i=txt.length()-1; i>=0; i--) {
//			System.out.print(txt.charAt(i)); // char.At(i)- will write letters
//		}
//		
//		
//		
//		//Bundle it together
//		
//		int total = 0;
//		
//		for (int i =1, j =9; i < 10 && j >= 1; i++, j-- ){
//		
//		total= i*j;
//		System.out.println(i + " x " + j + " = " + total);
//		
//	}
//		
//		
//		
//		
		// We can include in the body of the loop other statements then print lines
		// Create a program that will take from use 5 numbers and will show each number's multiplication to 10

//		Scanner sc = new Scanner(System.in);
//		
//		for(int i=1; i<=5; i++) {
//			
//			System.out.println("Please enter number: " + i);
//			
//			int num = sc.nextInt(); // bunu her defe yaza tekrar yaza bilmeyin ucun for loopun icinde yaziriq.
//			
//			System.out.println("The number multiply by 10: " +num*10);
//		}
		
		
		
//		// String 
//		
//		
//	    String quote = "Challenges are what make life interesting and overcoming them is what makes life meaningful";
//	    
//	    String [] array = quote.split(" ");
//	    System.out.println(Arrays.toString(array));
//	    
//	    //reverse array
//	    
//	    for (int i = array.length-1; i>=0; i-- ) {
//	    	System.out.print(array[i]+ " ");
//	    	
//	    }
		
		
		
		// Write a program to ask user enter 5 numbers
		//Print the total numers entered by user that are greater than 10
		//Example: user enters: 3, 5, 15, 21, 6
		//Your program should output: 36 (total of 15+21)
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		int sum =0;
//		
//		
//		for (int i = 1; i<=5; i++ ) {
//			
//			System.out.println("Please enter number: " + i);
//			
//			int nums = sc.nextInt();
//			
//			
//			if(nums>10) {
//			sum = sum +nums;
//											
//			}
//						
//		}
//		System.out.println("Sum of numbers that are greater than 10: " + sum);
		
		
		// Taks
//		You have a string of email addresses
//		String emailAddresses = "omar@gmail.com, michelle@yahoo.com, ahmed@hotmail.com, stacy@gmail.com, carlos@gmail.com";
//		This list can be changed in future, new people might be added or removed
//		Find out how many people have gmail.com address

		
		String emailAddresses = "omar@gmail.com, michelle@yahoo.com, ahmed@hotmail.com, stacy@gmail.com, carlos@gmail.com";
		
		String [] arr = emailAddresses.split(", ");
		
		String expected = "@gmail.com";
		
		int count =0; 
		
		for( int i=0;  i < arr.length-1;i++ ) {
			
			if(arr[i].contains(expected)) {
				System.out.println(arr[i]+ " ");
				count++;
				
			}
		}
		System.out.println("The number of gmail.com accounts: " + count);
		
		
		
		// Let's create a program that will login to Google account
		// Assume that you entered the username correctly 
		// the program has to validate the password if it is correct
		// if not ask again to enter the password

		
//		String expectedPassword = "Desk45";
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Please enter the username: ");
//		
//		String username = sc.nextLine();
//		
//		System.out.println("Please enter the password: ");
//		
//		String password = sc.nextLine();
//		
//		int attempt = 1;
//		int count = 3;
//		
//		while (!password.equals(expectedPassword)&& attempt <3) {
//			
//			System.out.println("Incorrect password! Please try again");
//			attempt++;
//			System.out.println("Attempts left: " + (count-attempt));
//			password = sc.nextLine();
//			
//		} 
//		if (password.equals(expectedPassword) && attempt<3) {
//			System.out.println("Welcome Back! ");
//		}else {
//			System.out.println("Your account is locked! ");
//		}
		
		
		
		
		
		
	}

}
