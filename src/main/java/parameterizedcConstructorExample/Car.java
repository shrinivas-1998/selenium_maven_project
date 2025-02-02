package parameterizedcConstructorExample;

public class Car 
{
	String brand;
	int cc;
	String colour;
	
	Car(String s1, int a, String c)
	{
		brand = s1;
		cc = a;
		colour = c;
	}
	public static void main(String[] args) 
          {
		// TODO Auto-generated method stub
		
		Car  c1  = new Car("maruti", 800 , "white");
		System.out.println(c1.brand);
		System.out.println(c1.cc);
		System.out.println(c1.colour);
	}

}
