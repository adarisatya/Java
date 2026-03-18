package component;

public class SuperChild3 extends SuperParent
	{
		private double loanAmount;
	    private double remainingBalance;
	    private double monthlyEMI; // Equated Monthly Installment
	    private int tenureMonths;
	    private int monthsPaid = 0;
	
	    public SuperChild3 (String accountNumber, String customerName,String customerId, double initialBalance, double loanAmount, int tenureMonths, double interestRate)
		    {
	    		super(accountNumber,customerName,customerId,initialBalance);
	    		this.loanAmount = loanAmount;
	            this.remainingBalance = loanAmount;
	            this.tenureMonths = tenureMonths;
	            this.interestRate = interestRate; // Annual interest rate
	            this.monthlyEMI = calculateEMI();
		    }
	    
	    private double calculateEMI()
		    {
	    		double monthlyRate = interestRate / 12 / 100;
	    		if (monthlyRate == 0) 
		    		{
		    	        return loanAmount / tenureMonths;
		    	    }
	    		return (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, tenureMonths)) / (Math.pow(1 + monthlyRate, tenureMonths) - 1);
		    }   
	    	   
	    public void payEMI(double amount)
		    {
		    	if (amount < monthlyEMI) 
			    	{
			            System.out.println("Insufficient payment. Minimum EMI required: $" + monthlyEMI);
			            return;
			        }
		    	remainingBalance -= amount;
		        monthsPaid++;
		        System.out.println("EMI paid: $" + amount);
		        System.out.println("Remaining loan balance: $" + remainingBalance);
		    }
	    
	    public void displayLoanDetails() 
		    {
		        super.displayAccountInfo(); // Call parent's display method
		        System.out.println("Original Loan Amount: $" + loanAmount);
		        System.out.println("Monthly EMI: $" + monthlyEMI);
		        System.out.println("Remaining Balance: $" + remainingBalance);
		        System.out.println("Months Paid: " + monthsPaid + " / " + tenureMonths);
		    }
	 }
