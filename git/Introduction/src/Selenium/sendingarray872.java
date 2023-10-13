package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendingarray872 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();
		//WebDriver driver = new EdgeDriver();
		
		String[] names = {"Cucumber","Brocolli"};
				
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.priduct-name"));
		
		for (int i=0; i<products.size();i++)
		{
		  String name= products.get(i).getText();
		  
		  if (name.contains("Cucumber"))
		  {
			 // driver.findElement(By.xpath("//button[text()='ASS TO CART']")).get(i).click();
			 
			  break;
		  }
		  
			
		}
		
		
		
		
		///Cucumber
		//Brocolli 
		
	}

}
