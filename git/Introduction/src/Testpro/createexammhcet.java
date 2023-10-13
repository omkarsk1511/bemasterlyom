package Testpro;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

public class createexammhcet {

	public static void main(String[] args) throws InterruptedException {
		 ChromeOptions opt = new ChromeOptions(); 
		  opt.addArguments("--remote-allow-origins=*"); 
		   
		  //WebDriverManager.chromedriver().setup(); 
		  WebDriver driver = new ChromeDriver(opt);  //Pass the chrome option object reference here 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		  driver.manage().window().maximize(); 
		  driver.get("https://prodtest50.bemasterly.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("Prodtest50");
			driver.findElement(By.id("password")).sendKeys("Prodtest50");
			driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='TestPro']")).click();
			driver.findElement(By.xpath("//li[@data-content='Create Exam']//a[@class='nav-link']//*[name()='svg']")).click();
			
				Actions actions = new Actions(driver);
				
				
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
			Thread.sleep(2000);
			
			
			Select selectOfferings = new Select(driver.findElement(By.id("offerings")));
			selectOfferings.selectByVisibleText("MH-CET - English");
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
			Select selectTemplate = new Select(TemplateDropdown);
			selectTemplate.selectByValue("174");
				
			
			
				
				
				Select selectExam = new Select(driver.findElement(By.id("ExamType")));
				selectExam.selectByValue("15584");
				Thread.sleep(2000);
				k++;
				
				Select selectOfferings = new Select(driver.findElement(By.id("offerings")));
				selectOfferings.selectByValue("8_10");
				Thread.sleep(2000);
				
				WebElement BatchDropdown = driver.findElement(By.xpath("//div[@id='grade_student']//button[@title='None selected']"));
				BatchDropdown.click();
				 WebElement mshb9th = driver.findElement(By.xpath("//input[@value='1707']"));
				 mshb9th.click();
				
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
				
			    for(int i=0;i<elementCount.size();i++)
			    	{
			    	actions.sendKeys(Keys.ARROW_DOWN, Keys.SPACE).perform();
					}
			   
				WebElement ContinueBtn = driver.findElement(By.xpath("//button[@id='button_page_1']"));
				Thread.sleep(3000);
				
				ContinueBtn.click();
				Thread.sleep(3000);
				WebElement AssignQP = driver.findElement(By.id("assign_qp_auto_generate"));
				//js.executeScript("window.scrollBy(300,600)");
				js.executeScript("arguments[0].scrollIntoView(true);", AssignQP);
				//js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
				
				//actions.click(AssignQP).perform();
				
				
				js.executeScript("arguments[0].click();", AssignQP);
				//actions..click(AssignQP).perform();
				
					
				driver.navigate().back();
				driver.findElement(By.xpath("//li[@data-content='Create Exam']//a[@class='nav-link']//*[name()='svg']")).click();
				
			
				}
 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  driver.get("https://prodtest50.bemasterly.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("Prodtest50");
			driver.findElement(By.id("password")).sendKeys("Prodtest50");
			driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='TestPro']")).click();
			driver.findElement(By.xpath("//li[@data-content='Create Exam']//a[@class='nav-link']//*[name()='svg']")).click();
			driver.findElement(By.xpath("//input[@id='examname']")).sendKeys("autotest1");
			// Find the dropdown element by ID
			//WebElement ExamTypedropdown = driver.findElement(By.id("ExamType"));
			// Create a Select object
			
			Select selectExam = new Select(driver.findElement(By.id("ExamType")));
			selectExam.selectByVisibleText("MH-CET");
			Thread.sleep(2000);
			
			
			Select selectOfferings = new Select(driver.findElement(By.id("offerings")));
			selectOfferings.selectByVisibleText("MH-CET - English");
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
			Select selectTemplate = new Select(TemplateDropdown);
			selectTemplate.selectByValue("174");
			
			
			/*WebElement MonthlyPracticeTestMaths = driver.findElement(By.xpath("//option[@value='174']']"));
			MonthlyPracticeTestMaths.click();*/
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='col-md-6 nomal_time anti_print_purpose']//label[@class='pt-3']")).click();
			Thread.sleep(1000);
			
			
			
			WebElement Chapter = driver.findElement(By.xpath("//button[@title='None selected']"));
			Chapter.click();
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.ARROW_DOWN).perform();
			
		Select selectChapter = new Select(driver.findElement(By.id("chapter")));
			
			List<WebElement> elementCount = selectChapter.getOptions();
			List<WebElement> elementnameCount = selectChapter.getAllSelectedOptions();
			System.out.println("Number of items: " + elementCount.size());
			System.out.println(elementnameCount);
			
			
			//System.out.println();
			
		    for(int i=0;i<elementCount.size();i++)
		    	{
		    	actions.sendKeys(Keys.ARROW_DOWN, Keys.SPACE).perform();
				}
			WebElement ContinueBtn = driver.findElement(By.xpath("//button[@id='button_page_1']"));
			ContinueBtn.click();
			Thread.sleep(3000);
			
			//js.executeScript("window.scrollBy(300,600)");
			js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			WebElement Assign_Que_Paper = driver.findElement(By.id("assign_qp_auto_generate"));
			//actions.moveToElement(Assign_Que_Paper).click().perform();
			
			Thread.sleep(3000);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
					
			Assign_Que_Paper.click();
			
			//Assign_Que_Paper.click();
			
		
			
			/*Object ChapterBox = driver.findElement(By.xpath("//ul[@class='multiselect-container dropdown-menu show']"));
			//actions.click();
			WebElement element = driver.findElement(By.xpath("//label[normalize-space()='2 - Pythagoras Theorem']"));
			
		    Point location = element.getLocation();
			int x = location.getX();
			int y = location.getY();
			System.out.println(x);
			System.out.println(y);
			//563  703   --1
			//563  735   --2
			for(int l=1;l<6;l++) {
				
			int t = 105;
			actions.moveByOffset(170, 105).click().perform();
			t=t+32;
			}
			
			
			//Chapter.sendKeys(Keys.ARROW_DOWN);
			//Chapter.sendKeys(Keys.ARROW_DOWN);
			//Chapter.sendKeys(Keys.ENTER);*/
			
		
			
		
			
			
			
			
			
			
			//Select selectchapter = new Select(ChapterDropdown);
			/*List<WebElement> Chapter = ChapterDropdown.findElements(By.tagName("li"));
			
			for (WebElement option : Chapter) {
			    String text = option.getText();
			    System.out.println(text);
			}*/
			
		}
		

}
