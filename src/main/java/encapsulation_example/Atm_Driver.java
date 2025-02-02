package encapsulation_example;

public class Atm_Driver {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("main starts");
		Atm  a1 = new  Atm();
		a1.setbalance(1230);
		System.out.println(a1.getbalance());
		System.out.println("main ends");
	}
}
