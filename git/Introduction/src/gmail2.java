import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail2 {

	public static void main(String[] args) {
	   
	      WebDriver driver = new ChromeDriver();

	    	      driver.get("w");
	    		driver.manage().window().maximize();

	    	      WebElement l = driver.findElement(By.name("identifier"));
	    	      l.sendKeys("omkarsk1511@gmail.com");
	    	      WebElement b = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
	    	      b.click();
	    	      WebElement p = driver.findElement(By.name("password"));
	    	      p.sendKeys("Ok@13096187");
	    	      b.click();
	    	      //close browser
	    	      //driver.close();
	    	   }
	

}
