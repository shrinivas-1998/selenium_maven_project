package abstraction_example;

public class AtmDriver extends Atm
{
   
	@Override
	public void withdraw()
	{
		System.out.println("money withdrawn");
	}
	
	@Override
	public void deposit()
	{
		System.out.println("money deposit");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AtmDriver a1 = new AtmDriver();
		a1.withdraw();
		a1.deposit();
		a1.withdraw();
	}
}
