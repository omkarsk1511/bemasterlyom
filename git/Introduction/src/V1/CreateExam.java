package V1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateExam {

	public static void main(String[] args) {
		// Verify that admin is able to create a "Batch"

				//new chorme driver 
				//WebDriver driver = new ChromeDriver();
				//WebDriver driver = new FirefoxDriver();
				//WebDriver driver = new EdgeDriver();

				//existing chorme driver
				//cd "C:\Program Files\Google\Chrome\Application\" 
	
				
				//chrome.exe --remote-debugging-port=3322 --user-data-dir="C:\Users\genex\OneDrive\Desktop\Omkar\automation\Selenium\Chrome profile"
				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("debuggerAddress", "127.0.0.1:3322");
				WebDriver driver = new ChromeDriver(options);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				JavascriptExecutor scroll = (JavascriptExecutor) driver;
				
				
				//Prerequisite
				
				String url = "https://smartschool.bemasterly.com/login";
				driver.get(url);
				driver.manage().window().maximize();
				String usernameEi = "username";
				driver.findElement(By.id(usernameEi)).sendKeys("smartschool");
				String passwordEi = "password";
				driver.findElement(By.id(passwordEi)).sendKeys("Genext@123");
				String signinEx = "//button[@type='submit']";
				driver.findElement(By.xpath(signinEx)).click();
	}

}