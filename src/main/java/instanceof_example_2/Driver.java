package instanceof_example_2;

public class Driver {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Ola o = new Mini();
		// Ola o1 = new Auto();

		if(o instanceof Mini)
		{
			Mini m1 = (Mini)o;
			System.out.println("Total bill :" + (m1.baseprice + m1.perkprice));
		}
		
		else if(o instanceof Auto)
		{
			Auto a1 = new Auto();
			System.out.println("Total bill :" + (a1.baseprice + a1.perkprice));
		}
	}
}
