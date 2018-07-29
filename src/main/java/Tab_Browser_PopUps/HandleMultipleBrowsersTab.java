package Tab_Browser_PopUps;
import java.util.ArrayList;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleMultipleBrowsersTab {
	
public static void main(String args[]) throws Exception{

	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.fb.com");
	((JavascriptExecutor)driver).executeScript("window.open()");
	((JavascriptExecutor)driver).executeScript("window.open()");
	((JavascriptExecutor)driver).executeScript("window.open()");
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(2));
	driver.get("http://www.google.com");
	driver.switchTo().window(tabs.get(3));
	driver.get("http://www.fb.com");
	driver.switchTo().window(tabs.get(1));
	driver.get("http://google.com");
    driver.quit();
    driver = null;
	
}
}