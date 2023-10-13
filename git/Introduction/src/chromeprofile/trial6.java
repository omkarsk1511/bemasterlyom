package chromeprofile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class trial6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chrome.exe --remote--debugging-port=1973 --user-data-dir="C:\selenium\AutomationProfile1"
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "127.0.0.1:2005");
		WebDriver driver = new ChromeDriver(options);  
		driver.get("https://www.flipkart.com/");
	}
}
