package component;

public class CallToSuperChild2 extends CallToSuperParent	
	{
		private String businessName;
	    private String businessType;
	    private int monthlyTransactionLimit;
	    private int transactionCount = 0;
	    
	    // Child class constructor calling super()
	    public CallToSuperChild2(String accountNumber, String accountHolderName,double initialBalance, String businessName,String businessType, int monthlyTransactionLimit) 
		    {
		        
		        // CALL TO SUPER - Initialize parent class constructor
		        super(accountNumber, accountHolderName, initialBalance);
		        
		        // Initialize child class properties
		        this.businessName = businessName;
		        this.businessType = businessType;
		        this.monthlyTransactionLimit = monthlyTransactionLimit;
		        this.accountType = "Business Account";
		        
		        System.out.println("[CHILD CLASS] Business Account initialized");
		        System.out.println("Business Name: " + businessName);
		        System.out.println("Business Type: " + businessType);
		        System.out.println("Monthly Transaction Limit: " + monthlyTransactionLimit);
		    }
	    
	    public void deposit(double amount) 
		    {
		        balance += amount;
		        transactionCount++;
		        System.out.println("Deposit: $" + amount);
		        System.out.println("Transaction Count: " + transactionCount + " / " + monthlyTransactionLimit);
		    }
	    
	    @Override
	    public void printStatement()
		    {
		        super.printStatement(); // Call parent's printStatement method
		        System.out.println("Business Name: " + businessName);
		        System.out.println("Business Type: " + businessType);
		        System.out.println("Transactions This Month: " + transactionCount);
		    }
	}
