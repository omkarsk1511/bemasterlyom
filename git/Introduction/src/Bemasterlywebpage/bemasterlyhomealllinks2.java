package Bemasterlywebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bemasterlyhomealllinks2 {
	//3min
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		
		driver.get("https://staging.bemasterly.com/");
		driver.manage().window().maximize();
		
	    //book demo button
	    scroll.executeScript("window.scrollBy(0,470)", "");
	    Thread.sleep(500);
	    driver.findElement(By.cssSelector(".cta_btn.orange_bg")).click();
	    Thread.sleep(500);
	    
	    //play now button
	    driver.findElement(By.cssSelector(".active")).click();
	    scroll.executeScript("window.scrollBy(0,470)", "");
	    Thread.sleep(500);
	    driver.findElement(By.cssSelector(".playnow.vpop")).click();
	    Thread.sleep(16000);
	    driver.findElement(By.cssSelector("#video-popup-close")).click();
	    
	    //know more button
	    driver.findElement(By.cssSelector("img[alt='BeMasterly']")).click();
	    scroll.executeScript("window.scrollBy(0,970)", "");
	    Thread.sleep(500);
	    driver.findElement(By.cssSelector(".cta_btn.blue_bg")).click();
	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	    Thread.sleep(2000);

	    
	    //Features Professionalism
	    driver.findElement(By.cssSelector("img[alt='BeMasterly']")).click();
	    Thread.sleep(500);
	    scroll.executeScript("window.scrollBy(0,1470)", "");
	    Thread.sleep(500);
	    driver.findElement(By.cssSelector("#benefits > div > div > div > div:nth-child(2) > a > div")).click();
	    Thread.sleep(2000);
	    
	    //Features Efficiency
	    driver.findElement(By.cssSelector("img[alt='BeMasterly']")).click();
	    Thread.sleep(500);
	    scroll.executeScript("window.scrollBy(0,1470)", "");
	    Thread.sleep(500);
	    driver.findElement(By.cssSelector("#benefits > div > div > div > div:nth-child(3) > a > div")).click();
	    Thread.sleep(2000);
	    
	   //Features Engagement
	    driver.findElement(By.cssSelector("img[alt='BeMasterly']")).click();
	    Thread.sleep(500);
	    scroll.executeScript("window.scrollBy(0,1470)", "");
	    Thread.sleep(500);
	    driver.findElement(By.cssSelector("#benefits > div > div > div > div:nth-child(4) > a > div")).click();
	    Thread.sleep(2000);
	    
	    //Features Growth
	    driver.findElement(By.cssSelector("img[alt='BeMasterly']")).click();
	    Thread.sleep(500);
	    scroll.executeScript("window.scrollBy(0,1470)", "");
	    Thread.sleep(500);
	    driver.findElement(By.cssSelector("#benefits > div > div > div > div:nth-child(5) > a > div")).click();
	    Thread.sleep(2000);

	    //terms and conditions
	    driver.findElement(By.cssSelector("img[alt='BeMasterly']")).click();
	    scroll.executeScript("window.scrollBy(0,470)", "");
	    Thread.sleep(500);
	    driver.findElement(By.cssSelector(".cta_btn.orange_bg")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("form[id='contactus_form'] div[class='form-check'] a")).click();
  	    scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	    Thread.sleep(2000);
		//Assertion
		//Assert.assertEquals(driver.findElement(By.cssSelector("p")).getText(), "At a glance summary of your account.");
	    driver.close();
		}
	}
