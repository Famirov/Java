package personalmodules;

import java.util.Scanner;

public class Lesson4 {

	public static void main(String[] args) {
		
//		String str = "Omar";
//		String str2 = "Omar";
//		String str3 = new String("Omar");
//		
//		System.out.println(str == str3 ); // false -it compares if they are same objects compare address
//		System.out.println(str == str2 ); // true - they are in same location 
//		
//		/**It compare the values*/
//		System.out.println(str.equals(str3)); //true
		
		
		
//		String str = "Yoll Academy";
//		
//		System.out.println(str.charAt(5)); // A we will get A. if u want one character location 
//		
//		System.out.println(str.length()); // 12 we will give us the length of the string
//		
//		
//		String str2 ="yoll academy";
//		System.out.println(str.equalsIgnoreCase(str2));// true we compare str=str2 and ignore the case sensitivity
//		
//		
//		System.out.println(str.startsWith("yoll"));//false if we wanna know if string starts with yoll. it will be boolean and 
//		System.out.println(str.startsWith("Yoll")); // true
//		
//		System.out.println(str.endsWith("my"));// true --Academy ends with "my"
//		
//		
//		String email = "omar_ramo@email.com";//this is company email and we want to extract omar
//		System.out.println(email.substring(0, 4));// omar-i secir.1-ci herf 0-dir, 4 ise "_" e dusur ve bu exlude olur
//		System.out.println(email.substring(5, 9));//ramonu secir 5-r herfi included, 9 ise @ exluded
		
		
		
		/***indexOf(String str --- STRING METHOD  */
		
		
		// example with one char
//		String email = "lizzy_doe@email.com";
//		System.out.println(email.indexOf("@")); // 9-dur. @-in harda oldugunu gosterir
//		System.out.println(email.indexOf("l")); // 0-dir. l-in harda oldugunu gosterir
		
		
		//example with a sequence of chars
		// If indexOf doesn't find a match it will return -1
//		String sentence = "Hello my friend";
//		System.out.println(sentence.indexOf("my"));// 6-dir. m-in 6dan basladigini gosterir
//		System.out.println(sentence.indexOf("friend"));//9-dur. friend 9-cu char-dan baslayir
//		System.out.println(sentence.indexOf("hot")); // -1 -dir. cunki ele cumle yoxdur
		
		
		// We can use indexOf for substring---attention
		
//		String email = "lizzy_doe@email.com";
//		int indexOfAt = email.indexOf("@");
//		
//		System.out.println(email.substring(0, indexOfAt)); //lizzy_doe 1-th method
//		System.out.println(email.substring(0, email.indexOf("@")));//lizzy_doe 2-nd method
		
		
		
//		String email = "omar_ramo@email.com";
//		int indexOfAt = email.indexOf("@");
//		int indexOfUnderscore = email.indexOf("_");
//		String firstName = email.substring(0,indexOfUnderscore);
//		String lastName = email.substring(indexOfUnderscore + 1, indexOfAt);
//		
//		System.out.println(firstName);// omar
//		System.out.println(lastName); // ramo
		
		//**offset
		// The index of offset is included
//		String sentence = "Codeboards are fun to solve but it gets challenging sometimes";
//		
//		System.out.println(sentence.indexOf("a",9));//11-olacaq. want to find 2nd A while ignoring A in "Codeboards" word
//
//		String sentence1 ="Hello friend, Hello!";
//		System.out.println(sentence1.indexOf("Hello"));//0-olacaq 
//		System.out.println(sentence1.lastIndexOf("Hello")); // 14-dur basdan 0,1,2....14 kimi gelir ama uzun cumle olanda istifade ucun yaxsidir.
		
		
		//Dynamic approach to find the value----Buna birde bax axrincida nese sehv var
		
//		String sentence = "My name is [Omar]. Nice to meet you!";
//		
//		int startIndex = sentence.indexOf("[")+ 1;
//		int endIndex = sentence.lastIndexOf("]");
//		
//		
//		System.out.println(sentence.substring(startIndex, endIndex));
//		
//		
//		String sentence1 = "My name is \"Omar\". Nice to meet you!";
//		
//		int startIndex1 = sentence.indexOf("\"")+ 1;
//		int endIndex1 = sentence.lastIndexOf("\"");
//		
//
//		System.out.println(sentence.substring(startIndex1, endIndex1));
		
		
		
		/**Concat(String str) -- adds two strings together*/
		
		
//		String fName = "Omar";
//		String lName = "Ramo";
		
		//Option 1
		
//		System.out.println(fName + " " + lName); //much easier
		
		//Option 2
		
//		System.out.println(fName.concat (" ").concat(lName).concat(" "));
		
		
		/**replace(CharSequence old, CharSequence new) -it will replace old with new chars */
		// will work with cars and strings
		
//		String str_pattern = "__x__x__x__";
//		
//		String modifiedString =str_pattern.replace("x", "o");
//		
//		System.out.println(modifiedString);
		
		
		
//		String sentence = "The recent Jave class was a little challengin. Anyway, Java is fun!";
//		String modifiedString = sentence.replace("Java", "SQL");
//		System.out.println(modifiedString); //result:  The recent Jave class was a little challengin. Anyway, SQL is fun!
		
		
//		String str = "One fish, two fish, three fish etc....";
//		
//		System.out.println(str.replace("fish","sheep"));
//		
//		System.out.println(str.replace(","," "));// vergul ,-leri space ile evez edir.
//		
//		System.out.println(str.replace(" ","")); // will replace space with no space
		
//		String str2 = "He11o He11o";
//		System.out.println(str2.replace("1", "l"));//11-leri ll herfine cevirir
		

		/**recplaceAll (String old, String new)-it is almost the same
		 *  as replace but also works with regex*/
		
		
		String str_pattern = "__1__2__3__4__";
		
		// __num__num__num
		
//		str_pattern.replace("1","num");
//		str_pattern.replace("2","num"); // ile deyisdiririk hamisini "num"-a
		
		//Regex - "\\d" -any digit
		//Regex - "\\s" - any space
		//Regex - "[a-z] - all small letters
		//Regex - "[A-Z]-- all capital letters
		//Regex - "[a-zA-z]" - all letters
		

//		String modifiedString = str_pattern.replaceAll("\\d","num");
//		System.out.println(modifiedString);
//		
//		String text = "hsdGfgj7834ryGb834f81JGTG3gf7g";
//		String modText = text.replaceAll("\\d", "");
//		
//		String modText2 = text.replaceAll("[a-z]","");
//		
//		String modText3 = text.replaceAll("[a-zA-Z]",""); // will remain only numbers
//		
//		System.out.println(modText);
//		System.out.println(modText2);
//		System.out.println(modText3);
		
		
		//contains (String str) - will return true or false
		
//		String sentence = "I like programming";
//		System.out.println(sentence.contains("I"));
		
		
		//Example
//		String emailMessage = "You have a new email in your inbox but is a spam. Would you like to open it? ";
//		
//		if (emailMessage.contains("inbox")) {
//			System.out.println("Open it!");
//			
//		}else if (emailMessage.contains("spam")) {
//			System.out.println("Delete it!");
//			
//		}else {
//			System.out.println("Save it for later...");
//		}

		
		
		/**toUpperCase() and toLowerCase()*/
		
//		String text = " I LIKE ProgramMMing!";
//		
//		System.out.println(text.toLowerCase());
//		System.out.println(text.toUpperCase());
		
//Dimanin yazdigi---------------------------------------------------------------------
		// contains(String str) - will return true or false
//		String sentence = "I like programming";
//		System.out.println(sentence.contains("I"));

//		String emailMessage = "You have a new email in your inbox but it is a spam. Would you like to open it?";
//
//		System.out.println("Contains inbox: " + emailMessage.contains("inbox"));
//		System.out.println("Contains spam: " + emailMessage.contains("spam"));
//		
//
//		if (emailMessage.contains("inbox")) {
//			System.out.println("Open it!");
//		} else if (emailMessage.contains("spam")) {
//			System.out.println("Delete it!");
//		} else {
//			System.out.println("Save it for later..");
//		}
		//email-de case sensitivity ye bax ordaq gor nece yazib
		
//-------------------------------------------------------------------------------------------------		
		
		
		
		
		
	// isEmpty() - will return true or false
		
//		String text = " ";
//		
//		System.out.println(text.isEmpty()); // false; if there will be ""-it's true, but if " " has space its false
//		
	// isBlank() - will return us blank if it has space or not
		
//		System.out.println(text.isBlank()); // true; it will ignore the spaces.
		
	// trim()	- will truncate the white spaces at the beginning and the end of the string
		
//		String myString = "   I like programming  ";
//		String trimmedString = myString.trim();
//		
//		System.out.println(myString);	  //   I like programming  -- cavabda space olacaq
//		System.out.println(trimmedString);//I like programming -- space trim olacaq

		
		/**Real World example*/
//		String expectedMessage = "New information about U.S. entry requirements, travel restrictions and changing your trip.";
//		String actualMessage = " New information about U.S. entry requirements, travel restrictions and changing your trip.                   ";
//		
//		String trimmedMessage = actualMessage.trim();
//		
//	    if(expectedMessage.equals(trimmedMessage)) {
//	    	System.out.println("Informational message validation passed!");
//	    }else {
//	    	System.out.println("Informational message validation failed!");
//	    	System.out.println("Actual: " + trimmedMessage);
//	    	System.out.println("Expected: " + expectedMessage);
//	    }
		
		
		
		/**Practice*/
		// Calculate the length of a given string without the space 
		//String str = "Success is bound to happen when you believe.";
		
//		String str = "Success is bound to happen when you believe.";
//				
//		String modifiedstr = str.replace(" ","");
//		
//		System.out.println("Length without spaces: "+ modifiedstr.length());
		
		
		/**TASK*/
/**Write a program that will ask user for a word and a sentence. 
Use a string method that will verify if word is contained in the sentence. 
Print out the result as boolean value. */
		// Task
//		Write a program that will ask user for a word and a sentence. 
//		Use a string method that will verify if word is contained in the sentence. 
//		Print out the result as boolean value. 
		
//		Scanner scan = new Scanner(System.in);
//		
//        System.out.println("Enter a sentence:");
//		String sentence = scan.nextLine().toLowerCase(); // use nextLine() to take the whole sentence
		//String lowerCaseSentence = sentence.toLowerCase();
		
		
//		System.out.println("Enter a word:");
//		String word = scan.nextLine().toLowerCase();
//		//String lowerCaseWord = word.toLowerCase();
//		
////		System.out.println(sentence.contains(word));//option 1 we can use ignore case to avoid case sensitivity
//		
//		if(sentence.contains(word)) {				//option 2
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
		
		
		
//Practice again 
		
		
		
		
		

		
		
		
		
		
		
	}

}
