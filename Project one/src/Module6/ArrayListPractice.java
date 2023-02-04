package Module6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice {

	public static void main(String[] args) {
//
////		ArrayList<String> fruit = new ArrayList<>(Arrays.asList("Pear", "Apple", "Plum", "Orange", "Grape"));
////		
////		System.out.println(fruit);
////		
////		// add new fruit to array at specific index
////		fruit.add(2, "Hurma");
////		
////		System.out.println(fruit);
////		
////		fruit.add("Dates");
////		
////		System.out.println(fruit);
////		
////		fruit.set(2, "Persimmon");
////		
////		System.out.println(fruit);
////		
////		
////		// Sort the list asc
////		Collections.sort(fruit);
////		
////		System.out.println(fruit);
////		
////		Collections.reverse(fruit);
////		
////		System.out.println(fruit);
////		
////		// When we sort our lists/data structures we need to make sure there are no null values
////		// If we have null value the compiler will throw an exception
////		
////		fruit.add(null);
////		fruit.add(null);
////		fruit.add(null);
////		
////		System.out.println(fruit);
////		
////		Collections.sort(fruit);
//		
//		//Task 1
//		// Task
////		.Create an Integer  type of ArrayList then add 1,7,4,12 to that list.
////		2. Then add 5 to index 1 and print the list.
////		3. Check if list contains 6
////		4. Print size of list.
//		
////		// Option 1 - initialize through constructor
////		
////		    ArrayList <Integer>  nums = new ArrayList<>(Arrays.asList(1,7,4,12));
////		    nums.add(1,5);
////		    System.out.println(nums);
////		    System.out.println(nums.contains(6));
////		    System.out.println(nums.size());
////		
////		// Option 2 - initialize through add method
////		    
////			ArrayList<Integer> list =new  ArrayList<Integer>();
////			
////			list.add(1);
////			list.add(7);
////			list.add(4);
////			list.add(12);
////			list.add(1, 5);
////			
////			System.out.println(list.contains(6));
////			System.out.println(list);
////			System.out.println("Size of ArrayList: " + list.size());
//		
//		
//		// Task 2
//		/*
//		 * 1.Create an Integer type of ArrayList then add 2,5,3,8 to that list. 
//		 * 2. Then add 9 to index 0 and print the list. 3. Print size of list. 4.Remove 3 from
//		 * list. 5. Check if list contains 3 or not 6. Check if list is empty or not 7.
//		 * Sort the arraylist in ascending order.
//		 */
//		
////		ArrayList<Integer> numb = new ArrayList<>(Arrays.asList(2,5,3,8));
////		
////		numb.add(0,9);
////		System.out.println(numb);
////		System.out.println("Size of ArrayList: " + numb.size());
////		
////		numb.remove(Integer.valueOf(3));
////		// remove.(int index) -- numb.remove(3);
////		// remove.(Object value)-- numb.remove(Integer.valueOf(3)); or numb.remove(numb.indexOf(3));
////		
////		System.out.println(numb.contains(3)); //false
////		System.out.println(numb.isEmpty());
////		Collections.sort(numb);
////		System.out.println(numb);
//		
//		
//		
//		
//		// Iterate through a list 
//		
//				ArrayList<String> fruit = new ArrayList<>(Arrays.asList("Pear", "Apple", "Plum", "Orange", "Grape"));
//				
//				// For Loop
//				
//				System.out.println("===========================");
//				System.out.println("For Loop");
//				
//				for(int i = 0; i < fruit.size(); i++) {
//					System.out.println(fruit.get(i));
//				}
//				
//				System.out.println("===========================");
//				
//				// For Each Loop - Enhanced Loop
//				System.out.println("For Each Loop");
//				
//				// "Pear", "Apple", "Plum", "Orange", "Grape"
//				
//				for(String eachFruit : fruit) {
//					System.out.println(eachFruit);
//				}
//				
//				System.out.println("===========================");
//				
//				System.out.println("Using Iterator");
//				Iterator it = fruit.iterator();
//				
//				while(it.hasNext()) {
//					System.out.println(it.next());
//				}
//				
//				System.out.println("===========================");
//				
//				System.out.println("Using Lambda Expression");
//				
//		        fruit.forEach(eachFruit -> {
//		        	
//		        	System.out.println(eachFruit);
//		        	
//		        });
//		        
//				System.out.println("===========================");
//				
//				
//				 /* When converting a list to array list we need to pay attention to way of converting 
//			     * If we try to assign an array to a list directly 
//			     * The list will inherit the size of the array
//			     * You will get issues if try to modify it's range
//			     * */
//				String [] cities = {"Baku", "Istambul", "Kiev"};
//				// We use List as type 
//				List<String> list = Arrays.asList(cities);
//				list.add("Paris"); // we will get a runtime exception if we try to add a new item to the list
//				System.out.println(list);
//				
//				// Do not try to assign directly to the list 
//				// Option 2
//				// Create array
//				String [] cities = {"Baku", "Istambul", "Kiev"};
//				// Create list
//				ArrayList<String> listCities = new ArrayList<>();
//				// try to assign the array to list directly 
//				// listCities = Arrays.toList(cities); // will not work
//				// or
//				// listCities = Arrays.asList(cities); // will not work
//				
//				
//				// To convert an array to a array list we can do it through constructor
//				// Basically passing the values of an array to the list 
//				// Having an Integer array
//				Integer [] nums = {1,3,5,6,7,8,9};
//				// Create an array list with same type elements 
//				// Pass to the constructor the array as list
//				ArrayList<Integer> listNums = new ArrayList<>(Arrays.asList(nums));
//				System.out.println(listNums);
//
//		        // This approach will keep the list dynamic 
//		
//		
//		
//		
//
	}

}
