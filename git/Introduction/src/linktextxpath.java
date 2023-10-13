import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktextxpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//impleicit timeoit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://smartschool.genextlearn.com/login");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Forgot Password?")).click();
		driver.findElement(By.partialLinkText("Forgot ")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("103");
		driver.findElement(By.cssSelector("#mobile")).sendKeys("7262940840");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
	}

}
