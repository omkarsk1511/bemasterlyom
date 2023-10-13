package offlineExam;

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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class JEEFM {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
		
		 //ChromeOptions opt = new ChromeOptions(); 
		  //opt.addArguments("--remote-allow-origins=*"); 
		   
		  //WebDriverManager.chromedriver().setup(); 
		  //WebDriver driver = new ChromeDriver(opt);  //Pass the chrome option object reference here 
		      //WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
			//WebDriver driver = new EdgeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			String[] names = {"Amar Exam 1", "Amar Exam 2", "Amar Exam 3", "Amar Exam 4", "Amar Exam 5", "Amar Exam 6", "Amar Exam 7", "Amar Exam 8", "Amar Exam 9", "Amar Exam 10", "Amar Exam 11", "Amar Exam 12", "Amar Exam 13", "Amar Exam 14", "Amar Exam 15", "Amar Exam 16", "Amar Exam 17", "Amar Exam 18", "Amar Exam 19", "Amar Exam 20", "Amar Exam 21", "Amar Exam 22", "Amar Exam 23", "Amar Exam 24", "Amar Exam 25", "Amar Exam 26", "Amar Exam 27", "Amar Exam 28", "Amar Exam 29", "Amar Exam 30", "Amar Exam 31", "Amar Exam 32", "Amar Exam 33", "Amar Exam 34", "Amar Exam 35", "Amar Exam 36", "Amar Exam 37", "Amar Exam 38", "Amar Exam 39", "Amar Exam 40", "Amar Exam 41", "Amar Exam 42", "Amar Exam 43", "Amar Exam 44", "Amar Exam 45", "Amar Exam 46", "Amar Exam 47", "Amar Exam 48", "Amar Exam 49", "Amar Exam 50"
					};
			
				driver.get("https://prodtest21.bemasterly.com/");
				driver.manage().window().maximize();
				driver.findElement(By.id("username")).sendKeys("Prodtest21");
				driver.findElement(By.id("password")).sendKeys("Genext@123");
				driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
				driver.findElement(By.xpath("//span[normalize-space()='TestPro']")).click();
				driver.findElement(By.xpath("//li[@data-content='Create Exam']//a[@class='nav-link']//*[name()='svg']")).click();
				Actions actions = new Actions(driver);
				int k=5;
				for (int j=6;j<29;j++){
					
				
				//String name=names[k];
				driver.findElement(By.xpath("//input[@id='examname']")).sendKeys(names[k]);
				
				Select selectExam = new Select(driver.findElement(By.id("ExamType")));
				selectExam.selectByValue("18397");
				Thread.sleep(2000);
				k++;
				
				Select selectOfferings = new Select(driver.findElement(By.id("offerings")));
				selectOfferings.selectByValue("3_4");
				Thread.sleep(2000);
				
				WebElement BatchDropdown = driver.findElement(By.xpath("//div[@id='grade_student']//button[@title='None selected']"));
				BatchDropdown.click();
				 WebElement mshb9th = driver.findElement(By.xpath("//input[@value='1063']"));
				 mshb9th.click();
				 Thread.sleep(2000);
				 
				Select selectMode = new Select(driver.findElement(By.id("test_mode")));
				selectMode.selectByValue("2");
				
				
				Thread.sleep(2000);
				WebElement TemplateDropdown = driver.findElement(By.id("template"));
				TemplateDropdown.click();
				
				Select selectTemplate = new Select(TemplateDropdown);
				selectTemplate.selectByValue("83");
				//List<WebElement> Templates = selectTemplate.getOptions();
			
	/*			try {
					selectTemplate.selectByIndex(j);
			      } catch (StaleElementReferenceException e) {
			    	  selectTemplate.selectByIndex(j);
			      }
				*/
				//actions.sendKeys(Keys.ENTER).perform();
			        //String TemplateName = selectTemplate.toString();
			        //System.out.println("Selected option: " + TemplateName);
			   
				
				/*WebElement MonthlyPracticeTestMaths = driver.findElement(By.xpath("//option[@value='174']']"));
				MonthlyPracticeTestMaths.click();*/
				Thread.sleep(1000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,600)");
				
				//driver.findElement(By.xpath("//div[@class='col-md-6 nomal_time anti_print_purpose']//label[@class='pt-3']")).click();
				Thread.sleep(4000);
				
				
				/*
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
			   */
				WebElement ContinueBtn = driver.findElement(By.xpath("//button[@id='button_page_1']"));
				Thread.sleep(3000);
				
				ContinueBtn.click();
				Thread.sleep(50000);
				//JavascriptExecutor js = (JavascriptExecutor) driver;
				//js.executeScript("window.scrollTo(0, document.body.scrollHeight");
				
				//Thread.sleep(3000);
				//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
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