package downcastingExample2;

public class Main 
{
	 public static void main(String[] args)
     {
     // TODO Auto-generated method stub
     Animal myAnimal = new Dog(); // Upcasting
     myAnimal.sound(); // Output: Dog barks


     // Downcasting
     Dog myDog = (Dog) myAnimal; // Safe downcasting
     myDog.fetch(); // Output: Dog fetches the ball


     // Example of unsafe downcasting
     Animal anotherAnimal = new Animal();
     // Dog anotherDog = (Dog) anotherAnimal; // This would throw ClassCastException at runtime
     }

}
