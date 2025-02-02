package launching_browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launching_Edge_Browser 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//WebDriver driver = new EdgeDriver();
		EdgeDriver driver = new EdgeDriver();
		
		  // Open a website
		driver.get("http://www.microsoft.com");

	}

}
