package thisKeywordExample1;

public class Car 
{
	 private String color = "yellow";
	   public Car(String color)


	   {
	      this.color = color; // 'this.color' refers to the instance variable
	      // String color1 = "green";
	   }


	   public void displayColor()
	   {
	       System.out.println("Car color: " + this.color);
	   }

}
