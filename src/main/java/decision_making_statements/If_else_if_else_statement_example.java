package decision_making_statements;

public class If_else_if_else_statement_example 
{
	public static void main(String[] args) 
    {
    // TODO Auto-generated method stub
    int a = 10;
    int b = 20;
    int c = 50;

    if(a>b && a>c)
    {
	 System.out.println("a is greater");
    }

    else if(b>c)
    {
	 System.out.println("b is greater");
    }

    else
    {
	 System.out.println("c is greater");
    }
 }
}
