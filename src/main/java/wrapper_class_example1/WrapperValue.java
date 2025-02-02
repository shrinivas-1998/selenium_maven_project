package wrapper_class_example1;

public class WrapperValue 
{
	 public static void main(String[] args) 
	 {
	        // Primitive data types
	        byte b = 10;
	        short s = 20;
	        int i = 30;
	        long l = 40;
	        float f = 23.44f;
	        double d = 45.67;
	        char ch = 'h';
	        boolean e = true;
	        // Wrapper classes
	        Byte obj1 = Byte.valueOf(b);
	        Short obj2 = Short.valueOf(s);
	        Integer obj3 = Integer.valueOf(i);
	        Long obj4 = Long.valueOf(l);
	        Float obj5 = Float.valueOf(f);
	        Character obj6 = Character.valueOf(ch);
	        Boolean obj7 = Boolean.valueOf(e);
	        Double obj8 = Double.valueOf(d);
	        System.out.println("After converting primitive data into object:");
	        System.out.println("Byte: " + obj1);
	        System.out.println("Short: " + obj2);
	        System.out.println("Integer: " + obj3);
	        System.out.println("Long: " + obj4);
	        System.out.println("Float: " + obj5);
	        System.out.println("Character: " + obj6);
	        System.out.println("Boolean: " + obj7);
	        System.out.println("Double: " + obj8);
	    }

}
