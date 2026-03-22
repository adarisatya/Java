package component;

public class CallToSuperChild1 extends CallToSuperParent
	{
		private double minimumBalance;
		private double premiumBenefit;
	    private boolean isPremium;
	    
	    // Child class constructor calling super()
	    public CallToSuperChild1(String accountNumber, String accountHolderName,double initialBalance, double minimumBalance) 
		    {
		        // CALL TO SUPER - Initialize parent class constructor
		        super(accountNumber, accountHolderName, initialBalance);
		        
		        // Initialize child class properties
		        this.minimumBalance = minimumBalance;
		        this.accountType = "Premium Savings";
		        this.premiumBenefit = 0.5; // 0.5% additional interest
		        this.isPremium = balance >= minimumBalance;
		        
		        System.out.println("[CHILD CLASS] Premium Savings Account initialized");
		        System.out.println("Minimum Balance Required: $" + minimumBalance);
		        System.out.println("Premium Status: " + (isPremium ? "YES" : "NO"));
		    }
	    
	    public void applyPremiumInterest() 
		    {
		        if (isPremium) 
			        {
			            double interest = balance * premiumBenefit / 100;
			            balance += interest;
			            System.out.println("Premium interest added: $" + interest);
			        } 
		        else 
			        {
			            System.out.println("Minimum balance not maintained. Premium benefits not available.");
			        }
		    }
	    
	    @Override
	    public void displayBalance() 
		    {
		        super.displayBalance(); // Call parent's displayBalance method
		        System.out.println("Premium Status: " + (isPremium ? "YES" : "NO"));
		    }
	    
	    @Override
	    public void printStatement()
		    {
		        super.printStatement(); // Call parent's printStatement method
		        System.out.println("Minimum Balance: $" + minimumBalance);
		        System.out.println("Premium Benefit: " + premiumBenefit + "%");
		    }
	 }