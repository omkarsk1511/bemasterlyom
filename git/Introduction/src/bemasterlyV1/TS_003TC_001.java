package bemasterlyV1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TS_003TC_001 {

	public static void main(String[] args) throws InterruptedException {
		// Verify that admin is able to create a "Batch"

		//new chorme driver 
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();

		//existing chorme driver
		//cd "C:\Program Files\Google\Chrome\Application\" 
		//chrome.exe --remote-debugging-port=2401 --user-data-dir="C:\selenium\SaasUserStories"
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "127.0.0.1:2401");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		
		
		//Prerequisite
		/*
		String url = "https://smartschool.bemasterly.com/login";
		driver.get(url);
		driver.manage().window().maximize();
		String usernameEi = "username";
		driver.findElement(By.id(usernameEi)).sendKeys("smartschool");
		String passwordEi = "password";
		driver.findElement(By.id(passwordEi)).sendKeys("Genext@123");
		String signinEx = "//button[@type='submit']";
		driver.findElement(By.xpath(signinEx)).click();
		
		String InstituteSetupEx = "//span[normalize-space()='Institute Setup']";
		driver.findElement(By.xpath(InstituteSetupEx)).click();;
		String batchesEx = "//span[normalize-space()='Batches']";
		driver.findElement(By.xpath(batchesEx)).click();	
		String addBEx = "//a[@class='btn btn-primary1']";
		driver.findElement(By.xpath(addBEx)).click();
			
		
		String batchNameEi = "batch_name";
		driver.findElement(By.id(batchNameEi)).sendKeys("Batch1");	
		WebElement offering = driver.findElement(By.id("offering_name"));
		Select dropoffering = new Select(offering);
		dropoffering.selectByIndex(1);
		
		driver.findElement(By.xpath("//div[@class='css-1hwfws3']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"react-select-2-option-0\"]")).click();
		driver.findElement(By.xpath("//div[@class='css-1hwfws3']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"react-select-2-option-1\"]")).click();		
		driver.findElement(By.xpath("//div[@class='css-1hwfws3']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"react-select-2-option-2\"]")).click();
		
		WebElement academicEi = driver.findElement(By.id("academic_name"));
		Select dropacademic = new Select(academicEi);
		dropacademic.selectByIndex(1);
		
		WebElement startdateEx = driver.findElement(By.xpath("//body/div[@class='nk-app-root']/div[@id='read_scrp_default']/div[@class='nk-main']/div[contains(@class,'nk-wrap')]/div[@id='nk-content-genext']/div[@class='container-xl wide-lg']/div[@class='nk-content-body']/div[@id='content-wrapper']/div[@class='row']/div[@id='batch-root']/div/div[@class='multistep-layout']/div[@class='tab-body']/form[@id='step1']/div[@class='row mt-3']/div[1]/div[1]/input[1]"));
		startdateEx.sendKeys("10-03-2023");
		WebElement endtdateEx = driver.findElement(By.xpath("//body/div[@class='nk-app-root']/div[@id='read_scrp_default']/div[@class='nk-main']/div[contains(@class,'nk-wrap')]/div[@id='nk-content-genext']/div[@class='container-xl wide-lg']/div[@class='nk-content-body']/div[@id='content-wrapper']/div[@class='row']/div[@id='batch-root']/div/div[@class='multistep-layout']/div[@class='tab-body']/form[@id='step1']/div[@class='row mt-3']/div[2]/div[1]/input[1]"));
		endtdateEx.sendKeys("10-03-2024");
		
		driver.findElement(By.xpath("//button[normalize-space()='Save & Next']")).click();
		*/
		//Tutor tagging
		List<WebElement> addTutor = driver.findElements(By.xpath("//tbody/tr[1]/td[4]/p[1]"));
		
	    int totaltutor = addTutor.size();
  
	    for( int i=0; i<totaltutor; i++)
	    {
	    	addTutor.get(i).click();
	    	Thread.sleep(2500);
	    	driver.findElement(By.xpath("//input[contains(@placeholder,'Search by Teacher name or employee ID')]")).sendKeys("virat");
	    	Thread.sleep(500);
	    	driver.findElement(By.xpath("//input[@class='ms-2 me-1']")).click();
	    	Thread.sleep(500);
	    	driver.findElement(By.xpath("//*[@id=\"customSidebar\"]/div[2]/div[3]/div[2]/button")).click();
   		}
	}
	    		    
	    			/*
	    		    int totaldeletes = deletes.size();
	    		    //System.out.println(deletes.size());
	    		    
	    	  
	    		    for( int j=0;j<totaldeletes;j++)// j++
	    		    {
	    		    	
	    		    		deletes.get(j).click();
	    		    		Thread.sleep(500);
	    		    		driver.findElement(By.cssSelector(".swal2-confirm.swal2-styled")).click();
	    		    		Thread.sleep(2500);
	    		    		
	    		    		 List<WebElement> deletesYes = driver.findElements(By.cssSelector("em[class='icon ni ni-trash'"));
	    		    			
	    		    		    int totaldeletesyes = deletesYes.size();
	    		    		    //System.out.println(deletesYes.size());
	    		    		    
	    		    	  
	    		    		    for( int k=0;k<totaldeletesyes;k++)// j++
	    		    		    {
	    		    		    	
	    		    		    		deletes.get(k).click();
	    		    		    		Thread.sleep(500);
	    		    		    		driver.findElement(By.cssSelector(".swal2-confirm.swal2-styled")).click();
	    		    		    		Thread.sleep(10000);
	    		    		     }
		    		     }
	    		    */
	    	
			
		

		/*
		//Assertions
		String addEx = "//a[@href='https://smartschool.bemasterly.com/admin/students/add']";
		//"Add Student" button is displayed
		Assert.assertEquals(true, driver.findElement(By.xpath(addEx)).isDisplayed());
		Assert.assertEquals(true, driver.findElement(By.xpath(addEx)).isEnabled());
		Assert.assertEquals(driver.findElement(By.xpath(addEx)).getText(), "Add");
		System.out.println("Automatic Assertions are applied If Test Case Fails then nothing will print" + '\n' + "For manual check");
		System.out.println("Element is present" + '\n' + "Expected = Add" + '\n' + "actual   = "+driver.findElement(By.xpath(addEx)).getText());
		
		driver.findElement(By.xpath(addEx)).click();
		String isClickable = "//h5[normalize-space()='Personal Details']";
		Assert.assertEquals(true, driver.findElement(By.xpath(isClickable)).isDisplayed());
		Assert.assertEquals(driver.findElement(By.xpath(isClickable)).getText(), "Personal Details");
		System.out.println("Element is clickable" + '\n' + "Expected = Personal Details" + '\n' + "actual   = "+driver.findElement(By.xpath(isClickable)).getText());
	
	*/
	

}


