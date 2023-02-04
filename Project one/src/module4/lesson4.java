package module4;

import java.util.Scanner;

public class lesson4 {

	public static void main(String[] args) {
		
  // (==) - Equal to
		
//		System.out.println(90 == 90); // true
//		System.out.println(25.5 == 25.5); // true
//		System.out.println(false == true); // false
//		System.out.println('A' == 'B'); // false
		
		// (!=) - Not equal to
//		System.out.println(90 != 90); // false
//		System.out.println(25.5 != 25.5); // false
//		System.out.println(false != true); // true
//		System.out.println('A' != 'B'); // true
		
		// (>) - Grater than
		
//		int a = 10;
//		int b = 9;
//		System.out.println(a > b);
//		
//		double num = 10.9;
//		double num2 = 11.0;
//		boolean result = num2 > num;
//		System.out.println(result); // true
//		System.out.println(num2>num);
//		
		// (<) - Less than
//		int num = 33;
//		int num2 = 20;
//		System.out.println(num < num2); //false
//		
//		char a = 'a';
//		char b = 'b';
//		
//		int asciiA = a;
//		int asciiB = b;
//		System.out.println("The ascii for a is: " + asciiA);
//		System.out.println("The ascii for b is: " + asciiB);
//		
//		System.out.println(a < b);
		
		// (>=) - Grater than or Equal to
		
//		System.out.println(100 >= 100); // true
//		int num = 100;
//		int num2 = num++; // 100
//		System.out.println(num); // 101
//		System.out.println(num2); // 100
//		                 // 101 >= 100
//		System.out.println(num >= num2);
//		
		// (<=) - Less than or Equal to
		
//		int a = -10;
//		int b = -9;
//		
//		System.out.println(a <= b);
		
//		
//		int num=100;
//		int num2 =num++; //100
//		
//		System.out.println(num);//101
//		System.out.println(num2);//100
//		
//							// 101>=100
//		System.out.println(num >= num2);
////		
//		
//				
//		
//		int a = -10;
//		int b = -9;
//		
//		System.out.println(a <= b);
//		System.out.println(101 >= 100);

//		TASK 11
		
//		Print true or false for given equations:
//		2*50+34 is greater than 12*4
//		12+4 is less than or equal to 11+5
//		83*421 is equal to 77*111+ 999
//		121 is not equal to 110+11
		
		
//		#11
//		System.out.println(2*50+34 > 12*4);// true
//		System.out.println(12+4 <= 11+5);// true
//		System.out.println(83*421 == 77*111+999);// false
//		System.out.println(121 != 110+11);// true
//	
				
		
	/*** LOGICAL OPERATORS***/
		
	/**Logical Operators are used with two expressions
	 * It will work only with boolean values	
	 */
		
	// (&&) - Logical AND Operator
	// AND Operators returns true only if both sides are true.	
//		System.out.println(true && true); //true
//		System.out.println(false && true);//false // compiler will use short circuit in this case 1-ci false-dursa hec o birini yoxlamaga gerek yoxdur
//		System.out.println(true && false);//false
//		System.out.println(false && false);//false
//		
//		boolean b1 = true;
//		boolean b2 = !false;
//		
//		System.out.println(b1 && b2);
//		
//		boolean result1 = 100 <= 100;//true
//		boolean result2 = -90 != 90; //true
//		
//		System.out.println(result1 && result2);// true
//		
//		System.out.println(10*5 >= 50 && -90 != -90);//false
		
		
		
		// (||)-Logical OR operator
		// OR operator will return true if any of sides are true
		
//		System.out.println(true || true);// true
//		System.out.println(false || true);//true
//		System.out.println(true || false);//true
//		System.out.println(false || false);//false
//		
//		boolean b1 =true;
//		boolean b2 = true;
//		System.out.println(b1 || b2);
//		
//		
//		System.out.println(true && true); //true
//		System.out.println(false && true);//false
//		
//								//false	   ||   true ---true
//		System.out.println((false && false)|| (true && true));//true
//		
//								//false    &&   true---false
//		System.out.println((false || false)&& (true && true));//false
//		
//		
//		int a = 55;
//		int b = 70;
//				
//							//false && no need to check 2nd
//		System.out.println(a < 50 && a < b);//false
//		
//							//false || true
//		System.out.println(a < b || a < b); //true
//		
		
//		int a = 10;
//		int b = 5;
//		int c =20;
//		//When we use Logical operators compiler will do short circuit, means it will not check the second
//		
//							//false  && true-ama ehtiyac yoxdur baxmaga
//		System.out.println((a < b) && (a++<c)); // false
//							
//		System.out.println(a);
//		
//		System.out.println(a != b || b++ < a);
//		
//		System.out.println(b);
//		
//						//true     && false
//						//10 < 20 		11<5
//		System.out.println((a++<c) && (a < b)); //false
//		
//		System.out.println(a); // 11
//		
		
		/**BITWISE OPERATORS - (&) (|) */
		
		
		/**The main difference between Logical Operators and Bitwise are:
		 * 1. Logical operators use Short-Circuit (kese yol), however the bitwise does not
		 * 2.Logical operaotrs can work only with boolean expression, however, bitwise can work with numbers*/
		
		//ex
		
//		 System.out.println(10 && 20); // Logical operators need both sides as boolean expressions
		 
//		 System.out.println( 10 & 20);
		
		//int a = 10;
		//int b = 5;
		//int c =20;
		
		
//		  System.out.println((a < b) & (a++<c)); // false
//		
//        System.out.println(a); //11
//
//        System.out.println(a != b || b++ < a);//true
//
//        System.out.println(b);//5
		
		
		
//		String text = "109.90";
//		
//		System.out.println(text + 250.0); //109.90250.0 this is concatenation 
//		
		
		
		/** CONVERSIONS */
		
		//There are two ways of converting a String to int/double
		
		/**First Option parseInt() and parseDouble()*/
		
		//Convert a String that holds an numeric value to an integer data type
		// Integer.parseInt();
		
//		String text = "100";
//		
//		int total = Integer.parseInt(text) +20;
//			
//		System.out.println(total);
		
		//Convert a String that holds an numeric value to an double data type
		// Double.parseDouble();
		
//		String text2 = "150.99";
//		
//		Double sum = Double.parseDouble (text2)+10.0;
//		
//		System.out.println(sum);
		
		
//		/**Convert using valueOF()*/
//		
//		String strNumber = "22";
//		
//		int total = 100 +Integer.valueOf(strNumber);
//		System.out.println(total);
//		
//		String strNum = "120.90";
//		double sum = 100.00 + Double.valueOf(strNum);
//		System.out.println(strNum);
//		
//		/**
//		 * The difference between parse methods and valueOf is that:
//		 * parse will automatically convert the value to a primitive data type
//		 * valueoF will first convert to a non primitive data type, then java will do conversion*/
//		
//		String strNum22 = "22";
//		
//		int total1 = Integer.valueOf(strNum22) + 100;
//		System.out.println(total1);
		
		
		
		/**TASK*/
		/**Ask user to enter number.
		 * Receive number as string.
		 * Convert string into integer.
		 * Add 100 to the number
		 * Print false if result is less than 200*/
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter a number: ");
//		
//		String number = sc.nextLine();
//		
//		int convertNumber = Integer.parseInt(number);
//		
//		convertNumber+=100;
//		
//		System.out.println(convertNumber >= 200);
		
		
//		///Ask user to enter number.//
//		 
//		 Scan sc = new Scanner (System.in)
//		 System.out.println("Enter a number: ");
//		
//		 // Receive number as string.
//		  String text = scan.next();
//		  
//		  //Convert string into integer.
//		  int convertedNum = Integer.parseInt(text);
//		  
//		  //Add 100 to the number
//		  convertedNum +=100;
//		  
//		  //Print false if result is less than 200*
//		  System.out.println(convertNum >=200);
		
		
		//DataType.toString();
		
		/* Convert a Data Type to a String */ 
		// We can use three ways
		// String.valueOf()
		
//		int num = 100;
//		String strNum = String.valueOf(num);
//		System.out.println(strNum + 10);
//		
//		double number = 105.99;
//		String strNum2 = String.valueOf(number);
//		System.out.println(strNum2 + 20);
//		
//		// DataType.toString();
//		num = 22;
//		String strNumber = Integer.toString(num);
//		System.out.println(strNumber + 77);
//		
//		number = 100.0;
//		String strNumber2 = Double.toString(number);
//		System.out.println(strNumber2 + 90);
//		
//		// Concatenation
//		int num = 44;
//		String numberString = "" + num;
//		System.out.println(numberString + 33);
//		
//		number = 88.99;
//		String numberString2 = "" + number;
//		System.out.println(numberString2 + 99);
		
		
		/*
		 * Note - When convert a string that contains a boolean then there is no case sensitivity
		 * As long as there are no extra characters the conversion will happen
		 * */
		
//		String strBoolean = "jkshfhbsdru";
//		boolean convertedString = Boolean.parseBoolean(strBoolean);
//		System.out.println("String as Boolean: " + !convertedString);
//		
//		System.out.println(convertedString == false);
//		
		// Three ways of converting a boolean to string
//		boolean myBoolean = false;
//		String strBool = "" + myBoolean;
//		String strBool2 = String.valueOf(myBoolean);
//		String strBool3 = Boolean.toString(myBoolean);
//		
//		System.out.println(strBool + strBool2 + strBool3);
//		
//		int num = 100;
//		String strNum = String.valueOf(num);
//		System.out.println(strNum +10);
//		
//		double number = 105.99;
//		String strNum2 = String.valueOf(number);
//		System.out.println(strNum2 + 20);
		
		


		

		
		
		

		

	}

}
