package handling_Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Frames 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		Thread.sleep(5000);
		
		// FRAME 1
	    WebElement Frame1 = driver.findElement(By.xpath("//frame[@src ='frame_1.html']"));
		
		driver.switchTo().frame(Frame1); // passed frame as a web element // SWITCHING TO frame 1 
		
		driver.findElement(By.xpath("//input[@name ='mytext1']")).sendKeys("welcome");
		
		driver.switchTo().defaultContent(); // switching from frame1 to main page or parent page
		
		Thread.sleep(5000);

		// Frame2
		
        WebElement frame2 =driver.findElement(By.xpath("//frame[contains(@src, 'frame_2.html')]"));
        
        driver.switchTo().frame(frame2);
        
		Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name ='mytext2']")).sendKeys("selenium");
		
		Thread.sleep(3000);

		driver.switchTo().defaultContent(); // switching from frame2 to main page or parent page
		
		Thread.sleep(3000);

		// Frame 3
        WebElement frame3 =driver.findElement(By.xpath("//frame[contains(@src, 'frame_3.html')]"));
        
        driver.switchTo().frame(frame3);
        
		Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name ='mytext3']")).sendKeys("java");
		
		Thread.sleep(3000);
		
		   // inner iframe which is part of frame 3 itself 
		
		driver.switchTo().frame(0); // switching from frame to inner iframe 
		
		WebElement  radio_button = driver.findElement(By.xpath("(//div[@class = 'rseUEf nQOrEb'])[2]"));
		
		// when you get  org.openqa.selenium.ElementNotInteractableException then use this method 
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", radio_button);
		
		driver.switchTo().defaultContent(); // switching from iframe to directly parent page 
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
