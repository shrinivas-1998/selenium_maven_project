package encapsulation_example_2;

public class Sim 
{
      private String serviceprovider;
      private long number;
      private String customer;
      private String colour;
      
      public String getserviceprovider()
      {
    	  return serviceprovider;
      }
      
      public long getnumber()
      {
    	  return number;
      }
      
      public void setcustomer(String name)
      {
    	  name = customer;
      }
      
      public String getcustomer()
      {
    	  return customer;
      }
      
      public void setcolour(String colour)
      {
    	  this.colour = colour;
      }
      
      Sim(String serviceprovider, long number, String customer ,String colour)
      {
    	  this.serviceprovider = serviceprovider;
    	  this.number = number;
    	  this.customer = customer;
    	  this.colour = colour;  
      }
      
      public void display()
      {
    	  System.out.println(serviceprovider);
    	  System.out.println(number);
    	  System.out.println(customer);
    	  System.out.println(colour);
      }  
}
