package interfaceExampleFromInterfacetoInterface;

public class Nano implements Car
{
	@Override
	public void start()
	{
		 System.out.println("nano started");
	}


	@Override
	public void honk()
	{
		 System.out.println("penn penn");
	}


	@Override
	public void stop()
	{
		 System.out.println("nano stopped");
	}

}
