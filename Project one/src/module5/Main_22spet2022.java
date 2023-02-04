package module5;


import java.util.Arrays; // Array is a class name
import java.util.Scanner;// Scanner is a class name

import module5.lesson4.*;//eger asagidakilar basqa pckgda yazilsa bele etmek lazimdir.


public class Main_22spet2022 {
	
	public static void main(String[] args) {
		
		
		
		
		// There are 3 way to import a class from a different package
		
		// Option 1 - use the full path of the class
		// java.util.Scanner scan = new java.util.Scanner(System.in);
		

		// Option 2 - use import statement
		Scanner scan = new Scanner(System.in);
		Arrays.sort(new int[] {1,4,6,3,2});
		

		// Option 3 - use the wild card *
		House h1 = new House();
		Car c1 = new Car();
		Rectangle r1 = new Rectangle();
	
	
	
	// We used built-in packages already when importing predefined classes
//	Scanner scan = new Scanner(System.in);
//	
//	int [] arr = {1,8,3,4,3,6,7};
//	
//	Arrays.sort(arr);
//	
//	
//	Car myCar =new Car();
	

}

	}