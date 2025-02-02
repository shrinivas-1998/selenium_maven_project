package SmartHomeSystem_RealTimeExampleOfEncapsulation;

public class Main 
{
	public static void main(String[] args)
    {
    // TODO Auto-generated method stub
     SmartHome myHome = new SmartHome(22.0);


     // Set temperature
    myHome.setTemperature(24.5); // Output: Temperature set to: 24.5° 


    // Check temperature
   System.out.println("Current Temperature: " + myHome.getTemperature() + "°C"); // Output:      Current Temperature: 24.5°C


   // Set security status
   myHome.setSecurityStatus(true);  // Output: Security system is now locked
  myHome.setSecurityStatus(false); // Output: Security system is now unlocked.


  // Set temperature
   myHome.setTemperature(25.5); // Output: Temperature set to: 25.5°
 System.out.println("Current Temperature: " + myHome.getTemperature() + "°C"); // Output: Current Temperature: 25.5°C
}

}
