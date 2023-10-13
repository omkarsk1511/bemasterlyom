import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//impleicit timeoit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://smartschool.genextlearn.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("smartschool");
		driver.findElement(By.id("password")).sendKeys("Genext@123");
		driver.findElement(By.className("btn")).click();
		//System.out.println(driver.findElement(By.cssSelector("#flash_message")).getText());
		driver.close();
		
	}

}
