package constructor_example;

public class Bike {
	
	String Brand;
	int cc ;
	{
		System.out.println("non static initialiser executed");
	}
	
	Bike()
	{
		System.out.println("bike constructor executed ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		Bike	b1 = new Bike();
		
		System.out.println("main starts");
	}
}
