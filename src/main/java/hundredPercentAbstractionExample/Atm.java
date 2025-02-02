package hundredPercentAbstractionExample;

public class Atm implements Bank 
{
	int balance = 10000;
	  @Override
	  public void withdrawal(int a)
	  {
		   System.out.println("withdrawal successful");
		   balance -= 10000;
		   System.out.println("balance after withdraw : " + balance);
	  }
	 
	  @Override
	  public void deposit(int b)
	  {
		   System.out.println("deposit successful");
		   balance += b;
		   System.out.println("balance after deposit : " + balance);
	  }
	 
	  @Override
	  public void checkbalnce()
	  {
		   System.out.println("balance checked : " + balance);
	  }

}
