package module8.setinterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;
public class SetInterface {

	public static void main(String[] args) {
		
		

		
		// given an ArrayList with values remove all duplicaed elements so we have only unique objects 
		
//		List<Integer>nums = new ArrayList<>(List.of(1,2,3,4,4,4,5,6,7,7,8,9,7,6,4,4));
//		
//		List<Integer> uniqueList = new ArrayList<>();
//		
//		for(Integer num: nums) {
//			
//			if(!uniqueList.contains(num)) {
//				uniqueList.add(num);
//			}
//		}
//		
//		
//		System.out.println(nums);
//		System.out.println(uniqueList);
//		
//		
//		
//		//2. Use set -- No duplicates in the set
//		
//		Set<Integer>uniqueNums = new HashSet<>(nums);
//		System.out.println("Set: " + uniqueNums);
		
		
		
//		Set<String>colors = new HashSet<>();
//		
//		//Insert
//		
//		colors.add("yellow");
//		colors.add("red");
//		colors.add("blue");
//		colors.add("black");
//		colors.add("pink");
//		
//		
//		System.out.println(colors); //[red, pink, blue, yellow, black] Doesn't keep the insertion order
//		
//		//if we will try to add duplicated object in set, it will just ignore it.
//		colors.add("red");
//		System.out.println(colors); // will be same answer [red, pink, blue, yellow, black]
//
//		// retrieve an element
//		//colors.get(2); - error: we do not have get() method for set , also no index
//		
//		//find the black coolor and print it
//		
//		//Way1
//		for(String color:colors) {
//			if(color.equals("pink")) {
//				System.out.println("I found the color that I was looking for: " + color);
//			}
//		}
//		
//		//Way2
//		colors.forEach(color->{
//			if(color.equals("pink")){
//				System.out.println("I found the color that I was looking for: " + color);
//			}
//		});
//		
//		//Removal
//		colors.remove("red");
//		System.out.println(colors);
//		
//		colors.remove(0);// will not work since no index
////		System.out.println(colors); //nothing gonna happen
//		
//		
//		// if you want to clear your set
//		colors.clear();
//		System.out.println(colors);
//		
//		//check if my hasSet is empty
//		System.out.println(colors.isEmpty());
//		
//		// null objects 
//		colors.add(null);
//		colors.add(null);
//		colors.add(null);
//		
//		
//		System.out.println(colors);
//		
//		//Get the size of the set
//		System.out.println(colors.size());
//		
//		/*TreeSet*/
//		// What do we do if we need to sort a set?
//		//We need to use TreeSet in order to get sorted Set DS
//		//TreeSet will initially sort the Set in Asc Order
//		//TreeSet does not alow null values
//		
//		Set<String> sortedColors = new TreeSet<>();
//		sortedColors.add("Cyan");
//		sortedColors.add("Magenta");
//		sortedColors.add("Purple");
//		sortedColors.add("Turqoise");
//		sortedColors.add("Neon");
//		sortedColors.add("Violeti");
//		sortedColors.add("Maroon");
//		sortedColors.add("Indigo");
//		sortedColors.add("Scarlet");
//		sortedColors.remove("null");
//		sortedColors.remove("null");
//		//sortedColors.add("null"); // complier will not complain if you add a null value, the exception occurs at Runtime
//		
//		System.out.println(sortedColors);
		
//		
//		Set<Integer>nums = new LinkedHashSet<>(List.of(3,42,3,4,6,7,8,33,1,45,7,5,3,4321,5,56,23,-1));
//		
//		
//		Set<Integer>insertionOrderColors = new LinkedHashSet<>
		
		
		
/*		Set<Integer> nums = new HashSet<>(List.of(1,2,34,45,6));
		System.out.println(nums);
		
		List<Integer> listNums = new ArrayList<>(List.of(1,746,-99,234,4124,634));
		
		// add all elements of a list to the set
		nums.addAll(listNums);
		System.out.println(nums); **/		
		
		
		/*Task*/
		
/*1. Create  String type of set which you can add null value
  2. Add these elements into set. (Tom, John, Alex, Peter, null, Tom)
  3. Get size of set 
  4. Create a String type of ArrayList and add Oliver and William into list
  5. Add that list into set and print the set*/	
		
	
		/*
		 * When adding value to the constructor we can use:
		 * Arrays.asList() - will allow to add null values 
		 * List.of() - will throw an exception when null value provided but will allow duplicates
		 * Set.of() - will throw an exception when null value provided but will NOT allow duplicates
		 */
		
		
	//	Set<String> names = new HashSet<>(Arrays.asList("Tom","John","Alex","Peter", null, "Tom")); // Arrays.asList() allows to pass null values to constructor
	//  Set<String> names2 = new HashSet<>(List.of("Tom","John","Alex","Peter", null, "Tom")); // Will throw a NullPoiterException
    //  Set<String> names3 = new HashSet<>(Set.of("Tom","John","Alex","Peter", "Tom", "Tom")); // Will throw a IllegalArgumentException
		
////		1. Create  String type of set which you can add null value
//			// 2. Add these elements into set. (Tom, John, Alex, Peter, null, Tom)
//			Set<String> names = new HashSet<>();
//			names.add("Tom");
//			names.add("John");
//			names.add("Alex");
//			names.add("Peter");
//			names.add(null);
//			names.add("Tom");
//			
//			// 3. Get size of set 
//			System.out.println(names.size());
//			
//			// 4. Create a String type of ArrayList and add Oliver and William into list
//			List<String> namesArr = new ArrayList<>();
//			namesArr.add("Oliver");
//			namesArr.add("William");
//			
//			// 5. Add that list into set and print the set
//			names.addAll(namesArr);
//			System.out.println(names);
		
		
		/*Map Interface
		 * It doesn't extend the Collection Interface
		 * It is a part of Collection Framework
		 * A map is a mapping between a key and value
		 * The keys in the maps have to be unique
		 * 
		 * Some examples to use maps:
		 * We can map error messages and error codes
		 * Cities mapped by zipcodes
		 * Employee table **/
			
			
			
			
//		/*Classes that extedn Map Interface*/
//		/*HasMap | LinkedHasMap | Hastable | TreeMap */
//			
//			
//		/*HasMap*/
//		//HasMap may have one null key
//		//It can duplicate values
//		//We can have multiple null values since allowed duplicates
//		//It maintains no order
//			
//		Map <String, Double>phones = new HashMap<>();
//		
//		//Insertion - put();
//		
//		phones.put("iPhone 14", 1200.00);
//		phones.put("Glaxy S22", 1100.00);
//		phones.put("Nokia 6300", 450.00);
//		phones.put("LG 5", 899.00);
//		
//		System.out.println(phones);
//		
//		//try to put same key in the map
//		//this will update the value of that key
//		phones.put("iPhone 14", 1300.00);
//		System.out.println(phones);
//		
//		//put() if finds the key it will update the valu
//		//if not found will add a new element
//		phones.put("iPhone 13", 1300.00);
//		System.out.println(phones);
//		
//		//replace() method is used to update an existing entry
//		//if not found it will do nothing
//		phones.replace("LG 5", 999.90);
//		System.out.println(phones);
//		
//		
//		//what we do if we need to add a new entry to map only if they is not present
//		//we use putIfAbsent()
//		
//		phones.putIfAbsent("Nokia 6300", 555.90);
//		System.out.println(phones);
//		
//		phones.putIfAbsent("Nokia 3310", 250.99);
//		System.out.println(phones);
//			
//		
//		//How do we remove entries
//		phones.remove("Nokia 6300");
//		System.out.println(phones);
//		
//		phones.remove("LG");//if no key found no entry will be removed
//		System.out.println(phones);
//		
//		//remove an entry only if both key and value mathces
//		phones.remove("LG 5", 888.90);
//		System.out.println(phones);
//			
//		// Check if the map contains a key
//		System.out.println(phones.containsKey("LG 5")); //boolean will give true
//		System.out.println(phones.containsKey("Nokia 3310"));//boolean will give true
//		
//		//Check if map contains a specific value
//		System.out.println(phones.containsValue(1300.00));//boolean will give true
//		
//		//retrive all the key-keySet()
//		Set<String>myKeys = phones.keySet();
//		System.out.println(phones.keySet());//will give us an attribute names [iPhone 14, LG 5, iPhone 13, Glaxy S22, Nokia 3310]
//		
//		
//		//retrive all the values as a collection
//		Collection<Double>values = phones.values();
//		System.out.println(phones.values());
//		
//		
//		//what if we add nulls?
//		
//		phones.put(null, null);
//		System.out.println(phones);
//		
//		phones.put(null, null);	// it will just override the other null value.
//		System.out.println(phones);
//		
//		phones.put(null, 199.0);
//		System.out.println(phones);
//		
//		//We can have multiple null values if we have unique values infront of it
//		phones.put("iPhone 15", null);
//		phones.put("iPhone 15 Max", null);
//		phones.put("iPhone 15 Mini", null);
//		System.out.println(phones);
//		
//		
//		
//		//Retrieve- Searching for specific value
//		
//		System.out.println(phones.get("iPhone 13"));
//		System.out.println(phones.get("iPhone"));
//		
//		
//		//We can get the size od a map
//		System.out.println(phones.size());// it will tell how many entries we currently have
//		
//		
//		//VA* Virgina
//		Map<String, String>states = new HashMap<>();
//		states.put("VA", "Virginia");
//		states.put("MD", "Maryland");
//		states.put("NY", "New York");
//		states.put("CA", "California");
//		
//		System.out.println(states);
//		
//		
//		//2. Get all the keys of map and print them each in new line
//		System.out.println("===============KEYS=================");
//		for(String st: states.keySet()) {
//			System.out.println(st);
//		}
//
//		
//		
//		
//		//3. Get all the values of map and print them
//		System.out.println("===============VALUES================");
//		
//		for(String eachValue: states.values()) {
//			System.out.println(eachValue);
//		}
//		System.out.println("============Specific Value============");
//		//4. Get the value of MD
//		System.out.println(states.get("MD"));
//		
//		System.out.println("=======================================");
//		//We need to iterate through each entry, not seperatly through keys and values
//		
//		//Map.Enttry
//		
//		for(Map.Entry<String, String>entry: states.entrySet()) {
//			
//			System.out.println(entry);
//			if(entry.getKey().equals("NY")) {
//				
//				System.out.println("This is the state I was looking for: " + entry.getValue());
//				break;
//			}
//		}
//		
//		
//		/**INTERVIEW QUESTION**/
//		//people 
//		// p= 2 e=2 0=1 l=1
//		
//		//Count a letters in a string
//		String str ="people";
//		
//		//We can use map for this task
//		//The idea is to have each letter as key
//		//And the count of it as value
//		
//		Map<String, Integer>map = new HashMap<>();
//		
//		
//		//We create a loop to itereate through the string
//		for(int i =0; i<str.length(); i++) {
//			
//			//We can store correct character in  a string to simplify the code later
//			//We can do the same for the value
//			String currentLetter = str.charAt(i)+ ""; //String.valueOf(Str.charAt(i));
//			Integer currentValue = map.get(currentLetter);
//			
//			//We need to check if the letter that acts as a key in map is already present
//			//If not present we will use put() method to add a new entry
//			//The key will be the letter we currently have 
//			//The value will be 1 since it initial count
//			//If the key is already present we just need to modify the value
//			//Basic increase by 1
//			if(!map.containsKey(currentLetter)) {
//				map.put(currentLetter, 1);
//			}else {
//				map.replace(currentLetter, currentValue + 1);
//			}
//		}
//		System.out.println(map);
		
		
		
//		Map<String,String>emp1 = new HashMap<>();
//		
//		emp1.put("FirstName","John");
//		emp1.put("Lastname","Simpson");
//		emp1.put("Age","33");
//		emp1.put("EmployeId","77564");
//		
//		Map<String,String>emp2 = new HashMap<>();
//		
//		emp2.put("FirstName","Bart");
//		emp2.put("Lastname","Simpson");
//		emp2.put("Age","32");
//		emp2.put("EmployeId","88564");
//		
//		Map<String,String>emp3 = new HashMap<>();
//		
//		emp3.put("FirstName","Lisa");
//		emp3.put("Lastname","Simpson");
//		emp3.put("Age","30");
//		emp3.put("EmployeId","89564");
//		
//		
//		//How to Iterate
//		
//		List<Map<String,String>>employees = new ArrayList<>();
//		
//		employees.add(emp1);
//		employees.add(emp2);
//		employees.add(emp3);
//		
//		for(int i =0; i<employees.size(); i++) {
//			
//			System.out.println(employees.get(i));
//			
//			if(employees.get(i).get("FirstName").equals("Bart")){
//				System.out.println("Employees age is: " + employees.get(i).get("Age"));
//				
//			}
//				
//		}
		
		
		
		/*----------HashTable--------------------*/
		/* 1.No null keys and no null values!
		 * 2.It's Thread-safe, means synchronized, and slower
		 * 3.It maintains no insertion order*/
		
		
//		Map<String, String>states = new Hashtable<>();
//		states.put("VA", "Virginia");
//		states.put("MD", "Maryland");
//		states.put("NY", "New York");
//		states.put("CA", "California");
//		
////		states.put("Nj", null);// if we try to add a null value, we will get NullPointer Exception
////		System.out.println(states);
//		
//		states.put(null, "California");// if we try to add a null value, we will get NullPointer Exception
//		System.out.println(states);
		
		
		
		/*---------------------LinkedHashMap-------------------*/
		
//		/* 1.We can have one null key, and multiple null values
//		 * 2.It will maintain insert insertion order*/
//		
//		
//		Map<String, String>states = new LinkedHashMap<>();
//		states.put("VA", "Virginia");
//		states.put("MD", "Maryland");
//		states.put("NY", "New York");
//		states.put("CA", "California");
//		
//		states.put("NJ", null);// we can apply it
//		System.out.println(states);
		
		
		
		/*---------------------------TreeMap---------------------------------------*/
		
		
		/* 
		 * 1.The map will be ordered in asc order by its keys
		 * 2.No null values allowed for keys - no nulls for sorting!
		 * 3.We can have multiple null values
		 * */
		
//		Map<String, String> states = new TreeMap<>();
//		states.put("VA", "Virginia");
//		states.put("MD", "Maryland");
//		states.put("NY", "Ney York");
//		states.put("CA", "California");
//		
//		System.out.println(states);
//		
////		states.put(null, "California"); // if we try to add a null value will get a NUllPointer Ex
////		System.out.println(states);
//		
//		states.put("NJ", null);
//		states.put("GA", null);
		
		
		
		/*-------------------------String Builder-------------------------*/
		
		/* 1.Since Strings are immutable we sometimes need to modify the string object
		 * 2.And for this purpose we use StringBuildere/StringBuffer*/
		
		/* StringBuilder - is not synchronizde / not thread-safe- faster
		 * StringBuffer - is synchronized/ thread-safe-slower*/
		
		/*Syntax 1*/
//		String school = new String("Yoll");
//		school.concat("Academy");
//		System.out.println(school);
		
		
		/*Syntax 2*/
//		StringBuilder schoolName = new StringBuilder("Yoll");
//		System.out.println(schoolName);
//		schoolName.append(" Academy");
//		System.out.println(schoolName);
		
		
//		/*Syntax 3*/
//		
//		StringBuffer city = new StringBuffer("Washington");
//		city.append(" DC");
//		System.out.println(city);
//		
//		
//		//get a specific char in the stringBuffer
//		System.out.println(city.charAt(0));
//		
//		// delete a substring from the stringBuffer
//		city.delete(3, 7);
//		System.out.println(city);
//		
//		
//		//delete a specific charAt in StringBuffer and StringBuilder
//		city.deleteCharAt(0);
//		System.out.println(city);
//		
//		
//		//insert back the deleted character
//		city.insert(0, "W");
//		System.out.println(city);
//		
//		city.insert(3, "hing");
//		System.out.println(city);
//		
//		city.insert(0, "The history of ");
//		System.out.println(city);
//		
//		//get the length of the string 
//		System.out.println(city.length());
//		
//		//reverse the string
//		System.out.println(city.reverse().substring(0,14));
//		
//		//get a substring
//		System.out.println(city.substring(15));
		
		
		/*Create a StringBuilder object with value: States
		  Add word United in front of it
		  Add America to the end of it
	  	  Remove states word from it*/
		
//		StringBuilder s1 = new StringBuilder("States");
//		System.out.println(s1);
//		s1.insert(0,"United ");
//		System.out.println(s1);
//		s1.append(" America");
//		s1.delete(7, 14);
//		System.out.println(s1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
	}	

}
