package Bemasterlywebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//1min 10sec
public class bemasterlyfoteraboutcompany6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		
		driver.get("https://staging.bemasterly.com/");
		driver.manage().window().maximize();
		
		//POSH Policy link footer
	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	    Thread.sleep(1000);		    
	    driver.findElement(By.xpath("//a[normalize-space()='POSH Policy'] ")).click();
	    Thread.sleep(5000);	
	    driver.navigate().back();
	    driver.findElement(By.cssSelector("img[alt='BeMasterly']")).click();
	    
	    //Legal disclaimer link footer
	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	    Thread.sleep(1000);	
	    driver.findElement(By.xpath("//a[normalize-space()='Legal disclaimer']")).click();
  	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("img[alt='BeMasterly']")).click();

	    //Privacy policy link footer
	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	    Thread.sleep(1000);	
	    driver.findElement(By.xpath("//a[normalize-space()='Privacy policy']")).click();
  	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");	    
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("img[alt='BeMasterly']")).click();
	    
		//Assertion
		//Assert.assertEquals(driver.findElement(By.cssSelector("p")).getText(), "At a glance summary of your account.");
	     driver.close();
		}
}
