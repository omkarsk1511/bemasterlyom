package Selenium.Section1to10;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindow1089 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();
		//WebDriver driver = new EdgeDriver();
			
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();//parentId,childId,subchildId
		
		Iterator<String>it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		//String subchildId = it.next();
		
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		//System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split("with")[0]);
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		driver.switchTo().window(parentId);

		//driver.quit();
		
	
	}

}
