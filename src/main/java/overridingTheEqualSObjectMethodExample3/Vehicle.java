package overridingTheEqualSObjectMethodExample3;

public class Vehicle 
{
	 String brand;
	   int no_of_wheels;
	   String fuel_type;
	  
	   Vehicle(String brand, int no_of_wheels, String fuel_type)
	   {
	   	this.brand = brand;
	   	this.no_of_wheels = no_of_wheels;
	   	this.fuel_type = fuel_type;
	   }
	  
	   @Override
	   public String toString()
	   {
	   	return "brand name : "+ brand + ", no_of_wheels : " + no_of_wheels + ", fuel_type : " + fuel_type;
	   }
	  
	   @Override
	   public boolean equals(Object o)
	   {
	       Vehicle temp = (Vehicle)o;
	   	if(this.brand ==temp.brand && this.no_of_wheels == temp.no_of_wheels && this.fuel_type ==temp.fuel_type)
	   	{
	   		return true;
	   	}
	   	
	   	else
	   	{
	   		return false;
	   	}
	   }
	  
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			Vehicle v1 = new Vehicle("hero", 2, "petrol");
			Vehicle v2 = new Vehicle("mahindra", 4, "diesel");
			System.out.println(v1);
			System.out.println(v2);
			System.out.println(v1 == v2);
			System.out.println(v1.equals(v2));
		}

}
