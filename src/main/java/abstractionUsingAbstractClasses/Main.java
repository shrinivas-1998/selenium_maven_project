package abstractionUsingAbstractClasses;

public class Main 
{
	public static void main(String[] args)
    {
      // TODO Auto-generated method stub
       Animal myDog = new Dog();
      Animal myCat = new Cat();


      Dog myDog1 = new Dog();
      myDog.makeSound(); // Output: Dog barks
     myDog.eat();       // Output: This animal eats food.
    
     myDog1.makeSound();
     myDog1.eat();


     myCat.makeSound(); // Output: Cat meows
     myCat.eat();       // Output: This animal eats food.
   }


}
