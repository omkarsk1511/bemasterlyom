package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class existingbrowser2 {

	public static void main(String[] args) {
		 //existing broeser cmd syntax
		//cd "C:\Program Files\Google\Chrome\Application\" 
		//chrome.exe --remote--debugging-port=1112 --user-data-dir="C:\Users\genex\OneDrive\Desktop\Automation\Chromeprofile\existingchrome3"
		ChromeOptions opt=new ChromeOptions();
		opt.setExperimentalOption("debuggerAddress","localhost:1112 ");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("http://newschool.genextschools.com");
		//driver.manage().window().maximize();
	}

}
