package component;

public class Constructors
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
		
		//Parameterized Constructor - It should be created explicitly because JVM doesn't what parameters / arguments are defined for the Constructor.
		public Constructors (String accountholder , double balance , String accountType)
			{
				this.accountholder = accountholder;
				this.balance = balance;
				this.accountType = accountType;
			}
		
		// Overloaded Constructor - It is created with same Class name but the different arguments / parameters are defined.
		public Constructors (double balance , String accountType)
			{
				this.balance = balance;
				this.accountType = accountType;
			}
			
		//Copy constructor - A new Constructors instance is created by copying fields from existing Object
		public Constructors (Constructors other)
			{
			this.accountholder = other.accountholder;
			this.balance = other.balance;
			this.accountType = other.accountType;
			}
		public static void main(String[] args) 
			{
				// Invoking the Parameterized Constructor
				Constructors Param1 = new Constructors ("Tom" , 5000.0 , "Savings");
				Constructors Param2 = new Constructors ("Jerry" , 15000.0 , "Current");
				Param1.displayDetails();
				Param2.displayDetails();
				// Invoking the Overloaded Constructor
				Constructors Overloaded = new Constructors (20000.0 , "Savings");
				Overloaded.displayDetails();
				// Invoking the Copy Constructor
				Constructors Copy = new Constructors (Param1);
				// Mutate original to show that copy retains the old values
			    Param1.accountholder = "Tom Updated";
			    Param1.balance = 6000.0;
			    Param1.accountType = "Current";
			    System.out.println("Original (Param1):");
			    Param1.displayDetails();
		        System.out.println("Copy of Param1 (created before manipulation):");
		        Copy.displayDetails();
		        // Invoking the Object to copy the values without creation of constructor
		        Constructors Nocopy = new Constructors(null, 0, null); // Here the field values are declared to match with Param1 - Existing Object Params.
		        Nocopy.accountholder = Param1.accountholder;
		        Nocopy.balance = Param1.balance;
		        Nocopy.accountType = Param1.accountType;
		        Nocopy.displayDetails();
			}
	}
