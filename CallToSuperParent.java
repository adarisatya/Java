package component;

public class CallToSuperParent
	{
		// SUPER CLASS - Parent Bank Account
		protected String accountNumber;
		protected String accountHolderName;
		protected double balance;
		protected String accountType;
	
	    // Super class constructor
	    public CallToSuperParent(String accountNumber, String accountHolderName, double initialBalance) 
		    {
		        this.accountNumber = accountNumber;
		        this.accountHolderName = accountHolderName;
		        this.balance = initialBalance;
		        System.out.println("[SUPER CLASS] Account initialized");
		        System.out.println("Account Number: " + accountNumber);
		        System.out.println("Account Holder: " + accountHolderName);
		        System.out.println("Balance: $" + balance);
		    }
	    
	    public void displayBalance() 
		    {
		        System.out.println("Current Balance: $" + balance);
		    }
	    
	    public void printStatement() 
		    {
		        System.out.println("\n--- ACCOUNT STATEMENT ---");
		        System.out.println("Account Type: " + accountType);
		        System.out.println("Account Number: " + accountNumber);
		        System.out.println("Holder Name: " + accountHolderName);
		        System.out.println("Balance: $" + balance);
		    }
	}	
