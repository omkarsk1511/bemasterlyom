package chromeprofile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class trial2 {
	public static void main(String[] args) {

		
		//chrome.exe --remote--debugging-port=2005 --user-data-dir=""C:\selenim"
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "127.0.0.1:2005");
		WebDriver driver = new ChromeDriver(options);  
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.id("username")).sendKeys("smartschool");
		//driver.findElement(By.id("password")).sendKeys("Genext@123");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		//driver.manage().window().maximize();
		driver.findElement(By.)
		

	}
}
