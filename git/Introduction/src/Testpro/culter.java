package Testpro;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class culter {

	public static void main(String[] args) {
		 ChromeOptions opt = new ChromeOptions(); 
		  opt.addArguments("--remote-allow-origins=*"); 
		   
		  //WebDriverManager.chromedriver().setup(); 
		  WebDriver driver = new ChromeDriver(opt);  //Pass the chrome option object reference here 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		  driver.manage().window().maximize(); 
		  
		  driver.get("https://prodtest21.bemasterly.com/");
	}

}
