package module4;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson5ArraysandMultidimensionalArrays {

	public static void main(String[] args) {
	
		
	/**Temperature example*/
		
		/**Why we need Arrays or data structures?*
		 * We can store multiple data in the same place
		 * Then we can access and manipulate that data
		 */
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter today's temperature: ");
//		
//		int temp = sc.nextInt();
//		int temp2 = sc.nextInt();
		
		//1.How we define an array
		//2.How we allocate the memory- Instantiation
		//3.Population the array - Initialization
		//4.Access and manipulate the data
		
		//1. How we define an array
		//Option 1 - Declaration and Instantiation in separate lines
		//* data_type [] identifier ;*/
		
		//String []myArray ; // we just declare the array but it is not created in the memory yet
		//String myArray2 []; //This declaration is same as previous one
		
		
//		// Allocate memory-Instantiate
//		/*Identifier = new data_type [int size]*/
//		myArray = new String[7]; // The size can't be changed later in the code - programmatically
//		// The array will be created as an object in heap memory
//		
//		//Option 2 - Declaration and Instantiation in separate lines
//		String [] daysOfWeek = new String [7];
//		// Once we initialize the array in this way the object will be created in the heaop
//		
//		
//		
//	/*    1    2    3    4    5    6    7     - Size(length)
//        ____ ____ ____ ____ ____ ____ ____
//       |    |    |    |    |    |    |    |
//       |____|____|____|____|____|____|____|
//         0    1    2    3    4    5    6     - Indices */
//		
//		
//		
//		
//		// Populate the array
//		// Each cell in array is called element
//		
//		daysOfWeek [0] = "Monday";
//		daysOfWeek [1] = "Tuesday";
//		daysOfWeek [2] = "Wednesday";
//		daysOfWeek [3] = "Thursday";
//		daysOfWeek [4] = "Friday";
//		daysOfWeek [5] = "Saturday";
//		daysOfWeek [6] = "Sunday";
//		
//		
//		
//		//Access and print the value of an element
//		System.out.println("The day of the week is: " + daysOfWeek[6]);
//		System.out.println("The day of the week is: " + daysOfWeek[0]);
//		
//		// Access an element and reassign
//		daysOfWeek[0] = "Sunday"; //Changing Monday to Sunday we are re-assigning the value
//		System.out.println("The day of the week is: " + daysOfWeek[0]);
//		
//		// We will get an exception if we try to increase the size of length of the array
////		 daysOfWeek[-647] = "Sunday";
//		
//		//There are 2 types of exceptions
//		//Runtime - occurs during the runtime of the program 
//		//Compile time - gives instant error
//		
//		
//		// Option 3 - Defining array
//		// The way that we do Declaration, Instantiation, Initialization
//		
//		int  [] nums = {10, 20, 30, 40, 50, 60};
//		
//		// To get the length of the array we use arrayName.length
//		// In string we have length()- this is a method
//		//nums.length - here length is just a field
//		System.out.println(nums.length);
//		
//		//Print the value 3rd and 4th  and last element 
//		System.out.println(nums[2]);//30
//		System.out.println(nums[3]);//40
//		System.out.println(nums[5]);//60
//		
//		// change the value of 3rd element to -555
//		nums [3] = -555;
//		System.out.println(nums[3]);
//		
//		
//		
//		//Print the content or the array
//		//Arrays.toString(array) ----here we convert arrays that we have to string
//		System.out.println(Arrays.toString(nums));
//		
		
		
		
//		String [] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
//		
//		System.out.println(Arrays.toString(workdays)); //[Monday, Tuesday, Wednesday, Thursday, Friday]
//		
//		
//		int len = workdays.length;
//		
//		System.out.println("The length of the array is: " + len);//The length of the array is: 5
//		
//		System.out.println(workdays[2]);//Wednesday
//		
//		System.out.println(workdays[0].equals(workdays[1])); //false 
//		
//		System.out.println(workdays[3].length());//Thursday string has the length of 8 chars
		
		
//		int [] numbers = {10, 20, 30};
//		
//		System.out.println(numbers[0]+numbers[2]); // Sum 10 + 30
		
		
//		String [] fruit = {"Apples", "Pear", "Plum"};
//		
//		System.out.println(Arrays.toString(fruit));// Answer [Apples, Pear, Plum][Apples, Pear, Plum]
//		
//		System.out.println(fruit[0].charAt(0)); // Single String //A cavab olacaq
//		
//		
//int [] numbers = {10, 20, 30, 40, 50, 60, 99};
//		
//		
//		// in the [] we can provide a constant value as well as expressions that evaluate to an int
////		System.out.println(numbers[2-2]);// 2-2 -> int 0
////		System.out.println(numbers[101 - 100]); // 101 - 100 -> int 1
////		System.out.println(numbers[100 - 98]); // 100 - 98 -> int 2
//		
////		System.out.println(numbers[0] + numbers[2]);
////		System.out.println(numbers[0+2]); // numbers[2]
//		
//		// Get the last element of an array dynamically
//		int arrLength = numbers.length;
//		System.out.println(numbers[arrLength - 1]);
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	int [] nums = {-5, -9, 8, 0, 74, 1, 4, 5}; //length starts from 1.. indices starts from 0...
		
		// the length of the array is 7
		// the last index in the given array is 6
		//the formula to get the last index in any array array.length - 1 ->6 (making a dynamic formula)
		
//		System.out.println(nums[nums.length-1]);// legth = 7 -int =6 // will give us last element which is 5
//		
//		
//		nums [1]=0; // will change -9 to 0
//		System.out.println(Arrays.toString(nums));
//		
//		int [] nums1 = {-5, -9, 8, 0, 74, 1, 4, 5};
//		
//		System.out.println(nums1);

		
		
		
		// Practice
		// Option 1
//		int [] value = new int[5];
//		System.out.println(Arrays.toString(value));
//
//		value[0] = 55;
//		value[1] = 443;
//		value[2] = 12;
//		value[3] = 5;
//		value[4] = 387;
//
//		System.out.println(Arrays.toString(value));
//
//		value[2] = 50;
//		
//		System.out.println(value[2]);
//
//		System.out.println(Arrays.toString(value));
//		
//		System.out.println(value.length);
//		
//        // Option 2
//		int [] values = {55, 443, 12, 5, 387};
//
//		System.out.println(value.length);
//		System.out.println(Arrays.toString(value));
		
		

		
		
		/**Ask user to enter 5 numbers and store them using Arrays
		Add all the numbers and print the total of all numbers*/
		
		
		
	//OPTION 1
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Please enter 5 number: ");
//		
//		int [] number = new int[5];
//		
//		number[0] = scan.nextInt();
//		number[1] = scan.nextInt();
//		number[2] = scan.nextInt();
//		number[3] = scan.nextInt();
//		number[4] = scan.nextInt();
//		
//		System.out.println(Arrays.toString(number));
//		
//		System.out.println(number[0] + number[1] + number[2] + number[3] + number[4]);
//		
		
		//OPTION 2
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Please enter 5 number: ");
//		
//				
//		int n[] = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
//		
//		System.out.println(Arrays.toString(n));
//		
//		System.out.println((n[0]+n[1]+n[2]+n[3]+n[4] ));
		
		
		
		
		
		/** Arrays Class methods */

		// Arrays.toString()
//		int[] nums = { 1, 3, 4, 5, 6 };
//		
//		double [] temps = {12.5, 66.8, 99.0};
//		
//		String [] arr = {"One", "Two", "Three"};
//		
//		System.out.println(Arrays.toString(nums));
//		System.out.println(Arrays.toString(temps));
//		System.out.println(Arrays.toString(arr));
		
		// Arrays.sort();
		// It sorts the array in ascending order
//		String [] fruit = {"Plum", "Orange", "Apple", "Pear"};
//		System.out.println("Before sort" + Arrays.toString(fruit));
//		Arrays.sort(fruit);
//		System.out.println("After sort" +Arrays.toString(fruit));
//		Arrays.sort(fruit, Collections.reverseOrder());
//		System.out.println("After sort" +Arrays.toString(fruit));
		
		// sort an int array
		
		// Ascending order
//		Integer [] nums2 = {3, 6, 9, 5, 4, -1};
//		Arrays.sort(nums2);
//		System.out.println(Arrays.toString(nums2));
//		// Descending order
//		Arrays.sort(nums2, Collections.reverseOrder());
//		System.out.println(Arrays.toString(temps));
//		System.out.println(Arrays.toString(nums));
		
		//Arrays.sort();
		// It sort the array in ascending order
		
		

		//Arrays.equals()
		
//		int [] arr1 = {1,2,3};
//		int [] arr2 = {3,2,1};
//		
//		System.out.println(Arrays.equals(arr1, arr2));//false
		
		//Arrays.copyOf()
//		
//		int [] nums = new int[2];
//		
//		nums [0] = 10;
//		nums [1] = 20;
//		
//		System.out.println(Arrays.toString(nums));
		
		
		//nums[2] = 30; // we will not be able to add like it but check the options below
		
		
		// Option 1
//		nums = new int[5];
//		
//		System.out.println(Arrays.toString(nums));
		
		// Option 2
//		int [] newArray = Arrays.copyOf(nums, 10);
//		System.out.println(Arrays.toString(newArray));
		
				
			
		/**MultiDimensional Arrays --check the 3D Arrays*/
		
		// Declare, Init, and populate
        //    Columns    0    1   2   3   4
//      int[][] nums = {{10, 20, 30, 40, 50},   // Row 0
//                        {60, 70, 80, 90, 100},  // Row 1
//                   {-10, -20, -30, -40, -50}};  // Row 2

//       Columns           0    1    2    3   4
//                       ____ ____ ____ ____ ____
//  Row 1 index 0       |    |    |    |    |    |
//                      |____|____|____|____|____|
//  Row 2 index 1       |    |    |    |    |    |
//                      |____|____|____|____|____|
//  Row 3 index 2       |    |    |    |    |    |
//                      |____|____|____|____|____|
		
		
		
		
                // To print the contents of multidimensional array we use Arrays.deepToString();
//                   System.out.println(Arrays.deepToString(nums));

                   // This line will print the addresses of each arrays
//                   System.out.println(Arrays.toString(nums));
		
		
		
		
                // Access the multidimensional array by giving the coordinates
                   // We always use first the number of row and second the number of column
//                   System.out.println(nums[1][2]); // This will print --> 80
//                   System.out.println(nums[2][4]); // This will print --> 50
//                   System.out.println(nums[0][0]); // This will print --> 10
//		
		
//           		// 10, 100, -40
//           		System.out.println(nums[0][0]);
//           		System.out.println(nums[1][4]);
//           		System.out.println(nums[2][3]);
                   
   // If we try to access an index that doesn't exist(out of range) we will get an exception
//                System.out.println(nums[0][6]); // This will throw an exception
//                System.out.println(nums[9][2]); // This will throw an exception
                   
  // The length of a multidimensional array will give us the number of rows, or number of arrays inside
  // To get the length of multidimensional array we use the field "length" arrayName.length
//                System.out.println(nums.length); // Will print --> 3
                
                   
                   
                // Declare and Init
                // Create a matrix 3 rows X 4 columns
//                int[][] numbers = new int[3][4]; // First size is used for rows, second is used for columns

//                    Columns      0    1    2    3
//                               ____ ____ ____ ____
        //  Row 1 index 0       |    |    |    |    |
//                              |____|____|____|____|
        //  Row 2 index 1       |    |    |    |    |
//                              |____|____|____|____|
        //  Row 3 index 2       |    |    |    |    |
//                              |____|____|____|____|

                // Print the contents
//                System.out.println(Arrays.deepToString(numbers));
                
                
        		// Populate the 2D array
        		// Row 1
//        		numbers[0][0] = 10;
//        		numbers[0][1] = 20;
//        		numbers[0][2] = 30;
//        		numbers[0][3] = 40;
//        		
//        		// Row 2
//        		numbers[1][0] = 11;
//        		numbers[1][1] = 22;
//        		numbers[1][2] = 33;
//        		numbers[1][3] = 44;
//        		
//        		// Row 3
//        		numbers[2][0] = -10;
//        		numbers[2][1] = -20;
//        		numbers[2][2] = -30;
//        		numbers[2][3] = -40;
//        		
//        		System.out.println(Arrays.deepToString(numbers));
		
		
		// Jagged arrays - The inner arrays have different lengths

//		String [][] fruit = {{"Apple", "Banana", "Kiwi"},
//				             {"Orange"},
//				             {"Pineapple","Peach","Melon","Grape", "Mango", "Fig"}};
//      Columns      0    1    2    3
//                     ____ ____ ____
//Row 1 index 0       |    |    |    |
//                    |____|____|____|
//Row 2 index 1       |    |
//                    |____|____ ____ ____ ____ ____
//Row 3 index 2       |    |    |    |    |    |    |
//                    |____|____|____|____|____|____|

//		System.out.println(Arrays.deepToString(fruit));
//		
//		System.out.println(fruit.length);
//		
//		// To get the each row length in 2D array we arrayName[rowIndex].length
//		
//		System.out.println("The length of the first row is: " + fruit[0].length);
//		System.out.println("The length of the second row is: " + fruit[1].length);
//		System.out.println("The length of the third row is: " + fruit[2].length);

		// When we declare an 2D array the size of the rows is required
		// The size of the columns is optional

//		int [][] myArray = new int[2][];
//		
//		System.out.println(Arrays.deepToString(myArray));
//		
//		myArray[0] = new int[5];
//		myArray[1] = new int[10];
//		
//		System.out.println(Arrays.deepToString(myArray));
//		
//		myArray[0][0] = 100;
//		myArray[1][0] = 99;
//		
//		System.out.println(Arrays.deepToString(myArray));

//		int[] arr1 = { 20, 88, 99, 77, 90 };
//		int[] arr2 = { 1, 2, 3, 5, 8, 13 };
//
//		int [][] arr2D = {arr1,arr2};
//		
//		System.out.println(Arrays.deepToString(arr2D));
//		
		
		
		
		
		
		// Practice
				// Option 1
				
//				String[][] colors = { { "red", "yellow", "blue" }, 
//						              { "orange", "green", "purple" } };
		//
//				System.out.println("My favorite color is :" + colors[1][2]);
		//
//				colors[0][1] = "pink";
		//
//				System.out.println("My favorite color is :" + colors[0][1]);
				
				// Option 2
				
//		        String[][] colors = new String[2][3];
//				
//		        // Row 1
//				colors[0][0] = "red";
//				colors[0][1] = "yellow";
//				colors[0][2] = "blue";
//				
//				// Row 2
//				colors[1][0] = "orange";
//				colors[1][1] = "green";
//				colors[1][2] = "purple";
//				
//				System.out.println(Arrays.deepToString(colors));
//				
//				System.out.println("My favourite color is " + colors[1][2] );
//				
//				colors[0][1] = "pink";
//				
//				System.out.println("My favourite color is " + colors[0][1] );
//				
//				System.out.println(Arrays.deepToString(colors));
		
		
		
		//TASK
		
		/**Print out the sum of the numbers in the second row of the "table" array. (It should print 18.)
		int[][] table = { {1,4,9},{11,4,3},{2,2,3} ,{5,8,4}};
		Print length of the table array
		Print length of the first row*/
		
					
//			int[][] num = { { 1,4,9}, 
//							{ 11,4,3},
//							{ 2,2,3},
//							{ 5,8,4}};
//		
//			// calculate the sum of the elements from the row number 2
//			System.out.println(num[1][0]+num[1][1]+num[1][2]);
//			
//			System.out.println(num.length);
//			
//			System.out.println(num[0].length);



//System.out.println("My favorite color is :" + colors[1][2]);
//
//colors[0][1] = "pink";
//
//System.out.println("My favorite color is :" + colors[0][1]);

		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
