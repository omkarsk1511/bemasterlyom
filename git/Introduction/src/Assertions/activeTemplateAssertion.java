package Assertions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class activeTemplateAssertion {

	public static void main(String[] args) throws InterruptedException {
		 ChromeOptions opt = new ChromeOptions(); 
		  opt.addArguments("--remote-allow-origins=*"); 
		   
		  //WebDriverManager.chromedriver().setup(); 
		  WebDriver driver = new ChromeDriver(opt);  //Pass the chrome option object reference here 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		  driver.manage().window().maximize(); 
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String examName = "activeTemplateAssertion";
			
				driver.get("https://Prodtest50.bemasterly.com/");
				driver.manage().window().maximize();
				driver.findElement(By.id("username")).sendKeys("prodtest50");
				driver.findElement(By.id("password")).sendKeys("prodtest50");
				driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
				driver.findElement(By.xpath("//span[normalize-space()='TestPro']")).click();
				driver.findElement(By.xpath("//li[@data-content='Create Exam']//a[@class='nav-link']//*[name()='svg']")).click();
				Actions actions = new Actions(driver);
				driver.findElement(By.xpath("//input[@id='examname']")).sendKeys(examName);
				
				
				Select selectExam = new Select(driver.findElement(By.id("ExamType")));
				selectExam.selectByValue("15584");
				Thread.sleep(2000);
				
			
				
				
				Select selectOfferings = new Select(driver.findElement(By.id("offerings")));
				selectOfferings.selectByValue("8_10");
				Thread.sleep(2000);
				
				WebElement BatchDropdown = driver.findElement(By.xpath("//div[@id='grade_student']//button[@title='None selected']"));
				BatchDropdown.click();
				 WebElement mshb10th = driver.findElement(By.xpath("//input[@value='1723']"));
				 mshb10th.click();
				
				Select selectMode = new Select(driver.findElement(By.id("test_mode")));
				selectMode.selectByVisibleText("Offline Assessment");
				
				
				Thread.sleep(2000);
				WebElement TemplateDropdown = driver.findElement(By.id("template"));
				TemplateDropdown.click();			
				
				Select dropdown = new Select(TemplateDropdown);
				List<WebElement> templateList = dropdown.getOptions();
				for (WebElement option : templateList) {
			    System.out.println(option.getText());
			    }

	}

}
