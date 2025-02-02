package HierarchicalInheritance2;

public class ShapeInfo 
{
	public static void main(String[] args)
	{
	    // TODO Auto-generated method stub
		
                 Circle circle = new Circle();
                 Square square = new Square();
      
                 circle.draw(); // Circle's method
                circle.drawing(); // inherited from Shape
               square.draw(); // Square's method
               square.drawing(); // inherited from Shape
	}

}
