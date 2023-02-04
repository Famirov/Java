package week17;

import java.util.Scanner;

public class Yuzyetmisuc {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Enter a:");
	    String a = scan.next();
	    
	    System.out.println("Enter b:");
	    String b = scan.next();
	    
	    System.out.println(biggerS(a, b));
	  }
	  
	  public static String biggerS(String a ,String b)  {
	    //your code here
		  
		  String longer = (a.length() > b.length()) ? a : b;
		  
		  return longer.substring(1);
		  
	    
	     
	     
	  }

		
		
		

	

}
