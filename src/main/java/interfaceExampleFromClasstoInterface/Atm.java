package interfaceExampleFromClasstoInterface;

public class Atm implements Bank
{
	@Override
	  public void withdraw()
	  {
		   System.out.println("money withdraw");
	  }
	 
	  @Override
	  public void deposit()
	  {
		   System.out.println("money deposited");
	  }
	 
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			
			Atm a1 = new Atm();
			a1.withdraw();
			a1.deposit();
			System.out.println(a1.balance);
		}

}
