package Bemasterlywebpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class acc {

	public static void main(String[] args) throws InterruptedException {
	
			   
			  ChromeOptions opt = new ChromeOptions(); 
			  opt.addArguments("--remote-allow-origins=*"); 
			   
			  //WebDriverManager.chromedriver().setup(); 
			  WebDriver driver = new ChromeDriver(opt);  //Pass the chrome option object reference here 
			  driver.manage().window().maximize(); 
			  
			  String url = "https://www.bemasterly.com/";
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
				List<WebElement> e = dropcity.getOptions();
				int itemCount = e.size();

				for(int l = 0; l < itemCount; l++)
				{
				    System.out.println(e.get(l).getText());
				}
				
				
				System.out.println(e.size());

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
