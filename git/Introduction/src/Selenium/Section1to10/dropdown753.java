package Selenium.Section1to10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown753 {
// dropdown
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();
		//WebDriver driver = new EdgeDriver();
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		
		String url = "https://www.spicejet.com/";
		
		driver.get(url);
		driver.manage().window().maximize();
	    
	    driver.findElement(By.id("divpaxinfo")).click();
	    Thread.sleep(500);
	    
	    //for loop for clicking multiple times
	      
	    for(int i=1;i<4;i++) //for 3 time clicks
	    {
	    	driver.findElement(By.id("hrefInadt")).click();
	
	    }
	    driver.findElement(By.id("btnclosepaxoption")).click();
    }
}
