package stringbuffer_example;

public class StringBuffer2 
{
	public static void main(String[] args)
	{
	    // TODO Auto-generated method stub
	    StringBuffer sb = new StringBuffer("Hello");
		
	    // append a string
	    sb.append(", WORLD!");
	    System.out.println("After append: "+ sb);
		
	    // Insert a string
	    sb.insert(5, " beautiful");
	    System.out.println("After insert : "+sb);
		
	    // Delete the substring
	    sb.delete(5, 16);
	    System.out.println("After delete  : "+sb);
	   
	    // reverse the string
	    sb.reverse();
	    System.out.println("After reverse : "+sb);
	   
	    // Convert to string
	    String finalString = sb.toString();
	    System.out.println("Final String : "+finalString );
	}

}
