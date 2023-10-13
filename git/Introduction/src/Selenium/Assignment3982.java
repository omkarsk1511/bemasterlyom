package Selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3982 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();
		//WebDriver driver = new EdgeDriver();
		
		String[] mobiles = {"iphone","Samsung","Nokia","Blackberry"};
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#password")).sendKeys("learning");
		driver.findElement(By.className("radiotextsty")).click();
		//driver.switchTo().alert().accept();
		WebElement drop = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(drop);
		dropdown.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.cssSelector("#signInBtn")).click();
	}
		public static  void addMobiles(WebDriver driver,String[] mobiles)
		{
		int j=0;
		List<WebElement> products=driver.findElements(By.cssSelector("h4.card-title"));
		for(int i=0;i<products.size();i++)
		{
		List itemsNeededList = Arrays.asList(mobiles);
		if(products.contains(mobiles))
		{
		j++;
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		if(j==mobiles.length)
		{
		break;
		}
}
		}
		}
}

