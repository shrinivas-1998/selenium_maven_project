package methodOverridingExample1;

public class Supercar extends Vehicle
{
	@Override
	void start()
	{
		  System.out.println("super car started");
	}


	//@Override -----> we can not override the method which is not present in parent class
	void shiftgear()
	{
		  System.out.println("gear shifted");
	}
		
	    public static void main(String[] args)
	       {
	        // TODO Auto-generated method stub	
	        System.out.println("main starts");
	        Supercar s1 = new Supercar();
	        s1.start();
	        s1.shiftgear();
	        s1.stop();
	        System.out.println("main ends");
	        }

}
