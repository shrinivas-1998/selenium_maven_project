package MultiLevelInheritance2;

public class CarInfo 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		SportsCar myCar = new SportsCar();
                          myCar.start(); // Inherited from Vehicle
                          myCar.drive(); // Inherited from Car
                          myCar.turboBoost(); // Sports Car own method
	}

}
