package methodOverridingExample3;

public class Main 
{
	public static void main(String[] args)
    {
    // TODO Auto-generated method stub
    Animal myDog = new Dog();
    Animal myCat = new Cat();
    myDog.sound(); // Calls Dog's overridden method
    myCat.sound(); // Calls Cat's overridden method
  }

}
