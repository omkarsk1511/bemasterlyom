package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdowndynamic755 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();
		//WebDriver driver = new EdgeDriver();
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		
		String url = "https://www.spicejet.com/";
		
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("div[data-testid='to-testID-origin'] input[type='text']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	}
}
