package variableExamples;

public class LocalVariableExample 
{
	public void myMethod()
	{
	int localVar = 5; // Local variable
	System.out.println("Local Variable: " + localVar);
	}
	
	public static void main(String[] args)
	{
	// TODO Auto-generated method stub
	LocalVariableExample example = new LocalVariableExample();
	example.myMethod();
	// Uncommenting the line below will cause a compilation error
	// System.out.println(localVar); // localVar is not accessible here
	}
}
