package Selenium.Section10to20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printlinkcount1193 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();
		//WebDriver driver = new EdgeDriver();
			
		driver.get("https://staging.bemasterly.com/");
		driver.manage().window().maximize();
		System.out.println("home link count is " + '"'+ driver.findElements(By.tagName("a")).size()+ '"');
		
		
		
		WebElement footer = driver.findElement(By.xpath("//body//footer"));
		System.out.println("footer link count is " + '"'+ footer.findElements(By.tagName("a")).size()+ '"');
		
		WebElement col1 = driver.findElement(By.xpath("//div[@class='row']//div[@class='col-lg-4']"));
		System.out.println("footer col1 link count is " + '"'+ col1.findElements(By.tagName("a")).size()+ '"');

		driver.close();
		}
}
