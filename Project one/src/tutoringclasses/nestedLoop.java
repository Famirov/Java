package tutoringclasses;

import java.util.Arrays;

public class nestedLoop {

	public static void main(String[] args) {
		

		
		/**	With For loop
		 * 
		 * 
		 * int[] arr = {4,5,6,7,8,9,10};
	       for(int i=arr.length-1;i>=0;i--) {
		   System.out.print(arr[i]+" ");
	       }
	*/
		
		
		/**
		 * Loop backwards with for each loop
		 */
//		int [] arr = {4, 5, 6, 7, 8, 9, 10};
//		
//		//Initialization
//		int i = arr.length-1; 
//		
//		// For each will never have indexOutOfBoundException
//		for (int num: arr) {
//			
//			
//		// Assigning new value to num 
//		num = arr [i];
//		
//		System.out.print(num + " ");
//		//	Decrementation
//		i--;
//			
//		}
		
		
	
		//Task
		
		String [] arr = {"aa", "bb", "cc", "bb", "ee", "ee", "ee", "ee", "tt"};
		
		
		for (int i = 0; i <= arr.length; i++) {
			
	    for(int j = i + 1; j < arr.length; j++) {  // i+1 we want to compare next element after 1th element "bb"
	    	
	    	if(arr[i].equals(arr[j])) { // cheking the equation 
	    		
				System.out.println(arr[j]);
				
			}
	    	
	      }
			
		}
		
		
		//TASK
		
		/**
		 * Count occurrences of elements in an array 
		 *  "no value"
		 */

//		 Element <element> occurs <num> times
		
//		String [] arr = {"a", "b", "c", "b", "a", "a", "d", "e", "e", "e", "e", "f", "p"};
//		
//		
//		for (int i=0; i< arr.length; i++) {
//			 int counter = 1;
//			
//			for (int j = i+1; j<arr.length; j++ ) {
//				if(arr[i].equals(arr[j])&& !arr[i].equals("no value")) {
//					counter++;
//					arr[j] = "no value";
//					
//				}
//				else {
//					continue;
//				}
//				
//			}
//			
//			if (!arr[i].equals("no value"))
//			System.out.println("Element " + arr[i]+ " occurs " + counter + " times");
			
		}
		
		/**
		    * Find min and max values in an array.
		    */
				
		
//				int[] arr = {99, 5, 77, 4, 1, 55, 80, 34, 7, -4};
//				
//				int min = arr[0],      max = arr[0];
//				
//				for(int num: arr) {
//					if(num < min) {
//						min = num;
//					}
//					if(num > max) {
//						max = num;
//						}
//						
//					}
				
//				System.out.println("The min value is " + min);
//				System.out.println("The max value is " + max);
		
		
		// Using for loop
				
//				int[] arr = {99, 5, -9, 77, 4, 1, 55, 100, 34, 7, -4};
//				int min = arr[0];
//				int max = arr[0];
//				for(int i=0; i < arr.length; i++) {
//					if (min > arr[i]) {
//						min = arr[i];
//					}
//					if (max < arr[i]) {
//						max = arr[i];
//					}
//				}
//				System.out.println("min: " + min);
//				System.out.println("max: " + max);
//		
		
		//TASK
		
//		int[] arr = { 5,7,8,55, 77, -4, 2, 1, 0};
//		
//		int max = arr[0];
//		int secondMax = arr[0];
//		
//		for (int num: arr) {
//			if(max < num) {
//				secondMax = max;
//				max = num;
//			}else if(secondMax< num) {
//				secondMax = num;
//			}
//			
//		}
//		
//		System.out.println("First Max Number: " + max );
//		System.out.println("Second Max Number: " + secondMax );

		
		
//		
//		
//int randomDeger,tekSayi = 0 ,ciftSayi = 0,toplamTek = 0,toplamCift
	
//		
//		int[] dizi= new int[]{10, 25, 34, 1, 66, 79, 98, 100, 199, 21};
//		
//		
//		
//		for(int i=0; i < dizi.length ; i++){
//            if(dizi[i] % 2 == 0){
//                ciftSayi += 1;
//                toplamCift += dizi[i];
//                //System.out.println(ciftSayi + " " + toplamCift);
//            }
//            else{
//                tekSayi += 1;
//                toplamTek += dizi[i];
//                //System.out.println(tekSayi + " " + toplamTek);
//            }
//		
//		}
//		
//		int tekDizi [] = new int [tekSayi];
//        int ciftDizi [] = new int [ciftSayi];
//        int tek = 0, cift = 0;
//        for(int k=0; k < dizi.length; k++){
//            if(dizi[k] % 2 == 0){
//                ciftDizi [cift] = dizi[k];
//                cift ++;
//                //System.out.println(Arrays.toString(ciftDizi));
//            }
//            else{
//                tekDizi[tek] = dizi [k];
//                tek ++;
//                //System.out.println(Arrays.toString(tekDizi));
//            }
//        }
//		
//		
//        System.out.println("Cift dizi: " + Arrays.toString(ciftDizi));
//	
		
		
		
	

	

}
