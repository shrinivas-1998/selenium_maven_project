package downcastingExample1;

public class Child  extends Parent
{
	int a = 30; // This hides the a in Parent, not override
	   int b = 40; // This hides the b in Parent, not override
}
