package component;

public class CallToSuperChild3 extends CallToSuperParent 
	{
		private String universityName;
	    private String studentId;
	    private double monthlyScholarship = 0;
	    
	    // Child class constructor calling super()
	    public CallToSuperChild3(String accountNumber, String accountHolderName,double initialBalance, String universityName, String studentId) 
		    {
		        
		        // CALL TO SUPER - Initialize parent class constructor
		        super(accountNumber, accountHolderName, initialBalance);
		        
		        // Initialize child class properties
		        this.universityName = universityName;
		        this.studentId = studentId;
		        this.accountType = "Student Account";
		        
		        System.out.println("[CHILD CLASS] Student Account initialized");
		        System.out.println("University: " + universityName);
		        System.out.println("Student ID: " + studentId);
		    }
	    
	    public void creditScholarship(double amount) 
		    {
		        balance += amount;
		        monthlyScholarship = amount;
		        System.out.println("Scholarship credited: $" + amount);
		    }
	    
	    @Override
	    public void printStatement() 
	    {
	        super.printStatement(); // Call parent's printStatement method
	        System.out.println("University: " + universityName);
	        System.out.println("Student ID: " + studentId);
	        System.out.println("Monthly Scholarship: $" + monthlyScholarship);
	    }
	}
