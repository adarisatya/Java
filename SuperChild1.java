package component;

public class SuperChild1 extends SuperParent
	{
		private double minimumBalance = 500;
	    private int monthlyWithdrawalLimit = 3;
	    private int withdrawalsThisMonth = 0;
	    
	    public SuperChild1(String accountNumber, String customerName,String customerId, double initialBalance)
		    {
		    	 super(accountNumber, customerName, customerId, initialBalance);
		         this.interestRate = 4.5; // 4.5% interest rate
		    }
	    
	    public void applyMonthlyInterest() 
		    {
		        double interest = balance * interestRate / 100;
		        balance += interest;
		        System.out.println("Monthly interest applied: $" + interest);
		        System.out.println("New Balance with interest: $" + balance);
		    }
	    
	    @Override
	    public void withdraw(double amount) 
		    {
		        if (withdrawalsThisMonth >= monthlyWithdrawalLimit) 
			        {
			            System.out.println("Monthly withdrawal limit exceeded!");
			            return;
			        }
		        
		        if (balance - amount < minimumBalance) 
			        {
			            System.out.println("Cannot withdraw. Minimum balance of $" + minimumBalance + " must be maintained!");
			            return;
			        }
		        
		        super.withdraw(amount); // Call parent's withdraw method
		        withdrawalsThisMonth++;
		    }
	    
	    public void resetMonthlyWithdrawals() 
		    {
		        withdrawalsThisMonth = 0;
		        System.out.println("Monthly withdrawal counter reset");
		    }
	 }
