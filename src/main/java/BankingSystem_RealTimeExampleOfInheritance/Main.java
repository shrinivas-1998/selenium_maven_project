package BankingSystem_RealTimeExampleOfInheritance;

public class Main 
{
	public static void main(String[] args)
    {
       // TODO Auto-generated method stub
      SavingsAccount savings = new SavingsAccount();
      savings.accountNumber = "SA123";
      savings.balance = 1000.0;
      savings.interestRate = 0.03;
     
      savings.deposit(500);
      System.out.println("Savings Account Balance: " + savings.balance);
      System.out.println("Savings Account Number: " + savings.accountNumber);
     
      CurrentAccount current = new CurrentAccount();
      current.accountNumber = "CA456";
      current.balance = 3000.0;
      current.overdraftLimit = 500.0;
     
      current.withdraw(2500);
      System.out.println("Current Account Balance: " + current.balance);
	}

}
