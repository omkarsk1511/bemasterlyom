package Bemasterlywebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bemasterlyblogs8 {
//3min
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
				
		driver.get("https://staging.bemasterly.com/");
		driver.manage().window().maximize();
		
		//Blog1 tab
		driver.findElement(By.cssSelector("div[class='navigation'] a:nth-child(5)")).click();
		scroll.executeScript("window.scrollBy(0,670)", "");
	    Thread.sleep(1000);	
	    driver.findElement(By.xpath("(//div[@class='blogtitle'])[1]")).click();
  	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
  	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("img[alt='BeMasterly']")).click();
	    Thread.sleep(1000);	
	    
		//Blog2 tab
		driver.findElement(By.cssSelector("div[class='navigation'] a:nth-child(5)")).click();
		scroll.executeScript("window.scrollBy(0,670)", "");
	    Thread.sleep(1000);	
	    driver.findElement(By.xpath("(//div[@class='blogtitle'])[2]")).click();
  	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
  	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("img[alt='BeMasterly']")).click();
	    Thread.sleep(1000);
	    
		//Blog3 tab
		driver.findElement(By.cssSelector("div[class='navigation'] a:nth-child(5)")).click();
		scroll.executeScript("window.scrollBy(0,1050)", "");
	    Thread.sleep(1000);	
	    driver.findElement(By.xpath("(//div[@class='blogtitle'])[3]")).click();
  	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	    driver.findElement(By.cssSelector("img[alt='BeMasterly']")).click();
	    Thread.sleep(1000);	
	    
		//Blog2 tab
		driver.findElement(By.cssSelector("div[class='navigation'] a:nth-child(5)")).click();
		scroll.executeScript("window.scrollBy(0,1050)", "");
	    Thread.sleep(1000);	
	    driver.findElement(By.xpath("(//div[@class='blogtitle'])[4]")).click();
  	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	    driver.findElement(By.cssSelector("img[alt='BeMasterly']")).click();
	    Thread.sleep(1000);	    

	  	driver.quit();
	}
}
