package accessing_The_Elements_Of_An_Arrylist1;

import java.util.ArrayList;

public class By_using_for_loop 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Object> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add('s');
		a1.add("hello");
		a1.add(40);
		
		for(int i = 0; i<a1.size(); i++)
		{
			System.out.println(a1.get(i));
		}		
	}

}
