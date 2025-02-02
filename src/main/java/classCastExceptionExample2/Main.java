package classCastExceptionExample2;

public class Main 
{
	 public static void main(String[] args)
     {
      // TODO Auto-generated method stub
     Animal myAnimal = new Dog(); // Upcasting to Animal


      // Downcasting to Dog (valid)
      Dog myDog = (Dog) myAnimal;
      myDog.sound(); // Output: Dog barks


      // Downcasting to Cat (invalid, will throw ClassCastException)
      try
      {
          Cat myCat = (Cat) myAnimal; // This line will cause ClassCastException
          myCat.sound(); // This line won't execute
      }
      catch (ClassCastException e)
      {
          System.out.println("ClassCastException: " + e.getMessage());
      }
  }

}
