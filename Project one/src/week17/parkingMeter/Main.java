package week17.parkingMeter;

import java.util.Scanner;

import Module6.ParkingMeter;

public class Main {
	
/*Instructions from your teacher:

at3 method gets two strings and returns a string.

the first string is the one that will be manipulated. 
at the 3rd char position of target you will insert the word argument.

example use:

at3("longword","foo")

will return: "lonfoogword"

at3("blabla","a")

will return: "blaabla"*/

	public static void main(String[] args) {


	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Enter target:");
	    String target = scan.next();
	    
	    System.out.println("Enter word:");
	    String word = scan.next();
	    
	    System.out.println(at3(target, word));
	  }
	  
	  public static String at3(String target,String word)  {
		  
		  String c1 = "";
		  
			  
		  
		return c1 = c1 + target.substring(0, 3).concat(word)+target.substring(3);
	    //your code here
	    
	    
	 


		
		

	}


}