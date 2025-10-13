package component;
public class MethodwithOverloading
	{
		private double balance;
		
			// Deposit just the amount
			public void deposit (double amount)
				{
					balance += amount;
					System.out.println("Deposited : " + amount);
				}
			
			// Deposit with a reference note
			public void deposit (double amount , String reference)
				{
					balance += amount;
					System.out.println("Deposited : " + amount + " " + " , " + "Reference Note is  : " + reference);
				}
			
			 // Deposit with amount, reference, and date
		    public void deposit(double amount, String reference, String date) 
			    {
			        balance += amount;
			        System.out.println("Deposited : " + amount + " " + " , " + "Reference Note : " + reference + " " + " , " + "Date : " + date);
			    }
		    
		    public double getBalance()
			    {
			    	return balance;
			    }
		    
		    public static void main (String args [])
		    	{
		    		MethodwithOverloading account = new MethodwithOverloading();
		    		account.deposit(5000.0);
		    		account.deposit(10000.0 , "Cheque Enabled");
		    		account.deposit (15000.0 , "UPI" , "13-OCT-2025");
		    	}
		    	
	}
   