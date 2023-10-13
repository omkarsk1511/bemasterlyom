package Selenium.Section10to20;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class openingalllinks1195 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();
		//WebDriver driver = new EdgeDriver();
			
		driver.get("https://staging.bemasterly.com/");
		driver.manage().window().maximize();
		
		/*
		System.out.println("home link count is " + '"'+ driver.findElements(By.tagName("a")).size()+ '"');
		
		for(int i=0; i<driver.findElements(By.tagName("a")).size();i++)
		{
			String linkinnewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			driver.findElements(By.tagName("a")).get(i).sendKeys(linkinnewTab);
		}
		*/

		WebElement footer = driver.findElement(By.xpath("//body//footer"));
		System.out.println("footer link count is " + '"'+ footer.findElements(By.tagName("a")).size()+ '"');

		for(int i=2; i<footer.findElements(By.tagName("a")).size();i++)
		{
			String linkinnewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footer.findElements(By.tagName("a")).get(i).sendKeys(linkinnewTab);
			Thread.sleep(2000);		
		}
	
		Set<String> handle=driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
		}
		driver.close();
	}
}
