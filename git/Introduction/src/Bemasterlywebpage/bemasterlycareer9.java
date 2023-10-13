package Bemasterlywebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bemasterlycareer9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		
		driver.get("https://staging.bemasterly.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//career tab
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/a[5]")).click();
		Thread.sleep(500);
		scroll.executeScript("window.scrollBy(0,1570)", "");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("#headingOne")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#headingTwo")).click();
		Thread.sleep(1000);
	
		driver.close();
	}
}
