package run_time_polymorphism;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Run_Time_Polymorphism_example {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("select the required browser !!!!!!");
		String browservalue = s.next();
		
		if (browservalue.equals("chrome"))
		{
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.cricbuzz.com/");
			
			driver.manage().window().maximize();	
		}
		
		else if (browservalue.equals("edge"))
		{
			WebDriver driver = new EdgeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
		}
		
		else
		{
			System.out.println("select the valid browser");
		}
				
	}

}
