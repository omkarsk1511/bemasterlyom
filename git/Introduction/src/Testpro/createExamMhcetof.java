package Testpro;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class createExamMhcetof {

	public static void main(String[] args) throws InterruptedException {
		 ChromeOptions opt = new ChromeOptions(); 
		  opt.addArguments("--remote-allow-origins=*"); 
		   
		  //WebDriverManager.chromedriver().setup(); 
		  WebDriver driver = new ChromeDriver(opt);  //Pass the chrome option object reference here 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		  driver.manage().window().maximize(); 
		  driver.get("https://prodtest50.bemasterly.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("prodtest50");
			driver.findElement(By.id("password")).sendKeys("prodtest50");
			driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='TestPro']")).click();
			driver.findElement(By.xpath("//li[@data-content='Create Exam']//a[@class='nav-link']//*[name()='svg']")).click();
			
				Actions actions = new Actions(driver);
				
				
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			String[] names = {"MHCET of 1", "MHCET of 2", "MHCET of 3", "MHCET of 4", "MHCET of 5",
					"MHCET of 6", "MHCET of 7", "MHCET of 8", "MHCET of 9", "MHCET of 10",
					"MHCET of 11", "MHCET of 12", "MHCET of 13", "MHCET of 14", "MHCET of 15",
					"MHCET of 16", "MHCET of 17", "MHCET of 18", "MHCET of 19", "MHCET of 20",
					"MHCET of 21", "MHCET of 22", "MHCET of 23", "MHCET of 24", "MHCET of 25"
					};
			int k=0;
			for (int j=1;j<29;j++){
				
			
			//String name=names[k];
			driver.findElement(By.xpath("//input[@id='examname']")).sendKeys(names[k]);
			
	
			
			Select selectExam = new Select(driver.findElement(By.id("ExamType")));
			selectExam.selectByVisibleText("MH-CET");
			Thread.sleep(3000);
			
			
			Select selectOfferings = new Select(driver.findElement(By.id("offerings")));
			selectOfferings.selectByVisibleText("MH-CET - English");
			Thread.sleep(2000);
			
			WebElement BatchDropdown = driver.findElement(By.xpath("//div[@id='grade_student']//button[@title='None selected']"));
			BatchDropdown.click();
			 WebElement MHCETcomplete = driver.findElement(By.xpath(("//input[@value='2427']")));
			 MHCETcomplete.click();
			 
			Select selectMode = new Select(driver.findElement(By.id("test_mode")));
			selectMode.selectByVisibleText("Offline Assessment");
			
			Thread.sleep(2000);
			WebElement TemplateDropdown = driver.findElement(By.id("template"));
			TemplateDropdown.click();
			
			Select selectTemplate = new Select(TemplateDropdown);
			//selectTemplate.selectByValue("174");
			List<WebElement> Templates = selectTemplate.getOptions();
			
			try {
				selectTemplate.selectByIndex(j);
		      } catch (StaleElementReferenceException e) {
		    	  selectTemplate.selectByIndex(j);
		      }
			//actions.sendKeys(Keys.ENTER).perform();
	        //String TemplateName = selectTemplate.toString();
	        //System.out.println("Selected option: " + TemplateName);
	   
		
		/*WebElement MonthlyPracticeTestMaths = driver.findElement(By.xpath("//option[@value='174']']"));
		MonthlyPracticeTestMaths.click();*/
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		
		//driver.findElement(By.xpath("//div[@class='col-md-6 nomal_time anti_print_purpose']//label[@class='pt-3']")).click();
		Thread.sleep(3000);
		
		
		
		WebElement Chapter = driver.findElement(By.xpath("//button[@title='None selected']"));
		try {
			 Chapter.click();
	      } catch (StaleElementReferenceException e) {
	    	  Chapter.click();
	      }
		
		
		
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		
	    Select selectChapter = new Select(driver.findElement(By.id("chapter")));
		
		List<WebElement> elementCount = selectChapter.getOptions();
		
		System.out.println("Number of items: " + elementCount.size());
		
		
		
		//System.out.println();
		
	    for(int i=0;i<=elementCount.size();i++)
	    	{
	    	actions.sendKeys(Keys.ARROW_DOWN, Keys.SPACE).perform();
			}
	   
		WebElement ContinueBtn = driver.findElement(By.xpath("//button[@id='button_page_1']"));
		Thread.sleep(3000);
		
		ContinueBtn.click();
		Thread.sleep(3000);
		WebElement AssignQP = driver.findElement(By.id("assign_qp_auto_generate"));
		js.executeScript("window.scrollBy(300,600)");
		js.executeScript("arguments[0].scrollIntoView(true);", AssignQP);
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		actions.click(AssignQP).perform();
		
		
		//js.executeScript("arguments[0].click();", AssignQP);
		//actions.click(AssignQP).perform();
		
			
		driver.navigate().back();
		driver.findElement(By.xpath("//li[@data-content='Create Exam']//a[@class='nav-link']//*[name()='svg']")).click();
		k++;
	
		}
	}
}
