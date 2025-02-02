package BankAccount_RealTimeExampleOfEncapsulation;

public class BankAccount 
{
	    // Private variables (attributes)
	   private String accountNumber;
	   private double balance;


	   // Constructor
	   public BankAccount(String accountNumber, double initialBalance)
	   {
	       this.accountNumber = accountNumber;
	       this.balance = initialBalance;
	   }


	   // Getter for accountNumber
	   public String getAccountNumber()
	   {
	       return accountNumber;
	   }


	   // Getter for balance
	   public double getBalance()
	   {
	       return balance;
	   }


	   // Method to deposit money
	   public void deposit(double amount)
	   {
	       if (amount > 0)
	       {
	           balance += amount;
	           System.out.println("Deposited: " + amount);
	       }
	       else
	       {
	           System.out.println("Deposit amount must be positive.");
	       }
	   }


	   // Method to withdraw money
	   public void withdraw(double amount)
	   {
	       if (amount > 0 && amount <= balance)
	       {
	           balance -= amount;
	           System.out.println("Withdrew: " + amount);
	       }
	       else
	       {
	           System.out.println("Invalid withdrawl amount.");
	       }
	   }

}
