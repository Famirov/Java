package module8;

public class Employee {
	
	private String firstName;
	private String lastName;
	
	
	
	public Employee(String firstName, String lastName) {
		//1.th method
		// Throw a new unchecked exception using IllegalArgumentException
		if(firstName.isBlank() || firstName == null || lastName.isBlank() || lastName == null) {
			
			throw new IllegalArgumentException("firstName or lastName should not be balnk or null.");
			
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
	}



	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	public static void giveBonus(Employee empl) throws Exception {
		
		//2nd method
		// throw a checked exception
		// If you throw a checked exception include throws in the declaration
		if(empl == null) {
			throw new Exception("The reference cannot be null");
		}
		
		
		System.out.println(empl.firstName + " Congrats you got a bonus!");
		
	}
	
	

}
