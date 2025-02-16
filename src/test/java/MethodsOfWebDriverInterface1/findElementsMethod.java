package MethodsOfWebDriverInterface1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");

		WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		SearchBox.sendKeys("Laptops");
		driver.findElement(By.id("nav-search-submit-button")).click();

		// Apply "HP" brand filter using preceding-sibling
		WebElement hpCheckBox = driver
				.findElement(By.xpath("//span[text()='HP']/preceding-sibling::div[contains(@class,'a-checkbox')]"));
		hpCheckBox.click();
		Thread.sleep(3000);

		WebElement RamSizeCheckbox = driver.findElement(
				By.xpath("//span[text() = '4 GB']/preceding-sibling::div[contains(@class,  'a-checkbox')]"));
		RamSizeCheckbox.click();
		Thread.sleep(3000);

		List<WebElement> LaptopNames = driver
				.findElements(By.xpath("//div[@class= 'a-section a-spacing-small a-spacing-top-small']/div/a/h2/span"));

		for (WebElement Laptop : LaptopNames) 
		{
			System.out.println(Laptop.getText());
			Thread.sleep(2000);
		}

		Thread.sleep(4000);
		driver.quit();
	}
}
