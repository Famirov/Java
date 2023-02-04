package week15;

import java.util.Scanner;

public class Methodswithreturn6watertax {

	public static void main(String[] args) {
		
		
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter Water Units:");
	    
	    double wu = input.nextDouble();
		
	   System.out.println(waterTax(wu));
		
/*161. Methods-with-return-6-water-tax
 * 
 * Instructions from your teacher:

waterTax method calculates a water bill, the method gets a double and returns a double.

The more water you use the more it will cost you (as a fine for wasting water).

for example:

waterTax(50)

returns 30

waterTax(55)

returns 49.5

waterTax(101)

returns 140.9

waterTax(151)

returns 235.9

the regular calculation under 50 is

bill = units * 0.60;

above 50 is:

bill = units * 0.90;

above 100 the calculation is like above 50 but with a 50 as fine

and above 150 its the same as above 50 (units *0.90) but with a 100 fine added to the price .*/		


		
	}
	
	public static double waterTax(double wu) {
		double bill =0.0;
		
		if (wu>=0 && wu <= 50) {
			return bill= wu*0.60;
		}else  if (50<wu && wu<=100  ){
			return bill= wu*0.90;
		}else if (100<=wu && wu<=150) {
			return bill =wu*0.90+50;
		}else {
		return bill = wu* 0.90+100;
		
		}
	}
	
	
	
	

}
