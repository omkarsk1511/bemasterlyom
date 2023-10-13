package SaaSUserStories;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class bw530ETE {
	// Verify that admin is able to create student
	public static void main(String[] args) throws InterruptedException {
		//chrome.exe --remote-debugging-port=2401 --user-data-dir="C:\selenium\SaasUserStories"

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "127.0.0.1:2401");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor scroll = (JavascriptExecutor) driver;

		String url = "https://smartschool.bemasterly.com/login";
		driver.get(url);
		driver.manage().window().maximize();
		String usernameEi = "username";
		driver.findElement(By.id(usernameEi)).sendKeys("smartschool");
		String passwordEi = "password";
		driver.findElement(By.id(passwordEi)).sendKeys("Genext@123");
		String signinEx = "//button[@type='submit']";
		driver.findElement(By.xpath(signinEx)).click();;
		String usersEx = "//span[normalize-space()='Users']";
		driver.findElement(By.xpath(usersEx)).click();;
		String studentsEx = "//span[normalize-space()='Students']";
		driver.findElement(By.xpath(studentsEx)).click();
		String addBEx = "//a[@class='dropdown-toggle btn btn-icon btn-primary']";
		driver.findElement(By.xpath(addBEx)).click();
		String addEx = "//a[@href='https://smartschool.bemasterly.com/admin/students/add']";
		driver.findElement(By.xpath(addEx)).click();
		//Personal Details
		{
		String nameEi = "first_name";
		driver.findElement(By.id(nameEi)).sendKeys("StudentII");
		String emailEn = "email";
		driver.findElement(By.name(emailEn)).sendKeys("omkarsk1511@gmail.com");
		String mobileEn = "mobile";
		driver.findElement(By.name(mobileEn)).sendKeys("7262940840");
		
		String dobEn = "dob";
		driver.findElement(By.name(dobEn)).click();;
		WebElement year = driver.findElement(By.className("datepicker-years"));
		WebElement prev = driver.findElement(By.cssSelector("div[class='datepicker-years'] th[class='prev']"));
		String bYear = "1997";
		String bMonth = "Nov";
		String bDay = "15";
		while(!year.getText().contains(bYear))
		{
			prev.click();
		}
		//year
	    List<WebElement> years = driver.findElements(By.className("year"));
	    int totalYears = years.size();
  	    for( int i=0; i<totalYears; i++)
	    {
	    	String yearExpected = years.get(i).getText();
	    	if(yearExpected.equals(bYear))
	    	{
	    		years.get(i).click();
	 	    	break;
	    	}	
	    }
  	    //Month
	    List<WebElement> months = driver.findElements(By.className("month"));
	    int totalMonth = months.size();
  	    for( int i=0; i<totalMonth; i++)
	    {
	    	String monthExpected = months.get(i).getText();
	    	if(monthExpected.equals(bMonth))
	    	{
	    		months.get(i).click();
	 	    	break;
	    	}	
	    }
  	    //day
	    List<WebElement> days = driver.findElements(By.className("day"));
	    int totalDays = days.size();
  	    for( int i=0; i<totalDays; i++)
	    {
	    	String dayExpected = days.get(i).getText();
	    	if(dayExpected.equals(bDay))
	    	{
	    		days.get(i).click();
	 	    	break;
	    	}	
	    }
  	    
  	    String rollEt = "roll_no";
  	    driver.findElement(By.id(rollEt)).sendKeys("StudentI");
  	    
		WebElement gender = driver.findElement(By.name("gender"));
		Select dropGender = new Select(gender);
		dropGender.selectByValue("Male");
		}
		
		//Parent Details
		String fnameEi = "fname";
		driver.findElement(By.id(fnameEi)).sendKeys("FatherI");
		String lfnameEi = "lname";
		driver.findElement(By.id(lfnameEi)).sendKeys("LastI");
		String femailEn = "parent_email";
		driver.findElement(By.name(femailEn)).sendKeys("omkarsk1511@gmail.com");
		String fmobileEn = "parent_mobile";
		driver.findElement(By.name(fmobileEn)).sendKeys("7262940840");
		
		//address
		String addressEn = "add1";
		driver.findElement(By.name(addressEn)).sendKeys("Vikhroli");
		String cityEn = "city";
		driver.findElement(By.name(cityEn)).sendKeys("mumbai");

		WebElement state = driver.findElement(By.name("state"));
		Select dropState = new Select(state);
		dropState.selectByVisibleText("Maharashtra");  
		
		String pincodeEn = "pincode";
		driver.findElement(By.name(pincodeEn)).sendKeys("400079");
		
		String setcredEx = "//label[@for='customRadio2']";
		driver.findElement(By.xpath(setcredEx)).click();
		
	    scroll.executeScript("window.scrollBy(0,1200)", "");
		Thread.sleep(2000);
		String saveEx = "//button[@id='test']";
		driver.findElement(By.xpath(saveEx)).click();
  	 }
}
