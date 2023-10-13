package chromeprofile;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class existingchrome5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//cd "C:\Program Files\Google\Chrome\Application\" 
		//chrome.exe --remote--debugging-port=2004 --user-data-dir="C:\eclips\chromeprofile1"
		//chrome.exe --remote--debugging-port=1993 --user-data-dir="C:\selenium\AutomationProfile1"

	
		//System.setProperty("webdriver.chrome.driver", "C:\\eclips\\eclipse\\Drivers\\Driver zip\\Driver\\chromedriver.exe");
        //ChromeOptions options = new ChromeOptions();
        //options.setExperimentalOption("debuggerAddress", "142.250.199.164:443");
        
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "142.250.76.205:443");
        WebDriver driver = new ChromeDriver(options);
        //driver.get("http://newschool.genextschools.com/login");      
        driver.manage().window().minimize();
	}  

}
