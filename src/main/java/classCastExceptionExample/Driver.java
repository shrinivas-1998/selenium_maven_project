package classCastExceptionExample;

public class Driver 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
               Parent p1 = new Parent();
               Child c1 = (Child)p1;
               System.out.println(p1.a);
               System.out.println(p1.b); // class cast exception
               System.out.println(c1.a);
               System.out.println(c1.b);
	}

}
