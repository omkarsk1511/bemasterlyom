import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class seleintroduction {

	public static void main(String[] args) {
		//Chrome launcch
		//System.setProperty("webdriver.chrome.driver", "C:\\eclips\\eclipse\\Drivers\\Driver zip\\Driver\\chromedriver.exe");
		//System.setProperty needed for older version of selenium
		//WebDriver driver = new ChromeDriver();
		
		//firefox launch
	    //System.setProperty("webdriver.gecko.driver", "C:\\eclips\\eclipse\\Drivers\\Driver zip\\Driver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//microsoft edge launch
	    //System.setProperty("webdriver.edge.driver", "C:\\eclips\\eclipse\\Drivers\\Driver zip\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close(); //only close current window
		//driver.quit(); //open all associted windows by selenium
        
	}
}




