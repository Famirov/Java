package personalmodules;

import java.util.Arrays;
import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		
/**Instructions from your teacher:

Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:

email -> info@gmail.com

Print:  

Email id: info

Email domain: gmail.com

If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com

print:  

invalid email

email -> my@fancy@email.com

print:  

invalid email****/
		
		
		
//		  Scanner input = new Scanner(System.in);
//		  String email = input.nextLine();
//		 
//		        
////		  String []arr = email.split("@");
//		  String id = email.substring(0,email.indexOf("@"));
//		  String domain = email.substring(email.indexOf("@")+1);
//		 
//		  
//		  System.out.println(id + "\n" +domain);
		
			
		
//		Scanner input = new Scanner(System.in);
//		String email = input.nextLine();
//		
//		
//		int count =0;
//		
//		for (int i = 0; i < email.length(); i++) {
//	        if (email.charAt(i)=='@') {
//	            count++;
//	        }
//					} 
//		
//		if (count !=1) {
//			
//		System.out.println("invalid email");
//		
//		}
//		else
//		{
//			
//		String[]split_email=email.split("@");
//		
//		for (int j = 0; j <= split_email.length; j++) {
//			
//		System.out.println("Email id: "+split_email[j] + "\n"+ "Email domain: " +split_email[j+1]);
//		break;
//		         }
//		System.out.println(split_email.length);
//		System.out.println(Arrays.toString(split_email));
//		    
//		}
		
		
		
		
/**		109. DoWhileLoop - Compute
 * 
 * Instructions from your teacher:

			- Create int variables k and total

			- Use a do...while loop to compute the sum of the squares of the first 50 counting numbers,

			- Store this value in total

			- Thus your code should put 1*1 + 2*2 + 3*3 +... + 49*49 + 50*50 into total

			- Use no variables other than k and total.

			- Print out value of variable total.

			NO NEED FOR ARRAY HERE, JUST LOOP**/
		
		
		
	/**With for loop*/
		
//		int total= 1;
//		
//		for (int k = 1; k<=50; k++) {
//			
//		total = k*k  ;
//		System.out.println(total);
//				
//		} 
		
		
		
		/**With Do While loop*/
		
		
		
//		int k = 1;
//		int total = 1;
//		do {
//			total +=k*k;
//			k++;
//			
//		
//			
//		}while(k<=50); {
//			
//			System.out.println(total);
//		}
		
		
		
		
/***110. WhileLoop - Print * n times
		
		
		Instructions from your teacher:

- Given an int variable n that has already been declared and initialized to a positive value
- Another int variable j that has already been declared
- Use a for loop to print a single line consisting of n STARS.
- Thus if n contains 5, five STARS will be printed
- Use no variables other than n and j.

HINT: NO NEED FOR ARRAY HERE, JUST USE WHILE LOOP

Example:

input: 1
output: *
Example:
input: 3
output: ***
		
		**/		
		
//		
//		int j = 0;
//	    Scanner scan = new Scanner(System.in);
//	    int n = scan.nextInt();
//	    
//	    
//		With for loop	    
//	    for(int j = 0;j<=n; j++) {
//	    	System.out.print("*");
//	    }
//		
//	    while (j<n) {
//	    	j++;
//	    	System.out.print("*");
//	    }
	    
	    
/***139. Methods 1 - simple calculator
 * Instructions from your teacher:

Create a static method called "plus", its return is void and it gets no arguments.

It asks the user to input two numbers, then it will add them and print the result.

Create a scanner within plus method.

Example:

Enter first number

1

Enter second number

2

result: 3*/	    
	
//		plus();
	
/**148
 * 
 * Instructions from your teacher:

Create a method called next3 . 
This method gets an int argument and prints the next 3 numbers after that number.
Call the method from main method and pass num to it.

enter number

1

next 3 are:

2 3 4

(put a space between numbers)**/		
//	
//		
//        Scanner inp = new Scanner(System.in);
//        System.out.print("enter number");
//        int num = inp.nextInt();
//	    next3(num);

	}
	

	
/**148
 * */
	
//public static void next3(int num) {
//	
//	for(int i=0; i<3;i++) {
//		
//		num++;
//		System.out.println(num + " ");
//			
//	}
//	
//	
//}	
	
	
	
	
/**139**/	
//	public static void plus() {
//	Scanner scan = new Scanner(System.in);
//	System.out.println("Enter first number");    
//	int n = scan.nextInt();
//	System.out.println("Enter second number");
//	int m = scan.nextInt();
//	  
//	int total = m+n;
//	System.out.println("result: " + total);
//	
//	}
	
	

	
	

}
