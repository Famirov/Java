package personalmodules;

import java.util.Arrays;
import java.util.Scanner;

public class LoopPractice {

	private static int multiple;

	public static void main(String[] args) {
		
		// Question 1
		
		//Write a program to print numbers from 1 to 10.
		
			
//		for(int i=0; i <= 10; i++) {
//			
//			System.out.println(i);
//		}
		
		
		//Question 2

//Write a program to calculate the sum of first 10 natural number.
		
		
//		int sum =0;
//		
//		for (int i = 0; i <= 10; i++) { // 1 2 3 4 5 6 7 8 9 10
//			sum += i;
//			
//			
//		}
//		System.out.println(sum);
		
		//Question 3
//
//		Write a program that prompts the user to input a positive integer. 
//		It should then print the multiplication table of that number. 
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num;
//		
//		System.out.println("Enter any positive integer: ");
//		num = sc.nextInt();
//		
//		System.out.println("Multiplication Table of " + num);
//		
//		for(int i= 1; i<=10; i++ ) {
//			
//			System.out.println(num + "x" + i + "=" + (num *i));
//		}
		
		
		//Question 4

//		Write a program to find the factorial value of any number entered through the keyboard. 
		
		
//		Scanner sc =  new Scanner(System.in);
//		
//		int num; 
//		int fact = 1;
//		
//		System.out.println("Enter any positive integer");
//		num = sc.nextInt();
//		
//		for(int i=1; i<=num; i++ ) {
//			fact *= i;
//	
//		}
//			
//		System.out.println("Factorial: " + fact); // 1+2+3 =6 if i will put 3
		
		
		
		/**This is wrong re-do it*/
////		int [] arr = {1,2,3,4,14,15,15,9};
////		int maxval= findmaxValue(arr);
////		System.out.println(maxval);
//		
//		int [] num = {1,5,3,9,5,1,2,7};
//		
//		int min = num[0];
//		
//		for (int j=1; j<num.length; j++) {
//			if(min< num[j]) {
//				System.out.println(j + "=" +num);
//			}
//		}
//		
//		
//		for (int i =0; i < num.length; i++) {
//			
//			System.out.println("i=" + i);
//			
//		}
		
		/**For */
		
//		for(int i = 0; i<10; i++) { // loop variable
//			System.out.println("Mesaj: "+i);//0-dan 9 a qeder gedir
//		}
		
		
		/**While*/
		
//		int i=0;
//		while(i<10) { // 0-dan 9-a kimi gedecek
//			System.out.println("Mesaj: " + i);
//		i++;	
//		
//		}
		
		/**Do While*/
		
//	    int i = 0;
//	
//		do {
//			System.out.println("Mesaj: " + i);//0-dan 9-a kimi gedecek
//			i++;
//		}while(i<10);
		
		// 100 den 1e kadar olan teksayilari yazmak
		// 0 ile 100 arasinda hem 3'e hem de 7'yee bolunebilen
		// 2 4 8 16 32, 2'nin usleri
		// 1'den 5'e kadar 5'e tam bolunen sayilar
		
		
		//#1// 100 den 1e kadar olan teksayilari yazmak
		
//		for(int i =99; i>=1; i-=2) {
//			System.out.println("i= " + i);
//		}
		
//		Second way of solving it
		
//		for(int i =0; i<50; i++) {
//			System.out.println("i= " + (100-(2*i+1)));
//		}
		
		//#2// 0 ile 100 arasinda hem 3'e hem de 7'yee bolunebilen
		

		
//		for(int i =0; i<=100; i++) {
//			
//			if(i %3==0 && i%7==0 ) {
//				System.out.println("i= " + i);
//				
//			}
//		
//		}
		
//		2'nd way of solving it
		
//		for(int i =0; i<=4; i++) {
//			System.out.println("i= " + i*21);
//		}
		
		
		
		
		//#3// 2 4 8 16 32, 2'nin usleri
		
//		for(int i=1; i<=100; i*=2) {
//			
//			System.out.println("i= " + i);
//		}
		
//		2'nd solution
		
//		for(int i = 0; i<7; i++) {
//			System.out.println("i= " + (int)Math.pow(2,i));
//		}
		
		
		
		//#4 // 1'den 5'e kadar 5'e tam bolunen sayilar
		
		
//		for(int i =1; i<=5; i++) {
//			if(i%5==0)
//			System.out.println("i= "+ i);
//		}
		
		
		
/**1. Create an array that contains numbers: 75, 30, 120, 4, 194, 222, 9;
2. Print the array +
3. Print the array elements each in new line +
4. Print only the numbers that are bigger than 100
5. Print the count of numbers that are bigger than 100
6. Print sum of the numbers in the array.
7. Print average value in the array.*/		
		
		
//		int [] nums = {75, 30, 120, 4, 194, 222, 9};
		
//		for(int i =0; i<7; i++) {
//			System.out.print(nums[i] + " ");
//		}
		

//		
//		for(int i = 0; i<7; i++) {
//			System.out.println((i+1) + "= " + nums[i]);
//		}
		
//		for(int i =0; i<nums.length;i++) {
//			
//			if(nums[i]>100) {
//				System.out.println(nums[i]);
//		
//			}
//		}
		
//		Print the count of numbers that are bigger than 100
		
		
//		int count=0;
//		for(int i =0; i<nums.length; i++) {
//			
//			if(nums[i]>=100) {
//				count++;
//				
//			}
//			
//		}
//		System.out.println(count+" ");
		
		
		
//		Print sum of the numbers in the array.
		//int [] nums = {75, 30, 120, 4, 194, 222, 9};
		
//		int sum = 0;
//		
//		for (int i =0; i<nums.length; i++) {
//			sum=nums[i]+sum;
//			
//		}
//		  System.out.println(sum);
		
		
		
//		 Print average value in the array.*/
		//int [] nums = {75, 30, 120, 4, 194, 222, 9};
		
//		int avg = 0;
//		int sum = 0;
//		
//		for(int i=0; i < nums.length; i++) {
//			
//			sum+=nums[i];
//			
//			avg = sum/nums.length;
//			
//		}
//		
//		 System.out.println(avg);
		
		
		// Loops with arrays
		
//		int [] nums = {10, 20, 30 ,40, 90, 80, 70};
//		
//		// Access each element manually
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
//		System.out.println(nums[3]);
//		
//	// Access all element with the help of loop
//	// Print all elements of the array in new line
//		
//		for (int i= 0; i<nums.length; i++) {
//			System.out.println(nums[i]);
//		}
//
      // Reverse array
		// Print the elements of the array in reversed order
		// use nums.length-1 since the length will give us the count from 1
		
//		int [] nums = {10, 20, 30 ,40, 90, 80, 70};
//		for (int i = nums.length-1; i>=0;i--) {
//			System.out.print(nums[i] + " ");
//		}
		
		String text = "Farhad";

//	    // Reverse a string
//		// Use as last index text.length() -1 since length() returns the natural number
		
//		for(int i = text.length()-1; i >= 0; i--) {
//			System.out.print(text.charAt(i));
//		}
		
//		int count =0;
//		try {
//			for(int i = 0; i < text.codePointAt(i);  i++) {
//				System.out.print(text.charAt(i));
//			}
//			
//		}catch(Exception e){
//			System.out.println("*******");
//			System.out.println(e.getMessage());
//			
//		}
		
		
	
		/**We use for loop- when we know the exact number of times to repeat the code*/
		
		
//		for (int i = 0; i<=10; i++) {
//			System.out.println("I'm counting: " + i);
//			
//			System.out.println("Thank You! ");
//		}

		
		
		// Decrementing loop
		
//		for (int i = 10; i>=1; i--) {
//			System.out.print(i + " ");
//		}
		
		
		// Loops with arrays
		
//		int [] nums = {10,20,30,40,50,60,70,80};
//		
//		for (int i = 0; i<nums.length; i++) {
//			System.out.print(nums[i] + " ");
//		}
		
		
		// Reverse arrays
		
//		int [] nums = {10,20,30,40,50,60,70,80};
//		
//		for (int i= nums.length-1; i>=0; i--) {
//			System.out.print(nums[i] + " ");
//		}
			
		
		// Reverse a String
		// Use as last index text.length() -1 since length() returns the natural number
		
//		String txt = "Hello Mate";
//		
//		for (int i=txt.length()-1; i>=0; i--) {
//			System.out.print(txt.charAt(i)); // char.At(i)- will write letters
//		}
		
		
		
		//Bundle it together
		
//		int total = 0;
//		
//		for (int i =1, j =9; i < 10 && j >= 1; i++, j-- ){
//		
//		total= i*j;
//		System.out.println(i + " x " + j + " = " + total);
//		
//	}

		
		/** TASK
		
		Write a program to print numbers from 1 to 10.

		Write a program to calculate the sum of first 10 natural number.*/
		
//		int sum =0;
//		
//		for (int i=1; i<=10; i++) {
//			
//			System.out.println(i + "");
//			sum +=i;
//			
//		}	System.out.println("---");
//			System.out.println(sum);
		
		
		// We can include in the body of the loop other statements then print lines
		// Create a program that will take from use 5 numbers and will show each number's multiplication to 10

//		Scanner sc = new Scanner(System.in);
//		
//		for(int i=1; i<=5; i++) {
//			
//			System.out.println("Please enter number: " + i);
//			
//			int num = sc.nextInt();
//			
//			System.out.println("The number multiply by 10: " +num*10);
//		}
		
		
		// Write a program that takes 3 numbers from user
		// It should check if the number is even or odd and output in the screen

//		Scanner sc = new Scanner (System.in);
//		
//		for(int i = 1; i<=3; i++) {
//			System.out.println("Please enter number: " + i );
//			
//			int num = sc.nextInt();
//			
//			if (num%2==0) {
//				System.out.println("This is an even number: " + num);
//			}else {
//				System.out.println("This is odd number: " + num);
//			}
//			
//
//		}
//		System.out.println("Session has finished!");
		
		
		
		//split(regex) - will return us an array of strings -> delimiter we need to split by 
		
//		String text = "Apple, Pear, Banana, Grape";
//		String [] arr = text.split(", ");
//		System.out.println(Arrays.toString(arr));
//		
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
//	    	for (int j=0; j<i; j++) {
//	    		
//	    	}
//	    	System.out.print(array[i]+ " ");
//	    	
//	    }
				
		
		
		
		
	
		
		
		
		
		
		// We can include in the body of the loop other statements then print lines
		// Create a program that will take from use 5 numbers and will show each number's multiplication to 10
		
		
		// Another way of doing it
		
//		Scanner sc = new Scanner(System.in);
//	
//		int sum = 0;
//		int mult = 0;
//	
//		for( int i = 1 ; i<=5;i++) {
//			
//
//		System.out.println("Please eneter number: " + i);
//		
//		int nums = sc.nextInt();
//		
//		mult = nums*10;
//		sum = sum + mult;
//		
//		System.out.println("Multiplication result will be for number: " + i +" is:  "+ mult);
//		
//					
//		System.out.println("Sum will be: " + sum);	 	
//		
//		}
				
		
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		int mult = 0;
//		
//		for( int i = 1 ; i<=5;i++) {
//			
//		System.out.println("Please enter number: " + i);
//		
//		int nums = sc.nextInt();
//		
//		mult = nums*10;
//		sum = sum + mult;
//		
//		System.out.println("Multiplication result will be for number: " + i +" is:  "+ mult);
//		System.out.println("Sum will be: " + sum);
//		}
		
		
	
	
	
	
	
	// Write a program to print increments of 5 from 0 to 100
	
//		for (int i = 0; i<=100; i += 5) {
//			
//			System.out.print(i + " ");
//		}
		
		
		
		
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
		

		
		// Task
		
//		Given a String variable sentence, write code to print each word in separate lines in a reverse order. 
//		Example sentence -> "Ain't nobody got time for that"

		
		
//		String sentence = "Ain't nobody got time for that";
//		
//		String [] arr = sentence.split(" ");
//		
//		System.out.println(Arrays.toString(arr));
//		
//		for (int i = arr.length-1; i>0; i--) {
//			
//			System.out.print(arr[i] + " ");
//		}

		
		
		
		
		// Taks
//		You have a string of email addresses
//		String emailAddresses = "omar@gmail.com, michelle@yahoo.com, ahmed@hotmail.com, stacy@gmail.com, carlos@gmail.com";
//		This list can be changed in future, new people might be added or removed
//		Find out how many people have gmail.com address

		
//		String emailAddresses = "omar@gmail.com, michelle@yahoo.com, ahmed@hotmail.com, stacy@gmail.com, carlos@gmail.com";
//		
//		String [] arr = emailAddresses.split(", ");
//		
//		String expected = "@gmail.com";
//		
//		int count =0; 
//		
//		for( int i=0;  i < arr.length-1;i++ ) {
//			
//			if(arr[i].contains(expected)) {
//				System.out.println(arr[i]+ " ");
//				count++;
//				
//			}
//		}
//		System.out.println("The number of gmail.com accounts: " + count); 
		
		
		
		
		
		
	 /**While  Loop**/
		
//		int count =1; 
//		while (count<=3) {
//			System.out.println("Hello World"); // 3-time will count in
//			count++;
//			
//		}
		
		
		/**TASK*
		 * Print numbers from 20 till 0
		 * USING WHILE LOOP
		 */

		
//		int i =20;
//		
//		while (i>=0) {
//			System.out.print(i + " ");
//			i--;
//			
//		}
		
		
		// Let's create a program that will login to Google account
		// Assume that you entered the username correctly 
		// the program has to validate the password if it is correct
		// if not ask again to enter the password

		
//		String expectedpassword = "Desk45";
//		
//		Scanner sc = new Scanner (System.in); 
//		
//		System.out.println("Please enter a username: ");
//		
//		String username = sc.nextLine();
//		
//		System.out.println("Please enter a password: ");
//		
//		String password = sc.nextLine();
//		
//		int attempt =1;
//		
//		while (!password.equals(expectedpassword) && attempt<3) {
//			
//			System.out.println("Please try again, attempts left: " + (3-attempt));
//			password = sc.nextLine();
//			attempt++;
//		} if (password.equals(expectedpassword) && attempt<3) {
//				System.out.println("Welcome back!");
//				
//		} else {
//			System.out.println("Your account locked!");
//		}
		
		
		
		
		
		/**Using For loop and while loop*/
		
//		System.out.println("Please enter the number of time you want to repeat the sign: ");
//		
//		Scanner sc = new Scanner (System.in);
//		
//		
//		int sign = sc.nextInt();
//		
//		for(int i =0; i<=sign; i++) {
//			System.out.println("@");
//			
//		}
		
		
		// with while loop ---- Why it's not working
		
//		System.out.println("Please enter the number of time you want to repeat the sign: ");
//		
//		Scanner sc = new Scanner (System.in);
//		
//		int sign = sc.nextInt();
//
//		int j = 1;
//		while (j <= sign) { 
//		System.out.println("@");
//		j++;
//		}

		
	
	
	
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

//        String expectedanswer = "yes";
//		
//		Scanner sc = new Scanner(System.in);
//		String answer;
//		int price =0;
//		int total =0;
//		
//		do {
//			System.out.println("Please enter the item: ");
//			String item = sc.nextLine(); // Red Tomato, Green Paper
//			
//			System.out.println("Please enter the price: ");
//			price = sc.nextInt();
//			total = total + price;
//			
//			System.out.println("Would you like to enter another item? ");
//			answer = sc.next();
//			sc.nextLine(); // Dummy line when use next() before nextLine() --------------------------
//			
//		}while(answer.equalsIgnoreCase("yes"));
//		
//			
//		System.out.println("Your total is: $" + (Math.round(total * 10.0) / 10.0));
		
	
	
		
///*Write a program that outputs sum of given elements of the array using for each loop*/
//	    
//	    int [] numbers = {10,34,-22,891,1334,4};
//	    int sum = 0;
//	    
////	    for (int eachNumber: numbers) {
////	    	sum = sum + eachNumber;
////	    	
////	    }
////	    	System.out.println("Sum=" + sum);
//	    
//		
//
///*Answer with for loop*/
//	    for (int i =0; i<numbers.length; i++) {
//	    	
//	    	sum = sum + numbers[i];
//	    }
//		
//	    System.out.println(sum);
//		
		
		
		
		
/**Practice
 * 
 * Print all the values of below array in using
 * nested for loops
 * nested for each loop*/
		
//		String apps [][] = {{"Facebook", "Instagram","Twitter", "Youtube"},
//							{"Bank of America", "TD Bank", "Chase", "Wells Fargo"},
//							{"Hotels", "AirBnb", "Expedia"}
//							};
//		
//		
/**nested for loops*/		
//		
//		for (int i =0; i<apps.length; i++) { // This is for rows
//			for(int j =0; j<apps[i].length; j++) {   // This is for columns
//				
//				System.out.print(" " + apps[i][j]);
//			}
//			
//		}
		
		
/** nested for each loop*/
		
//		for(String []eachAppArr:apps) {
//			
//			for(String eachApp: eachAppArr) {
//				
//				System.out.print(eachApp + " ");
//			}
//			
//		}
		
		
		
		
		// Practice
		
//		Write a program that takes arrays of integers and compares them
//		int[]tempArray= {23, 44, 12, 99, 4};
//		Then prints the smallest one out of them.
//
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
		
		
/**Using for loop to find min and max values*/		
		
//		int[]tempArray= {-23, -44, 12, 99, 4444};
//		
//		int min = tempArray[0];
//		int max = tempArray [0];
//		
//		for (int i=0; i<tempArray.length; i++) {
//			
//			if (min > tempArray[i]) {
//				min = tempArray[i];
//				
//			}else if(max < tempArray[i]) {
//				max = tempArray[i];
//				}
//			}
//
//		System.out.println(min);
//		System.out.println(max);
		
		
		
		
		
/**Using a For Each Loop*/
		
//		int[]tempArray= {-23, -44, 12, 99, 4444};
//		
//		int min = tempArray[0];
//		int max = tempArray [0];
//		
//		for (int num: tempArray) {
//			
//			if(num<min) {
//				min = num;
//			}
//			
//			else if (num>max) {
//				max =num;
//			}
//		}
//		System.out.println(min);
//		System.out.println(max);	
		
		
		
//		String one = "Java";
//		String two = "Sel";
//		
//		if(one.length()<two.length()) {
//		
//		for (int i=0; i<one.length(); i++) {
//			System.out.print(one.charAt(i)+ two.substring(i,i+1) );
//			}
//		System.out.println(two.substring(one.length()));
//		
//		}else {
//			for (int i=0; i<two.length(); i++) {
//				System.out.print(one.charAt(i)+ two.substring(i,i+1));
//				}
//			System.out.println(one.substring(two.length()));
//		}	

		
		int [] array = {10,12,10,12,10,10};
		
		int count = 0;
		
		int repeat = array[0];
		
		for(int i = 0; i<array.length; i++) {
			
			if(repeat == array[i]) {
				count++;
				
				
		}
			
			
		}
		System.out.println(repeat+ " equals "+ count);
		
		if(count%2==0) {
			System.out.println(count + " is even"  );
		}else {
			System.out.println(count + " is odd ");
		}
		
		
		
		
		

		
		
		

	}

}
