package whatsappExample_MethodOverriding;

public class Whatsappv3  extends Whatsappv2
{
	@Override
	void display()
	{
		super.display();
		System.out.println("blue tick");
	}
	
	@Override
	void call()
	{
		super.call();
		System.out.println("video call");
	}
	
	//@Override
	void stories()
	{
		System.out.println("post stories");
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("main starts");
		Whatsappv3 w3 = new Whatsappv3();
		w3.display();
		w3.call();
		w3.stories();
	}

}
