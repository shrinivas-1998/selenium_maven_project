package MethodShadowingExample2;

public class Main 
{
	 public static void main(String[] args)
     {
       // TODO Auto-generated method stub


      // Calling static methods using the class name
      Parent.display(); // Output: Display from Parent class
      Child.display();  // Output: Display from Child class


      // Calling static methods using reference
      Parent parent = new Child();
      parent.display(); // Output: Display from Parent class
     }

}
