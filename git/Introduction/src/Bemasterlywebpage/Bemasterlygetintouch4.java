package Bemasterlywebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Bemasterlygetintouch4 {
//0min 23sec
	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();

		String url = "https://staging.bemasterly.com/";
		String getusername = "carg";
		String getemail = "omkarsk1511@gmail.com";
		String getmobile = "7262940840";
		int getcityindex = 532;
		int getiamindex = 5;
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".getintouch")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("#get_username")).sendKeys(getusername);
        driver.findElement(By.cssSelector("#get_email")).sendKeys(getemail);
		driver.findElement(By.cssSelector("#get_mobile")).sendKeys(getmobile);
		
		WebElement getcity = driver.findElement(By.cssSelector("#get_city"));
		Select getdropcity = new Select(getcity);
		getdropcity.selectByIndex(getcityindex);
		
		WebElement getiam = driver.findElement(By.cssSelector("#get_iam"));
		Select getdropiam = new Select(getiam);
		getdropiam.selectByIndex(getiamindex);
		driver.findElement(By.cssSelector("#get_btn_text")).click();
		//Assertion
		//Assert.assertEquals(driver.findElement(By.cssSelector("p")).getText(), "At a glance summary of your account.");
		//driver.close();
		}
}
