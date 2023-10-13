package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class enableddisabled764 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();
		//WebDriver driver = new EdgeDriver();
		driver.get("http://spicejet.com"); //URL in the browser
		driver.manage().window().maximize();
		
		
		//driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2)")).click();
		//System.out.println(driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']")).getAttribute("style"));

		if(driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']")).getAttribute("style").contains("background-color: rgb(238, 238, 238); border-bottom-left-radius: 0px; border-top-left-radius: 0px;"))
		{
			System.out.println("disabled");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("enabled");
			Assert.assertTrue(false);
		}
		driver.close();
		
		
	}
}
