package personalmodules;

import java.util.Scanner;

public class HomeTask11 {
	
	
	
	
	
	
	
	
	

//	public static char getChar(String word, int index){ // This is a class
//		
//		char letter = word.charAt(index);
//		return letter;
//
//	}
//	
//	
//	public static boolean bothEven(int num1, int num2) {
//		
//		if (num1%2==0 && num2%2==0) {
//			return true; 
//		}else {
//			return false; 
//		}
//		
//		
//		
//	}
	

	public static void main(String[] args) {
		
//		   Scanner scan = new Scanner(System.in);
//	       String html = scan.nextLine();
//	       
//	       String id ="id";
//	       int count =0;
//		
//		for(int i=0; i< html.length()-1; i++) {
//			if(html.substring(i, i+2).contains(id)) {
//				count++;
//			}
//		} 
//		if(count==0 || !html.contains(id)) {
//			System.out.println("Invalid input!");
//		}else {
//			System.out.println(html.substring(html.indexOf(id)+4, html.lastIndexOf("id")+2));
//		}
		
			
		
//		System.out.println(str.substring(str.indexOf("bread")+5, str.lastIndexOf("bread")))
		
/**Write a program, that will read html variable and output attribute value of id`` 
 * attribute (tag) into the console. 
 * Input will be provided in a single line as outlined below. If html variable doesn't contain

id attribute, print out into the console message: "Invalid input!".
Example:

input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>

output: myid*/		
		
		
		
		
//		
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        
        String [] array;
        
        array = sentence.split(" ");
        
	    for (int i = array.length-1; i>=0; i-- ) {
//	    	for (int j=0; j<i; j++) {
//	    		
//	    	}
	    	System.out.print(array[i]+ "\n");
	    	
	    }
	
		
/**		Instructions from your teacher:

			Given a String variable sentence, write code to type each word in separate lines in a reverse order.

			Example:

			sentence -> "Java is fun"

			Print

			fun

			is

			Java */
		

		
		
		
		
		
//        Scanner input = new Scanner(System.in);
//        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};
//		
//        
//        
//        for(int i = 0; i < words.length; i++ ) {
//        	System.out.println(words[i].substring(0,1)+ words[i].substring(words[i].length()-1));
//        	
        }
        
		
		
		
/**		Instructions from your teacher:

			Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

			Example:

			words → ["hello", "why", "by", "apple" , "note"]

			print: 
			       ho
			       
			       wy
			       
			       by
			       
			       ae
			       
			       ne
		
		
**/		
		
		
		
		
		
//		Scanner input = new Scanner(System.in);
//		String[] arr = new String[5];
//		
//		for (int i=0;i<5;i++) {
//			arr[i] = input.nextLine();
//		}
//		
//		for(int j =0; j<5; j++) {
//			System.out.println(arr[j].substring(0, 3));
//			
//		}
		
		
		
		
/**Instructions from your teacher:

The code provided in your main method will take in five Strings and save them
into an array called arr. Print out the first three letter of each element of
arr, one per line. You can assume that every element of arr is at least 3 letters long.

Example:

arr -> ["apple", "banana"] 

 prints: app
         ban*/		
		
		
		
		
		
		
		
		
		
		
//        Scanner scan = new Scanner(System.in);
//        String sent = scan.nextLine();
//
//        int jcount =0;
//        int pcount =0;
//        
//        
//        for (int i =0; i<sent.length()-3; i++) {
//        	if(sent.substring(i, i+4).equals("java") ) 
//        	{
//        		jcount++;
//        		
//        	}
//        }
//        
//        for (int i =0; i<sent.length()-5; i++) {
//        	if(sent.substring(i, i+6).equals("python") ) 
//        	{
//        		pcount++;
//        		
//        	}
//        }
//        
//        		
//        if(jcount==pcount) {
//        	System.out.println(true);
//        	
//        }else {
//        	System.out.println(false);
//        }
		
/**		Instructions from your teacher:

			Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).

			`Example:`

			`input: We study java not python`

			`output: true`

			`Example:`

			`input: What's the difference between java, javascript and python?`

			`output: false`**/
			
			
			
			
			
			
		
//        Scanner scan = new Scanner(System.in);
//        String str = scan.next();
//		
//        int breadCount = 0;
//       //01234....
//       //xxbreadjambreadyy=17length, index16
//        // for- cumlede onun icinde bread-lerin sayini tapsin
//        for(int i=0; i<str.length()-4; i++) { // bread 5 herifli oldugu ucun axirda -4 qoyuruq sebeb: 5 herifli sozu 4 herifde tapmaq olmur 
//        	if(str.substring(i,i+5).equals("bread")) { //0,0+5 sonra 1,1+5 sonra 2,2+5 surusdurur 5 axtarir
//        		breadCount++;
//        												//System.out.println(breadCount); 1 sonra 2 nece defe tapirsa onlari bir bir print edir
//        	} 
//        	
//        }												// System.out.println(breadCount); 2-ci bread-i tapana qeder 1 leri rint edir
//        	if (breadCount!=2 || breadCount>2) {
//        		System.out.println("nothing");
//        	} else {						    //2-baslangic indexi + 5   // 10 breadin baslangic indexi en son breadin baslangic indexi
//        		System.out.println(str.substring(str.indexOf("bread")+5, str.lastIndexOf("bread")));
//        	}
//
//        	System.out.println(str.indexOf("bread"));
//        	System.out.println(str.lastIndexOf("bread"));
        
		
		
/**		Instructions from your teacher:

			A sandwich is two pieces of bread with something in between. 
			Print the string that is between the first and last appearance of "bread" in the given string, or return string 
			"nothing" if there are not two pieces of bread.

			**`Example:`**

			**`input: breadjambread`**

			**`output: jam`**

			**`Example:`**

			**`input: xxbreadjambreadyy`**

			**`output: jam`**

			**`Example:`**

			**`input: xxbreadapple`**

			**`output: nothing`**

			**`Example:`**

			**`input: breadbutterbread`**

			**`output: butter`** **/
		
		
//			System.out.println(bothEven(8, 6)); //should be true
//	        System.out.println(bothEven(5, 6)); //should be false
		
		
		
		/**Write a public static method header on line five with the following specs:

		Returns: a boolean

		Name: bothEven

		Parameters:

		an integer called "num1"
		an integer called "num2

		Then, starting on line 5, write code that will return true if both num1 and num2 are even. Return false otherwise.

		Examples:

		bothEven(4,6) ==> true
		bothEven(3,4) ==> false
		bothEven(-1,1) ==> false*/	
						
		
		
		
		
		
		
		
/**Write a public static method header on line 
 * five with the following specs:

Returns: a char

Name: getChar

Parameters:

a String called "word"
an integer called "index"

Then, starting on line 5, write code that will return the character
 in "word" at the index "index"

Examples:

getChar("hello",1) ==> 'e'*/
		
//		System.out.println(getChar("hello", 4)); //should be 'e'
		
		
		

		
		

	}


