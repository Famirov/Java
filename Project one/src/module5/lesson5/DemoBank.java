package module5.lesson5;

import java.util.Scanner;

public class DemoBank {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		WellsFargoBankAccount miamiBranch = new WellsFargoBankAccount();
 
		/* Open an account */
		miamiBranch.openAccount("Omar Ramo", "7867778912345", 2000, "Checking");

		/* Add a deposit */
		System.out.println("Deposition process..");
		System.out.println("Enter deposit amount:");
		miamiBranch.deposit(input.nextInt());
		
		/* Make a withdraw */
		System.out.println("Withdrawal process..");
		miamiBranch.withdraw(2000);
		
		
	}

}
