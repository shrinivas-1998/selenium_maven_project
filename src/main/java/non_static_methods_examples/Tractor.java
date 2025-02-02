package non_static_methods_examples;

public class Tractor 
{
	void start()
	{
		System.out.println("tractor started");
	}
	
	String brand = "mahindra";
	String colour = "red";
	double price = 1200000;
	int cc = 5000;


	public static void main(String[] args) 
{
		// TODO Auto-generated method stub


		System.out.println("main starts");
		Tractor t1 = new Tractor();
		System.out.println(t1.brand);
		System.out.println(t1.colour);
		System.out.println(t1.price);
		System.out.println(t1.cc);
                  System.out.println("main ends");
                  t1.start();
	}

}
