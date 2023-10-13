package Bemasterlywebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bemasterfootersocialm7 {
//1min 5sec
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
				
		driver.get("https://staging.bemasterly.com/");
		driver.manage().window().maximize();
		
		//facebook link footer
	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	    Thread.sleep(1000);	
	    driver.findElement(By.cssSelector("a[href='https://www.facebook.com/BeMasterlyIndia/']")).click();
	    Thread.sleep(2000);	
	    
	    //youtube link footer
	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	    Thread.sleep(1000);	
	    driver.findElement(By.cssSelector("a[href='https://www.youtube.com/channel/UCWgX3ZcF50RKlJTHusCbaDA']")).click();
	    Thread.sleep(2000);
	    
	    //linkedin link footer
	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	    Thread.sleep(1000);	
	    driver.findElement(By.cssSelector("a[href='https://in.linkedin.com/company/bemasterlyindia']")).click();
	    Thread.sleep(2000);
	    
	    //twitter link footer
	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	    Thread.sleep(1000);	
	    driver.findElement(By.cssSelector("a[href='https://twitter.com/BeMasterlyIndia']")).click();
	    Thread.sleep(2000);
	    
	    //instagram link footer
	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	    Thread.sleep(1000);	
	    driver.findElement(By.cssSelector("a[href='https://www.instagram.com/bemasterlyindia/']")).click();
	    Thread.sleep(2000); 

		//Assertion
		//Assert.assertEquals(driver.findElement(By.cssSelector("p")).getText(), "At a glance summary of your account.");
	    // driver.quit();
		}
}