package dynamic_read;

import java.util.Scanner;

public class dynamic_read_example_1 
{
	public static void main(String[] args) 
    {
      // TODO Auto-generated method stub
      Scanner s = new Scanner(System.in);

      System.out.println(" enter your name");
      String name = s.next();

      System.out.println("enter your id");
      int id = s.nextInt();

      System.out.println("enter your phone number");
      long ph_no = s.nextLong();

      System.out.println("enter your salary");
      double salary =s.nextDouble();

      System.out.println("enter your email_id");
      String email =s.next();
     
     //System.out.println("my name is " + name);
     //System.out.println("my id is " + id);
     //System.out.println("my phone number is " + ph_no);
     //System.out.println("my salary is "+ salary);
     //System.out.println("my email-id is "+ email);    
   }
}
