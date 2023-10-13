package Bemasterlywebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bemasterlyalltabs1 {
//2min 45sec
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		
		driver.get("https://staging.bemasterly.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//home tab
		scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		Thread.sleep(2000);	
				
		//aboutus tab
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/a[2]")).click();
		scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		Thread.sleep(2000);	
			
		//features tab
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/a[3]")).click();
		scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		Thread.sleep(2000);	
			
		//blog tab
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/a[4]")).click();
		scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		Thread.sleep(2000);	

		//career tab
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/a[5]")).click();
		scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		Thread.sleep(2000);

		driver.close();
	}
}