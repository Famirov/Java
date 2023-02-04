package module4Dima;

import java.util.Scanner;

public class lecture1loops {

	public static void main(String[] args) {
		
		// 10 times writing Hello World- But it's not proper way.
	
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
		
		
		
		
		
//		Scanner sc = new Scanner (System.in);
//		
//		System.out.println("Enter the expense for the day 1: ");
//		int expense = sc.nextInt();
//		
//		System.out.println("Enter the expense for the day 1: ");
//		int expense1 = sc.nextInt();
//		
//		System.out.println("Enter the expense for the day 1: ");
//		int expense2 = sc.nextInt();
//		
//		System.out.println("Enter the expense for the day 1: ");
//		int expense3 = sc.nextInt();
		
		
		
		
		
		
		
	//We need the loops because instead of repeating statement 
	// Repeating a specific block of code until certain condition is met
	
	// for loop - use when you know the exact number of times to repeat the code.
	// in human language you would say - repeat "Hello World" for 100 of times.
	
//	 for(count < 100){
//		System.out.println("Hello World");
//		}
		
		
		// How to properly define a for loop
		// 1.Use "for" keyword to let java know about loop 
		// Initialize the counter -- <
		// Create when loop will stop --100
		// Update the counter ---count
		// Provide the body
			
		
		// Increment count++ or ++count in the loop are identical since they are independent statements
		// count ++ helps us to stop.
		
		      // Initialize=1, condition<=10, update++
		
//		for (int count = 1; count <= 10; count++){
//			System.out.println("Hello World!");
//		}
//		
		
		
		// The counter can have different names
		// The most used name will "i"
		
		
		// Create a program that prints Meow 3 times
		// If we need to iterate 3 times the condition can be:
		// i < 3 or i <= 2 are equal to each other will return 3 times.
		
//		for(int i = 0; i < 3; i++) {
//			System.out.println("Meow");
//		}
		
		// Use the counter i in body
		// Create a program to print I'm counting: from 1 till 10
		
//		for(int i = 1; i <= 10; i++) {
//			
//			System.out.println("I'm counting: " + i);
//		}
		
		
		//Scopes matter!
		// We can have multiple lines of code repeated we just need to include them in the {}
		// If we have only one line to repeat the {} is optional
		// Remember if you have more than one line to repeat and do not provide scopes
		// Only the next line after for loop will be treated as body. {} qoymasan Thank you cemi bir defe deyecek
		
		// The variables declared inside of loop will be visible only to the for loop scope 
		
//		for(int i = 1; i <= 10; i++ ) {
//			System.out.println("I'm counting: " + i);
//			
//			System.out.println("Thank You!");
//		}
		
		// System.out.println(i)
		
		// The traps to not get in:
		
		//Syntax
		
	
		
		//Variations of loop
		//Incrementing loop ++
		
//		for (int i = 0; i < 5; i++) {
//			System.out.print(i + " ");
//		}
//		
//		
//		
//		// Decrementing loop 
//		for(int i = 10; i >= 1; i--) {
//			System.out.print(i + " ");
//		}
//		
//		 // Update in different way
//		// Print the even numbers with the help of update of 2
//		for(int i = 0; i <= 10; i += 2) {
//			System.out.print(i + " ");
//		}
//		
//	    // Print the odd numbers
//		for(int i = 1; i <= 10; i += 2) {
//			System.out.print(i + " ");
//		}
//		
//		// Loops with arrays
//		int [] nums = {10, 20, 30 ,40, 90, 80, 70};
//		
//		// Access each element manually
////		System.out.println(nums[0]);
////		System.out.println(nums[1]);
////		System.out.println(nums[2]);
////		System.out.println(nums[3]);
//		  
//		// Access all element with the help of loop
//		// Print all elements of the array in new line
//		for(int i = 0; i < nums.length; i++) {
//			System.out.println(nums[i]);
//		}
//		
//		
//	    // Reverse array
//		// Print the elements of the array in reversed order
//		for(int i = nums.length-1; i >= 0; i--) {
//			System.out.print(nums[i] + " ");
//		}
//		
//		
//        // Reverse array
//		// Print the elements of the array in reversed order
//		// use nums.length-1 since the length will give us the count from 1
//		// we need to subtract it since index starts from 0
//		for(int i = nums.length-1; i >= 0; i--) {
//			System.out.print(nums[i] + " ");
//		}
//		
//	    // Reverse a string
//		// Use as last index text.length() -1 since length() returns the natural number
//		for(int i = text.length()-1; i >= 0; i--) {
//			System.out.print(text.charAt(i));
//		}
		
		
		
		// Bundle it together 
		
//		for (int i =1, j =9; i < 10 && j >= 1; i++, j-- ){
//			System.out.println(i + " x " + j);
//		}
//		
//		// We can make our loop look ugly
//		
//		int i = 0; // initialization
//		
//		for(; i <= 10;) {
//			System.out.println("Ugly loop");
//			i++; //update
//		}
//		
//		System.out.println(i); // 11 edecek ama bu yuxaridakina fikir verme cunki bele yazmayacaqsan
		
		// All the components of the for loop are optional
		
//		for(;;){
//			System.out.println("Infinite!");
//		}
		
		
	
		/** TASK
		
		Write a program to print numbers from 1 to 10.

		Write a program to calculate the sum of first 10 natural number.*/
		
//		//1th part
//		
//		for (int i = 1 ; i <= 10; i++  ) {
//			System.out.print(" " + i);
//		
//		}
//		
//		//2nd part
//		// short cut 
//		 int sum =0;
//		 sum +=i
//		
//		int sum = 0;
//		//  1 2 3 4 5 6 7 8 9 10
//		
//		sum = sum + 1 ;//1
//		sum = sum + 2 ;//2
//		sum = sum + 3 ;//3
//		sum = sum + 4 ;//4
//		sum = sum + 5 ;//5
//		sum = sum + 6 ;//6
//		sum = sum + 7 ;//7
//		sum = sum + 8 ;//8
//		sum = sum + 9 ;//9
//		sum = sum + 10 ;//10
//		
//		System.out.println(sum);
		
		//End Solution
		
//		int sum =0;
//		for (int i = 1 ; i <= 10; i++  ) {
//			System.out.println(" " + i);
//			sum +=i;
//		}

				
				
		// We can include in the body of the loop other statements then print lines
		// Create a program that will take from use 5 numbers and will show each number's multiplication to 10
		
//		Scanner sc = new Scanner(System.in);
//		
//		for (int i = 1; i <= 5; i++ ) {
//			System.out.println("Enter the number: " + i);
//			int num = sc.nextInt();
//			
//			System.out.println("The number multiply by 10: " + (num * 10));
//					
//		}

		// Write a program that takes 10 numbers from user
		// It should check if the number is even or odd and output in the screen
		
		Scanner scan = new Scanner(System.in);
		
//		for(int i = 1; i<= 10; i++) {
//			System.out.println("Enter the number: " + i);
//			int num = scan.nextInt();
//			
//			if(num%2 == 0) {
//				System.out.println(num + " is even" );
//			}else {
//				System.out.println(num + " is odd");
//			}
//			
//		}
		
		
//		// split(regex) - will return us an array of strings -> delimiter we need to split by 
//		
//		String text = "Apple, Pear, Banana, Grape";
//		String [] array = text.split(", ");
//		System.out.println(Arrays.toString(array));
//		
	    String quote = "Challenges are what make life interesting and overcoming them is what makes life meaningful";
		// Save the splitter string to array
		String [] arr = quote.split(" ");
		
		for(int i = arr.length -1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		
		
		
		
		
				
		
		

	}

}
