import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathcss {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//impleicit timeoit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// stops for 5 second if page is not loading
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://smartschool.genextlearn.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("smartschool");
		Thread.sleep(5000);   //stops for 5sec
       
		//driver.findElement(By.id("username")).sendKeys("smartschool");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Genext@123");
		
		//Xpath through parent child
		//driver.findElement(By.xpath("//parenttagname/childtagname[indexno]")).sendKeys("smartschool");
		
		//CSS selector through parent child
		//driver.findElement(By.cssSelector("parenttagname childtagname[indexno]']")).sendKeys("Genext@123");
		
		//driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.className("btn")).click();
		//System.out.println(driver.findElement(By.cssSelector("#flash_message")).getText());
		driver.close();
	}
}
