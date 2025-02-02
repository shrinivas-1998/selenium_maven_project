package toString_method_example_3;

public class Vehicle 
{
	String brand;
	  int cc;
	  int noofwheels;
	  double price;
	 
	  Vehicle(String brand,int cc,int noofwheels, double price )
	  {
		   this.brand = brand;
		   this.cc = cc;
		   this.noofwheels = noofwheels;
		   this.price = price;
	  }
	 
	  @Override
	  public String toString()
	  {
		   return "brand name : " + brand + ", cc :" + cc + ", noofwheels :" + noofwheels + ", price : " +price;
	  }
	 
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			Vehicle v1 = new Vehicle("honda", 200, 2, 80000.0);
			Vehicle v2 = new Vehicle("maruti", 500, 4, 180000.0);
			System.out.println(v1);
			System.out.println(v2);
		}

}
