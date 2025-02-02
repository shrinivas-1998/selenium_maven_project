package variableShadowing1;

public class Main 
{
	public static void main(String[] args)
	{
	     // TODO Auto-generated method stub
	     Child child = new Child();
	     child.showName();
	     System.out.println(child.name);


	     Parent parent = new Parent();
	     parent.showName();
	     System.out.println(parent.name);
	}

}
