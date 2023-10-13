package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class existingbrowser {

	public static void main(String[] args) {
        //existing broeser cmd syntax
		//cd "C:\Program Files\Google\Chrome\Application\" 
		//chrome.exe --remote--debugging-port=8888 --user-data-dir="C:\Users\genex\OneDrive\Desktop\Automation\Chromeprofile\existingbrowser"
		ChromeOptions opt=new ChromeOptions();
		opt.setExperimentalOption("debuggerAddress","localhost:8888 ");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("http://facebook.com");
	
	
}
}
