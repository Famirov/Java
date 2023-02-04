package week15;

import java.util.Scanner;

public class Methodswithreturn5 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("user to enter 2 boolean values");
		System.out.println("enter first boolean: ");
		
		boolean word1 = sc.nextBoolean();
		
		System.out.println("enter second boolean: ");
		
		boolean word2 = sc.nextBoolean();
		
		
		System.out.println(hamletQuote(word1, word2));

		
		
		
		
/*Instructions from your teacher:

Ask user to enter 2 boolean values. Then pass those values to the hamletQuote method.

the hamletQuote method only returns true if one of or both of the boolean parameters is true.

example:

hamletQuote(true, false)

returns true

hamletQuote(false,true)

returns true

hamletQuote(true,true)

returns true

hamletQuote(false,false)

returns false

hint: use the truth table for this one, this can be done with one if and a logical operator.*/		
		
		

	}
	
	
    public static boolean hamletQuote(boolean toBe, boolean notToBe) {
    	
//    	if(toBe == true || notToBe == true) {
//    		return toBe;
//    	}else {
//    		return notToBe;
//    	}
    	
    	
    	boolean result = toBe ? true: notToBe;
		
    	return result;
    	    	 
    }

}







