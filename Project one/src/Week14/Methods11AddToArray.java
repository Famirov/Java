package Week14;

import java.util.Arrays;
import java.util.Scanner;

public class Methods11AddToArray {
	
	  public static int[] add_to_r(int[] initialArray,int newNumber) {
			//create new array with one more position.
			//create new array with one more position.
		 int [] newArray = new int [initialArray.length+1];
		    for (int i=0; i<initialArray.length; i++) {
		    newArray[i] = initialArray[i];
		    }
		    newArray[newArray.length-1] = newNumber;
		    System.out.println(Arrays.toString(newArray));
	 
		    return newArray;
		}

	public static void main(String[] args) {
		
		
	    Scanner input = new Scanner(System.in);
	    int size = input.nextInt();
	    int addition = input.nextInt();
	    
	    int[] arr = new int[size];
	    for(int i=0 ;i<size;i++){
	        arr[i]=input.nextInt();
	    }
	 
	    add_to_r(arr, addition);	
		

	}
	
		  
		  
	
/*149. Methods 11 - add to array*/
	
/*Instructions from your teacher:

add_to_r is a method that gets an array and a number.



the method creates a new array bigger by one then (int[] r).

It populates the new array with the old ones(r) values.

and finally in the last position adds the number (int n) to it.

for example:

method input: add_to_r(new int{1,5,77,8}  ,2)

outputs (int array):

[1, 5, 77, 8, 2]

Note: In main method create an array and populate it with the values {1,5,77,8}. 
      Call the method add_to_r and pass the created array and 2 as a parameters.
      Print the result.*/	
	
	
	

}
