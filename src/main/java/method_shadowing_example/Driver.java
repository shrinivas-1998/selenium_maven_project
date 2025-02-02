package method_shadowing_example;

public class Driver {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Parent p1 = new Parent();
		p1.test();
		Child c1 = new Child();
		c1.test();
		Parent p2 = new Child();
		p2.test();
		Parent p3 = c1;
		p3.test();
		Child c2 = (Child)p3;
		c2.test();
	}
}
