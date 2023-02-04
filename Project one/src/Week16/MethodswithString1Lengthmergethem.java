package Week16;

import java.util.Scanner;

/*
Instructions from your teacher:

When gears merge and work together, one teeth from each one goes in order.

Write a method mergeStrings that will return the strings merged, 
one letter at a time, starting with one. Please note one and
two can be of different lengths. Please look at below examples:

s1 ==> "12345"

s2 ==> "abcde"

mergeStrings(s1,s2) ==> "1a2b3c4d5e"
						 1a2b3c4d5e

mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
									 

mergeStrings("java", "selenium") ==> "jsaevlaenium"
*/
public class MethodswithString1Lengthmergethem {
	  public static void main(String[] args) {
	
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter string1:");
    String one = scan.next();
    
    System.out.println("Enter string2:");
    String two = scan.next();
    
    System.out.println(mergeStrings(one, two));
	
	
	  } 
    
    
    
    public static String mergeStrings(String one, String two) {
        // your code here  
    	
    	
    	String wordAfter = "";
    	int size = 0;
    	
    	if(one.length()>=two.length()) {
    		size = one.length();
    		
    	}else {
    		size= two.length();
    		
    	}
    	
    	for(int i = 0; i<size; i++) {
    		
    		if(i<one.length()) {
    			wordAfter = wordAfter+one.charAt(i);
    		}
    		
    		if(i<two.length()) {
    			wordAfter = wordAfter+two.charAt(i);
    	
    			
    		}
    		
    	}
		return wordAfter;
    	
    	
    
    }
}
