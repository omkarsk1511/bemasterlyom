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

public class mhsb_9th {
	// MHSB 10th
		public static void main(String[] args) throws Throwable {
			
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String[] names = {"T1", "T2", "T3", "T4", "T5", "T6", 
				"T7", "T8", "T9", "T10", "T11", "T12", "T13", 
				"T14", "T15", "T16", "T17", "T18", "T19", "T20", 
				"T21", "T22", "T23", "T24", "T25", "T26", "T27", 
				"T28", "T29", "T30", "T31", "T32", "T33", "T34", "T35", 
				"T36", "T37", "T38", "T39", "T40", "T41", "T42", "T43", 
				"T44", "T45", "T46", "T47", "T48", "T49", "T50"
				};
		
			driver.get("https://prodtest21.bemasterly.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("Prodtest21");
			driver.findElement(By.id("password")).sendKeys("Genext@123");
			driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='TestPro']")).click();
			driver.findElement(By.xpath("//li[@data-content='Create Exam']//a[@class='nav-link']//*[name()='svg']")).click();
			Actions actions = new Actions(driver);
			int k=0;
			for (int j=1;j<29;j++){
				
			
			//String name=names[k];
			driver.findElement(By.xpath("//input[@id='examname']")).sendKeys(names[k]);
			
			Select selectExam = new Select(driver.findElement(By.id("ExamType")));
			selectExam.selectByValue("15584");
			Thread.sleep(2000);
			k++;
			
			Select selectOfferings = new Select(driver.findElement(By.id("offerings")));
			selectOfferings.selectByValue("8_9");
			Thread.sleep(2000);
			
			WebElement BatchDropdown = driver.findElement(By.xpath("//div[@id='grade_student']//button[@title='None selected']"));
			BatchDropdown.click();
			 WebElement mshb9th = driver.findElement(By.xpath("//input[@value='1706']"));
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
		}
	
			
		}
	