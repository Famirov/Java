package module5.lesson5;

public class WellsFargoBankAccount {

	//Create a BankAccount Class
	//Create below variables:
	    //bankName → static

	    //accountType
	    //accountNumber
	    //accountHolder
	    //Balance

	//Create below methods:
	//displayBalance


	//Withdraw
	//Deposit
	//openAccount(with all the parameters)
	//showBankPolicy -> static



		
		/* State of the Bank Object */
		public static final String BANK_NAME = "Wells Fargo"; 
		public static final String BANK_POLICY = "Terms & Conditions Apply";
		
		public String accountType;
		public String accountNumber;
		public String accountHolder;
		public double balance;
		
		/* Behavior described by methods */
		
		public static void displayPolicy() {	
			System.out.println("Bank Name: " + BANK_NAME);
			System.out.println("Bank Policy: " + BANK_POLICY);
		}
		
		
		/* Display balance with specific format */
		// 160.9946658
		public void displayBalance() {
			System.out.print("$");
			System.out.format("%,.2f", balance);
			System.out.println();
		}
		
		/* Withdraw */
		// This method has to check if balance is more than amount we try to withdraw
		
		public void withdraw(double amount) {
			
			if(balance >= amount) {
				balance -= amount;
			} else {
				System.out.println("Sorry you do not have sufficient funds to complete this transaction!");
			}
			
			displayBalance();

		}
		   
		
		public void deposit(double depositAmount) {
			
			balance += depositAmount; // balance = balance + depositAmount
			System.out.println("You have successfully deposited $" + depositAmount);
			displayBalance();
			
		}
		
		/* This method will take initial values for the account fields 
		 * All these values we assign to the instance attributes */

		public void openAccount(String fullName, String userAccountNumber, double initBalance, String userAccountType ) {
			
			accountHolder = fullName;
			accountNumber = userAccountNumber;
			balance = initBalance;
			accountType = userAccountType;
	        System.out.println("Account successfully created!");
			
		}
	}

