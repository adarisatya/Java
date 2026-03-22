package component;

public class SuperChild2 extends SuperParent
	{
		private double overdraftLimit = 10000;
		private static final double MONTHLY_MAINTENANCE_FEE = 25.0;
	    private boolean chequebookIssued = false;
	    
	    public SuperChild2(String accountNumber, String customerName,String customerId, double initialBalance, double overdraftLimit)
		    {
		    	super(accountNumber,customerName,customerId,initialBalance);
		    	this.overdraftLimit=overdraftLimit;
		    	this.interestRate = 0.0; // 0% interest rate -- No interest on current account
		    }
	    
	    @Override
	    public void withdraw(double amount)
		    {
		    	double TotalAvaialble = balance + overdraftLimit;
		    	if(amount > TotalAvaialble)
			    	{
		    		System.out.println("Cannot withdraw. Overdraft limit exceeded!");
		            return;
			    	}
		    	super.withdraw(amount); // Call parent's withdraw method
		    }
	    
	    public void issueChequebook()
		    {
	    		chequebookIssued = true;
	    		System.out.println("Chequebook issued for account: " + accountNumber);
	    		System.out.println("Chequebook issued status: " + chequebookIssued);
		    }
	    
	    public void deductMonthlyMaintenanceFee()
		    {
		    	balance-=MONTHLY_MAINTENANCE_FEE;
		    	System.out.println("Monthly maintenance fee deducted: $" + MONTHLY_MAINTENANCE_FEE);
		        System.out.println("New Balance: $" + balance);
		    }
	}
