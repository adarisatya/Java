package component;

public class DefaultConstructor
	{
		String accountholder;
		double balance;
		String accountType;
		
		public void displayDetails()
			{
				System.out.println("Account Holder : " + accountholder);
				System.out.println("Balance : " + balance);
				System.out.println("Account Type : " + accountType);
			}
		
		// The default constructor is created by the compiler and returned the default values to the object like 0, null, etc., depending on the type.
		/* DefaultConstructor() 
			{
				accountholder = null;
		        balance = 0.0;
		        accountType = null;
			} */
		
		public static void main(String[] args) 
			{
				DefaultConstructor Default = new DefaultConstructor();
		        Default.displayDetails();
			}
	}
