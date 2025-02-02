package hybridInheritance1;

public class Main 
{
	public static void main(String[] args)
    {
       // TODO Auto-generated method stub
       FlyingCar flyingCar = new FlyingCar();
       AmphibiousVehicle amphibiousVehicle = new AmphibiousVehicle();


       flyingCar.start();        // Inherited from Vehicle
       flyingCar.fly();         // FlyingCar's implementation


       amphibiousVehicle.start(); // Inherited from Vehicle
       amphibiousVehicle.fly();   // AmphibiousVehicle's implementation
       amphibiousVehicle.swim();  // AmphibiousVehicle's implementation
     }

}
