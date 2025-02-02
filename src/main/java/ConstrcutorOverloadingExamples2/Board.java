package ConstrcutorOverloadingExamples2;

public class Board 
{
	double length;
	double breath;
	String colour;
	double price;
	
	Board(double length)
	{
		this.length = length;
	}


	Board(double length, double breath)
	{
		this.length = length;
		this.breath = breath;
	}
	
	Board(double length, double breath, String colour)
	{
		this.length = length;
		this.breath = breath;
		this.colour = colour;
	}
  
	Board(double length, double breath, String colour, double price)
	{
		this.length = length;
		this.breath = breath;
		this.colour = colour;
		this.price = price;
	}
	
	void displayDetails()
	{
		System.out.println("the length of the Board : "+length);
		System.out.println("the breath of the Board : "+breath);
		System.out.println("the colour of the Board : "+colour);
		System.out.println("the price of the Board : "+price);
	}
	public static void main(String[] args) 
             {
		// TODO Auto-generated method stub
		
		Board b1 = new Board(30.0, 40.0, "red", 3000.0);
		Board b2 = new Board(50.0, 60.0, "white", 5000.0);
		Board b3 = new Board(50.0);
		Board b4 = new Board(60.0, 70.0);
		Board b5 = new Board(600.0, 650.0, "ORANGE");
		
		b1.displayDetails();
		b2.displayDetails();
		b3.displayDetails();
		b4.displayDetails();
		b5.displayDetails();	
	}

}
