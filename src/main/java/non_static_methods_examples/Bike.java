package non_static_methods_examples;

public class Bike 
{
	void start()
	{
		System.out.println("started");
	}
	
	String brand;
	String colour;
	double price;
 	public static void main(String[] args) 
               {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		Bike b1 = new Bike();
		b1.brand = "hero";
		System.out.println(b1.brand);
		b1.colour = "black";
		System.out.println(b1.colour);
		b1.price = 50000;
		System.out.println(b1.price);
		System.out.println("main ends");
		b1.start();
	}

}
