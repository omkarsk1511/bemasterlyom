import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://smartschool.genextlearn.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("smartschool");
		driver.findElement(By.id("password")).sendKeys("Genext@123");
		driver.findElement(By.className("btn")).click();
		//driver.findElement(By.className("user-name")).click();
		//driver.findElement(By.xpath("//*[@id=\"read_scrp_default\"]/div[1]/div[2]/div[1]/div/div/div[3]/ul/li/div/div[3]/ul")).click();
		driver.findElement(By.xpath("//*[@id=\"read_scrp_default\"]/div[1]/div[1]/div[2]/div/div[1]/div[2]/div/div/div/div/div[1]/ul/li[4]")).click();//sub
		driver.findElement(By.xpath("//*[@id=\"nk-content-genext\"]/div/div/div[1]/div/div[2]/div/div/ul/li/div/a")).click();//plus btn
		driver.findElement(By.xpath("//*[@id=\"nk-content-genext\"]/div/div/div[1]/div/div[2]/div/div/ul/li/div/div")).click();//add
		driver.findElement(By.name("batch[]")).sendKeys("TOM");//sub1
		driver.findElement(By.className("input-group-prepend")).click();//add more
		driver.findElement(By.id("batch1")).sendKeys("SOM");//sub2
		driver.findElement(By.xpath("//*[@id=\"addClasses\"]/div/div[3]/div/button")).click();//submit
		driver.close();
} 
}	
