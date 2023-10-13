import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		

		//existing chorme driver
		//chrome.exe --remote-debugging-port=2401 --user-data-dir="C:\selenium\SaasUserStories"
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "127.0.0.1:2401");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://accounts.google.com/signin");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("omkarsk1511@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		//driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Ok@13096187");
		//driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();

		

	}

}
