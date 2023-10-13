package SaaSUserStories;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TS002TC001 {
//Verify that admin is able to create "Offering".
	public static void main(String[] args) {
		//chrome.exe --remote-debugging-port=2401 --user-data-dir="C:\selenium\SaasUserStories"
		/*
		//new chorme driver 
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		*/
		
		//existing chorme driver
		//chrome.exe --remote-debugging-port=2401 --user-data-dir="C:\selenium\SaasUserStories"
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "127.0.0.1:2401");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		
		//Prerequisite
		
		String url = "http://smartschool.mastorly.com/login";
		driver.get(url);
		driver.manage().window().maximize();
		String usernameEi = "username";
		driver.findElement(By.id(usernameEi)).sendKeys("smartschool");
		String passwordEi = "password";
		driver.findElement(By.id(passwordEi)).sendKeys("Genext@123");
		String signinEx = "//button[@type='submit']";
		driver.findElement(By.xpath(signinEx)).click();
		String instEx = "//span[normalize-space()='Institute Setup']";
		driver.findElement(By.xpath(instEx)).click();;
		String offeringsEx = "(//span[@class='nk-menu-text'][normalize-space()='Offerings'])[2]";		
		driver.findElement(By.xpath(offeringsEx)).click();
		String addBOEx = "(//a[normalize-space()='Add offerings'])[1]";
		driver.findElement(By.xpath(addBOEx)).click();
		String offnameEx = "//input[@id='offeringName']";
		driver.findElement(By.id(offnameEx)).sendKeys("off1");
		
		WebElement NexamEx = driver.findElement(By.name("gender"));
		Select dropGender = new Select(gender);
		dropGender.selectByValue("Male");
		
		
		
		
		
		/*
		//Assertions
		String addEx = "//a[@href='https://smartschool.bemasterly.com/admin/students/add']";
		//"Add Student" button is displayed
		Assert.assertEquals(true, driver.findElement(By.xpath(addEx)).isDisplayed());
		Assert.assertEquals(true, driver.findElement(By.xpath(addEx)).isEnabled());
		Assert.assertEquals(driver.findElement(By.xpath(addEx)).getText(), "Add");
		System.out.println("Automatic Assertions are applied If Test Case Fails then nothing will print" + '\n' + "For manual check");
		System.out.println("Element is present" + '\n' + "Expected = Add" + '\n' + "actual   = "+driver.findElement(By.xpath(addEx)).getText());
		
		driver.findElement(By.xpath(addEx)).click();
		String isClickable = "//h5[normalize-space()='Personal Details']";
		Assert.assertEquals(true, driver.findElement(By.xpath(isClickable)).isDisplayed());
		Assert.assertEquals(driver.findElement(By.xpath(isClickable)).getText(), "Personal Details");
		System.out.println("Element is clickable" + '\n' + "Expected = Personal Details" + '\n' + "actual   = "+driver.findElement(By.xpath(isClickable)).getText());
	*/
	}
}
