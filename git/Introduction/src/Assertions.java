import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class Assertions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://smartschool.genextlearn.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("smartschool");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Genext@123");
		driver.findElement(By.className("btn")).click();
		System.out.println(driver.findElement(By.cssSelector("p")).getText());
		//Assertion
	
		
		driver.close();
	}
}

