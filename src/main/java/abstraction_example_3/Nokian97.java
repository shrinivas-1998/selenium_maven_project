package abstraction_example_3;

public class Nokian97 extends Mobile
{
	@Override
    public void phone()
    {
 	   System.out.println("Call");
    }
    
    @Override
    public void sms()
    {
 	   System.out.println("send sms");
    }
    
    @Override
    public void games()
    {
 	   System.out.println("play games");
    }
    
    @Override
    public void camera()
    {
 	   System.out.println("take pictures");
    }
      
}
