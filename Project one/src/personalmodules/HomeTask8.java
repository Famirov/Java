package personalmodules;


import java.util.Arrays;
import java.util.Scanner;

public class HomeTask8 {
	
	// Put this code on a Class scope 
//	public static String reverseString(String str) {
//		if (str.length() <= 1) {
//			return str;
//		}
//		return reverseString(str.substring(1)) + str.charAt(0);
//	}

	public static void main(String[] args) {

		/**
		 * Instructions from your teacher:
		 * 
		 * You have 2 words
		 * 
		 * Print the first word, second word, second word, first word
		 * 
		 * Input:
		 * 
		 * one
		 * 
		 * two
		 * 
		 * Output:
		 * 
		 * onetwotwoone
		 */

//        Scanner scan = new Scanner(System.in);
//        String word1 = scan.next();
//        String word2 = scan.next();
//        
//        
//        System.out.println(word1.concat(word2)+word2+word1);

		/**
		 * Instructions from your teacher:
		 * 
		 * You have a word, do the following:
		 * 
		 * When word has odd number of characters and:
		 ** 
		 * - 3 or more characters,** print middle letter oak ==> a javav ==> v -
		 * **Single character,** print that character 3 times # ==> ### q ==> qqq When
		 * word has even number of characters and:
		 * 
		 * - **4 or more characters**, print middle 2 java ==> av apples ==> pl #$%^&*
		 * ==> %^
		 * 
		 * 2 characters, print those 2 characters twice
		 * 
		 * @@ ==>@@@@ $$ ==>$$$$ hi ==> hihi
		 */

//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//        
//        int len = word.length();
//        
//        int middle = len/2;
//        
//        int middle1 = len/2 +1;
//        
//    
//
//			if(len >=3 && len %2 != 0) {
//				System.out.println(word.charAt(middle));
//						
//			}else if(len==1) {
//				for(int i=0; i<3; i++) {
//				System.out.print(word);
//			}
//				
//			}else if(len>=4 && len%2 ==0) {
//				System.out.println(word.substring(middle-1,middle1));
//			}else if (len==2){
//				for(int i=0; i<4; i=i+2) {
//					System.out.print(word);
//				}
//			}

		/**
		 * Instructions from your teacher:
		 * 
		 * You have a word, do the following:
		 * 
		 * If the word has odd number of characters
		 * 
		 * and has 5 or more characters, print the middle three
		 * 
		 * characters of the word.
		 * 
		 * Otherwise print "invalid".
		 * 
		 * fifteen ==> fte
		 * 
		 * apple ==> ppl
		 * 
		 * hey ==> invalid
		 * 
		 * java ==> invalid
		 * 
		 * whatsup ==> ats
		 * 
		 * $ ==> invalid
		 */

//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//        
//        int len = word.length();
//        
//        int middle = len/2;
//        
//        
//		
//		if(len%2!=0 && len>=5) {
//			System.out.println(word.substring(middle-1,middle+2));
//		}else {
//			System.out.println("invalid");
//		}
//		

		/**
		 * Instructions from your teacher:
		 * 
		 * You have 2 words, both of them have 3 characters.
		 * 
		 * If either of them does not have exactly 3 characters, print "cannot merge"
		 * 
		 * Merge their characters one by one and print together like below:
		 * 
		 * 
		 * input 1: aok input 2: lol output: alookl
		 */

//        Scanner scan = new Scanner(System.in);
//        String word1 = scan.next();
//        String word2 = scan.next();
//        
//        int len1 = word1.length();
//        int len2 = word2.length();
//        
//		
//        
//        if(len1==3 && len2==3) {
//        	for(int i =0; i<word1.length();i++) {
//        	String merge= word1.charAt(i)+""+word2.charAt(i);
//        	System.out.print(merge);
//        	}
//        }else {
//        	System.out.println("cannot merge");
//        }

		/**
		 * Instructions from your teacher:
		 * 
		 * Write a program that will reverse a string. Your program should reverse a
		 * string only 5 characters long. If word is shorter, display message: "Too
		 * short!". If word is longer, display message: "Too long!". Otherwise, reverse
		 * this word and print out result into the console.
		 * 
		 * Example:
		 * 
		 * input: cat
		 * 
		 * output: Too short!
		 * 
		 * Example:
		 * 
		 * input: singularity
		 * 
		 * output: Too long!
		 * 
		 * Example:
		 * 
		 * input: apple
		 * 
		 * output: elppa
		 */

//		Scanner scan = new Scanner(System.in);
//		String word = scan.next();
//
//		String reverse = "";
//
//	
//
//		if (word.length() == 5) {
//			for (int i = word.length()-1; i >= 0; i--) {
//				
//				reverse = reverse + word.charAt(i);
//			}
//			System.out.println(reverse);
//
//		} else if (word.length() < 5) {
//			System.out.println("Too short!");
//		} else {
//			System.out.println("Too long!");
//		}

		
/**Instructions from your teacher:

Write a program that will print out route instructions. 
Your program should take 2 parameters: start point and end point. 
Use left, right, up and down for navigation. Insert ">" between commands.
If start point equals to end point - display:

"start/end(start or end variable!) found"(See the example).

Note: you may move only clock wise.

//		A---right---B      right > down > left: D found
//	    |           |
//	   up          down
//	    |           |
//	    D---left--- C

Example:

Input: A

Input: D

Output: right > down > left: D found

Input: B

Input: D

Output: down > left: D found

Input: C

Input: C

Output: C found*/		
		
		
//		    Scanner scan = new Scanner(System.in);
//		    String start = scan.next();
//		    String end = scan.next();
		    

//		    if(start.equals("A") && end.equals("D")) {
//		    	System.out.println("right > down > left: " + end + " found");
//		    	
//		    }else if (start.equals("B") && end.equals("D")) {
//		    	System.out.println("down > left: " + end + " found");
//		    	
//		    }else if (start.equals("C")&& end.equals("D")) {
//		    	System.out.println("left: " + end +" found");
//		    }
		    
//		    String[] array = {start, end};
//		    
//		   
//		    for(int i=0; i<array.length-1; i++) {
//		    	if(start.equals(end)) {
//		    		System.out.println(end+ " found");
//		    	}else if(start.equals("B")) {
//		    		System.out.println(end + " found");
//		    		
//		    		
//		    	}
//		    }
		    	
		
		    

		
		    
//		    for (int i = 0; i<start.length(); i++) {
//			    if(start.charAt(i)==end.charAt(i)) {
//			    	System.out.println(end + " found");
//			    }else if (start.charAt(i)<end.charAt(i)) {
//			    	System.out.println("right > down > left:"+ end +" found");
//			    }else if ()
//		    }
		
		    
		    

	    
	   
//		    String route = "";
//		    
//		    
//		      
//		    
//		      for (int i=0; i<4; i++) {
//		        
//		        if (start.equals(end)){
//		          if (i!=0){
//		            route = route.substring(0,route.length()-3);
//		            System.out.println(route + ": " + start + " found");
//		          } else {
//		            System.out.println(route + start + " found");
//		          }
//		          break;
//		        } 
//		        
//		        if (start.equals("A")){
//		          route = route + "right";
//		          start = "B";
//		        } else if (start.equals("B")){
//		          route = route + "down";
//		          start = "C";
//		        } else if (start.equals("C")){
//		          route = route + "left";
//		          start = "D";
//		        } else {
//		          route = route + "up";
//		          start = "A";
//		        }
//		        route = route + " > ";
//		        
//		      }
	      
		    
/**Inputs:

int end;

Write a for loop that will print out the numbers starting at 1 and ending at the input inclusive. The numbers printed should all be on the same line separated by a space.

Sample inputs/outputs:

In: 5
1 2 3 4 5

In: 10
1 2 3 4 5 6 7 8 9 10

In: -5

(no output)*/	
		
		
		    
//		    Scanner inp = new Scanner(System.in);
//		    System.out.print("In:");
//		    int end = inp.nextInt();
//		    
//		   
//
//		    	
//		    		
//		    	if(end >0) {
//		    		for(int i=1; i<=end; i++) {
//		    			System.out.print(i + " ");
//		    			
//		    		}
//		    		
//		    	}else {
//		    		System.out.println("no output");
//		    	}
		    					    		   			    	
		   
	      

		
//	    int weeks = 3;
//	    int days = 7;
//
//	    // outer loop prints weeks
//	    for (int i = 1; i <= weeks; ++i) {
//	      System.out.println("Week: " + i);
//
//	      // inner loop prints days
//	      for (int j = 1; j <= days; ++j) {
//	        System.out.println("  Day: " + j);
//	      }
//	    }
		
		
		
		/**Nested For loops example*///--Use it with 2D arrays
		
		
//		for (int i =0; i<5; i++) {
//			System.out.println (" Cold");//5 time Cold
//		}
//		System.out.println("-------------------------");
//		
//		// One dimentional Array
//		
//		String [] colors = {"Red", "Blue", "Green", "Pink", "Red"};
//		
//		for(int i=0; i < colors.length; i++) {
//			System.out.println(colors[i]);
//		}
//		System.out.println("-------------------------");
//		
//		// 2D arrays loops
//		
//		String [][] color = {{"Red", "Blue", "Green", "Pink", "Red"},
//							 {"Yellow", "Dark Blue",  "Purple"}};
//		
//		
//		for (int row=0; row<color.length; row++) {// first we have to do rows---2 dene row var
//			for(int column=0; column<color[row].length; column++) {
//				
//				System.out.print(color[row][column]+ " ");
//			}
//			 	System.out.println();
//		}	
		    
	
		//2D arrays Loop
		
//		int [][] nums = {{1,2,3},
//						{4,5,6},
//						{7,8,9}};
		
		
//		for(int row=0; row<nums.length; row++) {//3 dene row var
//			
//			for(int column=0; column<nums[row].length; column++ ) {
//				
//				System.out.print(nums[row][column]+ " ");
//			}
//				System.out.println( );
//		    }
		
		


//		// get average
//		
//		int [][] num = {{7,5,3},
//				{9,5,6},
//				{7,8,8}};
//		
//		double total =0;
//		int value =0;
//		
//		for(int row=0; row<num.length; row++) {
//			for(int column=0; column<num[row].length; column++ ) {
//				
//				value = num[row][column];
//				total = total + value;
//							
//			}
//			
//		}
//		System.out.println(total/(num.length * num[0].length));
//		
		

		
		
//		// This goes to main method
//		System.out.println(reverseString("Ferhad"));


		
		// get minimum and maximum
//		int[] arr = { 5, -9, 77, 4, 1, 55, 100, 34, 7, -4};
//		int max1 = arr[0]; 
//		int max2 = max1;
//		for (int i= 0; i< arr.length; i++) {
//			if(max1 < arr[i]) {
//				max2 = max1;
//				max1 = arr[i];
//			}
//		}
//		System.out.println(max1);
//		System.out.println(max2);
//		
//		
//		
//		int[] arry = { 5, -9, 77, 4, 1, 55, 100, 34, 7, -4};
		
		
		
//        int num = 0;
//      //Write Your code Here
//      
//      
//      
//       while(num<=50){
//       System.out.println(num);
//       num++;
//      }
		
		
//		Instructions from your teacher:
//
//			In this exercise you get a string called txt .
//
//			output txt without its last letter.
//
//			for example:
//
//			txt = "foo"
//
//			output will be:
//
//			fo
		
			
//        Scanner s = new Scanner(System.in);
//        String txt = s.next();
//        //your code here
//        
//        String newtxt = "";
//        
//       	  // Option 1       	
////        System.out.print(txt.substring(0,txt.length()-1));
//        
//        
//          // Option 2
//        for(int i=0; i<txt.length()-1; i++) {
//        	newtxt +=txt.charAt(i);
//        }
//        System.out.println(newtxt);
		
		
		
/**Instructions from your teacher:

# Online Book Merchants offers premium customers 1 free book 
with every purchase of 5 or more books and offers 2 free books with every purchase of 8 or more books. 
It offers regular customers 1 free book with every purchase of 7 
or more books, and offers 2 free books with every purchase of 12 or more books. 

#     Write a program that assigns freeBooks the appropriate value based on the values
of the boolean variable isPremiumCustomer and the int variable nbooksPurchased.
Print amount of freeBooks into the console. */		
		
		
		
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Are you Premium Customer?");
//        boolean isPremiumCustomer = scan.nextBoolean();
//        System.out.println("How many books did you purchase?");
//        int nbooksPurchased = scan.nextInt();
//        
//        int freeBook = 1;
//        	
//        if (isPremiumCustomer) {
//			if (nbooksPurchased >= 8) {
//				freeBook++;
//				System.out.println(freeBook);
//			} else if (nbooksPurchased < 8 && nbooksPurchased >= 5) {
//				
//				System.out.println(freeBook);
//			} else {
//				--freeBook;
//				System.out.println(freeBook);
//			}
//		}
//        
//        if (!isPremiumCustomer) {
//			if (nbooksPurchased >= 12) {
//				freeBook++;
//				System.out.println(freeBook);
//			} else if (nbooksPurchased < 12 && nbooksPurchased >= 7) {
//				
//				System.out.println(freeBook);
//			} else {
//				--freeBook;
//				System.out.println(freeBook);
//			}
//		}
        
        
		
		
/**Instructions from your teacher:

Print true if the string "cat" and "dog" appear the same number of times in the given string word.

Example:

input: catdog

output: true

Example:

input: catcat

output: false

Example:

input: cat-cheetah-dog-cat

output: false*/

		
//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//        //Write Your code here
//        
//       String c = "cat";
//       String d = "dog";
//       
//       int numc =0;
//       int numd =0;
//
//       
//       		
////    	   if(word.substring(0,word.length()).contains(d) == word.substring(0,word.length()).contains(c)) {
//       
//       		   if (c.equals(d)) {
//    		   for(int i =0; i<word.length(); i++) {
//    			   numc++;
//    			   
//    		   }
//    		   
//    		   System.out.println(numc);
//    	   }
        
        
        
		
/**Instructions from your teacher:

In this assignment, you will write a program that will generate a shopping list. It's more advanced version of assignment #22 (Shopping list I).
Your program should ask use to enter items followed by its price. After adding item, ask user if he wants to add one more item.
If Yes, repeat previous steps again. If no, print shopping list report and total price as show in examples. Your program should accept
up to 10 items.
Hint: use do while loop.

_Example:_

_output: Enter Item1 and its price:_

_input: Tomatoes_

_input: 5.5_

_output: Add one more item?_

_input: yes_

_output: Enter Item2 and its price:_

_input: Cheese_

_input: 3.5_

_output: Add one more item?_

_input: yes_

_output: Enter Item3 and its price:_

_input: Apples_

_input: 6.3_

_output: Add one more item?_

_input: no_

_output: Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3_

_output: Total price: 15.3_

_Example:_

_output: Enter Item1 and its price:_

_input: Lemons_

_input: 2.3_

_output: Add one more item?_

_input: yes_

_output: Enter Item2 and its price:_

_input: Oranges_

_input: 6_

_output: Add one more item?_

_input: no_

_output: Item1: Lemons Price: 2.3, Item2: Oranges Price: 6.0_

_output: Total price: 8.3_*/		
		
		
//		Scanner scan = new Scanner(System.in);
//		
//		
//		
//		
//		double total = 0.0;
//		int count = 1;
//		String answer = "yes";
//		
//		
//		
//		
//		do {
//			System.out.println("Enter Item" + count + " and its price: ");
//			String item = scan.next();
//			count++;
//			double price = scan.nextDouble();
//			total += price;
//			System.out.println("Add one more item?");
//			
//			System.out.println("Enter Item" + count + " and its price: ");
//			
//		} while (count<=10);
//			System.out.println("Item"+ count +": " + "Item" +count);
//			System.out.println("Total price: " + total);
	
		
	
		
		
             	
        	        	        	    
//		Scanner scan = new Scanner(System.in);

//		double total = 0.0;
//		int itemNo = 1;
//		String userAnswer;
//		String shopingCart = "";
//
//		do {
//			System.out.println("Enter Item" + itemNo + " and its price:");
//			String item = scan.next();
//			double itemPrice = scan.nextDouble();
//			shopingCart += ("Item" + itemNo + ": " + item + " Price: " + itemPrice + ", ");
//			itemNo++;
//
//			total = total + itemPrice;
//			System.out.println("Add one more item?");
//			userAnswer = scan.next();
//
//		} while (userAnswer.equalsIgnoreCase("yes"));
//		System.out.println(shopingCart.substring(0, shopingCart.length() - 2));
//		System.out.println("Total price: " + total);

        	
        	
        
  
		
/**Instructions from your teacher:

A variable inhabitants represents population of a city. City might have a population of 0 due to
a pandemic zombie disease that is wiping away the human lives. 
After each day, a city will lose half of its population.
write a program to loop the city population and make it lose half of its population until no humans left.

Print the each day like below for each day:

Hint: you might consider creating two int variables, inhabitants and days...

example1- inhabitants is 6

Day 0 -> 6

Day 1 -> 3
 
Day 2 -> 1

---- EXTINCT ----

example2- inhabitants is 0

---- EXTINCT ----

example3- inhabiants is 20

Day 0 -> 20

Day 1 -> 10

Day 2 -> 5

Day 3 -> 2

Day 4 -> 1

---- EXTINCT ----**/		
		
		
		
		
//		Scanner sc = new Scanner (System.in);
//		
//		System.out.println("How many inhabitans are there? ");
//		
//		int inhabitants = sc.nextInt();
//		
//		
//		int day = 0;
//				
//		
//		while (inhabitants > 0) {
//			
//			
//			System.out.println("Day " + day + " ->" + inhabitants );
//			inhabitants = inhabitants/2;
//			day++;
//			
//			
//			
//		}
//		 System.out.println("---- EXTINCT ----");
//				
		

		
		/**Instructions from your teacher:

		In this assignment, you will write a program that will generate a shopping list. It's more advanced version of assignment #22 (Shopping list I).
		Your program should ask use to enter items followed by its price. After adding item, ask user if he wants to add one more item.
		If Yes, repeat previous steps again. If no, print shopping list report and total price as show in examples. Your program should accept
		up to 10 items.
		Hint: use do while loop.

		_Example:_

		_output: Enter Item1 and its price:_

		_input: Tomatoes_

		_input: 5.5_

		_output: Add one more item?_

		_input: yes_

		_output: Enter Item2 and its price:_

		_input: Cheese_

		_input: 3.5_

		_output: Add one more item?_

		_input: yes_

		_output: Enter Item3 and its price:_

		_input: Apples_

		_input: 6.3_

		_output: Add one more item?_

		_input: no_

		_output: Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3_

		_output: Total price: 15.3_

		_Example:_

		_output: Enter Item1 and its price:_

		_input: Lemons_

		_input: 2.3_

		_output: Add one more item?_

		_input: yes_

		_output: Enter Item2 and its price:_

		_input: Oranges_

		_input: 6_

		_output: Add one more item?_

		_input: no_

		_output: Item1: Lemons Price: 2.3, Item2: Oranges Price: 6.0_

		_output: Total price: 8.3_*/	
		
		
//		Scanner scan = new Scanner(System.in);
//		
//
//		I declared them outside of the scopes of loop and reassign them inside of it
		
//		String item;
//		double price = 0;
//		int count = 1;
//		double totalPrice = 0;
//		String expectedAnswer ="yes";
//		String userAnswer;
//		String shopingCart = "";
//		
//		
//		do {
//			System.out.println("Enter Item" + count +" and its price:");
//			
//			item = scan.next();
//			price = scan.nextDouble();
//			
//			
//			shopingCart = shopingCart + ("Item" + count + ": " + item + " Price: " + price + ", ");
//			count++;
//			
//			totalPrice = totalPrice+price;
//			
//			System.out.println("Add one more item?");
//			userAnswer = scan.next();
//			
//			
//		}while(userAnswer.equalsIgnoreCase(expectedAnswer));
//			System.out.println(shopingCart.substring(0,shopingCart.length()-2));
//			System.out.println("Total price: " + totalPrice);
			
		
		
		
		
	/**	Instructions from your teacher:

			Print true if the string "cat" and "dog" appear the same number of times in the given string word.

			Example:

			input: catdog

			output: true

			Example:

			input: catcat

			output: false

			Example:

			input: cat-cheetah-dog-cat

			output: false */
		
//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
		
//		String s = "catdogcatdog cat dog catchatcaht";
        

//		String word = "Apple, Pear, Banana, Grape";
//		String [] arr = text.split(", ");
//		System.out.println(Arrays.toString(arr));

//		String s = "This is a sample sentence with []s.";
//		String[] words = s.split("\\W+");
//		
//		System.out.println(Arrays.toString(words));
		
		
		/**Note 	
		 * String word = "javaxxxx";
		 *
	System.out.println(word.indexOf('b')); // -1
	System.out.println(word.contains("aba")); // false
	System.out.println(word.lastIndexOf('c')); // -1
	**/
		
//		String str = "dcatd dog cat dog catcatcat"; // -1 sozu tapmayanda qaytarir
//		String findStr = "cat";
//		String findDog = "dog";
//		int lastIndex = 0;
//		int lastIndex2 = 0;
//		int count = 0;
//		int count2 = 0; 
//
//		while (lastIndex != -1 && lastIndex2 != -1) {
//
//		    lastIndex = str.indexOf(findStr, lastIndex);
//		    lastIndex2 = str.indexOf(findDog, lastIndex);
//
//		    if (lastIndex != -1 || lastIndex2 != -1) {
//		        count++;
//		        count2++;
//		        lastIndex = lastIndex + findStr.length();
//		        lastIndex2 = lastIndex2 + findDog.length();
//		    }
//		}
//		System.out.println(count);
//		System.out.println(count2);	
        
		


		
	    

//		Scanner scan = new Scanner(System.in);
//		String word = scan.next();
//		
//		int catCount = 0;
//		int dogCount = 0;
//		
//		String c = "cat";
//		String d = "dog";
//		
//		int i = 0;
//
//		while ( i <= word.length() - c.length() ) {
//			
//
//			if (word.substring(i, i + c.length()).equals("cat"))
//				catCount++;
//
//			if (word.substring(i, i + d.length()).equals("dog"))
//				dogCount++;
//			
//			i++;
//		}
//
//		if (dogCount == catCount) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}

	    
	    

//		String str = "dcatddogcatdogcatcatcat";
//		
//		int str1 = str.length();
//		
//		String cat = "cat";
//		String dog = "dog";
//		
//		int c = str.indexOf(cat);
//		
//		int d = str.indexOf(dog);
//		
//		int count =0;
//		int i=0;
//		while (i<str1) {
//			
//			if(str.substring(c, c+3).equals(cat)) {
//			
//			System.out.println(str.substring(c, c+cat.length()) + i);
//			i++;
//			count++;
//			}
//		}
		
	    
	    
	    
		
		

		
		
        
		
		
	}

}
