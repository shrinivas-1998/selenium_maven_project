package MethodsOfWebDriverInterface1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandles1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String ParentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent or Mian window handle : " + ParentWindowHandle);

		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text() = 'OrangeHRM, Inc']")).click();

		Set<String> AllWindowHandles = driver.getWindowHandles();

		Iterator<String> iterator = AllWindowHandles.iterator();

		while (iterator.hasNext()) 
		{
			String ChildWindowHandle = iterator.next();
			if (!ParentWindowHandle.equals(ChildWindowHandle)) 
			{
				driver.switchTo().window(ChildWindowHandle);
				System.out.println("Title of child window handle : " + driver.getTitle());
			}
		}

		Thread.sleep(4000);
		driver.switchTo().window(ParentWindowHandle);
		System.out.println("Title of Parent window handle : " + driver.getTitle());

		Thread.sleep(4000);
		driver.quit();
	}
}
