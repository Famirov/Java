package personalmodules;

import java.util.Random;
import java.util.Scanner;

public class hometaskWeek7 {

	public static void main(String[] args) {

/**Step 1: Declare first variable and assign a 'random number'

Step 2: Declare second variable and assign a 'job title'

Step 3: Print the code as shown: Development average salary: 1000.0

Hint: + symbol puts multiple strings together (its called concatenation)*/
		
		
//		Random rand = new Random();
//		
//		int salary = rand.nextInt();
//						
//		String DEPARTMENT= "tester";
//		
//		System.out.println(DEPARTMENT + " average salary: " + salary);
		
		
/**Instructions from your teacher:

Write a program that will print out first half of the word twice.

Example for even number words

input: java
output: jaja


Example for odd number words 

input: black
output: blbl */		
		
//	    Scanner scan = new Scanner(System.in);
//	    String word = scan.next();
	    
	    
	    

	 
	    
//	    if((word.length()%2)==0) {
//	    	
//	    	System.out.println((word.substring(0, word.length()/2))+ (word.substring(0, word.length()/2)));
//	    	
//	    }else {
//	    	System.out.println((word.substring(0, ((word.length()-1)/2))+ (word.substring(0, ((word.length()-1)/2)))));
//	    }
	    
	    
	    
		
/**
 *  For you to do:

Given a string variable "word", do the following tests

If the word ends in "y", print "-ies"

If the word ends in "ey", print "-eys"

If the word ends in "ife", print "-ives"

If none of the above is true, print "-s"

No more than one should be printed.*/	
		
		
//        Scanner inp = new Scanner(System.in);
//        System.out.print("In:");
//        String word = inp.nextLine();
//        
//        
//           	
//        	if (word.endsWith("y")&& !word.endsWith("ey")) {
//        		
//        		System.out.println("-ies");
//        		
//        		
//        	}else if (word.endsWith("ey")) {
//        		
//        		System.out.println("-eys");
//        		
//        		
//        	}else if (word.endsWith("ife")) {
//        		
//        		System.out.println("-ives");
//        	
//        		
//            }else {
//        		
//        		System.out.println("-s");
//        		
//            }
        
/**Instructions from your teacher:

Alejandro have started learning java, he knows what you know about ifs and strings.

He has a large number of text emails, going trough all of them will take a lot of time.

to save time he will only read the emails that refer to him by name.

He wants to write a program that takes the email content as string and if his name "alejandro" exists in email content, then program prints "read this mail" else it will output "don't read".

for example:

a = "dear alejandro.....alot of text"

outputs: "read this mail"

a = "thunder blaz is the best drink in the galaxy..."

outputs: "don't read"

a = "subject : important project, alejandro we refer to you  this ...."

outputs: "read this mail"*/     
		
		
//        Scanner s = new Scanner(System.in);
//        String a = s.nextLine();
//        
//        String expectedA = "alejandro";
//        
//        if(a.contains(expectedA)) {
//        	
//        	System.out.println("read this mail");
//        	
//        }else {
//        	
//        	System.out.println("don't read");
//        }

/**Instructions from your teacher:

Alejandro's time is precious, and even with his little knowledge of programming he managed to save some time. But still he had a lot of emails to read.

He wants to add more conditions to his program, he wants only job related mails, so he will narrow it down by also checking if the word "project" and also his name exists in emails, 
that way he will be sure its a job email that refers to him

If email is job related then display "read this mail" in console otherwise print "don't read"

a = "dear Alejandro.....alot of text"

outputs: "don't read"

a = "thunder blaz is the best drink in the galaxy..."

outputs: "don't read"

a = "subject : important project, Alejandro we refer to you  this ...."

outputs: "read this mail"*/		

		
//      Scanner s = new Scanner(System.in);
//      String a = s.nextLine();
//		
//        
//       if(a.contains("Alejandro") && a.contains("project")) {
//        	
//        	System.out.println("read this mail");
//        	
//        }else {
//        	
//        	System.out.println("don't read");
//        }
		
		
		
/**Instructions from your teacher:

In this task, you need to swap first name with last name in the email.
If email doesn't contain underscore - don't change anything

Example:

input: mike_tyson@gmail.com

output: tyson_mike@gmail.com

Example:

input: barakobama@gmail.com

output: barakobama@gmail.com*/		
		
		


		
		
		
//        //DO NOT CHANGE HERE
//        Scanner scan = new Scanner(System.in);
//        String email = scan.next();
//        // Your code here
//        
//
//        
//        if (email.contains("_")) {
//        	String var1 = email.substring(0,email.indexOf('@'));
//            String var2 = var1.substring(0,var1.indexOf('_'));
//            String var3 = var1.substring(var1.indexOf('_')+1,email.indexOf('@'));
//            String var4 = email.substring(email.indexOf('@'));
//
//        	
//        	System.out.println(var3 + "_" + var2 + var4);
//        }else {
//        	
//        	 System.out.println(email);
//        }
		
		
/**Instructions from your teacher:

Write a program that will print out information (First name, Last name, Domain, Top-Level Domain) about user based on email.

first and last name should start with the upper case like in example.

**Example:**

**Input: craig_federighi@apple.com**

**Output:** 

**First name: Craig**

**Last name: Federighi**

**Domain: apple**

**Top-Level Domain: com***/		
		
		
//		Scanner scan = new Scanner(System.in);
//		String email = scan.next();
//		
//		String firstName = email.substring(0,email.indexOf('_'));
//		
//		
//		String lastName = email.substring(email.indexOf('_')+1,email.indexOf('@'));
//		
//		
//		String domain = email.substring(email.indexOf('@')+1,email.indexOf('.'));
//		
//		
//		String topLevelDomain = email.substring(email.indexOf('.')+1,email.length());
//		
//		
//		
//		
//			
//	
//		System.out.println("First name: " + firstName.toUpperCase().charAt(0)+ firstName.substring(1));
//		
//		System.out.println("Last name: " + lastName.toUpperCase().substring(0,1)+lastName.substring(1));
//
//		System.out.println("Domain: " + domain);
//                
//		System.out.println("Top-Level Domain: " + topLevelDomain);
        
       
		
/**Instructions from your teacher:

We have a message variable already declared and assigned value in this format

Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

Variables are already declared:

sender, phoneNumber, messageBody

by using String methods: retrieve related information from SMSmessage string and assign to those 3 variables.

-print each variable in separate line

Sender: Mike Smith

Phone Number: 202-123-3456

Message body: I love programing and problem solving*/
		
		
		
//        String message = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
//
//        String sender, phoneNumber, messageBody;
//        
//        
//        String s1 = message.substring(message.indexOf('<')+1,message.indexOf('>'));
//        
//              
//        String s2 = message.substring(message.indexOf('[')+1,message.indexOf(']'));
//             
//		
//        String s3 = message.substring(message.indexOf('{')+1,message.indexOf('}'));
//        
//       	
//		
//        
//        System.out.println("Sender: " + s1);
//        
//        System.out.println("Phone Number: " + s2);
//        
//        System.out.println("Message body: " + s3);
     
        
        
        
        
        
//      String a = "Love";  
//      String b = "You";  
//      System.out.println("Before swap: " + a + " " + b);  
//      a = a + b;  
//      b = a.substring(0, a.length() - b.length());  
//      a = a.substring(b.length());  
//      System.out.println("After : " + a + " " + b);  
  
        
		
		
//		String name = "John";
//		for(int i = 1; i < Math.min(name.length(), 4); i++){
//		    System.out.print(name.charAt(i));
//		}
	
		



	}

}
