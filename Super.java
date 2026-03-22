package component;

public class Super 
	{
		public static void main(String[] args) 
			{
				System.out.println("===== SAVINGS ACCOUNT =====");
		        SuperChild1 savingsAcc = new SuperChild1("SAV001", "John Doe", "CUST001", 5000);
		        savingsAcc.displayAccountInfo();
		        savingsAcc.deposit(2000);
		        savingsAcc.withdraw(500);
		        savingsAcc.applyMonthlyInterest();
		        
		        System.out.println("\n===== CURRENT ACCOUNT =====");
		        SuperChild2 currentAcc = new SuperChild2("CHK001", "Jane Smith", "CUST002", 10000, 5000);
		        currentAcc.displayAccountInfo();
		        currentAcc.deposit(3000);
		        currentAcc.withdraw(2000);
		        currentAcc.deductMonthlyMaintenanceFee();
		        
		        System.out.println("\n===== LOAN ACCOUNT =====");
		        SuperChild3 loanAcc = new SuperChild3 ("LOAN001", "Mike Johnson", "CUST003", 50000,10000, 60, 8.5);
		        loanAcc.displayLoanDetails();
		        loanAcc.payEMI(965.50);
			}
	}
