package chromeprofile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class trial3 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "127.0.0.1:2007");
		
		
		/*
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "127.0.0.1:2007");
		WebDriver driver = new ChromeDriver(options);
		*/
		WebDriver driver = new ChromeDriver(options);
	      //object of ChromeOptions class
	      ChromeOptions o = new ChromeOptions();
	      //setting debuggerAddress value
	      o.setExperimentalOption("debuggerAddress", "localhost:2007");
	      //add options to browser capabilities
	      
	      /*
	      Capabilities c = driver.getCapabilities(o);
	      Map<String, Object> m = c.asMap();
	      m.forEach((key, value) −> {
	         System.out.println("Key is: " + key + " Value is: " + value);
	      });
	      //set implicit wait
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      //identify element
	      WebElement l = driver.findElement(By.id("gsc−i−id1"));
	      //remove existing data in edit box
	      l.clear();
	      l.sendKeys("Tutorialspoint");
	      String s = l.getAttribute("value");
	      System.out.println("Attribute value: " + s);
	      
	   }
		
		*/
		
		
		driver.get("https://www.amazon.com/");
	}

}
