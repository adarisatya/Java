package component;

public class CallToSuper
	{
		public static void main(String[] args) 
			{
				System.out.println("========== PREMIUM SAVINGS ACCOUNT ==========");
		        CallToSuperChild1 premium = new CallToSuperChild1("SAV-PREM-001","Alice Johnson",15000,10000);
		        premium.displayBalance();
		        premium.applyPremiumInterest();
		        premium.printStatement();
		        
		        System.out.println("\n========== BUSINESS ACCOUNT ==========");
		        CallToSuperChild2 business = new CallToSuperChild2("BIZ-001","Tech Solutions Ltd",50000,"Tech Solutions","IT Services",100);
		        business.deposit(5000);
		        business.deposit(3000);
		        business.printStatement();
		        
		        System.out.println("\n========== STUDENT ACCOUNT ==========");
		        CallToSuperChild3 student = new CallToSuperChild3("STU-001","Bob Smith",5000,"MIT University","STU123456");
		        student.creditScholarship(1000);
		        student.printStatement();
		   }
	}
