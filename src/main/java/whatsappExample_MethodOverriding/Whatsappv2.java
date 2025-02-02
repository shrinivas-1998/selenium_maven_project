package whatsappExample_MethodOverriding;

public class Whatsappv2 extends Whatsappv1
{
	@Override
	void display()
	{
		 super.display();
		 System.out.println("double tick");
	}
	void call()
	{
		 System.out.println("voice call");
	}

}
