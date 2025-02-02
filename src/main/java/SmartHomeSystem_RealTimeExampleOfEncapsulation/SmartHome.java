package SmartHomeSystem_RealTimeExampleOfEncapsulation;

public class SmartHome 
{
	 // Private attributes
	   private double temperature;
	   private boolean securityStatus;
	  
	   // Constructor to initialise the smart home system
	   public SmartHome(double initialTemperature)
	   {
	       this.temperature = initialTemperature;
	       this.securityStatus = false; // Default: security is off
	   }


	   // Method to set the temperature
	   public void setTemperature(double newTemperature)
	   {
	       if (newTemperature >= 0)
	       {
	       	// Assume temperature cannot be negative
	           temperature = newTemperature;
	           System.out.println("Temperature set to: " + temperature + "°C");
	       }
	       else
	       {
	           System.out.println("Temperature must be a non-negative value.");
	       }
	   }


	   // Method to get the current temperature
	   public double getTemperature()
	   {
	       return temperature;
	   }


	   // Method to lock or unlock the security system
	   public void setSecurityStatus(boolean status)
	   {
	       securityStatus = status;
	       String statusString = securityStatus ? "locked" : "unlocked";
	       System.out.println("Security system is now " + statusString + ".");
	   }


	   // Method to get the security status
	   public boolean isSecurityOn()
	   {
	       return securityStatus;
	   }

}
