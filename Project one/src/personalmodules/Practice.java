package personalmodules;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice {
	

	public static void main(String[] args) {

		
//		System.out.println("* * *");
//		System.out.println("*   *");
//		System.out.println("* * *");
//		
//	//Print on the screen exactly same as here: "Java is fun!"
//		
//		System.out.println("\"Java is fun!\"");
//		
//	//Print on the screen exactly same as here: 'Havanna!'
//		
//		System.out.println("\'Havanna!\'");
//		
//		System.out.println(" ^");
//		System.out.println("/ \\");
//		
//		int speedLimit = 25;
//		System.out.println(speedLimit);
//		
//		char myChar49 = '1';
//		System.out.println(myChar49);
//		
//
//		String academyName =  "\"Yoll Academy\"";
//		
//		System.out.println(academyName);
//		
//		int a=5;// 101
//		//System.out.println(a);
//		int b=4 ;// 100
		//System.out.println(b);
		
//		System.out.println("a:"+ a);
//		System.out.println("b:"+b);
		
		//a=a^b;//a=9 becomes 1001 // ^ -> XOR   1 1->0  1 0 -> 1   0 0 ->0   0 1-> 1 
		//b=a^b;//b=5
		//a=a^b;//a=4
//		
//		a=a^b; // 1 0 1 XOR 1 0 0 ----> 0 0 1
//		b=a^b; // 0 0 1 XOR 1 0 0 ----> 1 0 1 ->5
//		a=a^b; // 0 0 1 XOR 1 0 1 ----> 1 0 0 ->4
		
//		a=a+b;//a=9 becomes
//		b=a-b;//5=9-4
//		a=a-b;//4=9-5
		
//		System.out.println("a: "+a);
//		System.out.println("b: "+b);
//	

//		int speedLimit= 25;
//		
//		System.out.println(speedLimit);
//		
//		byte type= -128;
//		
//		System.out.println(type);
		

//		Declare a variable with value 680
//		short shortNum = 680;
//		System.out.println(shortNum);
		
//		float myFloat = 645.45f; 
//		System.out.println(myFloat);
		
		
//		String myStr = "5";
//		int myInt = 5;
//		System.out.println(myStr);
//		System.out.println(myInt);
//		System.out.println(myInt+10);
//		System.out.println(2 + 5 + "10" + 7); // 7107 
		
		
//		int myAge= 34;
//		int myDogsAge= 1;
//		int myCatsAge=2;
//		
//		
//		System.out.println("My Age:"+ myAge);
//		System.out.println("My Cats Age:"+ myCatsAge);
//		System.out.println("My Dogs Age:"+ myDogsAge);
//
//		String myName= "Farhad";
//		String catsName= "Stacy";
//		String dogsName= "Martin";
//		
//		System.out.println(myName);
		
//		System.out.println("myName:"+ myAge);
//		System.out.println("catsName:"+ myCatsAge);
//		System.out.println("dogsName:"+ myDogsAge);
		
		//System.out.println(String.toInteger(myName)+ myAge);
		
		
		
		
		
		
		
		/**IF STATEMENTS**/
		
		// if (condition) statement;
		
		// ex
		
//		int x, y;
//		
//		x=10;
//		y=20;
//		
//		if (x<y) System.out.println("x is less than y");
		
	
		
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//				
//		if (x<y) System.out.println("x is less than y");
		
		//
		// Create a program that will tell if a number is even or odd
		// The number is even or the number is add
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter a number: ");
//		int number = sc.nextInt();
//		
//		if(number%2==0){
//			System.out.println("The number is even: " + number);
//		}else {
//			System.out.println("The number is odd: " + number);
//		}
//		
//		System.out.println("Thanks! ");
//		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter the world: ");
//		String word = sc.next();
//		
//		
//		
//		if (word.startsWith("H") ) {
//			System.out.println("The word starts with H: " + word );
//		}else {
//			System.out.println("The word doesn't start with H: " + word);
//		}
		
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter your word: ");
//		String text= sc.next();
//		char prefix='H';
//		
//		
//		if(text.charAt(0)==prefix){
//		    System.out.println("Start with " + prefix);
//		}
//		else{
//		    System.out.println("It's not start with " + prefix);
//		}
//		
//		3rd method
//		char firstLetter = text.charAt(0);
//		
//		int word = "word".length();
//		char prefix='H';
//
//		
//		
//		if((firstLetter+"").equals(prefix+""))
//		{
//		    System.out.println("Starts with " + prefix);
//		}
//		else
//		{
//		    System.out.println("Doesn't start with " + prefix);
//		}
		
		
//	4th solution
		
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter your word: ");
//		String text= sc.next();
//		char prefix='H';
//		
//		if(text.indexOf(prefix) == 0) {
//			System.out.println("Starts with " + prefix);
//		}
//		else {
//			System.out.println("Doesn't starts with " + prefix);
//		}
//		
		
		/**
		 * Format the name correctly with first letter being uppercase and the rest lowercase
		 * 
		 */
		
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter your name:");
//		String unformattedName= in.nextLine();
//		String trimmed = unformattedName.trim();
//		System.out.println("Trimmed : "+ trimmed);
//		
//		String firstName = trimmed.substring(0, 1).toUpperCase() + trimmed.substring(1 , trimmed.indexOf(" ")).toLowerCase();
//		String lastName = trimmed.substring(trimmed.lastIndexOf(" ")+1, trimmed.lastIndexOf(" ")+2).toUpperCase() + trimmed.substring(trimmed.lastIndexOf(" ")+2).toLowerCase();
//
//		String formatted = firstName+ " "+lastName;
//		
//		
//		System.out.println(formatted);
////					dERya		b
//		System.out.println("Derya B");
		
		
		
		
		
//		 We will convert grades from higher to lower and give them marks.
//				Grade Converter
//		100-90 will be A, 90-80 will be B, 80-70 will be C, 
//		70-60 will be D, 60 to 0 will be F and the rest will be Invalid Score.
//
//	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter your score: ");
//		
//		int score = sc.nextInt();
//		
//		if (score<=100 && score >=90) {
//			System.out.println("Your grade is: A");
//			
//		} else if (score < 90 && score>80) {
//			System.out.println("Your grade is: B");
//		} else if (score < 80 && score > 70) {
//			System.out.println("Your grede is: C");
//		} else if (score < 70 && score > 60) {
//			System.out.println("Your grade is: D");
//		} else if (score < 60 && score >=0) {
//			System.out.println("Your grade is: F");
//		} else  {
//			System.out.println("Invalid scoce");
//		}
		
		
		
		/**Negating and Expression*/
		
		// !-symbol is used to convert true to false, and false to true
		
//		boolean c= true;
//		
//		boolean d= false;
//				
//		System.out.println(!c);//false.
//		System.out.println(d);
	
//	int a = 10;
//	int b = 20;
//	int c =0;
//	c = a+b;
//	
//	System.out.println("c = a + b = " + c);
//	
//	c += a;// c= c+a ( 40= 30 + 10)
//	
//	System.out.println("c += a = " + c);
//	
//	c -=a; // c= c-a (30=40-10)
//	
//	System.out.println("c += a = " + c);
//	
//	c *=a; // c=c*a (300=30*10)
//	System.out.println("c += a = " + c);
//	
//	a = 10;
//	c = 15;
//	
//	
//	c /= a; // c = c/a
//	System.out.println("c /= a= " + c);
//	
//	
//	
//	a = 10;
//	c = 15;
//	
//	c %= a; // c = c%a (5 = 15/10(5-qaliq)
//	System.out.println("c %= a= " + c);
//	
//	a = 10;
//	c = 15;
//	
//	c <<= 2; //BUNU BASA DUSMEDIM KECMEMISIK move the value twice one the right side and twice on the left side
//	System.out.println("c <<= 2 = " + c);
//	
//	
//	c >>= 2;
//	System.out.println("c >>= 2 = " + c);
//	
//	c &= a;
//	System.out.println("c &= 2 = " + c);
//	
//	c^= a;
//	System.out.println("c ^= a = " + c);
//	
//	c |= a;
//	System.out.println("c |= a = " + c);
//	
	
	
	/**JAVA LOGICAL OPERATORS by Alex Lee*/
	
	// || or 
	// &&  and 
	// !  not	
		
		//ex-OR
		
		
//		boolean a = true || true; // true
//		
//		System.out.println(a);
//		
//		
//		
//		boolean b = true || false; //true just one of them needs to be true
//		
//		System.out.println(b);
	
		
		//ex-and
//		
//		boolean d = true && true; // true
//		
//		System.out.println(d);
//		
//		
//		
//		boolean e = true && false; //false ---both of them needs to be true otherwise it's false 
//		
//		System.out.println(e);
		
		
		//ex-Not
//		
//		boolean f = !(true || true); // false because of !
//		
//		System.out.println(f);
//		
//		
//		
//		boolean g = !(true && false); //true inside parenthesis is false and there !(false)=true
//		
//		System.out.println(g);
//		
		
//		int a =3;
//		int b = 4;
//		int d= 5;
//		int e =6;
//		
		
				 //false  || true	---will give us true	
//		boolean c = (a>b) || true;
//		
//		System.out.println(c);
//		
//				  //false && true	---will give us false because of and
//		boolean f = (d>e) && true;
//		System.out.println(f);
//	
//		            //true and true
//		boolean c = !(a>b) && true; 
//		
//		System.out.println(c);
//	
		
		//using logical operator + if + boolean
		
//		int a = 3;
//		int b = 4;
//		boolean isSunny = true;
//		boolean amHappy = true;
//		
//		   //true and true	   or  true
//		if ((a < b && isSunny) || amHappy ) {
//			System.out.println("it's gonna be a good day! ");
//		}
				
		// STRING TO INTEGER
		
//		String s = "102";
//		
//		System.out.println(s + 4); // 1024
//		
//		Integer.parseInt(s); // converting
//		
//		System.out.println(Integer.parseInt(s) + 4);//106
		
		
		// veya bele yaza bilersen 
		
//		int n = Integer.parseInt("100");
//		
//		System.out.println(n+5);//105
//		
//		
//		
//		double m = Double.parseDouble("100.5");
//				
//		System.out.println(m - 0.5);//100.0
//		
		
		// Integer to String
		
//		int n = 8;
//		
//		System.out.println(n + 1);//9
//		
//		System.out.println(Integer.toString(n) + 1);//81 olacaq
//		
//		double d =100.20;
//		System.out.println(d+100);// 200.2
//		System.out.println(Double.toString(d)+100);//100.2100
		
		/**Getting Integer from a string that has other letters and doing math*/
		
//		String s = "Age: 47";
//		s = s.replaceAll("\\D+ ", "");
//		
//		int n = Integer.parseInt(s);
//		
//		System.out.println(s); // 47 edecek
//		System.out.println(n + 2); // 49 edecek		
		
		
		
		
		
		
		
		
		
		
		
// Conversion Task
		
//		Ask user to enter number.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a number:");
		
//		Receive number as string.
//		String text = scan.next();
		
//		Convert string into integer.
//		int convertedNum = Integer.parseInt(text);
		
//		Add 100 to the number
//		convertedNum += 100;
		
//		Print false if result is less than 200.
//		System.out.println(convertedNum >= 200);
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
//		num = 44;
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
//		// Three ways of converting a boolean to string
//		boolean myBoolean = false;
//		String strBool = "" + myBoolean;
//		String strBool2 = String.valueOf(myBoolean);
//		String strBool3 = Boolean.toString(myBoolean);
//		
//		System.out.println(strBool + strBool2 + strBool3);

			
		//Task
//		Ask user to enter number.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter a number: ");
//		
////		Receive number as string.
//		String text = sc.nextLine();
//				
////		Convert string into integer.
//		int converted =Integer.parseInt(text);
//		
////		Add 100 to the number
//		converted += 100;
//		
////		Print false if result is less than 200.
//		System.out.println(converted >= 200);
	
		
		
		/**Java IF .... ELSE STATEMENT*/
		
/** For example
 * Assigning grade (A,B,C) based on the percentage obtained by a student
 * 
 * if the percentage is above 90, assign grade A
 * if the percentage is above 75, assign grade B
 * if the percentage is above 65, assign grade C*/
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter your score: ");
//		
//		double score = sc.nextDouble();
//		
//		if (100 >= score && score >= 90) {
//			System.out.println("Your grade is: A ");
//		}else if (90> score && score >= 75) {
//			System.out.println("Your grade is: B");
//		}else if (75 > score && score >= 65) {
//			System.out.println("Your socre is: C");
//		}
//		else{
//			System.out.println("You entered invalid score! ");
//		}
		
		
/**A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.
*/
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Please enter a quantity ? ");
//		
//		double quantity = sc.nextDouble();
//		
//		System.out.println("Your quantity is: " + quantity);
//		
//		double cost = quantity*100;
//		
//		double disCost = cost - (cost * 0.1);
//		
//		if(quantity>1000) {
//			
//			System.out.println("You will get a discount for 10% and your total is: " + disCost);
//		}
//		else if (quantity<=1000 && quantity>=0 ) {
//			System.out.println("Your total is: " + cost);
//		}
//		else {
//			System.out.println("You have entered invalid number \nPlease try again ");
//		}
	
/**Ex 
If n > 10 --> sout “>10”
Else if n = 10 --> sout “=10”
Else sout “<10”
*/
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter a number: ");
//		
//		int n = sc.nextInt();
//		
//		if(n>10) {
//			System.out.println("sout > 10 ");
//		}
//		else if (n==10) {
//			System.out.println("sout = 10 ");
//					
//		}
//		else {
//			System.out.println("sout <10");
//		}
//		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter your age: ");
//		int age = sc.nextInt();
//		
//		
//		if(age >= 16) {
//			System.out.println("You can drive");
//		}else {
//			System.out.println("You are not allowed to drive");
//		}
//		
//		System.out.println("Please answer a question by typing true or false.\nYour mood is good? ");
//		
//		boolean mood = sc.nextBoolean();
//		
//		if(mood) {
//			System.out.println("Go to the gym!");
//		}else {
//			System.out.println("Go to sleep!");
//		}
		
		
		/* Google log in */ 
		

//		String expectedUsername = "omarRamo";
//		int expectedPassword = 12345;
//		int expectedSecretCode = 777;
//		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter your name: ");
//		
//		String username = sc.next();
//		
//		System.out.println("Please enter your password: ");
//		int password = sc.nextInt();
//		
//		if(username.equals(expectedUsername) && (password == expectedPassword)) {
//			
//			System.out.println("We sent you secret code. Please enter it: ");
//			int secretCode = sc.nextInt();
//			
//			if (secretCode == expectedSecretCode) {
//				System.out.println("You have successfuly loged in!: ");
//			}else {
//				System.out.println("Invalid secret code! ");
//			}//burda mesele baglanir if-in icinde if ve else var sonraki else if-e aid deyil
//				
//		}else {
//			System.out.println("Invalid credentials! ");
//		}
		
	
		

//		// Get input from user
//		Scanner in = new Scanner(System.in);
//		System.out.println("Please enter a number in the range of 1 till 5");
//		int usersAnswer = in.nextInt();
//		
//		// Random class gives us ability to generate different random numbers
//		Random random = new Random();
//		// Use the object from random class to access methods from it
//		int randomNumber = random.nextInt(1, 6);
//
//		if(usersAnswer == randomNumber) {
//			
//			System.out.println("Correct! Aren't you lucky.");
//			
//		}else {
//			
//			System.out.println("Hard luck! Maybe next time.");
//			System.out.println("The winning number was: " + randomNumber);
//			System.out.println("Your number was: " + usersAnswer);
//			
//		}
		
		
//		String car="honda";
//		String Bike = "yamaha";
//		int num=Bike.length();
//	
//		System.out.println(car.length());
//		System.out.println(num);
		
		
		
//		String name = "Omar";
//		System.out.println(name.length());
//
//		String fullName = "Omar Ramo";
//		int lengthOfStr = fullName.length();
//		System.out.println(lengthOfStr);

		// Practice
		// 1. Define two strings and assign some value to it
		// 2. Identify the length of both strings
		// 3. Print in the console the total length of those characters

//		String str = "Hello dude!";
//		String str2 = "I love JAVA!";
//
//		int length1 = str.length();
//		int length2 = str2.length();
//		System.out.println(length1 + length2);
//		
		
//		int methodLevelVariable = 700; //bu method variabledir > inside (lower level scopes) of scope-dan boyukdur.
//		
//		if( 10 > 5) {
//			System.out.println(methodLevelVariable); // inside of the scope {}
//		}

		
		
		
	/**Arrays*/
		
//		String [] workdays = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
//		
//		
//		System.out.println(Arrays.toString(workdays));//[Monday, Tuesday, Wednesday, Thursday, Friday]
//
//		// Find a length of the array
//		
//		System.out.println(workdays.length);//5
		
		
		
		
//	    String myStr = "Hello planet earth, you are a great planet.";
//	    System.out.println(myStr.indexOf("planet"));
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
