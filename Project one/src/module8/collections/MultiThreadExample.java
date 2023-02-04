package module8.collections;

import java.util.ArrayList;
import java.util.*;

public class MultiThreadExample {
	
	
	static List<String> count = new ArrayList<>();
	

	public static void main(String[] args) throws InterruptedException {
		
		// We can create a new thread in java by:
		// Extending the Thread class
		// Implement Runnable Interface
		// Runnable - Functional Interface (int that has one method)

		// Create a new thread
		
		Thread thread2 = new Thread(() -> addElements());
		
		thread2.start(); // this one will be executed by thread2
		addMoreElements(); // this method will be executed by main thread
		
		
		System.out.println(count);
		
	}
	
	public static void addElements(){
		count.add("One");
		count.add("Two");
		count.add("Three");
		count.add("Four");
		count.add("Five");
	}
	
	public static void addMoreElements() throws InterruptedException {
		count.add("Six");
		Thread.sleep(100);
		count.add("Seven");
		Thread.sleep(100);
		count.add("Eight");
		count.add("Nine");
		Thread.sleep(100);
		count.add("Ten");
	}
		


	}

}
