package Selenium.Section10to20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment1197 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();
		//WebDriver driver = new EdgeDriver();
			
		driver.get("https://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		WebElement option = driver.findElement(By.id("checkBoxOption3"));
		String selOption = driver.findElement(By.cssSelector("label[for='honda']")).getText();
		
		option.click();

		WebElement drop = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(drop);
		dropdown.selectByVisibleText(selOption);
		
		driver.findElement(By.id("name")).sendKeys(selOption);
		driver.findElement(By.id("alertbtn")).click();
		
		String a = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
	     if(a.contains(selOption))

	     {
	    System.out.println("Alert message success");
	     }
	     else
	    System.out.println("Something wrong with execution");
		driver.close();
	}
}
