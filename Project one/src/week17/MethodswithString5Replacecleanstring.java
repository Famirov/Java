package week17;

import java.util.Scanner;

public class MethodswithString5Replacecleanstring {
	
	
/*Instructions from your teacher:

This method gets two strings (text and badWord) and returns a string.

basicly what it dose is take out all the occurrences of badWord in text.

for example:

clean ("oneTwoThree","Two")

returns "oneThree"

clean ("fooBar","foo")

returns "Bar"

clean ("heSaidBlaBlaBla","Bla")

returns "heSaid "

hint:

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#replace(char,%20char)*/	

	public static void main(String[] args) {
		
		
	
		   Scanner scan = new Scanner(System.in);
		    
		    System.out.println("Enter text:");
		    String text = scan.next();
		    
		    System.out.println("Enter badWord:");
		    String badWord = scan.next();
		    
		    
		    System.out.println(clean(text, badWord));
		  }
		  
public static String clean (String text, String badWord) {
		// your code 
	
		String cleanText ="";
	
//		for(int i = 0; i<text.length(); i++) {
//			
//			if(text.contains(badWord)) {
//				
//				cleanText = text.replace(badWord, cleanText); 
//				break;
//				
//			}
//		}
	
	
	
	
		return cleanText = text.replace(badWord, cleanText);
		    
	
	
	
	
	
				
		 
	 }
		
	
		


}
		
		
		
		
		

		

