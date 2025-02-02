package handling_brokenLinks_and_SvgElements_and_ShadowDom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_SVG_Element 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("Admin");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("admin123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text() = ' Login ']")).click();
		
		Thread.sleep(2000);
		
		// 1) relative xpath by using text function 
		
		driver.findElement(By.xpath("//span[text() = 'Time']")).click();
		
		// by using name() method 
		
		// driver.findElement(By.xpath("(//a[@class = 'oxd-main-menu-item']//*[name() = 'svg'])[4]")).click();
        
		Thread.sleep(5000);
		driver.quit();
	}
}
