package parseX_Methods;

public class ParseBooleanExample 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String trueString = "true";
		String falseString = "false";
		String invalidString = "yes";
		
		boolean trueValue = Boolean.parseBoolean(trueString);
		boolean falseValue = Boolean.parseBoolean(falseString);
		boolean invalidValue = Boolean.parseBoolean(invalidString);
		
		System.out.println("Parsed Boolean (true) : "+ trueValue);
		System.out.println("Parsed Boolean (false) : "+falseValue);
		System.out.println("Parsed Boolean (invalid) :"+invalidValue);
	}

}
