package nonStaticVariables;

public class CarInformation 
{
	 public static void main(String[] args)
     {
       // TODO Auto-generated method stub
       // Creating instances of the Car class
       Car car1 = new Car("Toyota");
       Car car2 = new Car("Honda");


       // Displaying the models of the cars
       car1.displayModel(); // Output: Car model: Toyota
       car2.displayModel(); // Output: Car model: Honda
    }

}
