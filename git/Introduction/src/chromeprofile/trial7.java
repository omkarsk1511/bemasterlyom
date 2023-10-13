package chromeprofile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class trial7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//chrome.exe --remote-debugging-port=1989 --user-data-dir="C:\selenium\trail7"
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "127.0.0.1:1989");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://smartschool.bemasterly.com");
		/*driver.findElement(By.id("username")).sendKeys("smartschool");
		driver.findElement(By.id("password")).sendKeys("Genext@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Students']")).click();
		Thread.sleep(1000);
		WebElement actions = driver.findElement(By.cssSelector("em[class='icon ni ni-more-h'"));
		actions.click();
		*/
		
		
		
		
		
		
		
		
		
	}

}
