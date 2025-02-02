package hybridInheritance;

public class Main 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
	        Bird bird = new Bird();
	        Fish fish = new Fish();
	        Duck duck = new Duck();


	        bird.eat();  // Inherited from Animal
	        bird.fly();  // Bird's own method


	        fish.eat();  // Inherited from Animal
	        fish.swim(); // Fish's own method


	        duck.eat();   // Inherited from Animal
	        duck.fly();   // Duck's implementation of fly
	        duck.swim();  // Duck's implementation of swim
	}

}
