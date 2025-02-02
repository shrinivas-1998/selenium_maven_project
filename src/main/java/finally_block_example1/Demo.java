package finally_block_example1;

public class Demo 
{
	 public static void main(String[] args) 
	  {
	       // TODO Auto-generated method stub
	       System.out.println(test());
	   }
	   public static int test() 
	   {
	       try
	       {
	           int a = 10 / 0;
	           return 20;
	       }
	       catch (ArithmeticException e)
	       {
	           return 30;
	       }
	       finally
	       {
	           System.out.println("This is the finally block.");
	       }
	   }

}
