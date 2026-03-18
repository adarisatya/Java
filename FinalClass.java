package component;

final class FinalClass 
	{
		private final String transactionId;
	    private final double amount;
	    private final String timestamp;
	    private final String accountNumber;
	    
	    public FinalClass(String transactionId, double amount, String timestamp, String accountNumber)
		    {
		    	this.transactionId = transactionId;
		        this.amount = amount;
		        this.timestamp = timestamp;
		        this.accountNumber = accountNumber;
		    }
	    
	    public String getTransactionId() 
		    {
		        return transactionId;
		    }
	    
	    public double getAmount() 
		    {
		        return amount;
		    }
	    
	    public String getTimeStamp()
		    {
		    	return timestamp;
		    }
	    
	    public String getAccountNumber()
		    {
		    	return accountNumber;
		    }
	    
	    public static void main(String args[])
		    {
		    	FinalClass finalobject = new FinalClass("5",5000,"19-MAR-2026 09:00:00","CUS001");
		    	System.out.println(finalobject.getTransactionId());
		    	System.out.println(finalobject.getAmount());
		    	System.out.println(finalobject.getTimeStamp());
		    	System.out.println(finalobject.getAccountNumber());
		    }
	 }
