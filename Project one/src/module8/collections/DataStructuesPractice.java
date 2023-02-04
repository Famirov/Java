package module8.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class DataStructuesPractice {

	public static void main(String[] args) {

		ArrayList<String>list = new ArrayList(Arrays.asList("One","Two", "Three"));
		
		
		// Collections sort
//		Collections.sort(list);
//		System.out.println(list);
//		
//		
//		
//		List <String> names = new ArrayList<>();
//		
//		names.addAll(Arrays.asList("Shabnam", "Rahim", "Kamran", "Javid", "Vusal", "Maryna"));
//		
//		System.out.println(names);
//		
//		names.add("Evgenii");
//		
//		System.out.println(names);
//		
//		System.out.println("=========================================================================");
//		List<String>teams = new LinkedList<>();
//		
//		teams.add("Juventus");
//		teams.add("Galatasaray");
//		teams.add("Real Madrid");
//		teams.add("PSJ");
//		
//		teams.add(4,"Barcelona");
//		
//		Collections.sort(teams);
//		System.out.println(teams);
		
		
		
		int integer = 17;
		//Thread A
		integer++; // 18
		//Thread B
		integer++; // 19
		
		System.out.println(integer);
		
		
		/* Vector */ 
		List<String> cars = new Vector<>();
		cars.add("BMW");
		cars.add("Mercedes");
		cars.add("Audi");
		cars.add("Ford");
		
		System.out.println(cars);
		
		cars.set(2, "Acura");
		
		cars.set(cars.indexOf("Mercedes"), "Bentley");
		
		System.out.println(cars);
		
		cars.remove("Ford");
		
		System.out.println(cars);
		
		
		
		
		// Stack uses the concept of LIFO
				// Use Push() to add an element on top of the stack
				// Use Peek() to check what element is on top
				// Use Search() to get the location of the element 
				// Use pop() to remove and return the removed item
				// Remember: Stack doesn't use index, it uses location based on the top item which is always at loc 1.
				
				
				Stack<String> books = new Stack<>();
				books.push("Harry Potter");
				books.push("Power of Now");
				books.push("Art of War");
				books.push("Alice in Wanderland");
				books.push("The Alchemist");
				
				
				System.out.println(books);
				
				// Instead of indexOf() we search()
				System.out.println(books.search("The Alchemist"));
				
				System.out.println(books.search("Power of Now"));
				
				// See what is on top of the stack
				
				System.out.println("On top is: "+books.peek());
				
				// Remove an item from stack
				// pop() method removes and returns the element
				
				String removedItem = books.pop();
				
				System.out.println("Removed book: " + removedItem);
				System.out.println(books);
		
		
		

	}

}
