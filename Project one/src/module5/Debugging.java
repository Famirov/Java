package module5;

public class Debugging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int sum = 0;
		
		for (int i = 1; i <= 5 ; i++) {
			sum *= i;
		}
		
		System.out.println("The sum is: " + sum);
		
		// method calls
		// When we want to debud a method at the line where we have method call we Step Into
		int addition = addNums(17,23);
		
		// Do not Step into in predefined methods
		System.out.println(addition);
		

	}
	
	public static int addNums(int a, int b) {
		
		int result = a + b;
		return result;
		
	}

}
