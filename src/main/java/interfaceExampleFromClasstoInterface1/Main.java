package interfaceExampleFromClasstoInterface1;

public class Main 
{
	public static void main(String[] args)
    {
      // TODO Auto-generated method stub
      Animal myDog = new Dog(); // Upcasting
      Animal myCat = new Cat(); // Upcasting
     
      myDog.makeSound(); // Outputs: Bark
      myCat.makeSound(); // Outputs: Meow
   }

}
