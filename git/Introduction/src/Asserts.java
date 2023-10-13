import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Asserts {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		String username = "smartschool";
		String password = "Genext@123";
		String url = "https://smartschool.genextlearn.com/login";
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.className("btn")).click();
		
		Assert.assertEquals(driver.findElement(By.cssSelector(".user-name.dropdown-indicator")).getText(), username);
		
		System.out.println(driver.findElement(By.cssSelector(".user-name.dropdown-indicator")).getText());
		System.out.println(driver.findElement(By.cssSelector("p")).getText());
		//Assertion
		Assert.assertEquals(driver.findElement(By.cssSelector("p")).getText(), "At a glance summary of your account.");
		//driver.close();
	}
}

