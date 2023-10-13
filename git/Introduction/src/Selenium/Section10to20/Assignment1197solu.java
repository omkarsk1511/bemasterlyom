package Selenium.Section10to20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1197solu {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();
		//WebDriver driver = new EdgeDriver();
		
		driver.get("https://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		WebElement option = driver.findElement(By.cssSelector("label[for='honda"));
		String selOption = driver.findElement(By.cssSelector("label[for='honda']")).getText();
		System.out.println(selOption);
		
		
	}
}
