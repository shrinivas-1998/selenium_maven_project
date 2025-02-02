package variableExamples;

public class Dog 
{
	// Instance variables
	   private String name;
	   private int age;
	  
	   // Constructor to initialise instance variables
	   public Dog(String name, int age)
	   {
	       this.name = name; // 'this.name' refers to the instance variable
	       this.age = age;   // 'this.age' refers to the instance variable
	   }
	  
	   // Method to display dog's details
	   public void displayInfo()
	   {
	       System.out.println("Dog's Name: " + name);
	       System.out.println("Dog's Age: " + age);
	   }


		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			
			// Creating two Dog objects
	       Dog dog1 = new Dog("Buddy", 3);
	       Dog dog2 = new Dog("Max", 5);


	       // Displaying information for each dog
	       dog1.displayInfo(); // Outputs: Buddy, 3
	       dog2.displayInfo(); // Outputs: Max, 5
		}
}
