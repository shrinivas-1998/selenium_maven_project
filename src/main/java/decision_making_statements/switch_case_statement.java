package decision_making_statements;

import java.util.Scanner;
public class switch_case_statement 
{
	public static void main(String[] args) 
    {
     // TODO Auto-generated method stub

      Scanner s = new Scanner(System.in);
      System.out.println("enter the day");
      String day = s.next();
     
      switch(day)
      {
      case"monday":
      case"thursday":
      {
      	System.out.println("tennis");
      }
      break;
     
      case "tuesday":
      case "saturday":
      {
      	System.out.println("cricket");
      }
      break;
     
      case "wednesday":
      {
      	System.out.println("football");
      }
      break;
     
      case "friday":
      {
      	System.out.println("hockey");
      }
      break;
     
      default:
      {
      	System.out.println("holiday");
      }
    }
 }
}
