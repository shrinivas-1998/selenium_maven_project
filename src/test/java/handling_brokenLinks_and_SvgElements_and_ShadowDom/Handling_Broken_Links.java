package handling_brokenLinks_and_SvgElements_and_ShadowDom;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Broken_Links {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try 
        {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

            driver.get("http://www.deadlinkcity.com/");

            // Capture all the links from the website
            List<WebElement> links = driver.findElements(By.tagName("a"));
            System.out.println("Total number of links: " + links.size());

            int noOfBrokenLinks = 0;

            for (WebElement linkElement : links) 
            {
                String hrefAttributeValue = linkElement.getAttribute("href"); // Correct way to get href attribute

                if (hrefAttributeValue == null || hrefAttributeValue.isEmpty()) 
                {
                    System.out.println("href attribute value is null or empty, so not possible to check.");
                    continue;
                }

                try 
                {
                    // Hit URL to the server
                    URL linkUrl = new URL(hrefAttributeValue); // Convert href value from string to URL format
                    HttpURLConnection connection = (HttpURLConnection) linkUrl.openConnection(); // Open the connection to the server
                    connection.setRequestMethod("GET"); // Set request method
                    connection.connect();

                    int responseCode = connection.getResponseCode();
                    if (responseCode >= 400) 
                    {
                        System.out.println(hrefAttributeValue + " ======> Broken link");
                        noOfBrokenLinks++;
                    } 
                    else 
                    {
                        System.out.println(hrefAttributeValue + " ======> Not a broken link");
                    }

                    connection.disconnect(); // Close the connection
                } 
                catch (IOException e) 
                {
                    System.out.println("Error checking link: " + hrefAttributeValue);
                    e.printStackTrace(); // Print the exception message for debugging
                }
            }

            System.out.println("Number of broken links: " + noOfBrokenLinks);
        } 
        finally 
        {
            driver.quit(); // Ensure the WebDriver instance is closed
        }
    }
}
