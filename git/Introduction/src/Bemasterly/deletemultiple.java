package Bemasterly;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class deletemultiple {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
		WebDriver driver = new ChromeDriver(options);
		
		//JavascriptExecutor scroll = (JavascriptExecutor) driver;
			
		String url = "https://smartschool.genextlearn.com/login";
		String username = "smartschool";
		String password = "Genext@123";
		
		//driver.get(url);
		//driver.manage().window().maximize();
		//Thread.sleep(1000);
		//driver.findElement(By.cssSelector("#username")).sendKeys(username);
		//driver.findElement(By.cssSelector("#password")).sendKeys(password);
		//643
		//driver.findElement(By.xpath("//*[text()='Sign in']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Tutors']")).click();
		Thread.sleep(1000);
		//System.out.println(driver.findElements(By.cssSelector("em[class='icon ni ni-more-h'")).size());
		//Thread.sleep(1000);
		
	    List<WebElement> actions = driver.findElements(By.cssSelector("em[class='icon ni ni-more-h'"));
		
	    int totalaction = actions.size();
  
	    for( int i=0; i<totalaction; i++)
	    {
	    		actions.get(i).click();
	    		Thread.sleep(2500);
	   	    		
	    		    List<WebElement> deletes = driver.findElements(By.cssSelector("em[class='icon ni ni-trash'"));
	    			
	    		    int totaldeletes = deletes.size();
	    		    //System.out.println(deletes.size());
	    		    
	    	  
	    		    for( int j=0;j<totaldeletes;j++)// j++
	    		    {
	    		    	
	    		    		deletes.get(j).click();
	    		    		Thread.sleep(500);
	    		    		driver.findElement(By.cssSelector(".swal2-confirm.swal2-styled")).click();
	    		    		Thread.sleep(2500);
	    		    		
	    		    		 List<WebElement> deletesYes = driver.findElements(By.cssSelector("em[class='icon ni ni-trash'"));
	    		    			
	    		    		    int totaldeletesyes = deletesYes.size();
	    		    		    //System.out.println(deletesYes.size());
	    		    		    
	    		    	  
	    		    		    for( int k=0;k<totaldeletesyes;k++)// j++
	    		    		    {
	    		    		    	
	    		    		    		deletes.get(k).click();
	    		    		    		Thread.sleep(500);
	    		    		    		driver.findElement(By.cssSelector(".swal2-confirm.swal2-styled")).click();
	    		    		    		Thread.sleep(10000);
	    		    		     }
		    		     }
	    	}   
		driver.close();		
	}
}
	

