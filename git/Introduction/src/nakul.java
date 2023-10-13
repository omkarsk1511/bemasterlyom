import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nakul {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://smartschool.genextlearn.com/login");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("smartschool");
		driver.findElement(By.id("password")).sendKeys("Genext@123");
        driver.findElement(By.linkText("Sign in")).click();	
        driver.close();
	}

}
