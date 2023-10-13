package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class endtoendautomation766 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();
		//WebDriver driver = new EdgeDriver();
				
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().alert().dismiss();
	    driver.findElement(By.cssSelector("//div[@data-testid='to-testID-origin']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1)")).click();

		
		
		
		
		
		
	}

}
