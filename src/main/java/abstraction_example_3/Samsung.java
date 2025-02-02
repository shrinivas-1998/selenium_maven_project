package abstraction_example_3;

public class Samsung extends Mobile
{
       @Override
       public void phone()
       {
    	   System.out.println("you can call anyone");
       }
       
       @Override
       public void sms()
       {
    	   System.out.println("you can messege anyone");
       }
       
       @Override
       public void games()
       {
    	   System.out.println("you can play games");
       }
       
       @Override
       public void camera()
       {
    	   System.out.println("you can takes pictures");
       }
       
      // @Override
       public void os()
       {
    	   System.out.println("samsung os");
       }
       
}
