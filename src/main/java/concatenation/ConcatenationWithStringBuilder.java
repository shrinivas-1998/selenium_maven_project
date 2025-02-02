package concatenation;

public class ConcatenationWithStringBuilder 
{
	public static void main(String[] args)
    {
    // TODO Auto-generated method stub
     StringBuilder sb = new StringBuilder();
     sb.append("Java");
     sb.append(" ");
     sb.append("is");
     sb.append(" ");
     sb.append("powerful!");
     String result = sb.toString();
     System.out.println(result); // Output: Java is powerful!
	}
}
