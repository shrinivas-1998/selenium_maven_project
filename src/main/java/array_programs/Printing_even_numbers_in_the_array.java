package array_programs;

public class Printing_even_numbers_in_the_array 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
   int[] arr = {1,2,3,4,7,12,100,101};
   {
   	for(int i =0; i<arr.length; i++)
   	{
   		if (arr[i] % 2==0)
   		{
   			System.out.println(arr[i]);
   		}
   	}
   }
 }	

}
