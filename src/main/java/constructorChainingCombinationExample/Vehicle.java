package constructorChainingCombinationExample;

public class Vehicle 
{
	 private String brand;


	    // Constructor of the superclass
	    public Vehicle(String brand)
	    {
	        this.brand = brand;
	        System.out.println("Vehicle constructor called: " + brand);
	    }
	   
	    public void displayBrand()
	    {
	        System.out.println("Brand: " + brand);
	    }

}

