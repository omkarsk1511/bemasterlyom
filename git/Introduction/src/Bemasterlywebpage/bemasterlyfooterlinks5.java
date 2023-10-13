package Bemasterlywebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bemasterlyfooterlinks5 {
//4min 15sec
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		
		driver.get("https://staging.bemasterly.com/");
		driver.manage().window().maximize();
		
		//home link footer
	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	    Thread.sleep(1000);	
	    driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/a[1]")).click();
	    Thread.sleep(3000);	
	    driver.findElement(By.cssSelector("img[alt='BeMasterly']")).click();
	    
	    //features link footer
	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	    Thread.sleep(1000);	
	    driver.findElement(By.xpath("//a[@class='links'][normalize-space()='Features']")).click();
  	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("img[alt='BeMasterly']")).click();
    
	    //blogs link footer
	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	    Thread.sleep(1000);	
	    driver.findElement(By.xpath("//a[@class='links'][normalize-space()='Blogs']")).click();
  	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");	    
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("img[alt='BeMasterly']")).click();
	    
	    //career link footer
	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	    Thread.sleep(1000);	
	    driver.findElement(By.xpath("//a[@class='links'][normalize-space()='Careers']")).click();
  	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");	    
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("img[alt='BeMasterly']")).click();
	    
	    //About us link footer
	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	    Thread.sleep(1000);	
	    driver.findElement(By.xpath("//a[@class='links'][normalize-space()='About Us']")).click();
  	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");	    
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("img[alt='BeMasterly']")).click();

		//Assertion
		//Assert.assertEquals(driver.findElement(By.cssSelector("p")).getText(), "At a glance summary of your account.");
	    driver.close();
		}
}
