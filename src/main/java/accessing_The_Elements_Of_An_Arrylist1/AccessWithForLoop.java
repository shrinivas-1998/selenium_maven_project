package accessing_The_Elements_Of_An_Arrylist1;

import java.util.ArrayList;

public class AccessWithForLoop 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		ArrayList<String> Colours = new ArrayList<>();
		Colours.add("Red");
		Colours.add("Green");
		Colours.add("Blue");
      
    // Accessing elements using a for loop
       System.out.println("Colours:");
      
       for(int i = 0; i<Colours.size(); i++)
       {
       	System.out.println(Colours.get(i));
       }
	}

}
