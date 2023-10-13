import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class rough {

	public static void main(String[] args) throws InterruptedException {
		
		//chrome.exe --remote-debugging-port=2401 --user-data-dir="C:\selenium\SaasUserStories"
		/*
		//new chorme driver 
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		*/
		
		//existing chorme driver
		//chrome.exe --remote-debugging-port=2401 --user-data-dir="C:\selenium\SaasUserStories"
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "127.0.0.1:2401");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		
		//driver.get("https://staging.bemasterly.com/");
		//driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//div[@class='_1MR4o5']")).getText());
		//driver.findElement(By.cssSelector("img[alt='BeMasterly']")).click();
		//Thread.sleep(1000);
	    //scroll.executeScript("window.scrollBy(0,2870)", "");
	    //driver.findElement(By.cssSelector("form[id='contactus_form'] div[class='form-check'] a")).click();
	    //Thread.sleep(1000);
	    //driver.findElement(By.cssSelector("#benefits > div > div > div > div:nth-child(3) > a > div")).click();

	   // Thread.sleep(1000);
	   
	  
		
		//Assertion
		//Assert.assertEquals(driver.findElement(By.cssSelector("p")).getText(), "At a glance summary of your account.");
		
	    //driver.close();
		}


}
