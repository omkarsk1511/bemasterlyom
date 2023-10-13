package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment764 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();
		//WebDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
	
		driver.findElement(By.name("name")).sendKeys("Omkar");
		driver.findElement(By.name("email")).sendKeys("Omkar@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345678");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement gender = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropgender = new Select(gender);
		dropgender.selectByIndex(1);
		
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("15-11-1997");

		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());	
	}

}
