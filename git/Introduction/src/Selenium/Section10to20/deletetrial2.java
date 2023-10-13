package Selenium.Section10to20;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class deletetrial2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();
		//WebDriver driver = new EdgeDriver();
		
		//JavascriptExecutor scroll = (JavascriptExecutor) driver;
			
		String url = "https://smartschool.genextlearn.com/login";
		String username = "smartschool";
		String password = "Genext@123";
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#username")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		//643
		driver.findElement(By.xpath("//*[text()='Sign in']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Tutors']")).click();
		Thread.sleep(1000);
		//System.out.println(driver.findElements(By.cssSelector("em[class='icon ni ni-more-h'")).size());
		//Thread.sleep(1000);
		
		
		List<WebElement> actions = driver.findElements(By.cssSelector("em[class='icon ni ni-more-h'"));
		
		for(int i=0; i<actions.size();i++)
		{
			String linkinnewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			actions.get(i).sendKeys(linkinnewTab);
			Thread.sleep(2000);		
		}
		Set<String> handle=driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			/*List<WebElement> deletes = driver.findElements(By.cssSelector("em[class='icon ni ni-trash'"));
			
		    int totaldeletes = deletes.size();
		    //System.out.println(deletes.size());

		    for( int j=0;j<totaldeletes;j++)// j++
		    {	
		    		deletes.get(j).click();
		    		Thread.sleep(500);
		    		driver.findElement(By.cssSelector(".swal2-confirm.swal2-styled")).click();
		    		Thread.sleep(2500);
		    }*/
		}
	}
}
