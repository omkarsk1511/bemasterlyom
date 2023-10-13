package Forbidden;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class forbidden2 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
		
		 //ChromeOptions opt = new ChromeOptions(); 
		  //opt.addArguments("--remote-allow-origins=*"); 
		   
		  //WebDriverManager.chromedriver().setup(); 
		  //WebDriver driver = new ChromeDriver(opt);  //Pass the chrome option object reference here 
		     // WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
			//WebDriver driver = new EdgeDriver();
	
		
		
		//WebDriver driver = new EdgeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\eclips\\eclipse files\\Introduction\\chromedriver2\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--new-tab");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://prodtest21.bemasterly.com");
        driver.get("https://prodtest99.bemasterly.com");
        driver.get("https://prodtest50.bemasterly.com");
}
}
