package personalmodules;

import java.util.Scanner;

public class HomeTask10 {

	public static void main(String[] args) {

/**Instructions from your teacher:

# **Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = .** 

Example:

input: javapython

output: true

Example:

input: cjavac++

output: true

Example:

input: c#javaruby

output: false**/
		
		
//		Scanner scan = new Scanner(System.in);
//		
//		String word = scan.nextLine();
//		
//		String w = "java";
//		
//		boolean yay = true;
//		
//		
//		if (word.substring(0,w.length()).contains(w) || (word.substring(1,1 + w.length()).contains(w))){
//			System.out.println(yay);
//		}else {	
//			System.out.println(!yay);
//		}
				
		
		
		
/**Instructions from your teacher:

Return the number of times that the string "java" appears anywhere in the given string word.

Example:

input: javaxjava

output: 2

Example:

input: javaxjavaapplepearjavaegg

output: 3**/
		
		
//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//			
//		String j = "java";
//		
//		int count =0;
//		
//		for(int i =0; i<=word.length()-j.length(); i++) {
//			
//			if (word.substring(i, i+ j.length()).equals(j)) {
//				count++;
//			}
//						
//		}
//		
//			System.out.println("output: " + count );
			
			

/**Instructions from your teacher:

Print out the number of times that the string "hi" appears anywhere in the given string.

Example:

input: abc hi how hi

output: 2

Example:

input: hi code java please

output: 1**/

		
	      Scanner scan = new Scanner(System.in);
	      String str = scan.nextLine();
	      
	      String w = "hi";
	      int count = 0;
	      
 
	      for (int i =0; i<= str.length()-w.length(); i++) {
	    	  
	    	  if(str.substring (i,i+w.length()).contains(w)){
	    		  
	    	  count++;
	    	  }
	    	  
	    	  
	      }System.out.println(count);
		

		
/**Instructions from your teacher:

Given a string, consider the prefix string made of the first n chars of the string. 
Does that prefix string appear somewhere else in the string?

Assume that the string is not empty and that n is in the range from 1 till str.length().

Example:

input: abXYabc

input: 1

output: true

a appears twice

Example:

input: abXYabc

input: 2

output: true

ab appears twice

Example:

input: abXYabc

input: 3

output: false

abX appears once only**/		

		
		

		
		
		
		
	}

}
