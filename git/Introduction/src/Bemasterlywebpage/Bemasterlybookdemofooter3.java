package Bemasterlywebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Bemasterlybookdemofooter3 {
//0min 30sec
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();

		String url = "https://staging.bemasterly.com/";
		String username = "omkar";
		String email = "omkar1511@gmail.com";
		String mobile = "7262940840";
		int cityindex = 121;
		int iamindex = 2;
		
		driver.get(url);
		driver.manage().window().maximize();
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		
	    scroll.executeScript("window.scrollBy(0,470)", "");
	    Thread.sleep(500);
	    driver.findElement(By.cssSelector(".cta_btn.orange_bg")).click();
	    Thread.sleep(500);
		driver.findElement(By.cssSelector("#username")).sendKeys(username);
		driver.findElement(By.cssSelector("#email")).sendKeys(email);
		driver.findElement(By.cssSelector("#mobile")).sendKeys(mobile);
		
		WebElement city = driver.findElement(By.cssSelector("#city"));
		Select dropcity = new Select(city);
		dropcity.selectByIndex(cityindex);
		
		WebElement iam = driver.findElement(By.cssSelector("#iam"));
		Select dropiam = new Select(iam);
		dropiam.selectByIndex(iamindex);
		
		Thread.sleep(500);
		driver.findElement(By.cssSelector("#btn_text")).click();
		//Assertion
		//Assert.assertEquals(driver.findElement(By.cssSelector("p")).getText(), "At a glance summary of your account.");
		//driver.close();
		}
}
