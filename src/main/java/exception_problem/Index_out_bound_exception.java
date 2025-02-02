package exception_problem;

public class Index_out_bound_exception 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int [] arr = new int [4];
		arr[0]=10;
		arr[1]=20;
		arr[5]=50;
       System.out.println(arr[0]);
       System.out.println(arr[1]);
       System.out.println(arr[5]);
	}
}
