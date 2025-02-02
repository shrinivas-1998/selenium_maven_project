
public class dddd 
{
	public class SportSchedule 
	{
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the day:");
	        String day = scanner.next().toLowerCase();

	        switch (day) 
	        {
	            case "monday":
	            case "thursday":
	                System.out.println("Tennis");
	                break;
	            case "tuesday":
	            case "saturday":
	                System.out.println("Cricket");
	                break;
	            case "wednesday":
	                System.out.println("Football");
	                break;
	            case "friday":
	                System.out.println("Hockey");
	                break;
	            default:
	                System.out.println("Holiday");
	        }
	    }
	}






}
