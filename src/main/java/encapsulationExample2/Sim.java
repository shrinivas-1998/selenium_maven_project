package encapsulationExample2;

public class Sim 
{
	private String serviceProvider; // Fixed variable name casing
    private long number;
    private String customerName; // Changed to match convention
    private String colour;

    // Getter for serviceProvider
    public String getServiceProvider() 
    {
        return serviceProvider;
    }

    // Getter for number
    public long getNumber() 
    {
        return number; // Fixed incorrect variable name
    }

    // Setter for customerName
    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName; // Fixed variable name casing
    }

    // Getter for customerName
    public String getCustomerName() 
    {
        return customerName; // Fixed variable name casing
    }

    // Setter for colour
    public void setColour(String colour) 
    {
        this.colour = colour; // Fixed variable name casing
    }

    // Constructor
    public Sim(String serviceProvider, long number, String customerName, String colour) 
    {
        this.serviceProvider = serviceProvider;
        this.number = number;
        this.customerName = customerName; // Fixed variable name casing
        this.colour = colour;
    }

    // Display method
    public void display() 
    {
        System.out.println(serviceProvider);
        System.out.println(number);
        System.out.println(customerName); // Fixed variable name casing
        System.out.println(colour);
    }
}
