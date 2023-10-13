package Selenium.Section1to10;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1090 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();
		//WebDriver driver = new EdgeDriver();
			
		driver.get("https://the-internet.herokuapp.com");
		driver.manage().window().maximize();
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
	    scroll.executeScript("window.scrollBy(0,670)", "");
	    Thread.sleep(2000);

		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
		Set<String> windows = driver.getWindowHandles();//parentId,childId,subchildId
		
		Iterator<String>it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		//String subchildId = it.next();
		

		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.xpath("//h3[normalize-space()='New Window']")).getText());
		driver.switchTo().window(parentId);	
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		
		driver.quit();
	}

}
