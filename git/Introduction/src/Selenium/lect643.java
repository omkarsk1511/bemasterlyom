package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lect643 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		
		String url = "http://newschool.genextschools.com/";
		String username = "newschool";
		String password = "Genext@123";
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#username")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		//643
		driver.findElement(By.xpath("//*[text()='Sign in']")).click();
		
	}

}
