package SaaSUserStories;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class BW530TC002 {
	//Verify that breadcrumbs are displayed and clickable 

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
		
		String url = "https://smartschool.bemasterly.com/login";
		driver.get(url);
		driver.manage().window().maximize();
		String usernameEi = "username";
		driver.findElement(By.id(usernameEi)).sendKeys("smartschool");
		String passwordEi = "password";
		driver.findElement(By.id(passwordEi)).sendKeys("Genext@123");
		String signinEx = "//button[@type='submit']";
		driver.findElement(By.xpath(signinEx)).click();
		String usersEx = "//span[normalize-space()='Users']";
		driver.findElement(By.xpath(usersEx)).click();;
		String studentsEx = "//span[normalize-space()='Students']";
		driver.findElement(By.xpath(studentsEx)).click();
				
		String addBEx = "//a[@class='dropdown-toggle btn btn-icon btn-primary']";
		driver.findElement(By.xpath(addBEx)).click();
		
		//Assertions
		String breadEx = "//a[@href='https://smartschool.bemasterly.com/admin/students/add']";
		Assert.assertEquals(driver.findElement(By.xpath(breadEx)).getText(), "student/add new studemt");
		Assert.assertEquals(true, driver.findElement(By.xpath(breadEx)).isDisplayed());
		String breadsttudentEx = "//a[normalize-space()='Home']";
		Assert.assertEquals(true, driver.findElement(By.xpath(breadsttudentEx)).isEnabled());
		System.out.println("Automatic Assertions are applied If Test Case Fails then nothing will print" + '\n' + "For manual check");
		System.out.println("Element is present" + '\n' + "Expected = Add" + '\n' + "actual   = "+driver.findElement(By.xpath(addEx)).getText());
		
		driver.findElement(By.xpath(addEx)).click();
		String isClickable = "//h5[normalize-space()='Personal Details']";
		Assert.assertEquals(true, driver.findElement(By.xpath(isClickable)).isDisplayed());
		Assert.assertEquals(driver.findElement(By.xpath(isClickable)).getText(), "Personal Details");
		System.out.println("Element is clickable" + '\n' + "Expected = Personal Details" + '\n' + "actual   = "+driver.findElement(By.xpath(isClickable)).getText());
	}
}
