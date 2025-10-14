package component;

public class Objects 
	{
		private double balance;
			
			//Declaration of Constructor - A constructor is a special method that is called when you create a new object of the class . Its job is to initialize the object.
			public Objects(double initialBalance)
				{
					this.balance = initialBalance;
				}
			// Withdraw just the amount
			public void withdraw (double amount)
				{
					if (amount <= balance)
						{
							balance -= amount;
							System.out.println("Withdrawn Amount : " + amount);
						}
					else
						{
							System.out.println("Insufficient Balance for : " + amount);
						}
				}
			
			// Withdraw with amount and description
			public void withdraw (double amount , String description)
				{
					if (amount <= balance)
						{
							balance -= amount;
							System.out.println("Withdrawn Amount : " + amount + "Description : " + description);
						}
					else
						{
							System.out.println("Insufficient Balance for : " + amount + " Description : " + description);
						}
				}
			
			// Withdraw with amount, description, and date
		    public void withdraw(double amount, String description, String date) 
			    {
			        if (amount <= balance) 
				        {
				            balance -= amount;
				            System.out.println("Withdrawn: " + amount + ", Description : " + description + ", Date: " + date);
				        } 
			        else 
			        	{
				            System.out.println("Insufficient balance for: " + amount + " Description : " + description + " on " + date);
			        	}
			    }
		    public double getBalance()
			    {
			    	return balance;
			    }
		    
		    public static void main(String[] args) 
				{
		    		Objects account = new Objects(5000.0);
		    		account.withdraw(1000.0);
		    		account.withdraw(1500.0, "ATM Transfer");
		    		account.withdraw(2000.0, "Online Transfer", "14-OCT-2025");
		    		
		    		System.out.println("Remaining balance : " + account.getBalance());
				}
		    
		}
