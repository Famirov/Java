package week15;

import java.util.Scanner;

public class Methodswithreturn73locks {

	public static void main(String[] args) {

/*Instructions from your teacher:

This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true or 3 booleans are true.

Note: https://en.wikipedia.org/wiki/Truth_table

Example:

a-->true

b-->true

c-->false

output:

true*/	
		
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Boolean Value a:");
        boolean a = input.nextBoolean();
 
        System.out.println("Enter Boolean Value b:");
        boolean b = input.nextBoolean();
        
        System.out.println("Enter Boolean Value c:");
        boolean c = input.nextBoolean();

		
        System.out.println(threeLocks(a, b, c));
		
		

	}
	
	public static boolean threeLocks(boolean a, boolean b, boolean c) {
		
        // your code here
		
//		if (a== true && b== true || c == true ) {
//			return true;
//			}else {
//			return false;
//		}
			
		
		
		return a ? true: b?true:c;
	
		
 

    }//end th

}
