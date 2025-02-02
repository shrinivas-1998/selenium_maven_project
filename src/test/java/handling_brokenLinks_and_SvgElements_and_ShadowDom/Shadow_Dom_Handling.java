package handling_brokenLinks_and_SvgElements_and_ShadowDom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow_Dom_Handling 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://dev.automationtesting.in/shadow-dom");
		
		Thread.sleep(5000);
		
	  // 1) This element is insdide single shadow DOM
		
		 SearchContext  shadowhost = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		 Thread.sleep(2000);
		 String  text =  shadowhost.findElement(By.cssSelector("#shadow-element")).getText();
		 System.out.println(text);
		     
	  // 2) This element is inside 2 nested shadow DOM
		 SearchContext  shadowhost1 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		 Thread.sleep(2000);
		 SearchContext shadowhost2 = shadowhost1.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		 Thread.sleep(2000);
		 String  text2 =shadowhost2.findElement(By.cssSelector("#nested-shadow-element")).getText();
		 System.out.println(text2);
		 
	  // 3) This element is inside multi nested shadow DOM 
		 SearchContext  shadowhost3 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		 Thread.sleep(2000);
		 SearchContext shadowhost4 = shadowhost3.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		 Thread.sleep(2000);
		 SearchContext shadowhost5 = shadowhost4.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
		 Thread.sleep(2000);
	     String	text3 = shadowhost5.findElement(By.cssSelector("#multi-nested-shadow-element")).getText();
	     System.out.println(text3);	
	     
		Thread.sleep(5000);
        driver.quit();       
	}
}
