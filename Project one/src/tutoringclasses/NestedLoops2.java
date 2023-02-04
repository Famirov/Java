package tutoringclasses;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class NestedLoops2 {

//	public static void main(String[] args) {

		/**
		 * Find 2 biggest values in array
		 */

//		int[] arr = {99, 99, 5 ,7,8,55, 77, -4, 2, 1, 0};
//		
//		int max = arr[0];
//		int secondMax = arr[0];
//		
//		for( int num : arr) {
//			if(max < num) {
//				secondMax = max;
//				max = num;
//			}
//			else if(secondMax < num || max == secondMax) {
//				secondMax = num;
//			}
//		}
//		System.out.println("First Max Number: " + max);
//        System.out.println("Second Max Number: " + secondMax);
//	}
		
		
		
		/**EX*/
		
//		Creat a method that checks if given string is Palindrome
//		
//		racecar
		
		
//		public static void main(String[] args) {

//	       Create a method that checks if given string is Palindrome
			
//			racecar
			
//			Scanner in = new Scanner(System.in);
//			System.out.println("Enter the word: ");
//			System.out.println(isPalindrome(in.next()));
//			
//		}
//
//		public static boolean isPalindrome ( String word ){
//			String reversed = "";
//	    	for (int i = word.length()-1; i>= 0; i--) {
//	    		reversed += word.charAt(i); 
//	    	}
//			return word.equals(reversed);
			
//	public static void main(String[] args) {
//			
//			Scanner in = new Scanner(System.in);
//			System.out.println("Enter the word: ");
//			System.out.println(isPalindrome2(in.next()));	
//		}
//		public static boolean isPalindrome2 (String word) {
//			int i=0  ,   j = word.length()-1;
//			
//			while(i<j) {
//				if(word.charAt(i) != word.charAt(j)) {
//					return false;
//				}
//				i++;
//				j--;
//			}
//			return true;
			
			
		
//	}
	    	
			
	public static void main(String[] args) {

//		Write a method to find what is the number of day we are in a given year
//	    method that return int and takes params: int , string, int
//		First param int is number of day in a month
//		Second param string is name of the month
//		Third param int is a year
//		return int number of that day in a year
	    
//		7 January 2022   - > 7      February 1 => 32
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the day:");
		int day = in.nextInt();
		System.out.println("Enter month:");
		String month = in.next();
		System.out.println("Enter the year: ");
		int year = in.nextInt();
		int numberOfTheDayInAYear= numberOfTheDayInAYear(day, month, year);
		int daysFromChristmas = daysFromChristmas(year-1) +numberOfTheDayInAYear;
		if(numberOfTheDayInAYear != -1) {
			System.out.println(day+ " of "+month+" is "+numberOfTheDayInAYear+ " day in "+year);
			System.out.println("And "+daysFromChristmas+" day from 01/01/0001.");
		}
	}
	

	
	public static int numberOfTheDayInAYear(int day, String month, int year) {
		int[] daysInMonths= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(isLeapYear(year)) {
			daysInMonths[1]=29;
		}
		int numberOfMonth = numberOfMonth(month);
		if(numberOfMonth == -1) return -1;
		int result=0;
		for(int i=0;i<numberOfMonth-1;i++) {
			result+=daysInMonths[i];
		}
		
		if(day<=0 || day>daysInMonths[numberOfMonth-1]) {
			System.out.println("Day value "+day+" is invalid for month "+month);
			return -1;
		}
		
		return result+=day;
		
	}
	
	
	
	
//	Return number of month in a sequence
	public static int numberOfMonth(String month) {
		String [] months = {"January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December"};
		for(int i=0;i<months.length;i++) {
			if(month.equalsIgnoreCase(months[i])) {
				return i+1;
			}
		}
		
		System.out.println("Invalid month: "+month);
		return -1;
	}
	
	
	
	public static boolean isLeapYear(int year) {
		if((year-2020)%4 == 0) {
			System.out.println(year+" is a leap year");
			return true;
		}
		return false;
	}
	
	
	public static int daysFromChristmas(int year) {
		int numOfLeapYears = year/4;
		int numberOfRegularYears = year- numOfLeapYears;
		return (numOfLeapYears*366)+(numberOfRegularYears*365);
	}
	
	
	
}

	}

}
