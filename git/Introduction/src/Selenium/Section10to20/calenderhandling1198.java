package Selenium.Section10to20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderhandling1198{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();
		//WebDriver driver = new EdgeDriver();
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
			
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
	    scroll.executeScript("window.scrollBy(0,1200)", "");
	    Thread.sleep(2000);
	    driver.findElement(By.id("form-field-travel_comp_date")).click();
	    
	    

	    //WebElement currYear = driver.findElement(By.cssSelector("input[title='Scroll to increment']"));   
	    WebElement currMonth = driver.findElement(By.className("flatpickr-month"));
	    WebElement nextMonth = driver.findElement(By.className("flatpickr-next-month"));
	    
	   
	    
	    //System.out.println(currYear.getText());
	    //System.out.println(currMonth.getText());
	    

	    
	    //for novamber 
	    while(!currMonth.getText().contains("November"))
	    {
	    	nextMonth.click();
	    	Thread.sleep(200);
	    }

	    
	    System.out.println(currMonth.getText());
	    List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
	
	    int totalDays = dates.size();
  
	    for( int i=0; i<totalDays; i++)
	    {
	    	String dateExpected = dates.get(i).getText();
	    	if(dateExpected.equals("15"))
	    	{
	    		dates.get(i).click();
	 	    	break;
	    	}	
	    }
	    driver.close();
	    
	 }
}
