package BankAccount_RealTimeExampleOfEncapsulation;

public class BankTransaction 
{
	public static void main(String[] args)
	{
       // TODO Auto-generated method stub
       // Create a new bank account
       BankAccount account = new BankAccount("123456789", 1000.0);


       // Accessing account details using getters
       System.out.println("Account Number: " + account.getAccountNumber());
       System.out.println("Initial Balance: " + account.getBalance());


       // Deposit and withdraw
       account.deposit(500);
       System.out.println("Balance after deposit: " + account.getBalance());
       account.withdraw(200);
       System.out.println("Balance after withdrawal: " + account.getBalance());


       // Attempt to withdraw an invalid amount
       account.withdraw(2000); // Should print an error message
	}

}
