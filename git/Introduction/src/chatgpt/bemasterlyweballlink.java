package chatgpt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bemasterlyweballlink {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		
	  

        try {
            // Navigate to the URL
            driver.get("https://bemasterly.com");

            // Find all the links on the page
            java.util.List<WebElement> links = driver.findElements(By.tagName("a"));

            // Iterate through each link and click it
            for (WebElement link : links) {
                link.click();
                // Optional: You can perform additional actions on the clicked link here

                // Wait for page load before proceeding to the next link
                Thread.sleep(2000); // Adjust the duration as needed
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }

}
