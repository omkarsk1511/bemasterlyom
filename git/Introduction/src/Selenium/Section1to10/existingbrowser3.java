package Selenium.Section1to10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class existingbrowser3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "\"C:\\eclips\\eclipse\\Drivers\\Driver zip\\Driver\\chromedriver.exe\\");
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("debuggerAddress","localhost:1112 ");
		WebDriver driver=new ChromeDriver(option);
		driver.get("http://newschool.genextschools.com");
		//driver.manage().window().maximize();

		
		
	}

}
