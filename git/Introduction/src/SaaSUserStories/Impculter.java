package SaaSUserStories;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Impculter {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "127.0.0.1:2401");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		
		
		
		
		WebElement dob = driver.findElement(By.name(dobEN));
		dob.click();	
		WebElement year = driver.findElement(By.className("datepicker-years"));
	    //int totalyear = year.size();
		//System.out.println(year.getText());

	    while(!year.getText().contains("1997"))
	    {
	    	Thread.sleep(2000);
    		driver.findElement(By.className("form-control form-control-lg date-picker-alt")).click();
	    	Thread.sleep(2000);
	    }
	    System.out.println(year.getText());
	  
	    
	    List<WebElement> years = driver.findElements(By.className("year"));

	    int totalYears = years.size();
  
	    for( int i=0; i<totalYears; i++)
	    {
	    	String yearExpected = years.get(i).getText();
	    	if(yearExpected.equals("1997"))
	    	{
	    		years.get(i).click();
	 	    	break;
	    	}	
	    }
	}

}
