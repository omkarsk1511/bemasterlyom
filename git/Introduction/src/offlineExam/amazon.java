package offlineExam;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazon {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\eclips\\eclipse files\\Introduction\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		WebDriver driver = new FirefoxDriver();

        driver.get("https://amazon.com");
        JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("window.scrollBy(0,900)");

        // Wait for the page title to contain "Amazon"
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.titleContains("Amazon"));

        // Now you can interact with the loaded page
        // For example, you can find elements and perform actions

        // Close the browser
        //driver.quit();

}
}
