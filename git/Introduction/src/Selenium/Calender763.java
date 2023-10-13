package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender763 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();
		//WebDriver driver = new EdgeDriver();

		driver.get("http://spicejet.com"); //URL in the browser
		driver.findElement(By.cssSelector(".css-76zvg2.css-bfa6kz.r-homxoj.r-ubezar")).click();
		
		driver.close();
	}

}
