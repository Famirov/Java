package module8;

import java.util.Scanner;

public class Lesson1 {

	public static void main(String[] args) {
		
		/**
		 * Exception Sources*/
		
//		//1. Out of bounds
//		String [] arr = {"Hey", "Hola", "Salam"};
//		
//		System.out.println(arr[3]);// it will throw an exception
		
		
		//2. Input mismatch
		// if we write 10.5 double instead of the int 10 we will get exception
//		Scanner scan = new Scanner(System.in);
//		int number = scan.nextInt();
//		
//		System.out.println("The value of the number is: " + number);
		
		
		
		//3. File not found
		// FileInputStream fis = new FileInputStream ("fileName 
		
		
		
		/**There are two types of problems that can arise
		 * Error and Exception
		 * 
		 * Error- we cannot handle tem
		 * Exceptions- can be handled
		 * 
		 * Types of Exceptions:
		 * 
		 *1. Checked and 2.Unchecked
		 *
		 *1.Checked
		 * Checked Exceptions are known to the compiler and you will 
		 * not be able to compile them until you handle the exception
		 * 
		 * 
		 * 
		 * 2.Unchecked
		 * occur at runtime and are now shwn/known by compiler
		 * 
		 * **/
		
		
		/* InputMismatchException */
//      Scanner in = new Scanner(System.in);
//		System.out.println("Enter your age:");
//		int age  = in.nextInt();
//		System.out.println("Age: " + age);

		/* ArithmeticException */
//		int a = in.nextInt();	
//		System.out.println(10 / a);

		/* ArrayIndexOutOfBoundsException */
//		int [] arr = {1,2,3};
//		System.out.println(arr[5]);

		/* NullPointerException */
//		String str = null;
//		System.out.println(str.charAt(0));

		/* StringIndexOutOfBoundsException */
//		String str = "Exception";
//		System.out.println(str.charAt(20));

		/* NumberFormatException */
//      String str2 = "20.5";
//      int number = Integer.valueOf(str2);

		/* Common Checked Exceptions */

		/* NoSuchFieldException */
		// Cat cat = new Cat("Garfield");
		// System.out.println(cat.catBreed);
		// We can access a field/method by java methods
		// System.out.println(cat.getClass().getField("catBreed").get(cat));

		/* NoSuchMethodException */
//		System.out.println(cat.getClass().getMethod(null, null));

		/* FileNotFoundException */
		// FileInputStream fis = new FileInputStream("text.txt");

		/* InterruptedException */
		// Thread.sleep(1000);

		/* MalformedURLException */
		// URL url = new URL("https://www.google.com");

		/* SQLException */
		
		
		
		/* How do we handle exceptions?? */
		
		
		
		/* Handle Unchecked Exception */
		
//        Scanner in = new Scanner(System.in);
//		System.out.println("Enter your age:");
		
		
		// Use try keyword and block of code
		// Place inside the code that might be throwing an exception
//		int age = 0;
//		
//		try {
//			
//			 age = in.nextInt();
//			
//		} catch(InputMismatchException e) {
//			
//			System.out.println("You have entered wrong input! Try again:");
//			in.nextLine(); // this is dummy line to skip -buna bir daha bax
//			age = in.nextInt();
//		}
//		
//
//		System.out.println("Age: " + age);
		
				
		/* How do we handle exceptions?? */
		
		
		
		/* Handle Unchecked Exception */
		
//        Scanner in = new Scanner(System.in);
//		System.out.println("Enter your age:");
//		
//		
//		// Use try keyword and block of code
//		// Place inside the code that might be throwing an exception
//		int age = 0;
//		
//		try {
//			
//			 age = in.nextInt();
//			
//		} catch(InputMismatchException e) {
//			
//			System.out.println("You have entered wrong input! Try again:");
//			in.nextLine();
//			age = in.nextInt();
//		}
//		
//
//		System.out.println("Age: " + age);
		
		
		
//		int a = 10;
//		int b = 0;
//
//		// Notice, we cannot use try as a stand alone block
//		// It has to have at least one catch block of finally block
//
//		try {
//
//			System.out.println(a / b); // try block always gets executed
//
//		} catch (Exception e) {
//            
//			// The catch block is only executed when an exception occurs
//			System.out.println("You cannot divide by 0!");
//			System.out.println(e.getMessage());
//			// e.printStackTrace();
//
//		}
//
//		System.out.println("It worked!"); // yes it is printed even we have an exception
		
		
		
		
		
		/*Task*/
/* Create a string and assign null to it 
 * Print 2nd character of that string
 * Handle the exception with try catch block
 * print exception details*/		

		
//		String str = null;
//		
//		try {
//			System.out.println(str.charAt(1));
//		}catch(Exception e){ 
//			System.out.println("No such character");
//			
//		}
		
		
		/*Finally*/
		
/* finally block appears at the end of the try-catch block
 * The code in the finally block always executes, no matter if exception occurs or not.*/
		
		// Online Library Store
		// Multiple catch blocks
//			Scanner in = new Scanner(System.in);
			
			
//			String [] books = {"Atomic habits","Java","Fathers and sons", "Crime and punishment", "Angels and Demons"};
//			
//			System.out.println("Welcome to online library!");
//			System.out.println("Here are available books");
//			System.out.println(Arrays.toString(books));
//			System.out.println("Enter what book number you want?");
//			
//			int bookNumber;
//			
//			try {
//			     bookNumber = in.nextInt();
//			     System.out.println("You got " + books[bookNumber-1]);
//			     System.out.println("Create a connection to online store");
//			     
//			}catch (InputMismatchException e) {
//				
//				System.out.println("You have to enter the book number based ob availability!");
//				
//			}catch(ArrayIndexOutOfBoundsException e) {
//				
//				System.out.println("We do not have that book number");
//				System.out.println("The last book number in our library is: " + books.length);
//				
//			}finally {
//				
//				System.out.println("Thank you for visiting our library");
//				System.out.println("Log out and close connection..");
//				
//			}
			
			// Using one catch block with multiple exceptions
//			String [] books = {"Atomic habits","Java","Fathers and sons", "Crime and punishment", "Angels and Demons"};
//			
//			System.out.println("Welcome to online library!");
//			System.out.println("Here are available books");
//			System.out.println(Arrays.toString(books));
//			System.out.println("Enter what book number you want?");
//			
//			int bookNumber;
//			
//			try {
//			     bookNumber = in.nextInt();
//			     System.out.println("You got " + books[bookNumber-1]);
//			     System.out.println("Create a connection to online store");
//			     
//			}catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
//				
//				System.out.println("You have to enter the book number based ob availability!");
//				e.printStackTrace();
//				
//				
//			}finally {
//				
//				System.out.println("Thank you for visiting our library");
//				System.out.println("Log out and close connection..");
//				
//			}
		
		
		// Here we need to handle the exception we have postponed with throws keyword in method hardWait()
				// We can use try catch block or can even postpone again which is not a good behavior
//				 hardWait(5);
				

				
			}
			
			// The throws keyword is used to postpone the exception handling
//			public static void hardWait(int seconds) throws InterruptedException {
				
				// First option to handle exceptions is try catch
//				try {
//				    Thread.sleep(seconds * 1000);
//				} catch (InterruptedException e) {
//				    e.printStackTrace();
//				}
				
				// Second option is to postpone with throws keyword
//				Thread.sleep(seconds * 1000);
//			}
		
		
		
		

		
		
		
		
		
	}


