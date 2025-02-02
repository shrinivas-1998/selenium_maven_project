package hundredPercentAbstractionExample;

public class AtmDriver 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Atm a1 = new Atm();
		Bank b1 = new Atm(); // upcasting
		//Bank b1 = a1;
		a1.deposit(5000);
		a1.withdrawal(4000);
		//a1.deposit(6000);
		//a1.withdrawal(5000);	
	}

}
