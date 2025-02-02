package instanceMethodExample;

public class Dog 
{
	 // Instance variable
    private String name;
   
    // Constructor to initialize the instance variable
    public Dog(String name)
    {
        this.name = name;
    }
   
   // Instance method to get the dog's name
    public String getName()
    {
        return name; // Accessing the instance variable
    }
   
      // Instance method to make the dog bark
      public void bark()
      {
        System.out.println(name + " says: Woof!"); // Using the instance variable
      }
      public static void main(String[] args) 
      {
        // Creating an instance of Dog
        Dog myDog = new Dog("Buddy");
        // Calling instance methods
        System.out.println("Dog's name: " + myDog.getName()); // Output: Dog's name: Buddy
        myDog.bark(); // Output: Buddy says: Woof!
    }
}
