package wrapper_class_example1;

public class WrapperClassExample 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// Using wrapper classes
       Integer intValue = Integer.valueOf(42); // Creating an Integer object
       Double doubleValue = Double.valueOf(3.14); // Creating a Double object
       Boolean boolValue = Boolean.valueOf(true); // Creating a Boolean object
       // Displaying values
       System.out.println("Integer value: " + intValue);
       System.out.println("Double value: " + doubleValue);
       System.out.println("Boolean value: " + boolValue);
       // Autoboxing
       int primitiveInt = 10;
       Integer wrappedInt = primitiveInt; // Automatically converts int to Integer
       // Unboxing
       Integer wrappedInteger = Integer.valueOf(20);
       int unboxedInt = wrappedInteger; // Automatically converts Integer to int
       // Parsing strings
       String intString = "123";
       Integer parsedInt = Integer.parseInt(intString); // Parsing string to Integer
       System.out.println("Parsed Integer: " + parsedInt);
       // Using methods from wrapper classes
       System.out.println("Max of Integer: " + Integer.MAX_VALUE);
       System.out.println("Min of Integer: " + Integer.MIN_VALUE);
	}

}
