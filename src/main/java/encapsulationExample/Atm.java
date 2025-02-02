package encapsulationExample;

public class Atm 
{
	private int balance;
	  public int getbalance()
	  {
		   return balance;
	  }
		
	  public void setbalance(int balance)
	  {
		   if(balance > 0)
		   {
			   this.balance =balance;
		   }
		   else
		   {
			   System.out.println("balance can not be zero or negative");
		   }
	  }

}
