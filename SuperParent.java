package component;

public class SuperParent 
	{
		 // Common properties for all bank accounts
	    protected String accountNumber;
	    protected String customerName;
	    protected String customerId;
	    protected double balance;
	    protected String accountStatus;
	    protected String bankName;
	    protected double interestRate;
	    
	    // Super Class Constructor
	    public SuperParent(String accountNumber,String customerName,String customerId,double initialbalance)
		    {
		    	this.accountNumber = accountNumber;
		    	this.customerName = customerName;
		    	this.customerId = customerId;
		    	this.balance = initialbalance;
		    	this.accountStatus = "Active";
		    	this.bankName = "ICICI";
		    	this.interestRate = 0.0;
		    }
	    
	    // Common methods in super class
	    public void deposit(double amount)
		    {
		    	if (amount > 0)
			    	{
			    		balance += amount;
			    		System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
			    	}
		    }
	    
	    public void withdraw(double amount)
		    {
		    	if (amount > 0 && balance >= amount)
			    	{
			    		balance -= amount;
			    		System.out.println("Withdrawn: $" + amount + " | New Balance: $" + balance);
			    	}
		    	else
			    	{
		    			System.out.println("Insufficient funds or invalid amount!");
			    	}
		    }
	    
	    public double getBalance() 
		    {
		        return balance;
		    }
	    
	    public void displayAccountInfo() 
		    {
		        System.out.println("Account Number: " + accountNumber);
		        System.out.println("Customer Name: " + customerName);
		        System.out.println("Customer ID: " + customerId);
		        System.out.println("Current Balance: $" + balance);
		        System.out.println("Account Status: " + accountStatus);
		        System.out.println("Bank: " + bankName);
		    }
	    
	    public void closeAccount() 
		    {
		        accountStatus = "Closed";
		        System.out.println("Account closed successfully");
		    }
	  }
