package constrctorExample;

public class CarInfo 
{
	public static void main(String[] args)
	{
		
              // TODO Auto-generated method stub
             // Using the default constructor
            Car car1 = new Car();
             car1.displayDetails(); // Output: Make: Unknown, Model: Unknown, Year: 0


            // Using the parameterized constructor
            Car car2 = new Car("Toyota", "Camry", 2020);
           car2.displayDetails(); // Output: Make: Toyota, Model: Camry, Year: 2020
	}

}
