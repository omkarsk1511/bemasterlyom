package Selenium.Section1to10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown752 {
//static dropdown
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();
		//WebDriver driver = new EdgeDriver();
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		
		String url = "https://staging.bemasterly.com/";
		
		driver.get(url);
		driver.manage().window().maximize();
	    scroll.executeScript("window.scrollBy(0,470)", "");
	    Thread.sleep(500);
	    driver.findElement(By.cssSelector(".cta_btn.orange_bg")).click();
		Thread.sleep(500);
		WebElement city = driver.findElement(By.cssSelector("#city"));
		Select dropcity = new Select(city);
		dropcity.selectByIndex(69);
		System.out.println(dropcity.getFirstSelectedOption().getText());
		dropcity.selectByValue("Ajmer");
		System.out.println(dropcity.getFirstSelectedOption().getText());
		dropcity.selectByVisibleText("Jaipur");
		System.out.println(dropcity.getFirstSelectedOption().getText());
		driver.close();
	}
}
