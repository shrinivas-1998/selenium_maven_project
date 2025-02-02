package AbstractionUsingInterfaces;

public class Main 
{
	public static void main(String[] args)
    {
      // TODO Auto-generated method stub
      Animal myDog = new Dog();
      Animal myCat = new Cat();


      myDog.makeSound(); // Output: Dog barks
      myDog.eat();       // Output: Dog eats food


      myCat.makeSound(); // Output: Cat meows
      myCat.eat();       // Output: Cat eats food
    }

}
